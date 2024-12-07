public class Cacao extends Products{

    public Cacao(){
        super(400, 0, 8, 13, "Kakao", 25, 1);
    }

    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }
}
