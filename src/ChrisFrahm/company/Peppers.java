package ChrisFrahm.company;

public class Peppers extends ToppingsDecorator{

    public Peppers(Pizza tempPizza){
        super(tempPizza);
    }
    @Override
    public String getDescription() {
        return tempPizza.getDescription() + " and Peppers";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1;
    }
}
