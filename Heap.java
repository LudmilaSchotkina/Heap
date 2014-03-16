import java.util.Random;

public class Heap
{
    Random rand = new Random();
    Node root;

    void swap (Node a, Node b)
    {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    void insert(int key)
    {
        Node newNode = new Node(key);
        Node ptr=root;

        if (ptr == null)
        {
            root = newNode;
            return;
        }
        while(true)
        {
            Node parent=ptr;
            if (key < ptr.value)
            {
                if((rand.nextInt(100)%2)==0)
                    ptr = ptr.left;
                if (ptr == null)
                {
                    parent.left = newNode;
                    return;
                }

            }

            if (key > ptr.value)
            {
                swap (ptr, newNode);
                parent=ptr;
                ptr = ptr.right;

                if (ptr == null)
                {
                    parent.right = newNode;
                    return;
                }

            }
        }
    }

    void print()
    {
        print(root,0);
    }
    void print(Node ptr,int element)
    {
        while (ptr!=null)
        {
            print(ptr.right, element+5);

            for (int i=1; i<element; ++i)
                System.out.print(" ");

            System.out.print(ptr.value + "\n");
            ptr = ptr.left;
            element += 5;
        }
    }
}
