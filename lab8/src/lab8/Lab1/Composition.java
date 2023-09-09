package lab8.Lab1;

import java.util.Arrays;

public abstract class Composition {
    private String name;
    private double duration;

    public Composition() {
    }

    public Composition(String name, double duration) throws NazvanieException{
        try{
            if(name==null || name.isEmpty() ){
                throw new NazvanieException();
            }
        }catch (NazvanieException e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            throw e;
        }

        this.name = name;
        this.duration = duration;
    }

    public abstract String formDesc() throws ProdolzhitelnostException;

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

