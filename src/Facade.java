/**
 * Created by mariana.kotsko on 24-Feb-17.
 */

class BuyShoes {
    int shoesPrice (int size) {
        if (size < 20) return 20;
        else return 40;
    }
}

class BuyCoat {
    int coatPrice (int size) {
        if (size < 30) return 100;
        else return 200;
    }
}

class BuyGlasses {
    int glassesPrice (String color) {
        if (color == "green") return 250;
        else return 300;
    }
}

class BuyFacade {
    private BuyShoes shoes = new BuyShoes();
    private BuyCoat coat = new BuyCoat();
    private BuyGlasses glasses = new BuyGlasses();

    int buyClother (int shoesSize, int coatSize, String glassesColor) {
        int shoesPr = shoes.shoesPrice(shoesSize);
        int coatPr = coat.coatPrice(coatSize);
        int glassesPr = glasses.glassesPrice(glassesColor);

        return shoesPr + coatPr + glassesPr;
    }
}

public class Facade {
    public static void main (String[] args) {
        BuyFacade purchase = new BuyFacade();
        int overallPrice = purchase.buyClother(35, 40, "grey");
        System.out.println(overallPrice);
    }
}

