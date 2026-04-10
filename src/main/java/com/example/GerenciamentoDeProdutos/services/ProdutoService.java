package com.example.GerenciamentoDeProdutos.services;

import com.example.GerenciamentoDeProdutos.models.ProdutoModel;
import com.example.GerenciamentoDeProdutos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

  public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
  }

    public Optional<ProdutoModel> buscarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public void deletarProduto(Long id) {
       produtoRepository.deleteById(id);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produtoModel) {
        return produtoRepository.findById(id).map(existente -> {
            existente.setNome(produtoModel.getNome());
            existente.setDescricao(produtoModel.getDescricao());
            existente.setPreco(produtoModel.getPreco());
            existente.setStatus(produtoModel.getStatus());
            return produtoRepository.save(existente);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado para atualizar"));
    }
}
