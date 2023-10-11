package br.com.caefleury.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraRota")
// http//localhost:8080/primeiraRota
/* 
 * Sempre que eu acessar a rota acima
 * retornaremos essa controller
 */
public class FirstController {
    
    /*
     * GET - Buscar informação
     * POST = Adicionar um dado
     * PUT - Alterar/Substituir um dado/info
     * DELETE = Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     */

     // Método (Funcionalidade de uma classe)
    @GetMapping("/")
    public String primeiraMensagem() {

        return "Funcionou";
    }
};
