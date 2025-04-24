import java.util.Objects;

public class Point {

    // attributs
    private double x;
    private double y;


    // getters et setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y){
        x = this.x;
        y = this.y;
    }


    // voir ses deux trucs


    //o	Redéfinir la méthode equals(Object obj) pour comparer deux objets Point.
    // Deux points sont considérés égaux si leurs coordonnées x et y sont égales.


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Point autre = (Point) obj;

        return Double.compare(autre.x, autre.y) == 0;
    }


    //o	Redéfinir la méthode hashCode() //passe tous les attributs
    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }
}




