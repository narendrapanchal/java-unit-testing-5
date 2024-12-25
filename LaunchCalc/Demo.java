public class Demo{
    public static void main(String[] args) {
        // Create an object of the Student class
       Calc c=new Calc();
       int result=c.devide(10,5);
       if(result==2){
        System.out.println("Test case is passed");
       }else{
        System.out.println("Test case is failed");
       }
       int result2=c.devide(20,5);
       if(result2==4){
        System.out.println("Test case is passed");
       }else{
        System.out.println("Test case is failed");
       }
    }
}