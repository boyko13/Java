public class Americano extends Products{
    public Americano(){
        super(300, 80, 3, 13, "Americano", 0,1);
    }

    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }
}
