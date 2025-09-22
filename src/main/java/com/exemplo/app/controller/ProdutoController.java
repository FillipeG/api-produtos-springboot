package com.exemplo.app.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;



@AllArgsConstructor
@RequestMapping(path = "api/v1/produtos")
@RestController
public class ProdutoController {

    @Autowired
    private final ProdutoService produtoService;



    public ResponseEntity<List<Produto>> listarProdutos(){


        List<Produto> produtos = produtoService.listarTodosProdutos();
        return new ResponseEntity<>(produtos, HtppStatus.OK);


    }




    
}
