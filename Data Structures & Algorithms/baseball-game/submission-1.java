class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for(String operation : operations){
            if(operation.equals("+")){
                int temp = stack.pop();
                int newTop = temp + stack.peek();
                stack.push(temp);
                stack.push(newTop);

            } else if(operation.equals("C")){
                stack.pop();
            } else if(operation.equals("D")){
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        for(int score: stack){
            sum += score;
        }

        return sum;
    }
}