package com.ucheanna.webservice;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Product.class)
interface MobileProjection {
    Long getId();

    String getName();
}
