import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        Payments payments = new Payments();
        Scanner scanner = new Scanner(System.in);

        ProductList productList = new ProductList();

        System.out.println("Witam, co dzisiaj sobie życzysz? ");

        boolean dziala = true;

        while(dziala){

            productList.prductList();

            int wybor = scanner.nextInt();

            switch (wybor){
                case 1:
                    payments.paymentProcedure(productList.americano);
                    coffeMachine.choseProduct(productList.americano);
                    break;
                case 2:
                    payments.paymentProcedure(productList.flatWhite);
                    coffeMachine.choseProduct(productList.flatWhite);
                    break;
                case 3:
                    payments.paymentProcedure(productList.espresso);
                    coffeMachine.choseProduct(productList.espresso);
                    break;
                case 4:
                    payments.paymentProcedure(productList.cacao);
                    coffeMachine.choseProduct(productList.cacao);
                case 5:
                    payments.paymentProcedure(productList.late);
                    coffeMachine.choseProduct(productList.late);
                case 6:
                    System.out.println("Podaj ilosc kawy: ");
                    int coffe = scanner.nextInt();
                    System.out.println("Podaj ilosc cukru: ");
                    int sugar =scanner.nextInt();
                    System.out.println("Podaj ilosc kakao: ");
                    int cacao = scanner.nextInt();
                    System.out.println("Podaj ilosc mleka: ");
                    int milk = scanner.nextInt();
                    System.out.println("Podaj ilosc kubków: ");
                    int cups = scanner.nextInt();

                    coffeMachine.AddProductsOnState(coffe, milk, cacao, sugar, cups);
                    break;

                case 7:
                    coffeMachine.showInventoryState();
                    break;

                case 8:
                    dziala = false;
                    break;
            }


        }
        scanner.close();
    }
}