public class Anno {

    public static boolean eBisestile(int year){

        int anno = year;

        return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0);
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Hello, there!");

        int anno = 2023;

        if(eBisestile(anno)){
            System.out.println("L'anno " + anno + " e' bisestile");
        } else {
            System.out.println("L'anno " + anno + " non e' bisestile");
        }
    }
}
