package se.filip;
import java.util.Random;

public class DatorGissarTal {
    public void run(){
        Random rand = new Random();
        int tal = 30;
        int guessAnt =0;
        int guessUpdate = 100;
        int guess = 0;
        while (true) {
            if (guess != tal) {
                guess = rand.nextInt(guessUpdate);
                if (guess < tal) {
                    System.out.println("datorn gissade på:"+guess);
                    System.out.println("Det va för lågt");
                    guessAnt++;

                }
                else if(guess > tal){
                    System.out.println("datorn gissade på:" + guess);
                    System.out.println("Det va för högt");
                    guessUpdate = guess;
                    guessAnt++;
                }
                 
                
                
            }
            else{
                System.out.println("Gissade rätt på "+guessAnt+" försök");
                break;
            }
        }


    }
}
