class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(String value: tokens){

            switch(value){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a-b);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a/b);
                    break;

                default :
                    stack.push(Integer.parseInt(value));
            }
        }
        return stack.pop();
    }
}
