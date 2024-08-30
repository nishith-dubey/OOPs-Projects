package OnlineShoppingCart.Products;
import OnlineShoppingCart.Cart.Cart;
import OnlineShoppingCart.Login_reg.Login;

public class Main {
    public static void main(String[] args) {
          Login obj1 = new Login();
          obj1.display();
          obj1.takeInput();

          Products obj2 = new Products();
          obj2.displayProducts();
    }
}
