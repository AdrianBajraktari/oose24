package exercise4.a1;

public class Library {
    //...
    public void rent(Medium medium, User user) {
        if (user.canRent()) {
            user.addInventory(medium);
            medium.setRenter(user);
        } else {
            System.err.println("Sorry, but you can "
                    + "not rent this item");
        }
    }
}
