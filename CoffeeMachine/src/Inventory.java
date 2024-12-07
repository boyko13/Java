public class Inventory {
    private int coffeQuantity;
    private int milkQuantity;
    private int sugarQuantity;
    private int cupsQuantity;
    private int cacaoQuantity;

    public Inventory(int coffeQuantity, int milkQuantity, int sugarQuantity, int cupsQuantity, int cacaoQuantity){
        this.cacaoQuantity = cacaoQuantity;
        this.coffeQuantity = coffeQuantity;
        this.milkQuantity = milkQuantity;
        this.sugarQuantity = sugarQuantity;
        this.cupsQuantity = cupsQuantity;

}
public boolean sprawdzDostepnosc(int milk, int sugar , int cups, int coffe){
        return (milkQuantity >= milk && sugarQuantity >= sugar && cupsQuantity >= cups && coffeQuantity >= coffe );
}


public void useProduct(int milk, int sugar, int cups, int coffe, int cacao){
        if(sprawdzDostepnosc(milk, sugar, cups, coffe)){
            milkQuantity -= milk;
            sugarQuantity -= sugar;
            cupsQuantity -= cups;
            coffeQuantity -= coffe;
        }else{
            throw new IllegalArgumentException("Brak wystarczających produktów");
        }
}

public void addQuantityOfproduct(int milk, int sugar, int cups, int coffe, int cacao){
        milkQuantity += milk;
        cacaoQuantity += cacao;
        cupsQuantity += cups;
        coffeQuantity += coffe;
}

    @Override
    public String toString() {
        return "\n Zapas kawy: " + coffeQuantity + "\n zapas mleka: " + milkQuantity + "\n zapas kubków: " + cupsQuantity + "\n zapasy Kakao: " + cacaoQuantity + "\n zapas cukru: " + sugarQuantity;

    }
}
