import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {

        Heap tree = new Heap();
        try
        {
            File file = new File( "D:\\java\\idea\\bst\\src\\input.txt" );

            Scanner sc = new Scanner(file);
            while(sc.hasNext())
                tree.insert(sc.nextInt());

        }
        catch (FileNotFoundException e1)
        {
            System.out.println("Файл не найден");
            System.exit(0);
        }
        tree.print();
    }
}
