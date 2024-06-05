package exercise4.a1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Medium> inventory = new ArrayList<>();

    public void addInventory(Medium medium) {
        this.inventory.add(medium);
    }

    public boolean canRent() {
        return this.inventory.size() <= 5;
    }
    //...
}

