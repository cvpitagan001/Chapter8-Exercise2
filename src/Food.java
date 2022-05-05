public class Food {
    private String item;
    private double price, fat, carbs, fiber;

    public Food(
        String itm,
        double prce,
        double ft,
        double crb,
        double fbr
    ) {
        item = itm;
        price = prce;
        fat = ft;
        carbs = crb;
        fiber = fbr;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }
}