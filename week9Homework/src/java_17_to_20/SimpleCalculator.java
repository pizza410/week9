package java_17_to_20;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNUmber) {
        this.firstNumber = firstNUmber;
    }

    public void setSecondNumber(double secondNUmber) {
        this.secondNumber = secondNUmber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber<=0){
            return 0;
        }
        return firstNumber/secondNumber;
    }


}
