package calculate;

public class Calculator {
    public static void main(String[] args) {

    }
    public void addition(int a,int b){
        System.out.println("The sum is:"+(a+b));
    }
    public void subtraction(int a,int b){
        System.out.println("The subtraction is:"+(a-b));
    }
    public void division(int a,int b){
        System.out.println("The division  is:"+(a/b));
    }
    public void multiplication(int a,int b){
        System.out.println("The multiplication is:"+(a*b));
    }
    public void calculateResult(int a,int b,char c){
        switch(c){
            case '+':
                addition(a,b);
                break;
            case '-':
                subtraction(a,b);
                break;
            case '*':
                multiplication(a,b);
                break;
            case '/':
                division(a,b);
                break;

        }
    }
}
