package javaSummary.lesson06.smallProject;

import javaSummary.lesson06.smallProject.businessLogic.ProductService;
import javaSummary.lesson06.smallProject.database.ProductRepository;
import javaSummary.lesson06.smallProject.database.ProductRepositoryImpl;
import javaSummary.lesson06.smallProject.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepositoryImpl();
        ProductService service = new ProductService(repository);

        AddProduct addProduct = new AddProduct(service);
        GetAllProducts getAllProducts = new GetAllProducts(service);
        ExitMenuCommand exitMenuCommand = new ExitMenuCommand();

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addProduct);
        menuCommands.add(getAllProducts);
        menuCommands.add(exitMenuCommand);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();


    }
}
