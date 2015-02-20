import java.util.Arrays;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * 
 * for(int var = 0; var < files.size(); var++) {
System.out.println(files.get(var));
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int num[];

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        // initialise instance variables
        num = new int[0];
    }

    /**
     * Metodo que añade un elemento a la lista
     */
    public void add(int elemento)
    {
        int tamaño = num.length; //Se guarda el tamaño del array
        int posicion = 0; // Se crea un variable a 0
        if(tamaño == 0) //Si el array está vacio
        {
            num = new int[posicion+1]; //se crea un nuevo array con una posicion mas
            num[posicion] = elemento;//se guarda en esa posicion el elemento
            posicion++; //se aumenta la posicion
        }
        else //Si el array contiene algun elemento
        {
            int numB[] = new int[tamaño]; //Se crea un nuevo array del tamaño del anterior
            for(int vari =0; vari<tamaño; vari++)
            {
                numB[vari] = num[vari]; //Cada elemento de cada posicion del primer array
                //se guarda en la misma posicion del segundo

            }
            num = new int[numB.length + 1];
            for(int v = 0; v<tamaño; v++)
            {
                num[v] = numB[v];
                num[posicion+1] = elemento;
                posicion++;
            }

        }

    }

    /**
     * Añade un elemento a la colección en una posicion determinada por index
     */
    public void add(int index, int elemento)
    {
        if(num.length == 0)
        {
            num = new int[index];
            num[index-1] = elemento;
        }
        else if(index < num.length)
        {
            if(index == 1)
            {
                num[index-1] = elemento;
            }
            else
            {
                num[index-1] = elemento;
                for(int v = index+1; v < num.length; v++)
                {
                    num = new int[num.length+1];
                    num[v+1] = num[v];

                }
            }
        }

    }
}

