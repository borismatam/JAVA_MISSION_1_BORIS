import java.util.Scanner;

public class App {

    
    /**
     * The main method where the execution of the program begins.
     * @param args 
     */
    public static void main(String[] args) throws Exception {
        
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        // String for creating a separator line
        String spaces = "---------------------------------";

        // Input: Number of students in the class
        System.out.print("How many students are in this class?:");
        String num = scanner.nextLine();
        Integer noStudents = Integer.parseInt(num);

        // Creating a Rank object to manage student data
        Rank rank = new Rank(noStudents);

        // Inputting scores for each student and displaying individual statistics
        for(int i = 0; i < rank.size; i++){
            String id = "STD";
            if(i+1 < 10)
                id += "0";
            id += String.valueOf((i+1));

            // Inputting scores for each subject
            System.out.print(id + " Student's Java Score: ");
            int javaScore = Integer.parseInt(scanner.nextLine());
            System.out.print(id + " Student's SQL Score: ");
            int SQLScore = Integer.parseInt(scanner.nextLine());
            System.out.print(id + " Student's Math Score: ");
            int mathScore = Integer.parseInt(scanner.nextLine());
            System.out.print(id + " Student's English Score: ");
            int englishScore = Integer.parseInt(scanner.nextLine());

            // Adding student scores to the rank and displaying individual statistics
            int studentRank = rank.addStudentScore(id, javaScore, SQLScore, mathScore, englishScore);
            System.out.println(spaces);
            System.out.println("["+id+"] Student's Score Status");
            System.out.println("Java " + javaScore + ", SQL " + SQLScore + ", Math. "+ mathScore + ", English " + englishScore );
            System.out.println(spaces);
            System.out.println("Avg. : " + String.format("%.2f",rank.getStudentAvr(studentRank-1)) + ", Rank : " + studentRank);
            System.out.println(spaces);
        }
        
        // Getting the ordered list of students
        Student[] studentsOrder = rank.getStudentsOrder();

        // Displaying overall student statistics
        for(int i = 0; i< studentsOrder.length;i++){
            Student student = studentsOrder[i];
            String data = student.getID() + ": => Avg. : " + String.format("%.2f", student.getAverageStudentScore()) + ", Rank: " + (i+1)  ;
            System.out.println(data);
        }

        // Displaying class-wide averages
        System.out.println("=====================================");
        rank.CalculateAverage();
        double javaAvg =rank.getAvgJava();
        double SQLAvg =rank.getAvgSQL();
        double mathAvg = rank.getAvgMath();
        double englishAvg = rank.getAvgEnglish();

        System.out.println("Java Class Avg: " + String.format("%.2f", javaAvg));
        System.out.println("SQl Class Avg: " + String.format("%.2f", SQLAvg));
        System.out.println("Math Class Avg: " + String.format("%.2f", mathAvg));
        System.out.println("English Class Avg: " + String.format("%.2f", englishAvg));
        System.out.println("=====================================");

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
