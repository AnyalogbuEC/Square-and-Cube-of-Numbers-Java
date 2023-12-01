//PROGRAM TO CALCULATE SQUARES AND CUBES OF NUMBERS
//DATE: 20/09/2021
package squareandcube;
import javax.swing.JOptionPane;

public class SquareAndCube {
    public static void main(String[] args) {
	System.out.println("S/N \t number\t square\t cube\n");
	float z, z1, c = 0.0f;
	for (int k =1; k<= 9; k++){
            c = Float.parseFloat(JOptionPane.showInputDialog("Enter a number", 0));
            z = square (c);
            z1 = cube (c);
            System.out.println(k + "\t" + c  + "\t" + square(c) + "\t" + cube (c));
	}
    }		
    static float square( float x){
        return  x*x;
    }
    static float cube ( float x){
            return  x*x*x;
    }
}
