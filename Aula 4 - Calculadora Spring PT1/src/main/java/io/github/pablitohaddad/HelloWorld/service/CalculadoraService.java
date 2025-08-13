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

    // TODO -> Geisiane módulo

    // TODO -> Gustavo potência

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
