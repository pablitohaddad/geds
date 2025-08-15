package io.github.pablitohaddad.HelloWorld.service;

import io.github.pablitohaddad.HelloWorld.model.Operacao;
import io.github.pablitohaddad.HelloWorld.repository.OperacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculadoraService {

    @Autowired
    private OperacaoRepository operacaoRepository;

    public double somar(double num1, double num2){
        double resultado = num1 + num2;
        Operacao operacao = new Operacao(num1, num2, "+", resultado);
        operacaoRepository.save(operacao);
        return resultado;
    }
    // ATENÇÃO, comecem a fazer a operação a baixo do TODO com o seu nome!
    // TODO -> Eduardo subtração

    // TODO -> Meira multiplicação
    public double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        Operacao operacao = new Operacao(num1, num2, "*", resultado);
        return resultado;
    }

    // TODO -> Ana Paula divisão
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        double resultado = num1 / num2;
        Operacao operacao = new Operacao(num1, num2, "/", resultado);
        operacaoRepository.save(operacao);
        return resultado;
    }

    // TODO -> Geisiane módulo
    /* presumi que módulo se refere a (num1%num2) e
    não (|num|), pq o histórico funciona com 2 números.*/
    public double modulo(double num1, double num2){
        double resultado = num1 % num2;
        Operacao operacao = new Operacao(num1, num2, "%", resultado);
        operacaoRepository.save(operacao);
        return resultado;
    }

    // TODO -> Gustavo potência
    public double potencia(double base, double expoente) {
        double resultado = Math.pow(base, expoente);
        Operacao operacao = new Operacao(base, expoente, "^", resultado);
        operacaoRepository.save(operacao);
        return resultado;
    }

    // TODO -> Larissa raiz quadrada
    public double raizQuadrada(double num){
        double resultado = Math.sqrt(num);
        Operacao operacao = new Operacao(num, num, "√", resultado);
        operacaoRepository.save(operacao);
        return resultado;
    }

    // TODO -> Gabriel fatorial (3! = 3 * 2 * 1 = 6)
    public long fatorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Número negativo");
        }
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public List<Operacao> getHistorico() {
        return operacaoRepository.findAll();
    }

}
