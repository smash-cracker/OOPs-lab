class product {
    int pcode, price;
    String pname;
    void getdata(int x, String y, int z) {
        pcode = x;
        pname = y;
        price = z;
    }

}

public class Ex3 {
    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        p1.getdata(123,"Lays",10);
        p2.getdata(213,"Banana",40);
        p3.getdata(312,"Noodles",12);
        System.out.println("Maximum price is "+Math.max(p1.price, Math.max(p2.price, p3.price)));
    }
}
