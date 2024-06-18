import java.util.Scanner;
public class CGPACalculator 
{
    public static void main(String args[])
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
        double[] grades = new double[numberOfSubjects];     // Array to hold the grades
            for (int i = 0; i < numberOfSubjects; i++) 
{
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
  
        double cgpa = calculateCGPA(grades);     // Calculate CGPA
        System.out.printf("Your CGPA is: %.2f", cgpa);  
    }
    
    public static double calculateCGPA(double[] grades)     // Method to calculate CGPA
{
        double total = 0;
        for (double grade : grades) 
{
            total += grade;
        }
        return total / grades.length;
    }
}
