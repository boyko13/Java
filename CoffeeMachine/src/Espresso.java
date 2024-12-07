public class Espresso extends Products{

    public Espresso(){
        super(0, 7, 0, 8, "Espresso", 0, 1);
    }

    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }
}
