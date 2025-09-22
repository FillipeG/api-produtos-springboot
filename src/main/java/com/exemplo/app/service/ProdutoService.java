package com.exemplo.app.service;

import org.springframework.stereotype.Service;

import com.exemplo.app.repository.ProdutoRepository;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor;
@service;
public class ProdutoService{

@Autowired    
private final ProdutoRepository produtoRepository;


           public List<Produto> listarTodosProdutos(){
            return (List<Produto>) produtoRepository.findAll;
           }


           public Optional<Produto> buscarProdutoPorID(Long id){
            return produtoRepository.findById(id);

           }

           public Produto salvarProduto(Produto produto){
            return produtoRepository.save(produto);
           }



           //DELETE

           public void excluirProduto(Long id){
            produtoRepository.deleteById(id);
           }




           //PUT 

           public Produto atualizarProduto(Long id, Produto produtoAtualizado){
            Produto produto = produtoRepository.findById(id)
            .orElseThrow(()-> new IllegalArgumentException(
                String.format("Produto nao encontrado")
            ));

            produto.setNome(produtoAtualizado.getNome());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
            produto.setPreco(produtoAtualizado.getPreco());

            return produtoRepository.save(produto);





           }








}