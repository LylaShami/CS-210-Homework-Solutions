public class Client {
    public static void main(String[] args) {

        //Type name = new type;
        GroceryItemOrder2 lemon = new GroceryItemOrder2("lemon", 2, 1);
        GroceryItemOrder2 cereal = new GroceryItemOrder2("cereal", 2, 1);
        GroceryItemOrder2 bagels = new GroceryItemOrder2("bagels", 2, 1);

        GroceryList2 cart = new GroceryList2();
        cart.add(lemon);
        cart.add(cereal);
        cart.add(bagels);

        output(cart);


    }

    private static void output(GroceryList2 cart) {
        cart.displayItems();
        cart.getTotalCost();
        System.out.println("The total cost:" + cart.getTotalCost());
    }


}
