public class Calc {

    public int sum(int a, int b){
        return a + b;
    }
    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b){
        if (b==0){
            System.out.println("Exeption: we can't divide on 0");
        }

        return a / b;
    }
}