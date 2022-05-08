class product {
    int price;
    String pcode, pname;
    void getdata(String x, String y, int z) {
        pcode = x;
        pname = y;
        price = z;
    }

}

public class Program_1 {
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        p1.getdata("A123","Oneplus",56499);
        p2.getdata("123","Nokia",16999);
        p3.getdata("C123","Lenovo",39999);
        System.out.println("Minimum price is "+Math.min(p1.price, Math.min(p2.price, p3.price)));
    }
}