package test;

/**
 *
 * @author cesar
 */
public class Triangle {

    private double base;
    private double height;

    public Triangle() {

    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return (this.base * this.height)/ 2;
}

    @Override
    public String toString() {
        return "Triangle" + "base=" + base + ", height=" + height;
    }


}
