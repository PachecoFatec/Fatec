package br.com.api.fatec.apifatec.domain.produto;

import java.util.List;
import java.util.stream.Collectors;
import br.com.api.fatec.apifatec.entities.Produto;

public class ProdutoMapper {
    public static Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setId(dto.getId());
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        produto.setQtde(dto.getQtde());
        return produto; // Retorna a instância de produto, não a classe.
    }

    public static ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        dto.setQtde(produto.getQtde());
        return dto;
    }

    public static List<ProdutoDTO> toDTOList(List<Produto> produtos) {
        return produtos.stream().map(ProdutoMapper::toDTO).collect(Collectors.toList());
    }
}

