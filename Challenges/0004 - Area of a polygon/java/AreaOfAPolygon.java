public class AreaOfAPolygon {
    public static void main(String[] args) {

        System.out.println(area(new Triangle(10.0, 5.0)));
        System.out.println(area(new Rectangle(5.0, 7.0)));
        System.out.println(area(new Square(4.0)));
    }

    public static double area(Polygon polygon) {
        return polygon.getArea();
    }

    public interface Polygon {
        double getArea();
    }

    private static class Triangle implements Polygon {

        private final double base;
        private final double height;

        public Triangle(final double base, final double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return (base * height) / 2;
        }
    }

    private static class Square implements Polygon {

        private final double side;

        public Square(final double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }

    private static class Rectangle implements Polygon {

        private final double length;
        private final double height;

        public Rectangle(final double length, final double height) {
            this.length = length;
            this.height = height;
        }

        @Override
        public double getArea() {
            return length * height;
        }
    }
}