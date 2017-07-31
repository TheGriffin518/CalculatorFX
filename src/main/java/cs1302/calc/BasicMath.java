package cs1302.calc;

/**
 * Provides a basic implementation of the operations defined in the Math
 * interface. This implementation assumes that the inputs to each method are
 * non-negative integers.
 *
 * @author Michael "Supa Hot Fire" Cotterell
 */
public class BasicMath implements Math {
    /**adds two integers together
     *
     *@param int lhs, the left hand side integer
     *@param int rhs, the right hand side integer
     *@return int that is the addition of both parameters
     */
    public int add(int lhs, int rhs) {
        return lhs + rhs;
    } // add

    /**subtracts two integers from each other. It substracts the rhs from the lhs
     *
     *@param int lhs, the left hand side integer
     *@param int rhs, the right hand side integer
     *@return int, which is the difference between the lhs and rhs integer
     */
    public int sub(int lhs, int rhs) {
        if (lhs - rhs < 0) return 0;
        return lhs - rhs;
    } // sub

    /**multiplies together two integers and returns the product 
     *
     *@param int lhs, the left hand side integer
     *@param int rhs, the right hand side integer
     *@return int, which is the product of the rhs and lhs integer
     */
     
    public int mul(int lhs, int rhs) {
        return lhs * rhs;
    } // mul

    /**divides two integers that are passed two it and returns the result of said division
     *
     *@param int lhs, the left hand side integer
     *@param int rhs, the right hand side integer
     *@return int, which is the quotient of the lhs and rhs integers
     */
    public int div(int lhs, int rhs) throws ArithmeticException {
        return lhs / rhs;
    } // div

    /**computes the factorial of the number that is passed through it
     *
     *@param int num, which is the factorial to be computed 
     *@return int, which is the complete factorial of the number
     */

    public int fac(int num) {
        // THE NARWHAL BACONS!
	// AT MIDNIGHT!!
        int product = 1;              // products start with one
        int n       = ++num;          // increment, like a boss
        while (n --> 2) product *= n; // while n approaches 2, multiply
        return product;               // wait, "-->",  WAT!?
    } // fac

    /**computes the exponent of the number
     *
     *@param int lhs, the base number
     *@param int rhs, the power the base number is being raised to
     *@return int, which is the result of raising a number to the power of another number
     */
    public int pow(int lhs, int rhs) {
        return (int) java.lang.Math.pow(lhs, rhs);
    } // pow

} // BasicMath
