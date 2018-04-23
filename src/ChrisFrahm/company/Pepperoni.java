package ChrisFrahm.company;

public class Pepperoni extends ToppingsDecorator{

    public Pepperoni(Pizza tempPizza){
        super(tempPizza);
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " and Pepperoni";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.5;
    }
}
