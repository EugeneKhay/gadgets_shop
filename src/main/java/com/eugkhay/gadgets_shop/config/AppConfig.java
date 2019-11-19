package com.eugkhay.gadgets_shop.config;

import com.eugkhay.gadgets_shop.model.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class AppConfig {

    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_SESSION,
//           proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ShoppingCart obtainShoppingCart() {
        return new ShoppingCart();
    }
}
