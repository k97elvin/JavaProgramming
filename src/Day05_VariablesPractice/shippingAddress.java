package Day05_VariablesPractice;

public class shippingAddress {
    public static void main(String[] args) {
        String name = "James king",
                buildingName = "123A",
                streetName = "Jennins Lane",
                zipcode = "22150";
        String address = name + "\n" + buildingName + " " + streetName + ", " + zipcode ;
        System.out.println(address);
    }
}
