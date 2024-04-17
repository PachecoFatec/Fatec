package br.com.api.fatec.apifatec.domain.produto;
import br.com.api.fatec.apifatec.domain.produto.*;
import br.com.api.fatec.apifatec.entities.Produto;

public class ProdutoMapper {
	public static Produto toEntity(produtoDTO dto) {
		Produto produto = new Produto();
		produto.setId(dto.getId());
		produto.setNome(dto.getNome());
		produto.setDescricao(dto.getDescricao());
		produto.setPreco(dto.getPreco());
		produto.setQtde(dto.getQtde());
		return produto;
	}
	public static ProdutoDTO toDTO(Produto produto) {
		ProdutoDTO dto = new ProdutoDTO();
		dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.Descricao());
        dto.setPreco(produto.getPreco());
        dto.setQtde(produto.getQtde());
        return dto;
		
	}
	 public static List<ProdutoDTO> toDTOList(List<Produto> Produtos) {
	        return produtos.stream().map(ProdutoMapper::toDTO).collect(Collectors.toList());
	    }

}



/*package br.com.api.fatec.apifatec.domain.cliente;

import br.com.api.fatec.apifatec.entities.Cliente;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteMapper {
    public static Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setRazaoSocial(dto.getRazaoSocial());
        cliente.setEndereco(dto.getEndereco());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }

    public static ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setRazaoSocial(cliente.getRazaoSocial());
        dto.setEndereco(cliente.getEndereco());
        dto.setEmail(cliente.getEmail());
        return dto;
    }

    public static List<ClienteDTO> toDTOList(List<Cliente> clientes) {
        return clientes.stream().map(ClienteMapper::toDTO).collect(Collectors.toList());
    }
}
*/
