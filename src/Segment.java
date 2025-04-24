import java.util.Objects;

public class Segment {
    private double p1;
    private double p2;

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
    private Segment (){
        this.p1 = p1;
        this.p2 = p2;
    }

    // voir ses deux trucs

    //o	Redéfinir la méthode equals(Object obj) pour comparer deux objets Segment. Deux segments sont considérés égaux si leurs points d'extrémité p1 et p2 sont égaux
    // (l'ordre des points compte pour cette définition). Utilisez Objects.equals() pour une comparaison null-safe des objets Point


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Segment autre = (Segment) obj;
        return Double.compare(autre.p1, p1) == 0;
    }


    // o	Redéfinir la méthode hashCode() de manière cohérente avec la méthode equals(). Utilisez Objects.hash(p1, p2).
    @Override
    public int hashCode() {
        return Objects.hash(this.p1, this.p2);
    }


}









