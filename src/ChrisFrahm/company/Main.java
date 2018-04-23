package ChrisFrahm.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Pizza basicPizza = new Onions(new Mushrooms(new BasicPizza()));
        System.out.println("Pizza Description: " + basicPizza.getDescription());
        System.out.println("Pizza cost: $" + basicPizza.getCost());

        String []options= new String [] {"\n1)Cheese", "\n2)Pepperoni", "\n3)Onions",
                "\n4)Peppers", "\n5)None"};

        Scanner keyboard = new Scanner(System.in);

        int count = 1;
        Pizza orderPizza = new BasicPizza();
        boolean endLoop = false;

        int userOptionNumber =0;
        while (count < 5 && endLoop != true) {

            System.out.println("Which toppings do you want");
            for (int i = 0; i < options.length; i++) {
                System.out.println(options[i]);
            }
            String userOption = keyboard.nextLine();
             userOptionNumber = Integer.parseInt(userOption);

            switch (userOptionNumber) {
                case 1:
                    orderPizza = new BasicPizza();
                    options[0] = "";
                    count++;
                    break;
                case 2:
                    orderPizza = new Pepperoni(orderPizza);
                    options[1] = "";
                    count++;
                    break;
                case 3:
                    orderPizza = new Onions(orderPizza);
                    options[2] = "";
                    count++;
                    break;
                case 4:
                    orderPizza = new Peppers(orderPizza);
                    options[3] = "";
                    count++;
                    break;
                case 5:
                    endLoop = true;
                    break;
            }
        }
        System.out.println("Pizza Description: " + orderPizza.getDescription());
        System.out.println("Pizza cost: $" + orderPizza.getCost());
    }
}
