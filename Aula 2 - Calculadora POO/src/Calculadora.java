import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    // private => apenas a classe pode usar
    // protected => apenas as subclasses podem usar
    // public =>  tudo pode usar
    public List<Operacao> historico; // Usado 'protected' para que subclasses possam acessá-lo diretamente

    // construtor da calculadora
    public Calculadora() {
        this.historico = new ArrayList<>();
    }

    // metodos de uma calculadora
    public double somar(double a, double b) {
        double resultado = a + b;
        historico.add(new Operacao(a, b, "+", resultado)); // Adiciona ao histórico
        return resultado;
    }

    public double subtrair(double a, double b) {
        double resultado = a - b;
        historico.add(new Operacao(a, b, "-", resultado));
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historico.add(new Operacao(a, b, "*", resultado));
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna Not-a-Number para indicar erro
        }
        double resultado = a / b;
        historico.add(new Operacao(a, b, "/", resultado));
        return resultado;
    }

    // Vamos sobrescrever isso depois, caracteriza-se herança, um dos pilares do POO
    public void exibirMensagemBoasVindas() {
        System.out.println("Bem-vindo à Calculadora Básica!");
    }

    // metodo para printar o historico doq aconteceu
    public void exibirHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operação no histórico ainda.");
            return;
        }
        System.out.println("\n--- Histórico de Operações ---");
        for (Operacao op : historico) {
            System.out.println(op.toString());
        }
        System.out.println("------------------------------");
    }
}