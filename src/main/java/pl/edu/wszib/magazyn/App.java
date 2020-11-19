package pl.edu.wszib.magazyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.edu.wszib.magazyn.gui.IGUI;

public class App {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppCofiguration.class).getBean(IGUI.class).showMainMenu();
    }
}
