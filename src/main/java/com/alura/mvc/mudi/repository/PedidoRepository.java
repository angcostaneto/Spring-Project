package com.alura.mvc.mudi.repository;

import com.alura.mvc.mudi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Interface JpaRepository has all methods to get, insert, delete for database
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

}
