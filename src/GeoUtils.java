public class GeoUtils {

    // methodes statique

    // produits vectoriel 2D

    public static double produitVectorielle2D (double x1,double y1, double x2, double y2, double x3, double y3){
        double u ;
        double w;
        u  = (x2-x1)*(y2-y1);
        w= (x3-x1)*(y3-y1);
        return u*w;

    }

    //Fonction utilitaire qui permet de retourner -1 1 ou 0 en fonction de si c'est un segment ou non
    public static double orientation(double xr, double xy){
        // trois points sont colineaires
        //
    }





    // verification si un point est un segment
    public static double verificationSegment(double xr, double yr, double xp, double yp, double xq, double yq) {
        //min(xp,xq)≤xr≤max(xp,xq)  ⋁ min(yp,yq)≤yr≤max(yp,yq)
        // vraiment pas sure de ce code
        if (Math.min(xp, xp) >= xr && Math.max(xp, xq) <= xr) {
            xr = xr;
        }
        else {
            System.out.println("Ce n'est pas un segment");
        }

        if (Math.min(xp, xq) >= yr && Math.max(yp, yq) >= yr) {
         yr= yr;
        }
        else {
            System.out.println("Ce n'est pas un segment");
        }
    }


    // detection de l'intersection de deux segments



    public static double detectionIntersectionSegment(){

    }









}
