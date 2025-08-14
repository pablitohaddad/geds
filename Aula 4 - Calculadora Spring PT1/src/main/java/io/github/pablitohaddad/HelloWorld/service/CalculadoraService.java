package io.github.pablitohaddad.HelloWorld.service;

import io.github.pablitohaddad.HelloWorld.model.Operacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CalculadoraService {

    private final List<Operacao> historico = new ArrayList<>();

    public double somar(double num1, double num2){
        double resultado = num1 + num2;
        Operacao operacao = new Operacao(num1, num2, "+", resultado);
        historico.add(operacao);
        return resultado;
    }
    // ATENÇÃO, comecem a fazer a operação a baixo do TODO com o seu nome!
    // TODO -> Eduardo subtração

    // TODO -> Meira multiplicação
    public double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        Operacao operacao = new Operacao(num1, num2, "*", resultado);
        historico.add(operacao);
        return resultado;
    }

    // TODO -> Ana Paula divisão
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        double resultado = num1 / num2;
        Operacao operacao = new Operacao(num1, num2, "/", resultado);
        historico.add(operacao);
        return resultado;
    }

    // TODO -> Geisiane módulo
    /* presumi que módulo se refere a (num1%num2) e
    não (|num|), pq o histórico funciona com 2 números.*/
    public double modulo(double num1, double num2){
        double resultado = num1 % num2;
        Operacao operacao = new Operacao(num1, num2, "%", resultado);
        historico.add(operacao);
        return resultado;
    }

    // TODO -> Gustavo potência
    public double potencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        Operacao operacao = new Operacao(base, expoente, "^", resultado);
        historico.add(operacao);
        return resultado;
    }

    // TODO -> Larissa raiz quadrada

    // TODO -> Gabriel fatorial (3! = 3 * 2 * 1 = 6)
    public long fatorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Número negativo");
        }
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        historico.add(new Operacao("Fatorial", num, resultado));
        return resultado;
    }

    public List<Operacao> getHistorico() {
        return Collections.unmodifiableList(historico);
    }

}
