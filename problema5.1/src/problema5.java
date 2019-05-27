

import java.util.Scanner;

public class problema5 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
	        System.out.println("INGRESE LA PALABRA O FRASE: ");
	       String cadena = entrada.nextLine();
	       cadena = cadena.replace(" ", "");
	       int lenght = cadena.length();
	       char [] cadenaChar = cadena.toCharArray();
	       int n = lenght;
	       if ( lenght % 2 != 0){
	           lenght = lenght + 1;
	        }
	      
	       boolean palindromo = true;
	       
	       for (int i = 0; i < lenght/2 ; i++) {
	                      
	           char a = cadenaChar[i];
	           char b = cadenaChar[n - 1 -i];
	           
	            if(a == b){
	               
	           }
	           else{
	               palindromo = false;
	               
	               break;
	            }
	       }
	       
	       if (palindromo == true){
	           System.out.println(" SI ES UN PALINDROMO");
	       }
	       else{
	           System.out.println(" NO ES UN PALINDROMO");
	       }
	} 
}

	
	



