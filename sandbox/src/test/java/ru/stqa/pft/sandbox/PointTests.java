package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTests {
    //Проверка корректности расчёта расстояния методом distance
    public void testDistanceMethod(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(4,5);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }
    //Проверка корректности расчёта расстояния функцией distance
    public void testDistanceFunction(){
        Point p1 = new Point(4,5);
        Point p2 = new Point(1,1);
        Assert.assertEquals(Distance.distance(p1, p2), 5.0);
    }
    //Проверяем, что метод и функция возвращают одинаковый результат
    public void testEquality(){
        Point p1 = new Point(1.23,2.34);
        Point p2 = new Point(3.45,4.56);
        Assert.assertEquals(Distance.distance(p1, p2), p1.distance(p2));
    }
}
