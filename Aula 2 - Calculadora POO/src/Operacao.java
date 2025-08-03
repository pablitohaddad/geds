import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacao {

    // criando todos os parametros que preciso utilizar, o que uma operação tem? Numeros, operadores, resultado, LOG (utilizo a dataHora)
    private double num1;
    private double num2;
    private String operador;
    private double resultado;
    private LocalDateTime dataHora;

    // COnstrutor para CONSTRUIR meu objeto, então se qusier construir um obj, tenho que ter um construtor na classe
    public Operacao(double num1, double num2, String operador, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
        this.resultado = resultado;
        this.dataHora = LocalDateTime.now();
    }

    public Operacao(double num1, String operador, double resultado) {
        this.num1 = num1;
        this.operador = operador;
        this.resultado = resultado;
        this.dataHora = LocalDateTime.now();
    }

    // conceito de getters para BUSCAR minhas variaveis
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperador() {
        return operador;
    }

    public double getResultado() {
        return resultado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    // metodo para printar meu objeto
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("[%s] %.2f %s %.2f = %.2f",
                dataHora.format(formatter), num1, operador, num2, resultado);
    }
}