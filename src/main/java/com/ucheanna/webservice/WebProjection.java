package com.ucheanna.webservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "web", types = Product.class)
interface WebProjection {
    Long getId();

    String getName();

    double getPrice();
}
