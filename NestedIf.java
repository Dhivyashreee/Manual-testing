package basic;

public class NestedIf {
    public static void main(String[] args){
        int a= 10;
        int b =10;

        if(a==10){
            if (b>10){
                System.out.print(b + " is greater than " + a);

            }
            else if (b<10){
                System.out.println(b + "is lesser than " + a);
            }
            else{
                System.out.println(b + " is equal to " + a);
            }
        }


    }

}
