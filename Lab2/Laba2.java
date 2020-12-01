import java.util.Scanner;
public class Laba2{

   

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        /**Создаем 3 точки */
        Point3d point1 = new Point3d();
        Point3d point2 = new Point3d();
        Point3d point3 = new Point3d();

        /**Вводим координаты точки 1 */
        System.out.print("Pleasse enter the coordinates point1 = ");
        point1.setX(console.nextDouble());
        point1.setY(console.nextDouble());
        point1.setZ(console.nextDouble());

        /**Вводим координаты точки 2 */
        System.out.print("Pleasse enter the coordinates point2 = ");
        point2.setX(console.nextDouble());
        point2.setY(console.nextDouble());
        point2.setZ(console.nextDouble());

        /**Вводим координаты точки 3 */
        System.out.print("Pleasse enter the coordinates point3 = ");
        point3.setX(console.nextDouble());
        point3.setY(console.nextDouble());
        point3.setZ(console.nextDouble());
        
        /**Сравниваем точки */
        if(point1.isCompare(point2) || point1.isCompare(point3) || point2.isCompare(point3) ){
            System.out.println("points of equal");
            return;
        }
        
        /**Выводим результаты подсчетов */
        System.out.println("Area = "+ String.format("%1.2f", Point3d.computeArea(point1,point2,point3)).replace(',', '.'));
        System.out.println("Distance between point1 and point2 = "+ String.format("%1.2f", point1.distanceTo(point2)).replace(',', '.'));
        System.out.println("Distance between point1 and point3 = "+ String.format("%1.2f", point1.distanceTo(point3)).replace(',', '.'));
        System.out.println("Distance between point2 and point3 = "+ String.format("%1.2f", point2.distanceTo(point3)).replace(',', '.'));
    }

}