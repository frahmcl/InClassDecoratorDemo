package ChrisFrahm.company;

abstract class ToppingsDecorator implements Pizza {
    protected Pizza tempPizza;
    public  ToppingsDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }
    public String getName() {
        return tempPizza.getDescription();
    }
    public double getHealth() {
        return tempPizza.getCost();
    }
}