//225 Implement Stack using Queues
public class MyStack {
    //1st approach using only one queue
    // private Queue<Integer> q;

    // public MyStack() {
    //     q = new LinkedList<>();
    // }

    // public void push(int x) {
    //     q.add(x);
    //     for (int i = 1; i < q.size(); i++) {
    //         q.add(q.remove());
    //     }
    // }

    // public int pop() {
    //     return q.remove();
    // }

    // public int top() {
    //     return q.peek();
    // }

    // public boolean empty() {
    //     return q.isEmpty();
    // }

    //2nd approach 
    //using 2 queue
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
    public int pop(){
        if(!q1.isEmpty())
        return q1.remove();
        return -1;
    }
    public int top(){
        if(!q1.isEmpty())
        return q1.peek();
        return -1;
    }
    public boolean empty(){
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
