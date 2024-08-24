import java.util.*;
/**
 * Functions
 */
public class studentgradecalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
         System.out.println("Enter the marks of the First subject"); 
         a=sc.nextInt();
         System.out.println("Enter the marks of the Second subject"); 
         b=sc.nextInt();
         System.out.println("Enter the marks of the Third subject"); 
         c=sc.nextInt();
        

        int sum = (a+b+c);
         System.out.println("Total Marks:"+sum);

        double avg = sum/3.0;
         System.out.println("Average percentage:"+avg);

         if(avg>=90){
            System.out.println("GRADE :You scored 'A+' grade");
         }else if(avg>=80){
            System.out.println("You score 'A' grade");
         }else if(avg>=70){
            System.out.println("You Scored 'B+' grade");
         }else if(avg>=60){
            System.out.println("You Scored 'B' grade");
         }else if(avg>=50){
            System.out.println("You Scored 'C+' grade");
         }else if(avg>=35){
            System.out.println("You Scored 'C' grade");
         }else if(avg<=35){
            System.out.println("Fail");
         }
        
    }            
}        
         
         
            
         


    

        
    

  
