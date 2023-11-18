
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class StudentTest {
    


    @Test
    void testGetAverageStudentScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        double expectedValue = 35;
        assertEquals(expectedValue, student.getAverageStudentScore(), 0.001);

    }

    @Test
    void testGetEnglishScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        assertEquals(30, student.getEnglishScore(), 0);


    }

    @Test
    void testGetID() {
        var student = new Student("STD01", 80, 10, 20, 30);
        assertEquals("STD01", student.getID());
    }

    @Test
    void testGetJavaScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        assertEquals(80, student.getJavaScore(), 0);
    }

    @Test
    void testGetMathScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        assertEquals(20, student.getMathScore(),0);
    }

    @Test
    void testGetSQLScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        assertEquals(20, student.getMathScore(),0);

    }

    @Test
    void testSetAverageStudentScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setAverageStudentScore(75.6);
        assertEquals(75.6, student.getAverageStudentScore(),0.001);
    }

    @Test
    void testSetEnglishScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setEnglishScore(75);
        assertEquals(75, student.getEnglishScore(),0);

    }

    @Test
    void testSetID() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setID("STD10");
        assertEquals("STD10", student.getID());
    }

    @Test
    void testSetJavaScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setJavaScore(100);
        assertEquals(100, student.getJavaScore(),0);

    }

    @Test
    void testSetMathScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setMathScore(100);
        assertEquals(100, student.getMathScore(),0);
    }

    @Test
    void testSetSQLScore() {
        var student = new Student("STD01", 80, 10, 20, 30);
        student.setSQLScore(100);
        assertEquals(100, student.getSQLScore(),0);
    }
        
    @Test
    void testCompareTo() {
        var student01 = new Student("STD01", 100, 100, 100, 100);
        var student02 = new Student("STD02", 50, 50, 50, 50);
        var student03 = new Student("STD03", 50, 50, 50, 50);

        assertEquals(1, student01.compareTo(student02), 0);
        assertEquals(-1, student02.compareTo(student01), 0);
        assertEquals(0, student02.compareTo(student03), 0);
        
    }
}
