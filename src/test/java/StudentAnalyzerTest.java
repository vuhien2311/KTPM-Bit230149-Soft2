import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    public void testCountExcellentStudents_NormalCase() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        // Danh sách toàn bộ hợp lệ
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.0, 10.0)));
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Danh sách trống
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        // Danh sách chỉ chứa giá trị 0 hoặc 10
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0, 8.0)));
    }

    @Test
    public void testCountExcellentStudents_InvalidValues() {
        // Có điểm < 0 hoặc > 10
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 11.0, 15.0)));
    }

    @Test
    public void testCountExcellentStudents_NullList() {
        // Danh sách null
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        // Danh sách có nhiều điểm hợp lệ và không hợp lệ
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllValid() {
        // Danh sách toàn bộ hợp lệ
        assertEquals(7.5, analyzer.calculateValidAverage(Arrays.asList(5.0, 10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        // Danh sách trống
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        // Danh sách chỉ chứa giá trị 0 hoặc 10
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_InvalidValues() {
        // Có điểm < 0 hoặc > 10
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_NullList() {
        // Danh sách null
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.01);
    }

    @Test
    public void testCalculateValidAverage_SingleValid() {
        // Một điểm hợp lệ
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(8.0)), 0.01);
    }
}