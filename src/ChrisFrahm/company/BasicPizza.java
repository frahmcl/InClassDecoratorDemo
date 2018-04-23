package ChrisFrahm.company;

public class BasicPizza implements Pizza {
    String name = "Cheese Pizza";
    double cost;

    public BasicPizza(){
        this.name= name;
        this.cost = 5.00;
    }
    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
