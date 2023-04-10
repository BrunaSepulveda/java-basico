package entities;

public class Stock {
  private Product[] products;

  public Stock(int length){
    products = new Product[length];
  }

    public int size(){
    return this.products.length;
  }

  public void setProducts(String name, double price, int position) {
    products[position] = new Product(name, price);
  }


  public double avgPrices(){
    double totalVlaueHeight = 0;
    for(Product product: products) {
      totalVlaueHeight += product.getPrice();
    }
    return totalVlaueHeight/size();
  }
}
