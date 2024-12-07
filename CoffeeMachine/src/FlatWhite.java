public class FlatWhite extends Products{

    public FlatWhite(){
        super(150, 160, 4, 15,"Flat White", 0, 1);
    }
    @Override
    public void productInProgress() {
        System.out.println("Przygotowuje " + name + "..." );
        System.out.println("Zużywam: " + milk + "ml, mleka " + coffe + "gr kawy, " + cup + " kubek" );
        System.out.println();
    }
}
