class Calculator{
    public int mul(int num1,int num2){
        return num1*num2;
    }
}
public class classandobject2 {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        Calculator mult=new Calculator();
        int result=mult.mul(a, b);
        System.out.println(result);
        
    }
}
