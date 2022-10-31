package Vector_2_0;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double length() { return Math.sqrt(x * x + y * y + z * z); }
    public double scalarMultiply(Vector vector) { return x * vector.x + y * vector.y + z * vector.z; }
    public Vector vectorMultiply(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);}
    public double angle(Vector vector) { return this.scalarMultiply(vector) / (this.length() * vector.length()); }
    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z); }
    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z); }
    public static Vector[] generateArray(int size) {
        var vectors = new Vector[size];
        for (int i = 0; i < vectors.length; i++) {
            double newX = Math.random();
            double newY = Math.random();
            double newZ = Math.random();
            vectors[i] = new Vector(newX, newY, newZ);
        }
        return vectors;
    }
    public String toString() {
        return "x: " + x +
                ";\ny: " + y +
                ";\nz: " + z + ";";
    }
}
