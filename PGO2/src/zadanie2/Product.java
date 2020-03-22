package zadanie2;

public class Product {

    private String name;
    private double price;
    private int codeNumber;
    private int quantity;


    public Product(String name, double price, int codeNumber) throws Exception{
        if(name==null || price<0||codeNumber<0) throw new Exception("Błąd danych");

        this.name=name;
        this.price=price;
        this.codeNumber=codeNumber;
        setQuantity(0);

    }

    public Product(String name, double price, int codeNumber, int quantity) throws Exception{
        if(name==null || price<0||codeNumber<0 || quantity<0) throw new Exception("Błąd danych");
        this.name=name;
        this.price=price;
        this.codeNumber=codeNumber;
        this.quantity=quantity;

    }

    public void changePrice(double myNewPrice){
        this.price=myNewPrice;
    }
    public void changeQuantity(int quantity){
        this.quantity=quantity;
    }

    public void getAllParameters(){
        System.out.println("Name: " + getName() +"; number " + getCodeNumber() +"; price: " +getPrice() +  "; quantity: "+getQuantity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(int codeNumber) {
        this.codeNumber = codeNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", codeNumber=" + codeNumber +
                ", quantity=" + quantity +
                '}';
    }

}
