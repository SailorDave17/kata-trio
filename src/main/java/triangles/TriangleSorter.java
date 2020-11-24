package triangles;

public class TriangleSorter {


    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC){
            return "Equilateral";}
        else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return "Isosceles";}
        else if (sideB != sideC){
            return "Scalene";}
            else{
            return "";
        }


    }

    public boolean triangleTester(int sideA, int sideB, int sideC) {
        double sumOfTwoSquares = (Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return Math.pow(sumOfTwoSquares, 0.5) == sideC;
    }

    public boolean triangleChecker(int sideA, int sideB, int sideC){
        return sideA + sideB > sideC;
    }
}