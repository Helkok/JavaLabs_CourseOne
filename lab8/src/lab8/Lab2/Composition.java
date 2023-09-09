package lab8.Lab2;


public abstract class Composition {
    private String name;
    private double duration;

    public Composition() {
    }

    public Composition(String name, double duration){
        this.name = name;
        this.duration = duration;
    }

    public abstract String formDesc() ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }



}
