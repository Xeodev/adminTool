public class AirSystem {


    private int velocity;
    private int capacity;
    private double mass;
    private String type;

    public AirSystem() {

    }

    public AirSystem(int velocity, int capacity, double mass, String type) {
        this.velocity = velocity;
        this.capacity = capacity;
        this.mass = mass;
        this.type = type;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AirSystem{" +
                "velocity=" + velocity +
                ", capacity=" + capacity +
                ", mass=" + mass +
                ", type='" + type + '\'' +
                '}';
    }
}
