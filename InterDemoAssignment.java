package OBJAndClass_Demo;

class Areoplane {
    int noseats = 100;

    public Areoplane(int noseats) {
        this.noseats = noseats;
    }

    public String toString() {
        return "Number of Seats: " + noseats;
    }
}

interface i1 {
    int maximumheight = 20000; // constant from interface
}

class B747 extends Areoplane implements i1 {
    String Sector1 = "B747";

    public B747(int noseats, String Sector1) {
        super(noseats);
        this.Sector1 = Sector1;
    }

    public String toString() {
        String arepoString;
        arepoString = "From Class "+Sector1+" Here is Information: ";
        arepoString = arepoString + "Number of Seats: " + noseats + ", ";
        arepoString = arepoString + "Maximum Height: " + maximumheight + ", ";
        arepoString = arepoString + "Name of the Class: " + Sector1;
        return arepoString;
    }
}

class B757 extends Areoplane implements i1 {
    String Sector2 = "B757";

    public B757(int noseats, String Sector2) {
        super(noseats);
        this.Sector2 = Sector2;
    }

    public String toString() {
        String arepoString;
        arepoString = "From Class "+Sector2+" Here is Information: ";
        arepoString = arepoString + "Number of Seats: " + noseats + ", ";
        arepoString = arepoString + "Maximum Height: " + maximumheight + ", ";
        arepoString = arepoString + "Name of the Class: " + Sector2;
        return arepoString;
    }
}

class B767 extends Areoplane implements i1 {
    String Sector3 = "B767";

    B767(int noseats, String Sector3) {
        super(noseats);
        this.Sector3 = Sector3;
    }

    public String toString() {
        String arepoString;
        arepoString = "From Class "+Sector3+" Here is Information: ";
        arepoString = arepoString + "Number of Seats: " + noseats + ", ";
        arepoString = arepoString + "Maximum Height: " + maximumheight + ", ";
        arepoString = arepoString + "Name of the Class: " + Sector3;
        return arepoString;
    }
}

public class InterDemoAssignment {
    public static void main(String[] args) {
        Areoplane[] areoplane = new Areoplane[3];

        for (int i = 0; i < areoplane.length; i++) {
            if (i == 0) {
                areoplane[i] = new B747(120, "B747");

            } else if (i == 1) {
                areoplane[i] = new B757(150, "B757");
            } else {
                areoplane[i] = new B767(200, "B767");
            }
            System.out.println(areoplane[i].toString());
        }
    }
}
