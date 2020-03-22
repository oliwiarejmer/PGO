package zadanie4;

import zadanie1.User;
import zadanie2.Product;
import java.util.ArrayList;
import java.util.List;

public class Koszyk {

    Product product;
    User user = null;


    List<Product> productList = new ArrayList<>();
    public Koszyk(){

    }

    public Koszyk(User user){
        this.user=user;
    }
    public Koszyk(User user, Product product){
        this.user=user;
        this.product=product;
    }

    public void addUser(User newUser){
        this.user = newUser;
    }
    public void addProducts(Product products){
        products.setQuantity(products.getQuantity()-1);
        this.productList.add(products);

    }

    public void deleteProduct(Product product){
        product.setQuantity(product.getQuantity()+1);
        this.productList.remove(product);
    }

    public void pay(){
        double sum=0;
        for(Product prod : productList){
            sum += prod.getPrice();
        }
        System.out.println("Cena: "+sum);
    }

    @Override
    public String toString(){
        return "user mail: " + user.getEmail() + " products: " + productList;
    }

}
