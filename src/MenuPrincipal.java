import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MenuPrincipal {
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String fichero = "C:\\Users\\Dam\\eclipse-workspace\\P1Tema6\\src\\miguelfichero.txt";
		FileReader fr = null;
		int na=0;
		int ne=0;
		int ni=0;
		int no=0;
		int nu=0;
		try {

	        fr = new FileReader(fichero);
	        int caract = fr.read();
	        
	        while(caract != -1) {
	        	if ((char)caract=='a'||(char)caract=='A') {
	        		na++;
	        		
	        	}
	        	if ((char)caract=='e'||(char)caract=='E') {
	        		ne++;
	        		
	        	}
	        	if ((char)caract=='i'||(char)caract=='I') {
	        		ni++;
	        		
	        	}
	        	if ((char)caract=='o'||(char)caract=='O') {
	        		no++;
	        		
	        	}
	        	if ((char)caract=='u'||(char)caract=='i') {
	        		nu++;
	        		
	        	}
	        	
	             System.out.print((char)caract);
	            caract = fr.read();
	        }
	        System.out.println("\nNumero de a que ahi es "+na);
	        System.out.println("Numero de e que ahi es "+ne);
	        System.out.println("Numero de i que ahi es "+ni);
	        System.out.println("Numero de o que ahi es "+no);
	        System.out.println("Numero de u que ahi es "+nu);
	        fr.close(); 
	    }
	    catch (FileNotFoundException e) {
	        //Operaciones en caso de no encontrar el fichero
	        System.out.println("Error: Fichero no encontrado");
	        System.out.println(e.getMessage());//Mostrar el error
	    }


	}
}
