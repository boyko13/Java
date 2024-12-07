public class ProductList {

    FlatWhite flatWhite = new FlatWhite();
    LatteCoffe late = new LatteCoffe();
    Cacao cacao = new Cacao();
    Espresso  espresso = new Espresso();
    Americano americano = new Americano();

    public void prductList(){
        System.out.println();
        System.out.println("W naszym manu mamy takie produkty: ");
        System.out.println("1." + americano.name + ": " + americano.price + "\n2." + flatWhite.name + ": " + flatWhite.price + "\n3." + espresso.name + ": " + espresso.price + "\n4." + cacao.name + ": " + cacao.price + "\n5." + late.name + ": " + late.price + "\n6. Dodaj rzeczy do magazynu" + "\n7.Pokaż magazyn" + "\n8.Wyjdź " );
        System.out.println();
    }
}
