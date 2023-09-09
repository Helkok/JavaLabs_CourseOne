package lab8.Lab8;

import java.io.Serializable;

public abstract class Composition implements Serializable {
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

    @Override
    public String toString() {
        return "Composition{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
