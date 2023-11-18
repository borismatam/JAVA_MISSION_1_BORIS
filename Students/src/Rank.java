
public class Rank {
    // Array of students
    private Student[] students;
    
// Averages per subject

    //Average Java
    private double avgJava = 0;
    //Average SQl
    private double avgSQL = 0;
    //Average Math  
    private double avgMath = 0;
    //Average Ensglish
    private double avgEnglish = 0;

    // Maximum size of the student group
    public int size;
    // Current number of students in the group
    public int actual = 0;

    /**
     * Constructor for the Rank class.
     * @param sizeGroupStudents Maximum size of the student group.
     */
    public Rank(int sizeGroupStudents){
        students = new Student[sizeGroupStudents];   
        size = sizeGroupStudents;
    }

    /**
     * Gets the list of students in order.
     * @return Array of students.
     */
    public Student[] getStudentsOrder(){
        return students;
    }

        /**
     * Gets the average score of a student at a specific position.
     * @param position Index(Rank) of the student.
     * @return Average score of the student at the given position(Rank).
     */
    public double getStudentAvr(int position){
        return students[position].getAverageStudentScore();
    }

    /**
     * Calculates averages per subject for all students in the group.
     */
    public void CalculateAverage(){
        for(int i = 0; i < actual; i++){
            avgJava += students[i].getJavaScore();
            avgSQL += students[i].getSQLScore();
            avgMath += students[i].getMathScore();
            avgEnglish += students[i].getEnglishScore();
        }
        avgJava = avgJava/actual;
        avgSQL = avgSQL/actual;
        avgMath = avgMath/actual;
        avgEnglish = avgEnglish/actual;
    }
    /**
    * Gets the average score in Java.
    * @return Average score in Java.
    */
    public double getAvgJava(){
        return avgJava;
    }
    /**
    * Gets the average score in SQl.
    * @return Average score in SQL.
    */
    public double getAvgSQL(){
        return avgSQL;
    }
    /**
    * Gets the average score in Math.
    * @return Average score in Math.
    */
    public double getAvgMath(){
        return avgMath;
    }
    /**
    * Gets the average score in English.
    * @return Average score in English.
    */
    public double getAvgEnglish(){
        return avgEnglish;
    }

    /**
     * Adds a new student in its position with their scores to the group and returns their position in the ranking.
     * @param ID           Student's identification.
     * @param javaScore    Score in Java.
     * @param SQLScore     Score in SQL.
     * @param mathScore    Score in Math.
     * @param englishScore Score in English.
     * @return Position of the student in the ranking.
     */
    public int addStudentScore( String ID, Integer javaScore, Integer SQLScore, Integer mathScore, Integer englishScore){
        
        int rank = -1;
        try{
            Student newStudent = new Student(ID, javaScore, SQLScore, mathScore, englishScore);
            if(actual == 0){
                students[actual] = newStudent;
                actual++;
                rank = 1;
            }
            else{
                for(int i = 0; i<actual; i++){
                    if(newStudent.compareTo(students[i]) > 0){
                        Student savedStuden = students[i];
                        students[i] = newStudent;
                        newStudent = savedStuden;
                        if(rank == -1)
                            rank = i+1;
                    }   
                }
                students[actual] = newStudent;
                actual ++;
                if(rank ==-1)
                    rank = actual;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return rank;
    }

}
