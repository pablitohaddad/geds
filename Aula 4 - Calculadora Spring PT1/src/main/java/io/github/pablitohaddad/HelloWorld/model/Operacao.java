package io.github.pablitohaddad.HelloWorld.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Document(collection = "operacoes")
public class Operacao {
    // Primary Key
    @Id
    private String id; // Gerado automaticamente
    private double num1;
    private double num2;
    private String operador;
    private double resultado;
    private LocalDateTime dataHora;

    public Operacao(){

    }

    public Operacao(double num1, double num2, String operador, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
        this.resultado = resultado;
        this.dataHora = LocalDateTime.now();
    }

    // pegar
    public double getNum1() {
        return num1;
    }

    // setar -> atribuir
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("[%s] %.2f %s %.2f = %.2f",
                dataHora.format(formatter), num1, operador, num2, resultado); // [16:57] 1 + 1 = 2
    }
}
