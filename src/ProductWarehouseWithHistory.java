public class ProductWarehouseWithHistory extends ProductWarehouse{
    private changeHistory history;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
       history = new changeHistory();
       addToWarehouse(initialBalance);
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double received = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return received;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    public String history(){
        return history.toString();
    }
}
