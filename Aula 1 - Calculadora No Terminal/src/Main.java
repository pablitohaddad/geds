import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instanciando e usando obj, Classe para escrever via terminal
        boolean continuar = true;

        // enquanto o continuar for true -> perceba que vamos mudar isso depois!
        while (continuar){
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble(); // Lê o primeiro numero

            System.out.println("Digite o segundo número");
            double num2 = scanner.nextDouble(); // Lê o segundo número

            System.out.println("Digite a operação (+, -, /, *) ou 'sair' para finalizar");
            // Irá ler a operação que você digitar e deixar ela como maíscula sempre, caso
            // hajá alguem que digite SaIr -> SAIR
            String operacao = scanner.next().toUpperCase();

            double resultado = 0;
            boolean operacaoValida = true; // Vai que meu usuário digite '//'

            // Dependendo do que eu setei em operação, vamos fazer isso...
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    // é impossivel dividir por 0, então temos que fazer essa validação
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida");
                        operacaoValida = false;
                    }
                case "SAIR":
                    continuar = false; // para a aplicação
                    System.out.println("Saindo da calculadora... Até mais!");
                    break;
                default:
                    System.out.println("Operação invalida! Por favor, use +, -, *, / ou sair");
                    operacaoValida = false;
                    break;
            }
            // se a operação for válida e o continuar ser true
            if (operacaoValida && continuar) {
                System.out.println("Resultado " + resultado);
            }
            System.out.println("__________________________________________");
        }
        scanner.close();

        // mostre o debug do codigo, faça isso na linha do uppercase
        // coloque a bolinha vermelha, de o debug, vai ter o console
        // e o threads e variables, digite: SaIr no console e veja
        // o variables logo em seguida

        // aula sobre sintaxe, declaração, tipos de dados e operadores
    }
}