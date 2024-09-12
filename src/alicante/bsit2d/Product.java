package alicante.bsit2d;


public class Product {
    
    int id;
    String name;
    String category;
    int stockqty;
    double priceperUnit;
    
    public void addProducts(int id, String name, String category, int stockqty, double priceperUnit){
        this.id = id;
        this.name = name;
        this.category = category;
        this.stockqty = stockqty;
        this.priceperUnit = priceperUnit;
    }
    
    
}   
    
}
