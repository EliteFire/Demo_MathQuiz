/**********************************************************/
// Filename:  Demo_Question.java
// Purpose:   Framework of question and used to create the question that is used
//            by both student and teacher GUI (Demo Only)
// Author:    Christopher Morley & Rik Reyes
// Version:   1.2
// Date:	   10-June-2020	   
/**********************************************************/
package mathquiz;

public class Demo_Question implements Comparable <Demo_Question>
{
    private int answer;
    private int leftOperand;
    private String operator;
    private int rightOperand;
    
    public Demo_Question (int lOp, String op, int rOp, int ans)
    {
        answer = ans;
        leftOperand = lOp;
        operator = op;
        rightOperand = rOp; 
    }
    
    public int getLOp()
    {
        return leftOperand;
    }
    public int getROp()
    {
        return rightOperand;
    }
    public String getOperator()
    {
        return operator;
    }
    public int getAnswer()
    {
        return answer;
    }
    @Override
     public String toString()
     {
         // Question format
         return answer + "(" + leftOperand + " " + operator + " " + rightOperand + ")";
     }
     
     // return integer values 0, -1 or 1
     public int compareTo (Demo_Question obj)
     {
         if(this.answer < obj.answer)
            {
                 return -1;
            }
         else if(this.answer > obj.answer)
        {
            return 1;
        }
         else
        {
            return 0;
        }
     }
}
