package pl.jkanclerz.vouchershop.catalog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ProductCatalogConfiguration {

    ProductCatalog myProductCatalog() {
        return new ProductCatalog();
    }

    @Bean
    ProductCatalog myFixtureAwareCatalog() {
        ProductCatalog productCatalog = new ProductCatalog();

        var p1 = productCatalog.registerProduct();
        productCatalog.applyPrice(p1, BigDecimal.valueOf(22.22));
        productCatalog.updateDetails(p1, "Nice product 1", "nice picturee");

        var p2 = productCatalog.registerProduct();
        productCatalog.applyPrice(p2, BigDecimal.valueOf(122.22));
        productCatalog.updateDetails(p2, "Nice product 2", "nice picturee");

        var p3 = productCatalog.registerProduct();
        productCatalog.applyPrice(p3, BigDecimal.valueOf(122.22));
        productCatalog.updateDetails(p3, "Nice product 3", "nice picturee");

        return productCatalog;
    }
}
