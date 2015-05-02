import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class FractionDemo implements Serializable{
	public static void main(String[]args){
	String fileName = "SerialF.dat";
	 try
	 {
		 Fraction f = new Fraction();
		 f.getNumerator();
		 
		 
	 ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
	 
	 System.out.println("numerator and denominator");
	 System.out.println("in the file " + fileName);
	output.writeObject(f);
	int i = 0;
	while (i >= 3)
	 {
	 System.out.println();
	 
	 }
	 System.out.println("End of reading from file.");
	 output.close();
	 }
	 catch(FileNotFoundException e)
	 {
	 System.out.println("Problem opening the file " + fileName);
	 }
	 catch(EOFException e)
	 {
	 System.out.println("Problem reading the file " + fileName);
	 System.out.println("Reached end of the file.");
	 }
	 catch(IOException e)
	 {
	 System.out.println("Problem reading the file " + fileName);

	
}
	}
}
