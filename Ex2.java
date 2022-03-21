class Rectangle {
    int l,b;
    Rectangle() {
        l = 10;
        b = 10;
    }

    Rectangle(int x,int y) {
        l = x;
        b = y;
    }

    void Perimeter() {
        System.out.println("Perimeter is "+ 2*(l+b));
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,6);
        r1.Perimeter();
        r2.Perimeter();
    }
}
