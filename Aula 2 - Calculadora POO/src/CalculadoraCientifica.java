public class CalculadoraCientifica extends Calculadora{

    public CalculadoraCientifica(){
        System.out.println("Calculadora Científica está pronta!");
    }

    public double potencia(double base, double expoente){
        double resultado = Math.pow(base, expoente); // 1² = 1
        Operacao operacao = new Operacao(base, expoente, "^", resultado);
        historico.add(operacao);
        return resultado;
    }

    public double logaritmoBaseDez(double num){
        double resultado = Math.log10(num);
        Operacao operacao = new Operacao(num, "^", resultado);
        historico.add(operacao);
        return resultado;
    }

    // Sobrescrita
    @Override
    public void exibirMensagemBoasVindas() {
        System.out.println("Bem vindo a calculadora cientifica");
    }

}
