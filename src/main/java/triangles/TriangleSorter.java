package triangles;

public class TriangleSorter {


    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC){
            return "Equilateral";}
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles";}
        else if (sideA != sideB && sideB != sideC){
            return "Scalene";}
            else{
            return "";
        }


    }

    public boolean pythagoreanTriangleTester(int sideA, int sideB, int sideB) {
        double sumOfTwoSquares = (Math.pow(a, 2) + Math.pow(b, 2));
    }
}