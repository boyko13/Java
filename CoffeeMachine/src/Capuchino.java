public class Capuchino extends Products {


    public Capuchino() {
        super(100, 10, 3, 10.20, "Cappuccino", 0, 1);
    }

    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }


}
