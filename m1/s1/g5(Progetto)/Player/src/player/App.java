package player;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);
        Multimedia[] element = new Multimedia[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Creazione elemento: " + i);
            System.out.println("Inserire un titolo");
            String titolo = scanner.nextLine();

            System.out.println("Selezionare il tipo di elemento multimediale");
            System.out.println("Digita 1 per Audio");
            System.out.println("Digita 2 per Video");
            System.out.println("Digita 3 per Immagine");
            System.out.println("Scegli");
            int scegli = scanner.nextInt();
            scanner.nextLine();

            switch (scegli){
                case 1:
                    System.out.println("Inserire la durata dell'audio");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserire il volume dell'audio");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();

                    element[i] = new Audio(durataAudio, titolo, volumeAudio);
                    break;
                case 2:
                    System.out.println("Inserire la durata del video");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserire il volume del video");
                    int volumeVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserire la luminosita del video");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();

                    element[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.println("Inserire la luminosita dell'immagine");
                    int luminositaImmagine = scanner.nextInt();
                    scanner.nextLine();

                    element[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Errore, devi scegliere digitare un numero tra l'1 e il 3");
            }
        }

        while(true){
            System.out.println("Seleziona l'indice da esegire dal 0 al 4 oppure -1 per lo stop");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if(indice == -1){
                break;
            }
            if (indice <0 || indice >=5){
                System.out.println("Indice non valido... riprova");
                continue;
            }

            Multimedia elemento = element[indice];
            if (elemento instanceof Audio){
                Audio audio = (Audio) elemento;
                System.out.println("Elemento audio - titolo " + audio.getTitolo() + ", durata " + audio.getDurata() + "secondi, volume " + audio.getVolume());
            }else if(elemento instanceof Video){
                Video video = (Video) elemento;
                System.out.println("Elemento audio - titolo " + video.getTitolo() + ", durata " + video.getDurata() + "secondi, volume " + video.getVolume() + video.getLuminosita());
            }else if (elemento instanceof Immagine){
                Immagine immagine = (Immagine) elemento;
                System.out.println("Elemento audio - titolo " + immagine.getTitolo() + immagine.getLuminosita());
            }
        }
    }
}

