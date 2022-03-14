package game;
import javax.swing.*;

public class Game {
    public static void main (String[] args){
        int number = (int) (Math.random()*100 +1);
        int answer = 0;
        System.out.println(" The correct guess is" + number);
        int count = 1;
        
        while (answer != number){
             String response = JOptionPane.showInputDialog(null,
             "enter a number between 1-100", 3);
             answer = Integer.parseInt(response);
             JOptionPane.showMessageDialog(null,"" + determineGuess(answer,number,count));
             count++;
        }
        
    }
    public static String determineGuess(int answer, int number, int count){
        if (answer <=0 || answer >100){
            return "invalid guess";
        }
        else if (answer == number){
            return "congratualtions correct guess \n total guess" + count;
        }
        else if (answer > number){
            return "try again the guess value is too high" + count;
        }
        else if (answer <number){
            return "try again the guess value is too low" + count;
        }
        else{
            return "unlucky your guess is incorrect" + count;
        }
    }
}