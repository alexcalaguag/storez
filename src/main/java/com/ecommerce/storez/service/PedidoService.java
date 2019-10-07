package com.ecommerce.storez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.storez.kafka.transmission.PedidoProducer;
import com.ecommerce.storez.model.Pedido;
import com.ecommerce.storez.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PedidoProducer producer;

	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}

	public Pedido realizarPedido(Pedido pedido) {
		this.producer.sendMessage(pedido);
		return pedidoRepository.save(pedido);
	}
}
