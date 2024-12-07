public class CoffeMachine {
    private Inventory inventory;

    public CoffeMachine(){
        this.inventory = new Inventory(500,500,500,10,500);
    }

    public void choseProduct(Products products){
        System.out.println();
        if(inventory.sprawdzDostepnosc(products.milk, products.sugar, products.cup, products.coffe)){
            inventory.useProduct(products.milk, products.sugar, products.cup, products.coffe, products.cacao);
            products.productInProgress();
        }else{
            System.out.println("Brak potrzebnych produktów! Proszę uzupełnić magazyn");
        }



    }

    public void AddProductsOnState(int coffe, int milk, int cacao, int sugar, int cups){
        inventory.addQuantityOfproduct(coffe, milk, cacao, sugar, cups);
        System.out.println("Magazyn uzupełniony");
        System.out.println();
    }
    public void showInventoryState(){
        System.out.println(inventory);

    }
}
