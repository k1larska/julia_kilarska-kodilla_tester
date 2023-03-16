public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is quite expensive.");
        } else {
            System.out.println("The price is good.");
        }
    }
    public void checkWeight() {
         if (this.weight < 700) {
             System.out.println("This notebook is light.");
         } else if (this.weight > 1900) {
             System.out.println("This notebook is not too heavy.");
         } else {
             System.out.println("This notebook is very heavy.");
         }
    }
    public void checkYear () {
        if (this.year > 2022 && this.price > 1300) {
            System.out.println("This notebook is brand new so its price is high.");
        } else if (this.year < 2000 && this.price < 700) {
            System.out.println("This notebook is old so its price is low.");
        } else {
            System.out.println("This notebook is neither old nor brand new so its price is decent.");
        }
    }

}
