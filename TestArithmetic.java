import java.text.DecimalFormat;
import java.util.Random;

/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission by:
 * Date:
 * Purpose: Test the Plus Binop
 */
public class TestArithmetic 
{
    public static void main(String[] args) 
    {
        Node node1;
        Node node2;
        Node node3;
        Node node4;

        Node operationLeft;
        Node operationRight;
        Node operationMain;

        for(int i = 0 ; i < 5 ; i++)
        {
            TestArithmetic TA = new TestArithmetic();

            node1 = TA.randConstant();
            node2 = TA.randConstant();
            
            node3 = TA.randConstant();
            node4 = TA.randConstant();
    
            operationLeft = TA.randOperator(node1, node2);
            operationRight = TA.randOperator(node3, node4);
            operationMain = TA.randOperator(operationLeft, operationRight);
            
            System.out.printf(operationMain + " = %.2f\n", operationMain.eval());
        }
    }

    public Const randConstant()
    {
        int randomValue = (int) (Math.random() * 20 + 1);
        return new Const(randomValue);
    }

    public Binop randOperator(Node l , Node r)
    {
        int randomValue = (int) (Math.random() * 4 + 1);
        switch(randomValue)
        {
            case 1 : return new Plus(l,r);
            case 2 : return new Minus(l,r);
            case 3 : return new Divide(l,r);
            case 4 : return new Mult(l,r);
            default : return null;
        }
    }
}
