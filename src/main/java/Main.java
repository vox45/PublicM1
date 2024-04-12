import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();

        ArrayList<Shape> shapes = new ArrayList<>();
    }

    public int increment(ArrayList<Shape> a){

        return 0;
    }
}

class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}