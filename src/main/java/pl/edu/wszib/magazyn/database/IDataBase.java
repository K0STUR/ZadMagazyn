package pl.edu.wszib.magazyn.database;

import pl.edu.wszib.magazyn.model.Products;

import java.util.List;

public interface IDataBase {
        List<Products> getAllProducts();
        boolean AddProducts(String code, int quantity);
        boolean RmvProducts(String code, int quantity);

}
