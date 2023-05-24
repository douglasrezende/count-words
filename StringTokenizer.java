import java.util.StringTokenizer;
public class WordCount {
    public static void main (String args[]){
        String mydelim = " - ";
        String myString = "The  sky - - is blue!";
        StringTokenizer stringTokenizer1 = new StringTokenizer(myString);
        StringTokenizer stringTokenizer2 = new StringTokenizer(myString,mydelim);

        int tokensCount1  = stringTokenizer1.countTokens();
        int tokensCount2  = stringTokenizer2.countTokens();

        System.out.println("Word count without delimiter: "+String.valueOf(tokensCount1));
        System.out.println("Word count: "+String.valueOf(tokensCount2));
    }
}
