package javaSummary.lesson06.smallProject.database;

import javaSummary.lesson06.smallProject.entity.Product;

import java.util.List;

public interface ProductRepository {
    void add(Product product);

    List<Product> findAll();

}
