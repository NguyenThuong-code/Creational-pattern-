package behaviral.interpreter;

public class Client {
    public static void main(String[] args) {
        System.out.println("20 plus 8 ="+ interpret("20 plus 8"));
        System.out.println("10 minus 4 ="+interpret("10 minus 4"));
    }

    private static int interpret(String s) {
        Expression exp=null;
        if(s.contains("plus")){
            exp=new AddExpression(s);
        }else if (s.contains("minus")){
            exp=new SubtractExpression(s);
        }else {
            throw  new UnsupportedOperationException();
        }
        return exp.interpret(new InterpreterEngineContext());
    }
}
