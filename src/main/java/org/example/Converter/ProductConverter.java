package org.example.Converter;

import org.example.Dto.ProductDto;
import org.example.Entity.Category;
import org.example.Entity.Product;

public class ProductConverter {

    public static Product  convertDtoToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setCategory(
                new Category(productDto.getCategoryId()));

        return product;
    }
}
