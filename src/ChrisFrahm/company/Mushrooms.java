package ChrisFrahm.company;

public class Mushrooms extends ToppingsDecorator{

    public Mushrooms(Pizza tempPizza){
        super(tempPizza);
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " and Mushrooms";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1;
    }
}
