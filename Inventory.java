import java.util.ArrayList;
import java.util.List;


public class Inventory {
    public List<InventoryItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(String name, int quantity) {
        InventoryItem newItem = new InventoryItem(name, quantity);
        items.add(newItem);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equals(name));
    }

    public void updateQuantity(String name, int quantity) {
        for (InventoryItem item : items) {
            if (item.getName().equals(name)) {
                item.setQuantity(quantity);
            }
        }
    }

    public void displayInventory() {
        for (InventoryItem item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
    }
}




