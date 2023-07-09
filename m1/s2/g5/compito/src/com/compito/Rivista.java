package com.compito;

public class Rivista extends ElemLetteratura {
    private Periodicita period;

    public Rivista(String isbn, String Title, Integer yearPub, Integer numPages, Periodicita period){
        super(isbn, Title, yearPub, numPages);
        this.period = period;
    }

    public Periodicita getperiod(){
        return period;
    }

    public void setperiod(Periodicita period){
        this.period = period;
    }

    public static String toStringFile(Rivista rivista){
        return Rivista.class.getSimpleName() + ")" + rivista.isbn 
                                             + ")" + rivista.title
                                             + ")" + rivista.yearPub
                                             + ")" + rivista.numPages
                                             + ")" + rivista.period;
    }

    public static Rivista fromStringFile(String str){
        String[] split = str.split(")");
        Periodicita period = Periodicita.valueOf(split[5]);

        return new Rivista(split[1], split[2], Integer.valueOf(split[3]), Integer.valueOf(split[4]), period);
    }
}
