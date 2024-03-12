import java.util.*;
class Guesser{
    int guessNum;
    int guessNum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser,guess the number between 1 and 10 :");
        guessNum=scan.nextInt();
        if(guessNum>=1&&guessNum<=10) {
           System.out.println("continue");
         }
        else {
             System.out.println("Enter valid number");
              guessNum();
        }
        return guessNum;
    }
}
class Player {
    int guessNum;
    int guessNum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player,guess the number between 1 and 10:");
        guessNum=scan.nextInt();
        if(guessNum>=1&&guessNum<=10) {
           System.out.println("continue");
         }
        else {
             System.out.println("Enter valid number");
              guessNum();
        }
      return guessNum;
    }
}
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectNumFromGuesser() {
         Guesser g=new Guesser();
         numFromGuesser=g.guessNum();
    }
    void collectNumFromPlayer() {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
    }
    void compare() {
        if(numFromGuesser==numFromPlayer1) {
            if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3) {
                System.out.println("All players won the game");
            }
            else if(numFromGuesser==numFromPlayer2) {
                System.out.println("player1 and player2 won the game");
            }
            else if(numFromGuesser==numFromPlayer3) {
                System.out.println("player1 and player3 won the game");
            }
            else{
                System.out.println("player1 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer2) {
            if(numFromGuesser==numFromPlayer3) {
                System.out.println("player2 and player3 won");
            }
            else {
            System.out.println("Player2 won");
        }
        }
        else if(numFromGuesser==numFromPlayer3) {
            System.out.println("Player3 won");
        } 
        else {
            System.out.println("Game lost");
        }
    }
}
public class LaunchGame{
    public static void main(String[] args) {
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}