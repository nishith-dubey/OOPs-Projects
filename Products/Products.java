package OnlineShoppingCart.Products;

public class Products {
    String pname;
    double price;
    int quantity;
    String[] products = {"Shirts","Shoes","Bags","Smartwatches","laptops"};
    public void displayProducts(){
        System.out.println("---------------Home_Page_Products---------------\n");
        for (int i = 0; i < products.length; i++) {
            System.out.println( (i+1) + ". " + products[i]);
        }
        System.out.println("Select products you want to buy : ");
    }
}
