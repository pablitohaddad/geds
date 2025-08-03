import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Calc basica");

        Calculadora calcBasica = new Calculadora();
        calcBasica.exibirMensagemBoasVindas();
        System.out.printf("Soma (5 + 3): %.2f%n ", calcBasica.somar(5, 4));
        System.out.printf("Divisao (10 / 2): %.2f%n", calcBasica.dividir(10, 2));
        // foreach
        for (Operacao operacao : calcBasica.historico) { //[ operaco[0] , operacao[1] .... ]
            System.out.println(operacao);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Calculadora Cientifica!!!");

        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        calculadoraCientifica.exibirMensagemBoasVindas();
        System.out.printf("Potencia (2³): %.2f%n", calculadoraCientifica.potencia(2, 3));
        System.out.printf("Multiplicacao (2 * 2): %.2f%n", calculadoraCientifica.multiplicar(2, 2 ));
        for (Operacao operacao : calculadoraCientifica.historico) { //[ operaco[0] , operacao[1] .... ]
            System.out.println(operacao);
        }
    }
}