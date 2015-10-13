import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by BennettIronYard on 10/12/15.
 */
public class InventoryHW {
    public static void  main(String [] args) {
        //HashMap<String, Double> accounts = new HashMap();
        ArrayList <InventoryItem > inventorys = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            /*
            System.out.println("Enter Your User Name");

            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();

            if (!name.equals(""))
                System.out.println("Welcome" + username + "Enter Password");

            String password = scanner.nextLine();

            if (!password.equals("")) {
                System.out.println("Thank You" + name + "Welcome Back");
            }

            */

            for (InventoryItem item : inventorys) {
                System.out.println(item.name + " " + item.amount);
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

                InventoryItem item = new InventoryItem(name, quantityNum);
                inventorys.add(item);
            }
            else if (optionNum == 2) {
                System.out.println("remove an item by number");
                String remove = scanner.nextLine();
                int removeNum = Integer.valueOf(remove);
                inventorys.remove(removeNum - 1);
            }
            else if (optionNum == 3) {
                System.out.println("enter product number");
                String update = scanner.nextLine();
                int updateNum = Integer.valueOf(update);

                System.out.println("enter product quantity");
                String quantity = scanner.nextLine();
                int quantityNum = Integer.valueOf(quantity);

                InventoryItem item = inventorys.get(updateNum - 1);
                item.amount = quantityNum;
            }
        }
    }
}
