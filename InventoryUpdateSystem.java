public class InventoryUpdateSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        InventoryUser u1 = new InventoryUser(inventory, "User-1", -30);
        InventoryUser u2 = new InventoryUser(inventory, "User-2", -50);
        InventoryUser u3 = new InventoryUser(inventory, "User-3", 20);

        u1.start();
        u2.start();
        u3.start();
    }
}
