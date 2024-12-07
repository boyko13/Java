public abstract class Products {
    protected String name;
    protected double price;
    protected int milk;
    protected int coffe;
    protected int sugar;
    protected int cacao;
    protected int cup;


    public Products(int milk, int coffe, int sugar, double price, String name, int cacao, int cup){
        this.price = price;
        this.milk = milk;
        this.coffe = coffe;
        this.name = name;
        this.sugar = sugar;
        this.cacao = cacao;
        this.cup = cup;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void productInProgress();



}


