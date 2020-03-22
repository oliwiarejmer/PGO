import zadanie1.User;
import zadanie2.Product;
import zadanie3.Category;
import zadanie4.Koszyk;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args) throws Exception {

        System.out.println("zadanie 1 ====================================================================================");

        User user1 = new User("Michał", "Michał", "asd@asd","asd123");
        User user2 = new User("mail@pl.pl");
        User user3 = new User("emailUser@wp.pl");

        user3.setUserFromGuest("Kasia","Nowak","lala123");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
System.out.println();
System.out.println("zadanie 2 ====================================================================================");
        Product product1 = new Product("Sok jabłkowy", 3.99, 509123, 10);
        Product product2 = new Product("Sok pomarańczowy", 5.99, 857392,12 );
        Product product3 = new Product("Sok wiśniowy", 4.99, 123098);

        product2.changePrice(5.79);
        product3.changeQuantity(5);

        product1.getAllParameters();
        product2.getAllParameters();
        product3.getAllParameters();
System.out.println();
        System.out.println("zadanie 3 ====================================================================================");
        List<String> categoryList3 = new ArrayList<>();
        categoryList3.add("marchew");
        categoryList3.add("rzodkiew");
        categoryList3.add("pomidor");

        Category category1 = new Category();
        Category category2 = new Category("Owoce");
        Category category3 = new Category("Warzywa", categoryList3);

        category1.addProduct("produkt1");
        category1.addProduct("product9999");
        category2.addProduct("produkt2");
        category3.addProduct("product3");

        category1.deleteProduct("product9999");
        category3.deleteProduct("pomidor");


        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);

        System.out.println();
        System.out.println("zadanie 4 ====================================================================================");

        Koszyk koszyk1 = new Koszyk(user1);
        Koszyk koszyk2 = new Koszyk();
        Koszyk koszyk3 = new Koszyk(user2,product1);

        koszyk2.addUser(user3);

        koszyk3.addProducts(product1);
        koszyk2.addProducts(product2);

        koszyk3.deleteProduct(product1);

        System.out.println(koszyk1);
        koszyk1.pay();

        System.out.println(koszyk2);
        koszyk2.pay();

        System.out.println(koszyk3);
        koszyk3.pay();



    }
}
