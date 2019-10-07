package com.ecommerce.storez.kafka.transmission;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ecommerce.storez.model.Pedido;

@Service
public class PedidoConsumer {

	    @KafkaListener(topics = "pedido", groupId = "group_id")
	    public void consume(Pedido message) throws IOException {
	        System.out.println(String.format("#### -> Consumed message -> %s", message.getProduto()));
	    }

}
