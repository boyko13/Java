public class LatteCoffe extends Products {


    public LatteCoffe() {

        super(110, 20, 5, 12, "Kawa Latte", 0, 1);
    }

    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }
}
