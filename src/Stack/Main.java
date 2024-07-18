package Stack;

public class Main {
    public static void main(String[] args) {
        StackByArray sba = new StackByArray(4);
        sba.push(1);
        sba.push(2);
        sba.push(3);
        sba.push(4);
        int result = sba.pop();
        System.out.println(result);
        int result1 = sba.pop();
        System.out.println(result1);
        System.out.println(sba.peek());
        System.out.println(sba.peek());
        sba.deleteStack();
    }


}
