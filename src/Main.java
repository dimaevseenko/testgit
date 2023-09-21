// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else{
            int megaBytes = kiloBytes / 1024;
            int remKiloBytes = (megaBytes==0)?0:kiloBytes % (megaBytes * 1024);
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remKiloBytes+" KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean number(int number){
        return number > 5;
    }
}