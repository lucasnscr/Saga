package query.projection;

import command.data.Product;
import command.data.ProductRepository;
import command.model.ProductRestModel;
import org.springframework.stereotype.Component;
import query.queries.GetProductsQuery;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {

    private ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductRestModel> handle(GetProductsQuery getProductsQuery){

        List<Product> products = productRepository.findAll();

        List<ProductRestModel> productRestModels = products.stream().map(product -> ProductRestModel
                .builder()
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .name(product.getName())
                .build())
                .collect(Collectors.toList());

        return productRestModels;

    }


}
