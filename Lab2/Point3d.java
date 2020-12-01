
public class Point3d extends Point2d{
	
	private double zCoord;
	
	
	Point3d(double x, double y, double z){
		
		setX(x);
		setY(y);
		zCoord = z;
		
	}
	
	Point3d(){
		this(0,0,0);
		
	}
	
	public double getZ() {
		return zCoord;
	}
	
	public void setZ(double z) {
		zCoord = z;
	}
	
	public boolean isCompare(Point3d obj2){

        if (this.getX() == obj2.getX() && this.getY()== obj2.getY() && this.getZ() == obj2.getZ() ){
            return true;
        }else{
            return false;
        }
    }
	
	 public double distanceTo(Point3d point2){

	        double dist = 0;

	        dist = Math.sqrt((point2.getX() - this.getX())*(point2.getX() - this.getX()) 
	         +  (point2.getY() - this.getY())*(point2.getY() - this.getY())
	         +  (point2.getZ() - this.getZ())*(point2.getZ() - this.getZ()));
	        return dist;
	    }
	 
	 public static double computeArea(Point3d p1, Point3d p2, Point3d p3){

	        /**Стороны треугольника */
	        double a=0,b=0,c=0;

	        /**Находим длины сторон */
	        a = Math.sqrt((p2.getX() - p1.getX())  * (p2.getX() - p1.getX()) +
	        (p2.getY() - p1.getY())  * (p2.getY() - p1.getY()) + 
	        (p2.getZ() - p1.getZ())  * (p2.getZ() - p1.getZ()));

	        b = Math.sqrt((p3.getX() - p2.getX())  * (p3.getX() - p2.getX()) +
	        (p3.getY() - p2.getY())  * (p3.getY() - p2.getY()) + 
	        (p3.getZ() - p2.getZ())  * (p3.getZ() - p2.getZ()));

	        c = Math.sqrt((p3.getX() - p1.getX())  * (p3.getX() - p1.getX()) +
	        (p3.getY() - p1.getY())  * (p3.getY() - p1.getY()) + 
	        (p3.getZ() - p1.getZ())  * (p3.getZ() - p1.getZ()));
	       
	        /**Находим полупериметор */
	        double p = (a+b+c)/2;

	        /**Находим площадь */
	        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

	        return s;
	    }

}