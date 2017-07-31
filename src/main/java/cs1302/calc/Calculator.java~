package cs1302.calc;

import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;


public class Calculator extends BorderPane {

    public String expression = "";
    public Label expressionLabel = new Label(expression);
    public Label answerLabel = new Label("");
    public String[] infix;
    public String[] postfix;
    public boolean rec = false;
    public boolean bin = true;
    public int result;

    //the buttons for the calculator so people can push them    
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button divide, multiply, subtract, add, factorial, carrot, equal;
    private Button leftShift, rightShift, backspace, clear;
    private Button recursion, hideBinary;

    VBox buttons = new VBox();
    HBox row1, row2, row3, row4;
    
    /**The constructor for Calculator. Has no parameters and brings together all of the other components
     *
     */
    public Calculator() {

	super(); //Not as super as SUPA MIKE!!
	//AnswerPanel, BinaryPanel, and ExpressionPanel getting this instance of Calculator passed to them
	AnswerPanel answer = new AnswerPanel(this);
	BinaryPanel binary = new BinaryPanel(this);
	ExpressionPanel expressionPanel = new ExpressionPanel(this);

	//set the size of the calculator
	setPrefSize(515,200);
	
	//initialize each button
	//numbers
	zero = new Button("0");
	one = new Button("1");   //So many buttons to initialize!!
	two = new Button("2");  
	three = new Button("3");
	four = new Button("4");
	five = new Button("5");
	six = new Button("6");
	seven = new Button("7"); 
	eight = new Button("8");
	nine = new Button("9");

	//operators
	divide = new Button("/");
	multiply = new Button("*");
	subtract = new Button("-");
	add = new Button("+");
	equal = new Button("=");
	
	//GUI modifiers
	backspace = new Button("<");
	clear = new Button("X");
	factorial = new Button("!");
	carrot = new Button("^");
	leftShift = new Button("<<");
	rightShift = new Button(">>");
	
	//Which implementation to use
	recursion = new Button("Use Recursion");
	hideBinary = new Button("Hide Binary");

	//set the dimensions of the buttons
	//numbers
	one.setPrefSize(65, 30);
	two.setPrefSize(65, 30);
	three.setPrefSize(65, 30);
	four.setPrefSize(65, 30);
        five.setPrefSize(65, 30);
	six.setPrefSize(65, 30);
	seven.setPrefSize(65, 30);
	eight.setPrefSize(65, 30);
	nine.setPrefSize(65, 30);
	zero.setPrefSize(65, 30);

	//operators
        factorial.setPrefSize(65, 30);
	backspace.setPrefSize(65, 30);
	clear.setPrefSize(65, 30);
	multiply.setPrefSize(65, 30);
	carrot.setPrefSize(65, 30);
	leftShift.setPrefSize(65, 30);
	rightShift.setPrefSize(65, 30);
	subtract.setPrefSize(65, 30);
	add.setPrefSize(65, 30);
	divide.setPrefSize(65, 30);

	//GUI modifiers
	recursion.setPrefSize(205, 30);
	equal.setPrefSize(135, 30);
	hideBinary.setPrefSize(205, 30);

	//Initializing each HBox with spacing of 5
	row1 = new HBox(5);
	row2 = new HBox(5);
	row3 = new HBox(5);
	row4 = new HBox(5);

	//add Buttons to the HBoxes
	row1.getChildren().addAll(seven, eight, nine, divide, factorial, backspace, clear);
	row2.getChildren().addAll(four, five, six, multiply, carrot, leftShift, rightShift);
	row3.getChildren().addAll(one, two, three, subtract, recursion);
	row4.getChildren().addAll(zero, equal, add, hideBinary);

	//Adding padding between the HBoxes
	row1.setPadding(new Insets(5));
	row2.setPadding(new Insets(5));
	row3.setPadding(new Insets(5));
	row4.setPadding(new Insets(5));

	//add the HBoxes (rows of buttons) to the VBox and the AnswerPanel and BinaryPanel aswell
	buttons.getChildren().addAll(row1,row2,row3,row4);
	
	//set the style of equal, recursion, hideBinary, backspace, and clear buttons
	equal.setStyle("-fx-color: lightgreen");
	recursion.setStyle("-fx-color: lightskyblue");
	hideBinary.setStyle("-fx-color: lightskyblue");
	backspace.setStyle("-fx-color: orange");
	clear.setStyle("-fx-color: orange");
	
	//Add the all of the components of Calculator
	setTop(expressionPanel);
	setCenter(binary);
	setBottom(buttons);

	//setting the actions for each button
	//numbers
	zero.setOnAction(event -> {
		expression = expression = expression + "0";     
		expressionLabel.setText(expression);
	    });//zero

	one.setOnAction(event -> {
		expression = expression = expression + "1";
		expressionLabel.setText(expression);
	    });//one

	two.setOnAction(event -> {
		expression = expression = expression + "2";
		expressionLabel.setText(expression);
	    });//two

	three.setOnAction(event -> {
		expression = expression = expression + "3";
		expressionLabel.setText(expression);
	    });//three

	four.setOnAction(event -> {
		expression = expression = expression + "4";
		expressionLabel.setText(expression);
	    });//four

	five.setOnAction(event -> {
		expression = expression = expression + "5";
		expressionLabel.setText(expression);
	    });//five

	six.setOnAction(event -> {
		expression = expression = expression + "6";
		expressionLabel.setText(expression);
	    });//six

	seven.setOnAction(event -> {
		expression = expression = expression + "7";
		expressionLabel.setText(expression);
	    });//seven

	eight.setOnAction(event -> {
		expression = expression = expression + "8";
		expressionLabel.setText(expression);
	    });//eight

	nine.setOnAction(event -> {
		expression = expression = expression + "9";
		expressionLabel.setText(expression);
	    });//nine

	//mathematical operators
	divide.setOnAction(event -> {
		expression = expression + " / ";
		expressionLabel.setText(expression);
	    });//divide

	multiply.setOnAction(event -> {
		expression = expression + " * ";
		expressionLabel.setText(expression);
	    });//multiply

	subtract.setOnAction(event -> {
		expression = expression + " - ";
		expressionLabel.setText(expression);
	    });//subtract

	add.setOnAction(event -> {
		expression = expression + " + ";
		expressionLabel.setText(expression);
	    });//add

	factorial.setOnAction(event -> {
		expression = expression + " !";
		expressionLabel.setText(expression);
	    });//factorial

	carrot.setOnAction(event -> {
		expression = expression + " ^ ";
		expressionLabel.setText(expression);
	    });//carrot

	//modifiers for GUI
	clear.setOnAction(event -> {
		expression = "";
		binary.clear();
		expressionLabel.setText(expression);
		answerLabel.setText(expression);
	    });//clear

	backspace.setOnAction(event -> {
		expression = expression.substring(0, expression.length() - 1);
		expressionLabel.setText(expression);
		answerLabel.setText("");
	    });//backspace

	leftShift.setOnAction(event -> {
		expression = expression + " << ";
		expressionLabel.setText(expression);
	    });//leftShift

	rightShift.setOnAction(event -> {
		expression = expression + " >> ";
		expressionLabel.setText(expression);
	    });//rightShift

	recursion.setOnAction(event -> {
		if(recursion.getText().equals("Use Recursion")) {
		    recursion.setText("Use Iterative");
		    rec = true;
		}//if
		else {
		    recursion.setText("Use Recursion");
		    rec = false;
		}//else
	    });//recursion

	hideBinary.setOnAction(event -> {
		if(hideBinary.getText().equals("Hide Binary")){  //sets the text on the button to indicate
		    binary.setVisible(false);                    //if the BinaryPanel is hidden or not
		    hideBinary.setText("Show Binary");
		    bin = false;
		}//if
		else {
		    binary.setVisible(true);                     
		    hideBinary.setText("Hide Binary");
		    bin = true;
		    binary.updateBitLabels();
		}//else
	    });//hideBinary

	equal.setOnAction(event -> {
		String infix[] = expression.split(" ");    //infix and postfix for ReversePolsihNotation
		String postfix[] = ReversePolishNotation.infixToPostfix(infix);
		Math iterativeMath = new IterativeMath(); 
		Math recursiveMath = new RecursiveMath();
		if(rec) { //determines which implementation of math to used based on whether or not the user 
		    try { //has selected recursion or not
			result = ReversePolishNotation.evaluate(recursiveMath, postfix);
			answerLabel.setText(Integer.toString(result));
		    }//try
		    catch(Exception e) {
			System.out.println(e);
		    }//catch
		    
		    if(bin) { //updates the BinaryPanel if the user has decided to have it visible
			binary.updateBitLabels();
		    }//if(bin)
		}//if(rec)
		
		else {
		    try {
			result = ReversePolishNotation.evaluate(iterativeMath, postfix);
			answerLabel.setText(Integer.toString(result));
		    }//try
		    catch (Exception e) {
			System.out.println(e);
		    }//catch

		    if(bin) {
			binary.updateBitLabels();
		    }//if(bin)
		}//else
	    });

    }//Calculator constructor


}//calculator