

abstract class Property {
    String address, propertyId;
    long areaInYard, price_per_yard;

    static int propertyCount;

    Property() {
        propertyCount++;
        System.out.println("Default Constructor Called");
    }

    Property(int something) {
        System.out.println("Parameterized Constructor Called");
    }

    public abstract long calculatePriceOfProperty();

    public void printPropertyInfo() {
        System.out.println("propertyId" + propertyId);
        System.out.println("address" + address);
        System.out.println("areaInYard" + areaInYard);
        System.out.println("price_per_yard" + price_per_yard);
        System.out.println("Total Properties: " + propertiesTotalCount());

    }

    public static int propertiesTotalCount() {
        return propertyCount;
    }

}

class FurnishedHome extends Property {

    int furnitureCharge;

    FurnishedHome() {
        System.out.println("Default Constructor Called");
    }

    FurnishedHome(int something) {
        System.out.println("Parameterized Constructor Called");
    }

    @Override
    public long calculatePriceOfProperty() {
        System.out.println("test");
        return 0;
    }

    @Override
    public void printPropertyInfo() {
        super.printPropertyInfo();
    }

}

public class Set2_Property {

}
