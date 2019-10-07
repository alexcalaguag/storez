package com.ecommerce.storez.kafka.transmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ecommerce.storez.model.Pedido;

@Service
public class PedidoProducer {
	private static final String TOPIC = "pagamento";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(Pedido pedido) {
		System.out.println(String.format("$$ -> Producing message --> %s", pedido.getProduto()));
		this.kafkaTemplate.send(TOPIC, "Gostoso "+pedido.getProduto());
	}
}
