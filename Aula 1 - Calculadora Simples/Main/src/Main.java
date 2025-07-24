import java.util.Scanner;

public class Main { // classe
    public static void main(String[] args) { // metodo
        Scanner scanner = new Scanner(System.in); // Instanciou nosso objeto
        boolean continuar = true;

        // enquanto
        while (continuar){
            System.out.println("Digite o primeiro num: ");
            double num1 = scanner.nextDouble(); // 2

            System.out.println("Digite o segundo num: ");
            double num2 = scanner.nextDouble(); // 10

            // +, -, *, / OU sair
            System.out.println("Digite a operação (+, -, /, *) ou 'sair' para finalizar");
            // toUpperCase -> sair -> SAIR
            String operacao = scanner.next().toUpperCase();

            double resultado = 0;
            boolean operacaoValida = true;

            switch (operacao){
                case "+":
                    resultado = num1 + num2; // 2 + 10
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    // imposivel dividir por 0
                    if (num2 != 0){
                        resultado = num1 / num2;
                        break;
                    } else {
                        System.out.println("Erro: Divisão por zero é impossível!");
                        operacaoValida = false;
                    }
                case "SAIR":
                    continuar = false;
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Se ta fazendo merda!");
                    operacaoValida = false;
                    break;
            }

            if (operacaoValida && continuar){
                System.out.println("resultado: " + resultado);
            }
            System.out.println("-------------------------------------------------------------");
        }

    }
}