package io.github.pablitohaddad.HelloWorld.controller;

import io.github.pablitohaddad.HelloWorld.model.Operacao;
import io.github.pablitohaddad.HelloWorld.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculadora") //localhost:8080/calculadora
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/somar") // localhost:8080/calculadora/somar?num1=12&num2=12
    public double somar(@RequestParam double num1, @RequestParam double num2){
        return calculadoraService.somar(num1, num2);
    }
    // ATENÇÃO, comecem a fazer o endpoint a baixo do TODO com o seu nome!!
    // TODO -> Eduardo subtração

    // TODO -> Meira multiplicação
    @GetMapping("/multiplicar") // localhost:8080/calculadora/multiplicar?num1=2&num2=5
    public double multiplicar(@RequestParam double num1, @RequestParam double num2){
        return calculadoraService.multiplicar(num1, num2);
    }

    // TODO -> Ana Paula divisão

    // TODO -> Geisiane módulo
    @GetMapping("/modulo")
    public double modulo(@RequestParam double num1, @RequestParam double num2){
        return calculadoraService.modulo(num1,num2);
    }

    // TODO -> Gustavo potência
    @GetMapping("/potencia") // localhost:8080/calculadora/somar?num1=12&num2=12
    public double potencia(@RequestParam double base, @RequestParam double expoente){
        return calculadoraService.potencia(base, expoente);
    }

    // TODO -> Larissa raiz quadrada

    // TODO -> Gabriel fatorial (3! = 3 * 2 * 1 = 6)
    @GetMapping("/fatorial")
    public long fatorial(@RequestParam int num) {
        return calculadoraService.fatorial(num);
    }


    @GetMapping("/historico") // localhost:8080/calculadora/historico
    public List<Operacao> getHistorico(){
        return calculadoraService.getHistorico();
    }

}
