

public class Point3d{

    /** Координаты X */
    private double xCord;
    /**Координаты Y */
    private double yCord;
    /**Координаты Z */
    private double zCord;

    /** Конструктор класса*/
    public Point3d(double x,double y,double z){
        xCord = x;
        yCord = y;
        zCord = z;
    }
    /**Конструктор по умолчанию */
    public Point3d(){
        this(0,0,0);
    }

    /**Возвращение координат */
    public double getX(){
        return xCord;
    }
    public double getY(){
        return yCord;
    }
    public double getZ(){
        return zCord;
    }

    
}