package com.ucheanna.webservice;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
interface ProductRepository extends JpaRepository<Product, Long> {
    @RestResource(path = "/findByName")
    Page<Product> findByNameContains(@Param("productName") String name, Pageable pageable);
}
