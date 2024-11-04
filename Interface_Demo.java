package AbstractDemo;

class Rectangle {
    int id = 1;
}

interface I1 {
    float no = 3.14f;
    void I1_Method(); // by default, this is an abstract method
}

interface I2 {
    void I2_Method(); // by default, this is an abstract method
}

class Shape extends Rectangle implements I1, I2 {
    Shape() {
        System.out.println("Constructor is Called or Initialized...©");
    }

    @Override
    public void I1_Method() {
        System.out.println("I1_Method() Called from Shape class...😊");
    }

    @Override
    public void I2_Method() {
        System.out.println("I2_Method() Called from Shape class...😅");
    }
}

public class Interface_Demo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.I1_Method();
        shape.I2_Method();
    }
}