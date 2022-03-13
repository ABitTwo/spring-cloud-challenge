package br.com.caelum.eats.pagamento;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("monolito")
public interface MonolitoClient {
	
	@PutMapping(value = "/pedidos/{pedidoId}/status")
	public void atualizaStatus(@PathVariable long pedidoId, @RequestBody PedidoMudancaDeStatusRequest pedido);
}
