package gameguess;


import java.util.Scanner;

public class GameGuess {

   
    public static void main(String[] args){      
        
      Logic log = new Logic();    
      Scanner answer = new Scanner(System.in);
      String an; 
        
            do{
     
            log.logicOfGame();
            System.out.println("Играть еще? y/n");  
            an = answer.next();
            
            } while (an.equals("y"));         

    }
}
