public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] heights = {8,8,5,7,9,8,7,4,8};
        int minimumNumberOfBlocksNeeded = solution.solution(heights);
        System.out.println("The minimum number of blocks needed is: "+minimumNumberOfBlocksNeeded);

    }


}