package io.github.pablitohaddad.HelloWorld.controller;

import io.github.pablitohaddad.HelloWorld.model.Operacao;
import io.github.pablitohaddad.HelloWorld.service.CalculadoraService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Calculadora", description = "Endpoints de calculadora avançada")
@RestController
@RequestMapping("/calculadora") //localhost:8080/calculadora
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    // TODO -> Pablo soma
    @Operation(
            summary = "Realiza a soma de dois números",
            description = "O endpoint recebe dois números e soma esses números: localhost:8080/calculadora/somar?num1=12&num2=12"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação de soma realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parametros invalidos."),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.")
    })
    @GetMapping("/somar")
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
    @Operation(
            summary = "Realiza a multiplicação de dois números.",
            description = "O endpoint recebe dois números e mostra o resultado da divisão desses números: localhost:8080/calculadora/divisao?num1=12&num2=4"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operação de divisão realizada com sucesso!"),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos."),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.")
    })


    @GetMapping("/dividir") // localhost:8080/calculadora/dividir?num1=10&num2=2
public double dividir(@RequestParam double num1, @RequestParam double num2) {
    return calculadoraService.dividir(num1, num2);
}

    // TODO -> Geisiane módulo
    @GetMapping("/modulo") // localhost:8080/calculadora/modulo?num1=12&num2=12
    public double modulo(@RequestParam double num1, @RequestParam double num2){
        return calculadoraService.modulo(num1,num2);
    }

    // TODO -> Gustavo potência
    @GetMapping("/potencia") // localhost:8080/calculadora/potencia?num1=12&num2=12
    public double potencia(@RequestParam double base, @RequestParam double expoente){
        return calculadoraService.potencia(base, expoente);
    }

    // TODO -> Larissa raiz quadrada
    @GetMapping("/raiz") //http://localhost:8080/calculadora/raiz?num=12
    public double raizQuadrada(@RequestParam double num){
        return calculadoraService.raizQuadrada(num);
    }

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
