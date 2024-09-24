package  com.carhub.models;
import java.util.*;

class Cars{

    int pow(int b,int p){
        int prod=1;
        for(int i=1;i<=p;i++){
            prod*=b;
        }
        return prod;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();

        Cars car = new Cars();
        int x = car.pow(2,power);
        int rem,sum=0;
        while(x != 0){
            rem = x%10;
            sum+=rem;
            x/=10;
        }
        System.out.println(sum);

    }


}