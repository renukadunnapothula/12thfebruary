class InventoryUser extends Thread {

    private Inventory inventory;
    private String user;
    private int quantity;

    public InventoryUser(Inventory inventory, String user, int quantity) {
        this.inventory = inventory;
        this.user = user;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        inventory.updateStock(user, quantity);
    }
}
