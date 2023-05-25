public class CalculatorModel {
    private int answer;
    private int answer1;

    private int answer2;

    private int answer3;

    private int answer4;
    public void addTwoNumbers(int firstNumber, int secondNumber){
        answer = firstNumber + secondNumber;

        answer1 = firstNumber - secondNumber;

        answer2 = firstNumber * secondNumber;

        answer3 = firstNumber / secondNumber;

        answer4 = firstNumber % secondNumber;


    }

    public int getAnswer(){
        return answer;
    }
    public int getAnswer1(){
        return answer1;
    }
    public int getAnswer2(){
        return answer2;
    }

    public int getAnswer3(){
        return answer3;
    }

    public int getAnswer4(){
        return answer4;
    }

}