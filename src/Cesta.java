public class Cesta {
    private Trasa a;
    private Trasa b;

    public Cesta(Trasa a, Trasa b) {
        this.a = a;
        this.b = b;
    }

    public Trasa getA() {
        return a;
    }

    public void setA(Trasa a) {
        this.a = a;
    }

    public Trasa getB() {
        return b;
    }

    public void setB(Trasa b) {
        this.b = b;
    }
}
