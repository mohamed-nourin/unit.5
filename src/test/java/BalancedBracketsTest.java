import org.junit.Assert;
import org.junit.Test;


public class BalancedBracketsTest {
    String balancedParentheses = "(6)";
    String MoreOpenParentheses = "((6)";
    String MoreClosedParentheses = "(6))";
    String balancedSquareBrackets = "[[6]]";
    String MoreOpenSquare = "[[6]";
    String balancedMixed = "([6])";
    String MoreClosedMixed = "([6]])";

    private BalancedParentheses balanced = new BalancedParentheses();
    private BalancedBrackets balancedBrackets = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedParentheses(){
        //assertTrue checks if the output value is true
        Assert.assertTrue(balanced.balancedParentheses(balancedParentheses));
    }
    @Test
    public void testBalancedBrackets_MoreOpenParentheses(){
        //assertFalse checks if the output value is false
        Assert.assertFalse(balancedBrackets.balancedBrackets("([6)"));
    }
    @Test
    public void testBalancedBrackets_MoreClosedParentheses(){
        Assert.assertFalse(balancedBrackets.balancedBrackets("([6)])"));
    }
    @Test
    public void testBalancedBrackets_balancedSquareBrackets() {
        Assert.assertTrue(balancedBrackets.balancedBrackets("[[6]]"));
    }
    @Test
    public void testBalancedBrackets_MoreOpenSquare() {
        Assert.assertFalse(balancedBrackets.balancedBrackets("[[[[6]]"));
    }
    @Test
    public void testBalancedBrackets_balancedMixed() {
        Assert.assertTrue(balancedBrackets.balancedBrackets("<[[(6)]]>"));
    }
    @Test
    public void testBalancedBrackets_MoreClosedMix() {
        Assert.assertFalse(balancedBrackets.balancedBrackets("[{[6}}]]"));
    }
}