package ru.stqa.pft.sandbox;

public class Distance {
    public static void main (String[] args){
        Point point1 = new Point (1,1);
        Point point2 = new Point (4,5);
        //считаем расстояние между точками функцией distance()
        System.out.println("Расстояние между точкой 1 с координатами (" + point1.x + ", " + point1.y + ") и точкой 2 с координатами (" + point2.x + ", " + point2.y + ") равно " + distance(point1, point2));
        //считаем расстояние между точками методом Point.distance(Point p)
        System.out.println("Расстояние между точкой 1 с координатами (" + point1.x + ", " + point1.y + ") и точкой 2 с координатами (" + point2.x + ", " + point2.y + ") равно " + point1.distance(point2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.x-p1.x), 2) + Math.pow((p2.y-p1.y),2));
    }
}
