package com.ecommerce.storez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.storez.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}