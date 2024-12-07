import java.util.Scanner;

public class Payments {
    Scanner scanner = new Scanner(System.in);
    private Inventory inventory;
    private Products products;

    int userMoney;


    public void paymentProcedure(Products products){
        this.products = products;


        System.out.println("Wybrany produkt kosztuje " + products.price + "zł");

            System.out.println();
            System.out.println("Prosze wrzuć pieniądze!: ");

            userMoney = scanner.nextInt();

            double change = changeCalculating(userMoney);
            if(change > 0){
                System.out.println("Twoja reszta: " + change + "zł");
            }

    }

    public double changeCalculating( int userMoney){
        double   reszta = 0;

        if (userMoney >= this.products.price){
            reszta = userMoney - this.products.price;
        }else{
            System.out.println("Nie masz wysterczająco pieniedzy!");
            paymentProcedure(this.products);
        }

        return reszta;
    }



}
