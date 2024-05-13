//#2
    public class Stack {
        int[] stack = new int[3];
        int top = 0;

        public static void main(String[] args) {
            Stack nums = new Stack();
            //System.out.println("Empty: " + nums.isEmpty());
            nums.push(11);
            nums.show();
            // System.out.println("Empty: " + nums.isEmpty());
            nums.push(12);
            nums.show();
            //System.out.println(nums.peek());
            nums.push(33);
            nums.show();
            // nums.push(7);
            //nums.show();
            //System.out.println("size is:" + nums.size());
            System.out.println("Empty: " + nums.isFull());
            //System.out.println(nums.pop());
            //System.out.println(nums.pop());
            //System.out.println(nums.pop());
            //System.out.println(nums.pop());
            //System.out.println("size is:" + nums.size());
        }
        public void push(int data) {
            if(isFull()){
                System.out.println("stack is full!");
            }
            else{
                stack[top] = data;
                top++;
            }
        }
        public int pop() {
            int data = 0;
            if(isEmpty()) {
                System.out.println("stack is empty!");
            }
            else{
                top--;
                data = stack[top];
                stack[top] = 0;
            }
            return data;
        }
        public int peek(){
            int data = 0;
            top--;
            data = stack[top];
            return data;
        }
        public int size() {
            return top;
        }
        public boolean isEmpty() {
            return top <= 0;
        }
        public boolean isFull() {

            return top >= stack.length;
        }
        public void show(){
            for(int n: stack){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }


