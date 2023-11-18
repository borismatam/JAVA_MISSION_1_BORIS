import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RankTest {
    @Test
    void testCalculateAverage() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        rank.CalculateAverage();
        assertEquals(53.333, rank.getAvgJava(),0.001);
        assertEquals(60.00, rank.getAvgSQL(),0.001);
        assertEquals(40.00, rank.getAvgMath(),0.001);
        assertEquals(73.333, rank.getAvgEnglish(),0.001);
    }

    @Test
    void testAddStudentScore() {
        var rank = new Rank(3);
        int rankStud1 =rank.addStudentScore("STD01", 90, 30, 60, 80);
        assertEquals(rankStud1, 1,0);
        var student1 = rank.getStudentsOrder()[rankStud1-1];
        assertEquals(90, student1.getJavaScore(),0);
        assertEquals(30, student1.getSQLScore(),0);
        assertEquals(60, student1.getMathScore(),0);
        assertEquals(80, student1.getEnglishScore(),0);

        int stud2= rank.addStudentScore("STD02", 30, 70, 20, 80);
        assertEquals(stud2, 2,0);

    }

    @Test
    void testGetAvgEnglish() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        assertEquals(73.333, rank.getAvgEnglish(),0.001);
    }

    @Test
    void testGetAvgJava() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        assertEquals(53.333, rank.getAvgJava(),0.001);
    }

    @Test
    void testGetAvgMath() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        assertEquals(40.00, rank.getAvgMath(),0.001);
    }

    @Test
    void testGetAvgSQL() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        assertEquals(60.00, rank.getAvgSQL(),0.001);
    }

    @Test
    void testGetStudentAvr() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        var stud1 = rank.addStudentScore("STD03", 40, 80, 40, 60);
        assertEquals(55.0, rank.getStudentAvr(stud1-1),0.001);
    }

    @Test
    void testGetStudentsOrder() {
        var rank = new Rank(3);
        rank.addStudentScore("STD01", 90, 30, 60, 80); 
        rank.addStudentScore("STD02", 30, 70, 20, 80);
        rank.addStudentScore("STD03", 40, 80, 40, 60);
        var order = rank.getStudentsOrder();

        assertEquals("STD01", order[0].getID());
        assertEquals("STD03", order[1].getID());
        assertEquals("STD02", order[2].getID());

    }
}
