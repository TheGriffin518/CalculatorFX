package cs1302.calc;

import javafx.scene.text.TextFlow;

public class AnswerPanel extends TextFlow {

    public Calculator calc;

    /**Constructor for AnswerPanel. Takes in a Calculator argument in order to 
     *to display information
     *@param Calculator calc, passes the Calculator so the variables in Calculator can be used
     */
    public AnswerPanel(Calculator calc) {
	super();
	this.calc = calc;
	setPrefSize(300,50);
	getChildren().add(calc.answerLabel);
    }//constructor


}//AnswerPanel
