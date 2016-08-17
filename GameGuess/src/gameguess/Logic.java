
package gameguess;

import java.util.Scanner;
import java.lang.System.*;
/**
 *
 * @author Vladimir Kasharevsky
 */
public class Logic {
     public void logicOfGame(){
         
        int num =(int) ( Math.random() * 11);
        System.out.println("Введите число от 0 до 10");
        Scanner input = new Scanner(System.in); //число, введенное пользователем
        
        if (input.hasNextInt()){  //проверка типа числа
            
            int usernum = input.nextInt(); 
                       
            if ((usernum == num )){ //сравнение чисел
               
                System.out.println("Ура! Победа! Вы выииграли!");
             
            }else{       
                 
                System.out.println("Вы проиграли! Искомое число " + num);
            }
    
            }else{
           
            System.out.println("Некорректное число");
        };
        
    }
        
}
  

