package ChrisFrahm.company;


public class Onions extends ToppingsDecorator{

    public Onions(Pizza tempPizza){
        super(tempPizza);
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " and Onions";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1;
    }
}
