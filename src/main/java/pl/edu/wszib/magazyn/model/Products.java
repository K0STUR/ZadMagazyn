package pl.edu.wszib.magazyn.model;

public class Products {
    private String name;
    private String code;
    private int amount;

    public Products(String name, String code, int amount) {
        this.name = name;
        this.code = code;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", amount=" + amount +
                '}';
    }
}
