public class Student implements Comparable<Student>{

    //Student ID
    private String ID;
    //Score get in java
    private Integer javaScore;
    //Score get in SQL
    private Integer SQLScore;
    //Score get in Math
    private Integer mathScore;
    //Score get in English
    private Integer englishScore;
    //Average Score of the student
    private Double averageScore;

    /**
     * Constructs a new Student object with the specified parameters.
     * @param ID           The identifier for the student.
     * @param javaScore    The score achieved in Java.
     * @param SQLScore     The score achieved in SQL.
     * @param mathScore    The score achieved in Math.
     * @param englishScore The score achieved in English.
     */
    public Student( String ID, Integer javaScore, Integer SQLScore, Integer mathScore, Integer englishScore){

        if (ID == null || javaScore == null || SQLScore == null || mathScore == null || englishScore == null) {
            throw new IllegalArgumentException("Parameters cannot be null");
        }
        if (javaScore < 0 || SQLScore < 0 || mathScore < 0 || englishScore < 0) {
            throw new IllegalArgumentException("Scores cannot be negative");
        }
        this.ID = ID;
        this.javaScore = javaScore;
        this.SQLScore = SQLScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        double totalScore = javaScore + SQLScore + mathScore + englishScore;
        averageScore = totalScore/4;
    }




    /**
    * Sets the ID of the student.
    * @param ID The new ID to set.
    */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
    * Sets the Java score of the student.
    * @param javaScore The new Java score to set.
    */
    public void setJavaScore(Integer javaScore) {
        this.javaScore = javaScore;
    }

    /**
    * Sets the SQL score of the student.
    * @param SQLScore The new SQL score to set.
    */
    public void setSQLScore(Integer SQLScore) {
        this.SQLScore = SQLScore;
    }

    /**
    * Sets the Math score of the student.
    * @param mathScore The new Math score to set.
    */
    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    /**
    * Sets the English score of the student.
    * @param englishScore The new English score to set.
    */
    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    /**
    * Sets the Average score of the student.
    * @param averageScore The new Average score to set.
    */
    public void setAverageStudentScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    /**
    * @return The Id of the student.
    */
    public String getID(){
        return ID;
    }

    /**
     * @return The Java score of the student.
     */
    public Integer getJavaScore(){
        return javaScore;
    }

    /**
     * @return The SQL score of the student.
     */
    public Integer getSQLScore(){
        return SQLScore;
    }

    /**
     * @return The Math score of the student.
     */
    public Integer getMathScore(){
        return mathScore;
    }

    /**
     * @return The English score of the student.
     */
    public Integer getEnglishScore(){
        return englishScore;
    }

    /**
     * @return The Average score of the student.
     */
    public Double getAverageStudentScore(){
        return averageScore;
    }
    /**
     * Compare this student with another student by the average score
     * @return 1 if this student has a higer score, 0 if its equal, -1 if its lower
     */
    @Override
    public int compareTo(Student otherStudent){
        double scoreOtherStudent = otherStudent.getAverageStudentScore();
        return (scoreOtherStudent < averageScore)? 1: ((scoreOtherStudent ==averageScore)? 0: -1);
    }
    
}
