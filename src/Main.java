/*

-Exceptions:
    - represent specific types of errors / edge cases in your code.
    - They all inherit from the "Throwable" class.
    - Most of the time we use a child class (subclass) or throwable, Exception, as a parent class.
    - Whenever an exception happens, your program crashes.
    - 'throws': used in a method/constructor declaration to tell Java that said method/ constructor may or
    may NOT throw an exception.
    - 'throw': inside of a method/ constructor, to actually use an exception.

-Try and catch block:
    - used to deal with exceptions that may happen,
    - Syntax:
    try{
      // run the code that may or may not throw and exception.
    } catch(Exception exception object) { //specify what type of exception you are catching.
        //where you deal with the exception that was thrown.
    }

 */


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args)  {

FileReader fr = null;

try{
    fr = new FileReader("C:\\Users\\W0718860\\Desktop\\Bread.txt");

} catch (FileNotFoundException e) {
    System.out.println("Cannot find file");
    //System.exit(0);
   // e.printStackTrace();
}

    }

}
