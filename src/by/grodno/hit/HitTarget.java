package by.grodno.hit;

public class HitTarget {
    public static void main(String[] args) {
        double x = 0.8;
        double y = 0.1;
        double r = 1;

        if (inRound(x,y,r)&&underParabola(x,y)&&(y > 0))
            System.out.println("Ты попал");
        else System.out.println("Ты не попал");
    }

    public static boolean inRound(double x, double y, double r) {
        if (x * x + y * y < r * r)
        {
            return true;
        }
        return false;
    }

    public static boolean underParabola(double x, double y){
        if (x*x > y)
        {
            return true;
        }
        return false;
    }
}
