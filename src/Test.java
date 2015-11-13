/**
 * Created by Georgi on 11/13/2015.
 */
public class Test {
    public static void main(String[] args) {
        try {
            throw new ProblemException("Some problem");
        }catch (ProblemException e){
            //e.getMessage();
            e.printStackTrace();
            e.printProblem();
        }
    }
}
