public class Main1 {
    public static void main(String[] args) {
        ExpressShippingStrategy cost = new ExpressShippingStrategy();
        DeliveryContext context = new DeliveryContext(cost);
        double ves = 25.6;
        int col = 56;
        double result = context.getShippingStrategy(ves, col);
        System.out.println(result);

    }
}
