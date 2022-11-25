package MTPO_EyOD;

import test.Triangle;

/**
 *
 * @author cesar
 */
public class Test {

    public static void main(String[] args) {
        Triangle triDefault = new Triangle();
        
        System.out.println(triDefault);
        System.out.println("area; " + triDefault.computeArea());
        
        Triangle triParams = new Triangle(5.0, 4.0);
        System.out.println(triParams);
        System.out.println("area; " + triParams.computeArea());
    }
}
