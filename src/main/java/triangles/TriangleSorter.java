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

    public boolean TriangleTester(int sideA, int sideB, int sideC) {
        double sumOfTwoSquares = (Math.pow(sideA, 2) + Math.pow(sideB, 2));
        if (Math.pow(sumOfTwoSquares, 0.5) == sideC)
            return true;
        else
            return false;
    }
}