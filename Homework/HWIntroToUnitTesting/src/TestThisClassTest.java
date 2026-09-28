
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestThisClassTest{
    @org.junit.jupiter.api.Test
    public void testNumberOfXs() {
        TestThisClass g1 = new TestThisClass();
        TestThisClass g2 = new TestThisClass();
        TestThisClass g3 = new TestThisClass();
        TestThisClass g4 = new TestThisClass();
        assertTrue(g1.numberOfXs("XXXXxxx")==7);//Deploys a large number of upper and lowercase Xs
        assertTrue(g2.numberOfXs("XiXiXO")==3);//Deploys a number of Xs and a number of non-Xs
        assertTrue(g3.numberOfXs("auosdhfaudskhoifajdsoifaoisdofsa")==0);//Deploys a long string, that does not contain any Xs
        assertTrue(g4.numberOfXs("Xavier is a cruel, cruel person, who needs to be kept away from the Xanax")==3);//Contains a sentence, which contains 3 Xs.
        //g4's test fails. Lowercase y's char value, int divided by 8 is the same as the lowercase x. I suspect the same occurs with the uppercase Y.
    }
    @org.junit.jupiter.api.Test
    public void testCountChocula() {
        TestThisClass g1 = new TestThisClass();
        TestThisClass g2 = new TestThisClass();
        TestThisClass g3 = new TestThisClass();
        TestThisClass g4 = new TestThisClass();
        assertTrue(g1.countChocula("Chocula")==1);//Tests Chocula, by itself.
        assertTrue(g2.countChocula("XiXiXO")==0);//Who needs creativity? Tests a string that is not Chocula.
        assertTrue(g3.countChocula("chocula")==0);//Lowercase chocula, which should be discarded.
        assertTrue(g4.countChocula("Chocula is a cruel, cruel person. His son, Chocula Jr, is somehow even worse.")==2);//Tests multiple Choculas.
        //g1's test fails. The test runs once for every number above 7 that the String length is. Chocula, by itself, is of length 7, so the loop doesn't even run once.
    }
    @org.junit.jupiter.api.Test
    public void testCountAlternations() {
        TestThisClass g1 = new TestThisClass();
        TestThisClass g2 = new TestThisClass();
        TestThisClass g3 = new TestThisClass();
        TestThisClass g4 = new TestThisClass();
        int[] input1 = {1,-1,1,-1,1,-1,1};
        int[] input2 = {-1,-2,-1,-2};
        int[] input3 = {72,5-123,234,-555,-5+123,4};
        int[] input4 = {2,2};
        //Pre-initialization of the inputs is required for this code to run properly.
        assertTrue(g1.countAlternations(input1)==6);//Tests a continuous alteration between 1 and -1.
        assertTrue(g2.countAlternations(input2)==0);//Tests an alteration between -1 and -2.
        assertTrue(g3.countAlternations(input3)==4);//Tests multiple different numbers, including equations. The first four alternate between negative and positive.
        assertTrue(g4.countAlternations(input4)==0);//Tests two 2s. Say that 22 times fast.
        //Surprisingly, all gs pass their tests.
    }


}
