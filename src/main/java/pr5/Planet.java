package pr5;

public enum Planet {
    МЕРКУРИЙ(4.52, 4.52);

    private final double MASS;
    private final double RADIUS;



    Planet(double MASS, double RADIUS) {
        this.MASS = MASS;
        this.RADIUS = RADIUS;
    }

    public double getMASS() {
        return MASS;
    }

    public double getRADIUS() {
        return RADIUS;
    }
    public static final double G = 6.67300;
    double surfaceGravity() {
        return G * MASS/ Math.pow(RADIUS,2);
    }
    double surfaceWeight(double otherMass) {
        return surfaceGravity() * otherMass;
    }
}
