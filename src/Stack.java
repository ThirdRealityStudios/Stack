public class Stack
{
    private Node last;

    public boolean isEmpty()
    {
        return last == null;
    }

    public void push(Object pObject)
    {
        if(pObject != null)
        {
            Node temp = last;

            last = new Node(pObject);
            last.setNext(temp);
        }
    }

    public void pop()
    {
        if(!isEmpty())
        {
            last = last.getNext();
        }
    }

    public Object top()
    {
        if(!isEmpty())
        {
            return last.getContent();
        }

        return null;
    }
}
