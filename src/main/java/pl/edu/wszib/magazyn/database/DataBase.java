package pl.edu.wszib.magazyn.database;
import org.springframework.stereotype.Component;
import pl.edu.wszib.magazyn.model.Products;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataBase implements IDataBase {
    private final List<Products> products = new ArrayList<>();

    public DataBase(List<Products> products){
        this.products.add(new Products("Ryzen 3", "R234",10));
        this.products.add(new Products("Ram 2400", "r2400", 4));
        this.products.add(new Products("SSD 240GB", "SSD240GB", 30));
    }


    @Override
    public List<Products> getAllProducts() {
        return products;
    }

    @Override
    public boolean AddProducts(String code, int quantity) {
        for (Products products : products) {
            if (products.getCode().equals(code)) {
                products.setAmount(products.getAmount() + quantity);
                return true;
            }
        }
        return false;
    }




    @Override
    public boolean RmvProducts(String code, int quantity) {
        for (Products products : products) {
            if (products.getCode().equals(code) && products.getAmount() >= quantity) {
                products.setAmount(products.getAmount() - quantity);
                return true;
            }
        }
        return false;
    }
}
