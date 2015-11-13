/**
 * Created by Georgi on 11/13/2015.
 */
public class ProblemException extends Exception {
     public ProblemException(String e){
        super(e);
    }

    public void printProblem(){
        System.out.println("some problem");
    }
}
