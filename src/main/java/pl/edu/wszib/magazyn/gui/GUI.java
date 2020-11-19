package pl.edu.wszib.magazyn.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.magazyn.database.IDataBase;
import pl.edu.wszib.magazyn.model.Products;

import java.util.Scanner;

@Component
public class GUI implements IGUI {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    public IDataBase dataBase;


    @Override
    public void showMainMenu(){
        System.out.println("1: Show product");
        System.out.println("2: Add product");
        System.out.println("3: Take product");
        System.out.println("4: Exit");


        switch (scanner.next()){
            case"1":
                this.showAllProducts();
                this.showMainMenu();
                break;
            case"2":
                this.AddProduct();
                this.showMainMenu();
                break;
            case"3":
                this.takeProduct();
                this.showMainMenu();
                break;
            case"4":
                System.exit(0);


                default:
                    System.out.println("Ups, wrong number");
                    this.showMainMenu();
                    break;
        }

    }

    private void showAllProducts(){
        for(Products products : this.dataBase.getAllProducts()){
            System.out.println(products);
        }
    }

    private void AddProduct(){
        System.out.println("Write product code");
        String serialNumber = scanner.next();
        System.out.println("Give amount of products");
        int count = scanner.nextInt();
        if(dataBase.AddProducts(serialNumber, count)){
            System.out.println("Adding done!");
        } else{
            System.out.println("Adding error!");
        }
    }

    private void takeProduct(){
        System.out.println("Remove product code");
        String serialNumber = scanner.next();
        System.out.println("Remove amount of products");
        int count = scanner.nextInt();
        if(dataBase.RmvProducts(serialNumber, count)){
            System.out.println("Remove done!");
        } else{
            System.out.println("Remove error!");
        }

    }




}
