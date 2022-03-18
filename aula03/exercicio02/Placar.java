package exercicio02;
public class Placar {
    private String timeMandante, timeVisitante;
    private int placarMandante, placarVisitante;

//---------------------------------------------------------Construtores------------------------------------------------------------------------

    public Placar(){

    }

    public Placar(String timeMandante,String timeVisitante){
    this.timeMandante=timeMandante;
    this.timeVisitante=timeVisitante;
    placarMandante=0;
    placarVisitante=0;
    }

    public Placar(String timeMandante, String timeVisitante, int placarMandante, int placarVisitante){
        this.timeMandante=timeMandante;
        this.timeVisitante=timeVisitante;
        setPlacarMandante(placarMandante);
        setPlacarVisitante(placarVisitante);
    }




//---------------------------------------------------------Metodos------------------------------------------------------------------------

    public void mostrarPlacar(){
        System.out.println(timeMandante+" "+placarMandante+" X "+placarVisitante+" "+timeVisitante);
    }






//---------------------------------------------------------Get e sett------------------------------------------------------------------------

    public String getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(String timeMandante) {
        this.timeMandante = timeMandante;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        if(placarMandante>0)
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        if(placarVisitante>0)
        this.placarVisitante = placarVisitante;
    } 



}
