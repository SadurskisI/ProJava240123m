package javaSummary.lesson06.smallProject.businessLogic;

import javaSummary.lesson06.smallProject.database.ProductRepository;
import javaSummary.lesson06.smallProject.database.ProductRepositoryImpl;
import javaSummary.lesson06.smallProject.entity.Product;

import java.util.List;

public class ProductService {

    private final ProductRepository database;

    public ProductService(ProductRepository database) {
        this.database = database;
    }

    public void addProduct(Product product){

        database.add(product);
    }

    public List<Product> findAll(){
        return database.findAll();
    }
}
