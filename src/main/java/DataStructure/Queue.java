package DataStructure;
    public class Queue {
        int queue[] = new int[5];
        int size;
        int front;
        int rear;

        public void enqueu(int data) {

            queue[rear] = data;
            rear = rear + 1;
            size = size + 1;
        }

        public void show() {
            System.out.println("Elements are:");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[front + i] + " ");
            }
        }

        public int dequeue() {
            int data = queue[front];
            front = front + 1;
            size = size - 1;
            return data;

        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.enqueu(5);
            q.dequeue();
            q.enqueu(6);
            q.enqueu(8);
            q.show();
        }
    }


