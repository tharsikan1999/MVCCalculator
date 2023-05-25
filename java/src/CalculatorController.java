import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// The Controller coordinates interactions
// between the View and Model
public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;


    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
// Tell the View that when ever the calculate button
// is clicked to execute the actionPerformed method
// in the CalculateListener inner class
        this.theView.addCalculateListener(new CalculateListener());

        this.theView.addCalculateListener1(new CalculateListener1());

        this.theView.addCalculateListener2(
                new CalculateListener2());

        this.theView.addCalculateListener3(
                new CalculateListener3());

        this.theView.addCalculateListener4(
                new CalculateListener4());

    }
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered
            try{
                firstNumber = theView.getFirstNumber();

                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAnswer());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }

        }
    }

    class CalculateListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered

            try{
                firstNumber = theView.getFirstNumber1();

                secondNumber = theView.getSecondNumber1();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution1(theModel.getAnswer1());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

    class CalculateListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered

            try{
                firstNumber = theView.getFirstNumber2();

                secondNumber = theView.getSecondNumber2();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution2(theModel.getAnswer2());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }
    }

    class CalculateListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered

            try{
                firstNumber = theView.getFirstNumber3();

                secondNumber = theView.getSecondNumber3();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution3(theModel.getAnswer3());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }

    }


    class CalculateListener4 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
// Surround interactions with the view with
// a try block in case numbers weren't
// properly entered

            try{
                firstNumber = theView.getFirstNumber4();

                secondNumber = theView.getSecondNumber4();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution4(theModel.getAnswer4());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
        }

    }
}