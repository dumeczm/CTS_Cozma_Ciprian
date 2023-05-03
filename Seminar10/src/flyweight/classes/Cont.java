package flyweight.classes;

public class Cont {
    private float suma;
    private int nrCont;
    public Cont(float suma, int nrCont){
        this.suma=suma;
        this.nrCont=nrCont;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("suma=").append(suma);
        sb.append(", nrCont=").append(nrCont);
        sb.append('}');
        return sb.toString();
    }
}
