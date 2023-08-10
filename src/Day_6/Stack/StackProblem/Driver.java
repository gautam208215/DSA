package Day_6.Stack.StackProblem;

public class Driver {

    public static void main(String[] args) {

        BalancingParentheses balancingParentheses = new BalancingParentheses();
        boolean validSymbolPattern = balancingParentheses.isValidSymbolPattern("{[()[]}]");
        System.out.println(validSymbolPattern);
    }
}
