package javaSummary.lesson06.smallProject.ui;

import javaSummary.lesson06.smallProject.businessLogic.ProductService;
import javaSummary.lesson06.smallProject.entity.Product;

import java.util.Scanner;

public class AddProduct implements MenuCommand {

    private final ProductService service;
    private Long id = 1L;

    public AddProduct(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        Double price = scanner.nextDouble();


        Product product = new Product(name,price);
        product.setId(id++);

        service.addProduct(product);
    }

    @Override
    public String getMenuName() {
        return "Add product";
    }
}
