package javaSummary.lesson06.smallProject.ui;

import javaSummary.lesson06.smallProject.businessLogic.ProductService;

public class GetAllProducts implements MenuCommand{

    private final ProductService service;

    public GetAllProducts(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {
        System.out.println(service.findAll());
    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }
}
