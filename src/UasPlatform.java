public class UasPlatform extends AirSystem{


    private String propulsion;
    private int motorCount;

    public UasPlatform(String propulsion, int motorCount) {
        this.propulsion = propulsion;
        this.motorCount = motorCount;
    }

    public UasPlatform(int velocity, int capacity, double mass, String type, String propulsion, int motorCount) {
        super(velocity, capacity, mass, type);
        this.propulsion = propulsion;
        this.motorCount = motorCount;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public int getMotorCount() {
        return motorCount;
    }

    public void setMotorCount(int motorCount) {
        this.motorCount = motorCount;
    }

    @Override
    public String toString() {
        return "UasPlatform{" +
                "propulsion='" + propulsion + '\'' +
                ", motorCount=" + motorCount +
                '}';
    }
}
