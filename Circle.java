// Circle class that extends GeometricObject and implements the Comparable interface
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius; // Private variable to store the radius of the circle

    // Constructors, getters, setters, and other methods from Listing 11.2 omitted)

    // Override the compareTo method from the Comparable interface
    @Override
    public int compareTo(Circle other) {
        // Compare this circle's radius with another circle's radius
        return Double.compare(this.radius, other.radius);
    }

    // Override the equals method from the Object class
    @Override
    public boolean equals(Object obj) {
        // Check if the current object is the same as the object it's being compared
        // with
        if (this == obj) {
            return true;
        }
        // Check to see if the object is null or if the classes of the objects are
        // different
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast the object to Circle type and compare the radii
        Circle other = (Circle) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }

    // "Quick Fix" below only to get rid of error in VS Code for Circle class
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }
}
