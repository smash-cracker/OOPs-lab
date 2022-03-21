class Rectangle {
    int l,b;
    void getdata() {
        l = 10;
        b = 20;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getdata();
        System.out.println("Area is "+ r1.l*r1.b);
    }
}
