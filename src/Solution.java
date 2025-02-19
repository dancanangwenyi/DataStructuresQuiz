import java.util.Stack;

public class Solution {

    public int solution(int[] H){

        int n = H.length;
        if(n == 0){
            return 0;
        }

        //  We will use the stack to build a wall (Using the stack will optimize by reducing the number of
        // bricks needed through stacking in an optimal way) thus ideal data structure of this problem

        Stack<Integer> stack = new Stack<>();
        int blocks = 0;
        for(int height : H){
            while(!stack.isEmpty() && stack.peek() > height){
                stack.pop();
                blocks++;
            }
            if(stack.isEmpty() || stack.peek() != height){
                stack.push(height);
            }
        }

       return blocks + stack.size();

    }

}
