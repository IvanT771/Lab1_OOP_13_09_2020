

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

    public void setX(double x){
        xCord = x;
    }
    public void setY(double y){
        yCord = y;
    }
    public void setZ(double z){
        zCord = z;
    }

    public boolean isCompare(Point3d obj2){

        if (xCord == obj2.getX() && yCord == obj2.getY() && zCord == obj2.getZ() ){
            return true;
        }else{
            return false;
        }
    }

    public double distanceTo(Point3d point2){

        double dist = 0;

        dist = Math.sqrt((point2.getX() - xCord)*(point2.getX() - xCord) 
         +  (point2.getY() - yCord)*(point2.getY() - yCord)
         +  (point2.getZ() - zCord)*(point2.getZ() - zCord));
        return dist;
    }
    
}