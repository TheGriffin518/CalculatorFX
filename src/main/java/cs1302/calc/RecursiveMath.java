package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 * The methods calculate the answer for each of the following operations using recursion. 
 * The type of recursion is ordinary tail recursion, due to keeping the method 
 * signatures the same.
 *
 * @author James Griffin
 * @author Jacob Hilmandolar
 */
public class RecursiveMath implements Math {

    Alert alert = new Alert(AlertType.INFORMATION);

    public int inc(int n) {
	return n + 1;
    } // inc


    public int dec(int n) {
	return n - 1;
    } // dec


    public int add(int lhs, int rhs) {
	if(rhs == 0) return lhs;
	return add(inc(lhs), dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
	if (rhs == 0 || lhs == 0) return 0;
	if (rhs == 1) return lhs;
	return add(lhs, mul(lhs, dec(rhs)));
    } // mul

    public int div(int lhs, int rhs) {
	if(rhs == 0){ //Displays an alert dialog pane to inform the user that dividing zero is not possible
	    alert.setContentText("Can't divide by zero!");
	    alert.showAndWait();
	    throw new ArithmeticException();
	}//if
	if(lhs < rhs) return 0;
	if(lhs == rhs) return 1;
	return inc(div(sub(lhs, rhs), rhs));
    } // div

    public int fac(int n) {
	if(n > 0) return mul(n, fac(dec(n)));
	return 1;
    } // fac

    public int pow(int lhs, int rhs) {
	if(rhs == 0) return 1;
	return mul(lhs, pow(lhs,dec(rhs)));
    } // pow

} // RecursiveMath
