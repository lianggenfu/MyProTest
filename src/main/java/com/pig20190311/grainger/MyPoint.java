package com.pig20190311.grainger;


import java.util.List;

/*
* 最近距离
已知平面上的若干点的位置，存入一个 List 中。现在需要计算所有这些点中，距离最
近的两个点间的最小距离。请补全缺失的代码。把填空的答案（仅填空处的答案，不包括题
面）存入考生文件夹下对应题号的“解答.txt”中即可。
* */
public class MyPoint {


    private double x; // 横坐标
    private double y; // 纵坐标

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /*
     lst 中含有若干个点的坐标
     返回其中距离最小的点的距离
    */
    public static double getMinDistance(List<MyPoint> lst) {
        if (lst == null || lst.size() < 2) return Double.MAX_VALUE;
        double r = Double.MAX_VALUE;
        MyPoint p0 = lst.remove(0);
        for (int i = 0; i < lst.size(); i++) {
            MyPoint p = lst.get(i);
            double d = MyPoint.distance(p0, p);
            //if (d < r) _________;
        }
       // double d2 = __________________;
       // return d2 < r ? d2 : r;
        return 0;
    }

}
