class Cylinder {
    static double getFullArea(int radius, int height){
        return getPerimeter(radius) * height + 2 * getArea(radius);

    }
    private static double getArea(int radius){
        return radius*radius*Math.PI;
    }
    private static double getPerimeter(int radius){
        return 2*radius*Math.PI;
    }

}
