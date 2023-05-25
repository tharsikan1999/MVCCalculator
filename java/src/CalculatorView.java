import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame{
    //++++++//
    private JTextField firstNumber = new JTextField(5);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(5);

    private JLabel equal = new JLabel("=");

    private JTextField calcSolution = new JTextField(8);

    private JButton calculateButton = new JButton("+");

    private JButton calculateButton1 = new JButton("-");

    private JButton calculateButton2 = new JButton("*");

    private JButton calculateButton3 = new JButton("/");

    private JButton calculateButton4 = new JButton("%");


    //------//

    private JTextField firstNumber1 = new JTextField(5);

    private JLabel additionLabel1 = new JLabel("-");

    private JTextField secondNumber1 = new JTextField(5);

    private JLabel equal1 = new JLabel("=");


    private JTextField calcSolution1 = new JTextField(8);

    // ************** //
    private JTextField firstNumber2 = new JTextField(5);

    private JLabel additionLabel2 = new JLabel("*");

    private JTextField secondNumber2 = new JTextField(5);

    private JLabel equal2 = new JLabel("=");

    private JTextField calcSolution2 = new JTextField(8);

    //////////////////////////

    private JTextField firstNumber3 = new JTextField(5);

    private JLabel additionLabel3 = new JLabel("/");

    private JTextField secondNumber3 = new JTextField(5);

    private JLabel equal3 = new JLabel("=");

    private JTextField calcSolution3 = new JTextField(8);

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

    private  JTextField firstNumber4 = new JTextField(5);

    private JLabel additionLabel4 = new JLabel("%");

    private JTextField secondNumber4 = new JTextField(5);

    private JLabel equal4 = new JLabel("=");

    private JTextField calcSolution4 = new JTextField(8);
    public CalculatorView(){
// Sets up the view and adds the components
        JPanel panel = new JPanel();
        this.setTitle("MVC Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        panel.setBackground(Color.GRAY);

        panel.add(firstNumber);
        panel.add(additionLabel);
        panel.add(secondNumber);
        panel.add(equal);
        panel.add(calcSolution);
        panel.add(calculateButton);


        panel.add(firstNumber1);
        panel.add(additionLabel1);
        panel.add(secondNumber1);
        panel.add(equal1);
        panel.add(calcSolution1);
        panel.add(calculateButton1);


        panel.add(firstNumber2);
        panel.add(additionLabel2);
        panel.add(secondNumber2);
        panel.add(equal2);
        panel.add(calcSolution2);
        panel.add(calculateButton2);

        panel.add(firstNumber3);
        panel.add(additionLabel3);
        panel.add(secondNumber3);
        panel.add(equal3);
        panel.add(calcSolution3);
        panel.add(calculateButton3);

        panel.add(firstNumber4);
        panel.add(additionLabel4);
        panel.add(secondNumber4);
        panel.add(equal4);
        panel.add(calcSolution4);
        panel.add(calculateButton4);

        this.add(panel);

    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getFirstNumber1(){
        return Integer.parseInt(firstNumber1.getText());
    }

    public int getFirstNumber2(){
        return Integer.parseInt(firstNumber2.getText());
    }

    public int getFirstNumber3(){
        return Integer.parseInt(firstNumber3.getText());
    }

    public int getFirstNumber4(){
        return Integer.parseInt(firstNumber4.getText());
    }


    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public int getSecondNumber1(){
        return Integer.parseInt(secondNumber1.getText());
    }
    public int getSecondNumber2(){
        return Integer.parseInt(secondNumber2.getText());
    }
    public int getSecondNumber3(){
        return Integer.parseInt(secondNumber3.getText());
    }

    public int getSecondNumber4(){
        return Integer.parseInt(secondNumber4.getText());
    }




    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }

    public int getCalcSolution1(){
        return Integer.parseInt(calcSolution1.getText());
    }

    public int getCalcSolution2(){
        return Integer.parseInt(calcSolution2.getText());
    }

    public int getCalcSolution3(){
        return Integer.parseInt(calcSolution3.getText());
    }

    public int getCalcSolution4(){
        return Integer.parseInt(calcSolution4.getText());
    }



    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }

    public void setCalcSolution1(int solution){
        calcSolution1.setText(Integer.toString(solution));
    }

    public void setCalcSolution2(int solution){
        calcSolution2.setText(Integer.toString(solution));
    }

    public void setCalcSolution3(int solution){
        calcSolution3.setText(Integer.toString(solution));
    }

    public void setCalcSolution4(int solution){
        calcSolution4.setText(Integer.toString(solution));
    }




    // If the calculateButton is clicked execute a method
// in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

    void addCalculateListener1(ActionListener listenForCalcButton1){
        calculateButton1.addActionListener(listenForCalcButton1);
    }

    void addCalculateListener2(ActionListener listenForCalcButton1){
        calculateButton2.addActionListener(listenForCalcButton1);
    }

    void addCalculateListener3(ActionListener listenForCalcButton1){
        calculateButton3.addActionListener(listenForCalcButton1);
    }

    void addCalculateListener4(ActionListener listenForCalcButton1){
        calculateButton4.addActionListener(listenForCalcButton1);
    }
    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}