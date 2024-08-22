public class Sphere {

    private double mass;
    private double radius;
    private double volume;

    public Sphere(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public void calculateInfo() {
        volume = (4.0 / 3.0) * 3.14159 * Math.pow(radius, 3);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Sphere sphere = new Sphere(10.0, 2.0);
        sphere.calculateInfo();
        System.out.println("The volume of the sphere is: " + sphere.volume + " cubic meters");
    }
}