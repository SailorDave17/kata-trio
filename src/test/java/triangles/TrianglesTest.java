package triangles;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;



public class TrianglesTest {

    private TriangleSorter underTest;

    @BeforeEach
    void setUp() {
        underTest = new TriangleSorter();
    }

    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }

    @Test
    public void twoSidesIsAnIsoscelesTriangle() {
        String triangleType = underTest.analyze(3, 5, 3);
        assertThat(triangleType).isEqualTo("Isosceles");

    }

    @Test
    public void twoSidesIsAnIsoscelesTriangleSecondTest() {
        String triangleType = underTest.analyze(10, 7, 10);
        assertThat(triangleType).isEqualTo("Isosceles");

    }

    @Test
    public void noSidesEqualIsScaleneTriangle() {
        String triangleType = underTest.analyze(1, 2, 3);
        assertThat(triangleType).isEqualTo("Scalene");
    }

    @Test
    public void noSidesEqualIsScaleneTriangleSecondTest() {
        String triangleType = underTest.analyze(4, 8, 12);
        assertThat(triangleType).isEqualTo("Scalene");
    }

    @Test

    public void thisIsARightTriangle() {
        boolean triangleType = underTest.triangleTester(5, 12, 13);
        assertThat(triangleType).isEqualTo(true);
    }

    @Test

    public void thisIsARightTriangleSecondTest() {
        boolean triangleType = underTest.triangleTester(4, 3, 5);
       assertThat(triangleType).isEqualTo(true);
    }

    @Test

    public void thisIsATriangle() {
        boolean triangleType = underTest.triangleChecker(1, 1, 5);
        assertThat(triangleType).isEqualTo (false);
    }


}
