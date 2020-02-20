import domain.poem.IObtainPoems;
import domain.poem.PoetryReader;
import infrastructure.driven.PoetryLibraryFileAdapter;
import infrastructure.driver.ConsoleAdapter;

import java.util.Scanner;

public class MainFile {

    public static void main(String[] args) {
        //1. verlasse das Hexagon right-Side Adapter (i want to go outside the hexagon)
        IObtainPoems poetryFileAdapter = new PoetryLibraryFileAdapter("/Users/dalmaso/IdeaProjects/poem.txt");
        //instanze the hexagon
        PoetryReader poetryReader = new PoetryReader(poetryFileAdapter);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);

        System.out.println("Here is some...");
        consoleAdapter.ask();
        System.out.println("Type enter to exit");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
