package dogGo;
import java.util.Arrays;
import java.util.Scanner;
public class BombsHealth {

	public static void main(String[] args) {
		
		 char[][] arr = new char[10][10];
		 Scanner in = new Scanner(System.in); 
		    for (char i = 0; i < arr.length; i++) {
		        for (char j = 0; j < arr[i].length; j++) {
		        	if(i==0||j == 0||i== arr.length -1||j==arr.length-1);
		        	arr[i][j]= '*';
		        
		        
		           System.out.println( arr[i][j] = '*');
		       
		            arr[i][j] = '_';
		            arr[i][0]='@';
		        }
		    }
		    for (char  i =0;i < arr.length;i++) {
		        for (char j = 0; j< arr.length;j++) {
		            System.out.print(arr[i][j]+ " ");
		        }
		        System.out.println();
		      
		      int health = 100;
		     int bomb = 40;
		      int life = 40;
		     char currentPosition = in.nextLine();
		        do{  
		     	   switch (in.nextLine()){
		     	   case "a":
		     		   if (currentPosition != 0){
		     		   arr[currentPosition--]='_';
		     		   arr[currentPosition]='@';
		     	   }
		     	   break;
		     	   case "d":
		     		   if(currentPosition !=0){
		     		  arr[currentPosition++]='_';
		     		 arr[currentPosition]='@';
		     		   }
		     		   break;
		     	   case "w":
		     		   arr[currentPosition++ ]= '_';
		     		   arr[current Position ]='@';
		     		   default:
		     			   System.out.println("wrong key");
		     			   break;
		        }
		        System.out.println(Arrays.toString(arr));
		     	   } while(currentPosition !=(arr.length-1));
		     	   in.close();
		    }
		}
		
	
		
			 
		 
		
		



		        }
		        }
	}
}

