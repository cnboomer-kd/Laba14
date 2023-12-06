import java.util.ArrayList;

public class ArrayList_3
{

    public static void main(String[] args)
    {

        // Создаем объект ArrayList
        ArrayList<String> myCollection = new ArrayList<>();

        // Добавляем элементы в коллекцию
        myCollection.add("Element 1");
        myCollection.add("Element 2");
        myCollection.add("Element 3");

        // Выводим элементы коллекции
        for (String element : myCollection)
        {
            System.out.println(element);
        }
    }
}