package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/**
 * The methods in this class achieve the results through means of iteration. They 
 * use a while loop in order to calculate the operation.
 *
 * @author James Griffin
 * @author Jacob Hilmandolar
 */
public class IterativeMath implements Math {
    
    Alert alert = new Alert(AlertType.INFORMATION);

    public int inc(int n) {
	return n + 1;
    } // inc

    public int dec(int n) {
	return n - 1;
    } // dec

    public int add(int lhs, int rhs) {
	int sum = lhs;
	while(rhs > 0) {
	    sum = inc(sum);
	    rhs = dec(rhs);
	}//while
	return sum;
    } // add

    public int sub(int lhs, int rhs) {
	int diff = lhs;
	while(rhs > 0) {
	    diff = dec(diff);
	    rhs = dec(rhs);
	}//while
	return diff;
    } // sub

    public int mul(int lhs, int rhs) {
	if(rhs == 0 || lhs == 0) return 0;
	int prod = lhs; 
	while(rhs > 1){
	    prod = add(lhs, prod);
	    rhs = dec(rhs);
	}//while
	return prod;
    } // mul

    public int div(int lhs, int rhs) {
	int diff = 0;
	//Throws up an alert dialog pane to alert the user that they can't divide by zero
	if(rhs == 0) {
	    alert.setContentText("Can't divide by zero!");
	    alert.showAndWait();
	    throw new ArithmeticException("Can't divide by zero!");
	}//if
	if(lhs == 0) return diff;
	while( lhs >= rhs) {
	    diff = inc(diff);
	    lhs = sub(lhs, rhs);
	}//while
	return diff;
    } // div

    public int fac(int n) {
	int fac = n;
	if(fac == 0) return 1;
	while (n > 1) {
	    n = dec(n);
	    fac = mul(fac, n);
	}//while
	return fac;
    } // fac

    public int pow(int lhs, int rhs) {
	int power = lhs;
	if(rhs == 0) return 1;
	while(rhs > 1) {
	    rhs = dec(rhs);
	    power = mul(power, lhs);
	}//while
	return power;
    } // pow

} // IterativeMath
