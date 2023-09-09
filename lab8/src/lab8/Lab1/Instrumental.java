package lab8.Lab1;

import java.util.Arrays;

public class Instrumental extends Composition{
    private String instruments;

    public Instrumental() {
    }

    public Instrumental(String name, double duration, String instruments) throws NazvanieException {
        super(name, duration);
        this.instruments = instruments;
    }

    @Override
    public String formDesc() {
        String s;
        try {
            s = this.getName() + " // dur: " + this.getDuration() + "\nInstruments: " + instruments;
        }catch (Exception e){
            s = "Exception";
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return s;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
}
