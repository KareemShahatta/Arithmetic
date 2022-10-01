/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Purpose: A binary operator for Addition
 */
public class Mult extends Binop 
{
    /**
     * @param l the left node
     * @param r the right node
     */
   public Mult(Node l, Node r) 
   {
       super(l, r);
   }
   /**
    * @return the result of adding
    * lChild to rChild after each has
    * been evaluated.x
    */
   public double eval() 
   {
       return lChild.eval() * rChild.eval();
   }

   @Override
   public String toString() 
   {
        return "(" + lChild.toString() + " * " + rChild.toString() + ")";
   }
}
