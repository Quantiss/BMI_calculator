import java.util.Scanner;

/**
 * BMI calculator.
 * 
 * @author Nathaniel L Fergusson
 * @version 12.14.16
 */

public class BMI
{
       public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            
            System.out.println("\t\tVersion 02.11.17.20.16\n");
            
            System.out.println("===========================================================");
            System.out.println("\t\t Body Mass Index Calculator! ");
            System.out.println("===========================================================\n\n");
            
           
            System.out.println("Enter your first name- ");
                    String name = in.next();
                    System.out.println();
                   
            System.out.println("Enter your gender with the according number-\n\n \t-[0] Male- \n \t-[1] Female- ");
                    int gender = in.nextInt();
                    System.out.println();
                    
            System.out.println("Enter your age- ");
                    int age = in.nextInt();
                    System.out.println();
                    
            System.out.println("Enter the unit with the according number-\n\n \t-[0] Metric-\n\t-[1] Imperial- ");
                    int unit = in.nextInt();
                    System.out.println();
            
            
            if(gender == 0){
                
                if(unit == 0)
                { 
                
                    System.out.println("Weight in Kilograms- ");
                        double weightKG = in.nextDouble();
                        System.out.println();
                        
                    System.out.println("Height in Centimeters- ");
                        double heightCM = in.nextDouble();
                        System.out.println();
                        
                    double menBMIM = weightKG / (heightCM * heightCM);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Name- " + name + "\n");
                        System.out.println("Age- " + age + "\n");
                        System.out.println("Weight- " + weightKG + " " + "KG" + "\n");
                        System.out.println("Height- " + heightCM + " " + "CM" + "\n");
                        System.out.println("Gender- Male" + "\n");
                        System.out.println("Your Body Mass Index(BMI) in Metric- " + menBMIM + "\n");
                    if(menBMIM < 18.5 )
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered underweight-\n");
                    }else if(menBMIM <= 24.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered a heathyweight-\n");
                    }else if(menBMIM <= 29.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered overweight-\n");
                    }else 
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered obese-\n");
                    }
                        System.out.println("-----------------------------------------------------------");
                }
                else if(unit == 1)
                {
                    
                   System.out.println("Weight in Pounds- ");
                        double weightPD = in.nextDouble();
                        System.out.println();
                        
                   System.out.println("Height in Inches- ");
                        double heightIN = in.nextDouble();
                        System.out.println();
                        
                   double menBMIi = weightPD / (heightIN * heightIN);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Name- " + name + "\n");
                        System.out.println("Age- " + age + "\n");
                        System.out.println("Weight- " + weightPD + " " + "PD" + "\n");
                        System.out.println("Height- " + heightIN + " " + "IN" + "\n");
                        System.out.println("Gender- Male" + "\n");
                        System.out.println("Your Body Mass Index(BMI) in Imperial- " + menBMIi + "\n");
                   if(menBMIi < 18.5 )
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered underweight-\n");
                    }else if(menBMIi <= 24.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered a heathyweight-\n");
                    }else if(menBMIi <= 29.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered overweight-\n");
                    }else 
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered obese-\n");
                    }
                        System.out.println("-----------------------------------------------------------");
                }
                else
                {
                        
                        System.out.println("**Please enter a valid entry** ");
                        System.out.println();
                    
                }
            }
                else if(gender == 1)
            {
                     if(unit == 0)
                    { 
                        
                    System.out.println("Weight in Kilograms- ");
                        double weightKG = in.nextDouble();
                        System.out.println();
                        
                    System.out.println("Height in Centimeters- ");
                        double heightCM = in.nextDouble();
                        System.out.println();
                        
                    double womenBMIM = weightKG / (heightCM * 2);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Name- " + name + "\n");
                        System.out.println("Age- " + age + "\n");
                        System.out.println("Weight- " + weightKG + " " + "KG" + "\n");
                        System.out.println("Height- " + heightCM + " " + "CM" + "\n");
                        System.out.println("Gender- Female" + "\n");
                        System.out.println("Your Body Mass Index(BMI) in Metric- " + womenBMIM + "\n");
                         if(womenBMIM < 18.5 )
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered underweight-\n");
                    }else if(womenBMIM <= 24.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered a heathyweight-\n");
                    }else if(womenBMIM <= 29.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered overweight-\n");
                    }else 
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Metric is considered obese-\n");
                    }
                        System.out.println("-----------------------------------------------------------");
                    }
                    else if(unit == 1)
                    {
                        
                    System.out.println("Weight in Pounds- ");
                        double weightPD = in.nextDouble();
                        System.out.println();
                        
                    System.out.println("Height in Inches- ");
                        double heightIN = in.nextDouble();
                        System.out.println();
                        
                        double womenBMIi = weightPD / (heightIN * 2);
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("Name- " + name + "\n");
                        System.out.println("Age- " + age + "\n");
                        System.out.println("Weight- " + weightPD + " " + "PD" + "\n");
                        System.out.println("Height- " + heightIN + " " + "IN" + "\n");
                        System.out.println("Gender- Female" + "\n");
                        System.out.println("Your Body Mass Index(BMI) in Imperial- " + womenBMIi + "\n");
                         if(womenBMIi < 18.5 )
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered underweight-\n");
                    }else if(womenBMIi <= 24.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered a heathyweight-\n");
                    }else if(womenBMIi <= 29.9)
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered overweight-\n");
                    }else 
                    {
                        System.out.println("-Your Body Mass Index(BMI) in Imperial is considered obese-\n");
                    }
                        System.out.println("-----------------------------------------------------------");
                    }
                    else
                    {
                        
                        System.out.println("**Please enter a valid entry** ");
                        System.out.println();
                    
                    }
            
            }
            else 
            {
                     
                System.out.println(" **Please restart the program and enter a valid entry**  \n " );
                
            }  
        }
}
