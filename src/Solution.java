import java.util.Stack;

public class Solution {

    public int solution(int[] H) {

        int n = H.length;
        if (n == 0) {
            return 0; // If there are no heights, no blocks are needed.
        }

        // We will use a stack to efficiently track the height of walls.
        // The stack helps minimize the number of blocks required by ensuring
        // we only push heights that contribute to new blocks.

        Stack<Integer> stack = new Stack<>();
        int blocks = 0; // Counter to track the number of blocks used.

        for (int height : H) {

            // If the current height is smaller than the top of the stack,
            // it means we need to close previous blocks before continuing.
            while (!stack.isEmpty() && stack.peek() > height) {
                stack.pop(); // Remove the top block as it is no longer needed.
                blocks++; // Count it as a completed block.
            }

            // If the stack is empty or the top element is different from the current height,
            // we need a new block, so we push the height onto the stack.
            if (stack.isEmpty() || stack.peek() != height) {
                stack.push(height);
            }
        }

        // The remaining elements in the stack represent blocks that were never closed,
        // so we add their count to the total number of blocks used.
        return blocks + stack.size();
    }

}
