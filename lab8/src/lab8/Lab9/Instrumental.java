package lab8.Lab9;

public class Instrumental extends Composition {
    private String instruments;

    public Instrumental() {
    }

    public Instrumental(String name, double duration, String instruments)  {
        super(name, duration);
        this.instruments = instruments;
    }

    @Override
    public String formDesc() {

        return this.getName() + " // dur: " + this.getDuration() + "\nInstruments: " + instruments;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    @Override
    public String toString() {
        return "Instrumental{" +"name='" + getName() + '\'' +
                ", duration=" + getDuration() +
                "instruments='" + instruments + '\'' +
                '}';
    }
}
