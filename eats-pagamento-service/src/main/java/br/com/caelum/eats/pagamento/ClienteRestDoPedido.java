package br.com.caelum.eats.pagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Service
public class ClienteRestDoPedido {

//    private final String monolitoUrl;
//    private final RestTemplate restTemplate;
	
	@Autowired
	MonolitoClient client;

//    public ClienteRestDoPedido(@Value("${configuracao.monolito.url}") String monolitoUrl, RestTemplate restTemplate) {
//        this.monolitoUrl = monolitoUrl;
//        this.restTemplate = restTemplate;
//    }

    void notificaPagamentoDoPedido(Long pedidoId) {
    	
    	
    	client.atualizaStatus(pedidoId, new PedidoMudancaDeStatusRequest("PAGO"));
    	
    	
//        String endpoint = this.monolitoUrl.concat(String.format("/pedidos/%d/status", pedidoId));

//        ResponseEntity<?> response = restTemplate.exchange(endpoint, HttpMethod.PUT, new HttpEntity<>(new PedidoMudancaDeStatusRequest("pago".toUpperCase())), Map.class);

//        this.restTemplate.put(endpoint, new PedidoMudancaDeStatusRequest("pago".toUpperCase()));

//        if (!HttpStatus.valueOf(response.getStatusCodeValue()).is2xxSuccessful()) {
//            throw new RuntimeException("problema ao tentar mudar o status do pedido: " + pedidoId);
//        }
    }
}

@Getter
@AllArgsConstructor
class PedidoMudancaDeStatusRequest {
    private String status;
}


