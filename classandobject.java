class Calculator{
    int num1;
    public int add(int n1,int n2){
       
        int r=n1+n2;
        return r;
    } 
}


public class classandobject {
    public static void main(String[] args) {
        int a=1;
        int b=5;
        
        Calculator calc=new Calculator() ;
        int c=calc.add(a,b);
        System.out  .println(c);
    }
}
