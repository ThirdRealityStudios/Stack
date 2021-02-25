public class Main
{
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.push("Hello world!");
        System.out.println("Object on top: " + s.top());

        System.out.println();

        s.push("TEST1");
        System.out.println("Object on top: " + s.top());

        System.out.println();

        s.pop();
        System.out.println("Object on top: " + s.top());

        System.out.println();

        s.push("TEST2");
        System.out.println("Object on top: " + s.top());

        System.out.println();

        s.pop();
        System.out.println("Object on top: " + s.top());

        System.out.println();

        s.pop();
        System.out.println("Object on top: " + s.top());
    }
}
