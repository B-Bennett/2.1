import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/12/15.
 */
public class InventoryHW {
    public static void  main(String [] args) {
        //HashMap<String, Double> accounts = new HashMap();
        ArrayList<InventoryItem> inventories = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {


            for (InventoryItem item : inventories) {
                System.out.println(String.format("%s %d %s", item.name, item.amount, item.category));
            }
            System.out.println("Options");
            System.out.println("[1] Create item");
            System.out.println("[2] remove an item");
            System.out.println("[3] update an quantity");

            String option =  scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum == 1) {
                System.out.println("Type a Product name");
                String name = scanner.nextLine();

                System.out.println("Type Product quantity");
                String quantity = scanner.nextLine();
                int quantityNum = Integer.valueOf(quantity);

                // Adding a number to categories. Bump to next line \n
                System.out.println("Choose Category");
                System.out.println("[1] Miscellaneous\n[2] Transportation\n[3] Attack\n[4] Food\n[5] Treasure\n");

                String category = scanner.nextLine();

                InventoryItem item = createItem(category);
                item.name = name;
                item.amount = quantityNum;
                inventories.add(item);
            }
            else if (optionNum == 2) {
                System.out.println("remove an item by number");
                String remove = scanner.nextLine();
                int removeNum = Integer.valueOf(remove);
                inventories.remove(removeNum - 1);
            }
            else if (optionNum == 3) {
                System.out.println("enter product number");
                String update = scanner.nextLine();
                int updateNum = Integer.valueOf(update);

                System.out.println("enter product quantity");
                String quantity = scanner.nextLine();
                int quantityNum = Integer.valueOf(quantity);

                InventoryItem item = inventories.get(updateNum - 1);
                item.amount = quantityNum;
            }
        }
    }
        // Choose by name or Number
    static InventoryItem createItem(String category) {
        if (category.equals("Miscellaneous") || category.equals("1")) {
            return new Miscellaneous();
        } else if (category.equals("Transportation") || category.equals("2")) {
            return new Transportation();
        } else if (category.equals("Attack") || category.equals("3")) {
            return new Attack();
        } else if (category.equals("Food") || category.equals("4")) {
            return new Food();
        } else if (category.equals("Treasure") || category.equals("5")) {
            return new Treasure();
        } else {
            return new InventoryItem();
        }
    }

}
