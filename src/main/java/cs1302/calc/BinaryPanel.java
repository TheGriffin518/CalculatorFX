package cs1302.calc;

import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

public class BinaryPanel extends VBox {

    int FontLabelSize = 25;
    public Calculator calc;

    Label b0 = new Label("0"); //So many Labels
    Label b1 = new Label("0"); //sorry if it hurts your eyes
    Label b2 = new Label("0"); //Imagine being the one to code this...
    Label b3 = new Label("0");
    Label b4 = new Label("0");
    Label b5 = new Label("0");
    Label b6 = new Label("0");
    Label b7 = new Label("0");
    Label b8 = new Label("0");
    Label b9 = new Label("0");
    Label b10 = new Label("0");
    Label b11 = new Label("0");
    Label b12 = new Label("0");
    Label b13 = new Label("0");
    Label b14 = new Label("0");
    Label b15 = new Label("0");
    Label b16 = new Label("0");
    Label b17 = new Label("0");
    Label b18 = new Label("0");
    Label b19 = new Label("0");
    Label b20 = new Label("0");
    Label b21 = new Label("0");
    Label b22 = new Label("0");
    Label b23 = new Label("0");
    Label b24 = new Label("0");
    Label b25 = new Label("0");
    Label b26 = new Label("0");
    Label b27 = new Label("0");
    Label b28 = new Label("0");
    Label b29 = new Label("0");    
    Label b30 = new Label("0");
    Label b31 = new Label("0");

    //an array of labels that contain the bits 
    public Label[] bitLabels = {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
				b11, b12, b13, b14, b15, b16, b17, b18, b19,
				b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31
    };

    /**the constructor which takes in a Calculator as an argument
     *@param Calculator calc, which allows the Binary pane to utilize the variables within Calculator
     */
    public BinaryPanel(Calculator calc) {
	super();
	this.calc = calc;

	//set the Font for each Label
	b0.setFont(new Font(FontLabelSize));
	b1.setFont(new Font(FontLabelSize));
	b2.setFont(new Font(FontLabelSize));
	b3.setFont(new Font(FontLabelSize));
	b4.setFont(new Font(FontLabelSize));
	b5.setFont(new Font(FontLabelSize));
	b6.setFont(new Font(FontLabelSize));
	b7.setFont(new Font(FontLabelSize));
	b8.setFont(new Font(FontLabelSize));
	b9.setFont(new Font(FontLabelSize));
	b10.setFont(new Font(FontLabelSize));
	b11.setFont(new Font(FontLabelSize));
	b12.setFont(new Font(FontLabelSize));
	b13.setFont(new Font(FontLabelSize));
	b14.setFont(new Font(FontLabelSize));
	b15.setFont(new Font(FontLabelSize));
	b16.setFont(new Font(FontLabelSize));
	b17.setFont(new Font(FontLabelSize));
	b18.setFont(new Font(FontLabelSize));
	b19.setFont(new Font(FontLabelSize));
	b20.setFont(new Font(FontLabelSize));
	b21.setFont(new Font(FontLabelSize));
	b22.setFont(new Font(FontLabelSize));
	b23.setFont(new Font(FontLabelSize));
	b24.setFont(new Font(FontLabelSize));
	b25.setFont(new Font(FontLabelSize));
	b26.setFont(new Font(FontLabelSize));
	b27.setFont(new Font(FontLabelSize));
	b28.setFont(new Font(FontLabelSize));
	b29.setFont(new Font(FontLabelSize));
	b30.setFont(new Font(FontLabelSize));
	b31.setFont(new Font(FontLabelSize));

	//markers for points of reference within binary
	Label marker0 = new Label("0");
	Label marker8 = new Label("8");
	Label marker16 = new Label("16");
	Label marker24 = new Label("24");
	Label marker31 = new Label("31");
	Label markerNeg = new Label("(-)");

	//sets the padding for the markers so they appear in the correct location
	marker0.setPadding(new Insets(1,1,1,117));
	marker8.setPadding(new Insets(1,1,1,125));
	marker16.setPadding(new Insets(1,1,1,120));
	marker24.setPadding(new Insets(1,1,1,85));
	marker31.setPadding(new Insets(1,20,1,10));

	//add the labels in groups for readability
	HBox group1 = new HBox(1, b3, b2, b1, b0);
	HBox group2 = new HBox(1, b7, b6, b5, b4);
	HBox group3 = new HBox(1, b11, b10, b9, b8);
	HBox group4 = new HBox(1, b15, b14, b13, b12);
	HBox group5 = new HBox(1, b19, b18, b17, b16);
	HBox group6 = new HBox(1, b23, b22, b21, b20);
	HBox group7 = new HBox(1, b27, b26, b25, b24);
	HBox group8 = new HBox(1, b30, b29, b28);
	HBox group9 = new HBox(1, b31);

	//create rows of the binary digits with markers underneath
	HBox row1 = new HBox(5, group9, group8, group7, group6, group5, group4, group3, group2, group1);
	HBox row2 = new HBox(1, markerNeg, marker31, marker24, marker16, marker8, marker0);
	getChildren().addAll(row1, row2);

	//Toggle the values of the binary by calling the toggle method
	b0.setOnMouseClicked(event -> toggle(b0));
	b1.setOnMouseClicked(event -> toggle(b1));
	b2.setOnMouseClicked(event -> toggle(b2));
	b3.setOnMouseClicked(event -> toggle(b3));
	b4.setOnMouseClicked(event -> toggle(b4));
	b5.setOnMouseClicked(event -> toggle(b5));
	b6.setOnMouseClicked(event -> toggle(b6));
	b7.setOnMouseClicked(event -> toggle(b7));
	b8.setOnMouseClicked(event -> toggle(b8));
	b9.setOnMouseClicked(event -> toggle(b9));
	b10.setOnMouseClicked(event -> toggle(b10));
	b11.setOnMouseClicked(event -> toggle(b11));
	b12.setOnMouseClicked(event -> toggle(b12));
	b13.setOnMouseClicked(event -> toggle(b13));
	b14.setOnMouseClicked(event -> toggle(b14));
	b15.setOnMouseClicked(event -> toggle(b15));
	b16.setOnMouseClicked(event -> toggle(b16));
	b17.setOnMouseClicked(event -> toggle(b17));
	b18.setOnMouseClicked(event -> toggle(b18));
	b19.setOnMouseClicked(event -> toggle(b19));
	b20.setOnMouseClicked(event -> toggle(b20));
	b21.setOnMouseClicked(event -> toggle(b21));
	b22.setOnMouseClicked(event -> toggle(b22));
	b23.setOnMouseClicked(event -> toggle(b23));
	b24.setOnMouseClicked(event -> toggle(b24));
	b25.setOnMouseClicked(event -> toggle(b25));
	b26.setOnMouseClicked(event -> toggle(b26));
	b27.setOnMouseClicked(event -> toggle(b27));
	b28.setOnMouseClicked(event -> toggle(b28));
	b29.setOnMouseClicked(event -> toggle(b29));
	b30.setOnMouseClicked(event -> toggle(b30));
	b31.setOnMouseClicked(event -> toggle(b31));

    }//constructor


    /** Toggles the binary label by switching the text within the label. 
     * @param Label label, the label that needs the text to be switched
     */
    public void toggle(Label label) {
	if(label.getText().equals("1")) {
	    label.setText("0");
	}//if
	else label.setText("1");//else
	updateAnswer();
    }//toggle

    /** Sets all of the Binary Labels to 0 when called.
     * Is used whenever to accurately display the answer in binary
     */

    public void clear() {
	for(int i = 0; i < 32; i++) {
	    bitLabels[i].setText("0");
	}//for
    }//clear

    /**Updates all of the labels to what they should represent in binary
     *
     */
    public void updateBitLabels() {
	String bitString = "";
	clear(); //clears the labels, so the BinaryLabels accurately represent the answer in binary
	if(calc.result < 0){ //if answer is negative converts it to positive to not mess up 
	    bitString = Integer.toBinaryString((calc.result * -1));//binary labels. 
	    bitLabels[31].setText( "1");
	}//if for determinig if answer is negative
	else {
	    bitString = Integer.toBinaryString(calc.result);
	}//else for determining if answer is negative or not
	for(int i = 0; i < bitString.length(); i++){
	    bitLabels[i].setText(Character.toString(bitString.charAt(bitString.length() - 1 -i)));
	}//for
    }//updateBitLabels

    /**This updates the answer to reflect any changes that the user may have made
     *by clicking on any of the binary labels
     */
    public void updateAnswer() {
	String binaryString = "";
	int answer;
	//reads through and gets the binary representation
	for(int i = 30; i >= 0; i--){
	    binaryString += bitLabels[i].getText();
	}//for
	answer = Integer.parseInt(binaryString, 2); //parses the string into binary
	if(bitLabels[31].getText().equals("1")){ //used to switch the answer between negative and non-negative
	    answer = answer * -1;
	}//if
	calc.answerLabel.setText(Integer.toString(answer));
    }//updateAnswer
}//BinaryPanel
