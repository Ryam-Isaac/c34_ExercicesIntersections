//Point
import java.util.Objects;

public class Point {
    // Attributs privés
    private double x;
    private double y;

    // Constructeur
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Accesseurs (getters)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutateurs (setters)
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Redéfinition de la méthode equals()
    @Override
    public boolean equals(Object obj) {
        // Vérification de l'identité
        if (this == obj) return true;
        // Vérification de nullité et du type
        if (obj == null || getClass() != obj.getClass()) return false;
        // Transtypage
        Point other = (Point) obj;
        // Comparaison des attributs
        return Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0;
    }

    // Redéfinition de la méthode hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
