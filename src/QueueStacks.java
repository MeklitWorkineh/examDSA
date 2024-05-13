//#3
public class QueueStacks {
    class Stack {
        private int[] arr;
        private int top;
        private int maxSize;


        public Stack(int size) {
            maxSize = size;
            arr = new int[maxSize];
            top = -1;
        }


        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is Full");
                return;
            }
            arr[++top] = item;
        }


        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top--];
        }


        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }


        public boolean isEmpty() {

            return top == -1;
        }


        public boolean isFull() {

            return top == maxSize - 1;
        }
    }

    class QueueUsingStacks {
        private Stack stack1;
        private Stack stack2;


        public QueueUsingStacks(int size) {
            stack1 = new Stack(size);
            stack2 = new Stack(size);
        }


        public void enqueue(int item) {
            if (stack1.isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(item);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }


        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack1.pop();
        }


        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return stack1.peek();
        }


        public boolean isEmpty() {

            return stack1.isEmpty();
        }
    }


}
