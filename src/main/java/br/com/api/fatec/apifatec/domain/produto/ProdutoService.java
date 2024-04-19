package br.com.api.fatec.apifatec.domain.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.fatec.apifatec.domain.cliente.ClienteRepository;
import br.com.api.fatec.apifatec.entities.Cliente;
import br.com.api.fatec.apifatec.entities.Produto;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto encontrarProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void deletarProduto(Long id) {
		produtoRepository.deleteById(id);
	}

	public Produto atualizarProduto(Long id, Produto produto) {
		
		Produto produtoCadastrado = encontrarProdutoPorId(id);
		
		if(produtoCadastrado == null) {
			return null;
		}else {
			produtoCadastrado.setNome(produto.getNome());
			produtoCadastrado.setDescricao(produto.getDescricao());
			produtoCadastrado.setPreco(produto.getPreco());
			produtoCadastrado.setQtde(produto.getQtde());
			
			
			return produtoRepository.save(produto);
		}	
	}

}
