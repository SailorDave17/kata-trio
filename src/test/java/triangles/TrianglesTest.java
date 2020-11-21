package triangles;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;


public class TrianglesTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }

    @Test
    public void twoSidesIsAnIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 5, 3);
        assertThat(triangleType).isEqualTo("Isosceles");

    }

    @Test
    public void twoSidesIsAnIsoscelesTriangleSecondTest() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(10, 7, 10);
        assertThat(triangleType).isEqualTo("Isosceles");

    }

    @Test
    public void noSidesEqualIsScaleneTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(1, 2, 3);
        MatcherAssert.assertThat(triangleType, is("Scalene"));
    }

    @Test
    public void noSidesEqualIsScaleneTriangleSecondTest() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(4, 8, 12);
        MatcherAssert.assertThat(triangleType, is("Scalene"));
    }


}
