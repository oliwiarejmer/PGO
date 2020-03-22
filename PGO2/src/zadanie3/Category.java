package zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Category {


    private String categoryName;
    private List<String> listOfProducts = new ArrayList<String>();

    public Category(){
        setCategoryName("Primal");
        listOfProducts=getListOfProducts();
    }

    public Category(String categoryName) throws Exception{
        if(categoryName==null) throw new Exception("Błąd danych");
        this.categoryName=categoryName;
    }
    public Category(String categoryName, List<String> listOfProducts) throws Exception{
        if(categoryName==null)throw new Exception("Bład w imieniu");
        if(listOfProducts.isEmpty())throw new Exception("Lista jest pusta");
        this.categoryName=categoryName;
        this.listOfProducts=listOfProducts;
    }


    public void addProduct(String product){

        listOfProducts.add(product);

    }
    public void deleteProduct(String product){

        listOfProducts.remove(product);

    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<String> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", listOfProducts=" + listOfProducts +
                '}';
    }


}
