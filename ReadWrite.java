/**
 * Abiola Gabriel Olofin
 * 01/27/2020
 * This program is a file reader that prints out the total amount of words,
 * letters, and the last word of the text file
 */
//importing java libraries Scanner, FileReader, Printwriter
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
public class ReadWrite{
    public static void main(String[] args){
        ReadWrite terminal = new ReadWrite();
        terminal.run();
    }

    /**
     * This method run() allows the ReadWrite object to run and print out
     * the total number of words, letters and the last word of the text file
     * It uses try and catch
     */
    public void run(){
        Scanner sc = null;
        Scanner sc1 = null;
        //System.out.println("Got here");
        //try and catch method to produce results
        try{
            //defining Scanner sc as a new Scanner
            //sc = new Scanner(new FileReader("lab1b.txt"));
            //sc = new Scanner(new FileReader("lab1bpart2.txt"));
            sc = new Scanner(new FileReader("lab1bpart3.txt"));
            //creating a printwriter object in order to print the results to a text file called Lab1bResults
            PrintWriter results = new PrintWriter("Lab1bResults.txt");
            //while loop that checks if there's a next line
            while(sc.hasNextLine()){
                //taking each line and running it through scanner in order to get total words, letters, and last word
                String line = sc.nextLine();
                sc1 = new Scanner(line);
                int words = 0;
                int letters = 0;
                String word = "";
                //checks each word in the line
                while(sc1.hasNext()){
                    word = sc1.next();
                    letters = letters + word.length();
                    words++;
                }
                //Printing out results
                results.println("Words: "+words+""+" Letter: "+letters+""+ " Last: "+word);
            }
            //closes the text file
            results.close();
        }
        //Prints out error if error is caught
        catch(Exception e){
            System.err.println(e);
        }
    }
}

