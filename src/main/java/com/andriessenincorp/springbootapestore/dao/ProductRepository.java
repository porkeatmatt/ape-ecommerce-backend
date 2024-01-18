package com.andriessenincorp.springbootapestore.dao;

import com.andriessenincorp.springbootapestore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

// httpRequest zijn normaal niet toegestaan op andere ports, bv als je vanuit localhost:4200 (angular) een request doet
// naar localhost:8080 (spring)
//door deze annotatie geef je wel toestemming
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
