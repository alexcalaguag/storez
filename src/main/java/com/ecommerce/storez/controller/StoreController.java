package com.ecommerce.storez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.storez.model.Pedido;
import com.ecommerce.storez.service.PedidoService;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
	
	@Autowired
	private PedidoService pedidoService;

	
	@GetMapping(value = "/consultar-pedido")
	public List<Pedido> consultarPedido() {
		return pedidoService.getPedidos();
	}
	
	@PostMapping(value = "/realizar-pedido")
	public ResponseEntity<Pedido> realizarPedido(@RequestBody Pedido pedido) {
		Pedido response= pedidoService.realizarPedido(pedido);
		return new ResponseEntity<Pedido>(response, HttpStatus.OK);
	}
}
