package cs1302.calc;

import javafx.scene.layout.VBox;

public class ExpressionPanel extends VBox {

    public Calculator calc; 

    /** Creates the ExpressionPanel and takes in a Calculator object as an argument.
     * This is done so to insure the ExpressionPanel displays the accurate information.
     *@param Calculator calc, the current calculator object being interacted with by the user.
     */
    public ExpressionPanel(Calculator calc) {
	super();
	this.calc = calc;
	setPrefSize(300,50);
	getChildren().addAll(calc.expressionLabel, calc.answerLabel);
    }//constructor
    
}//ExpressionPanel