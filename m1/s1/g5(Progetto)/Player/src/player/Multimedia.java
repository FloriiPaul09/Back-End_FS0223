package player;

abstract public class Multimedia {
    private String titolo;
    private int durata;

    public Multimedia(int durata, String titolo) {
        this.titolo= titolo;
        this.durata= durata;
    }

    public String getTitolo(){
        return titolo;
    }

    public int getDurata(){
        return durata;
    }

    public void play(){
        System.out.println("");
    } 

}

class Audio extends Multimedia implements PlayerInterface{

    private int volume;
    
    public Audio (int durata, String titolo, int volume) {
        super(durata, titolo);
        this.volume= volume; 
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public int abassaVolume(int valore){
        volume -= valore;
        if(volume<0){
            volume = 0;
        }
        return volume;
    }

    @Override
    public int alzaVolume(int valore){
        volume += valore;
        return volume;
    }

	@Override
	public int abassaLuminosita(int valore) {
		return 0;
	}

	@Override
	public int alzaLuminosita(int valore) {
		return 0;
	}

    @Override
    public void play(){
        System.out.println("Riproduzione audio " + getTitolo());

        for(int i = 0; i < getDurata(); i++){
            String esclamativo = "!".repeat(volume);
            System.out.println(getTitolo() + " " + esclamativo);
        }
    }
}

class Video extends Multimedia implements PlayerInterface{
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita){
        super(durata, titolo);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getLuminosita(){
        return luminosita;
    }

    public void setLuminosita(int luminosita){
        this.luminosita = luminosita;
    }

    @Override
    public int abassaVolume(int valore){
        volume -= valore;
        if(volume<0){
            volume = 0;
        }
        return volume;
    }

    @Override
    public int alzaVolume(int valore){
        volume += valore;
        return volume;
    }

	@Override
	public int abassaLuminosita(int valore) {
		luminosita -= valore;
        if (luminosita < 0){
            luminosita = 0;
        }
        return luminosita;
	}

	@Override
	public int alzaLuminosita(int valore) {
		luminosita += valore;
        return luminosita;
	}

    public void play(){
        System.out.println("Riproduzione audio " + getTitolo());

        for(int i = 0; i < getDurata(); i++){
            String esclamativo = "!".repeat(volume);
            String asterischi = "*".repeat(luminosita);
            System.out.println(getTitolo() + " " + esclamativo + " " + asterischi );
        }
    }
}

class Immagine extends Multimedia implements PlayerInterface {
    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(0, titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita(){
        return luminosita;
    }

    public void setLuminosita(int luminosita){
        this.luminosita = luminosita;
    }

    @Override
    public int abassaVolume(int valore) {
        return 0;
    }

    @Override
    public int alzaVolume(int valore) {
        return 0;
    }

    @Override
    public int abassaLuminosita(int valore) {
        luminosita -= valore;
        if (luminosita < 0){
            luminosita = 0;
        }
        return luminosita;
    }

    @Override
    public int alzaLuminosita(int valore) {
        luminosita += valore;
        return luminosita;
    }

    public void show(){
        System.out.println("Mostra l'immagine " + getTitolo());
        String asterischi = "*".repeat(luminosita);
        System.out.println(getTitolo() + " " + asterischi);
    }
}




