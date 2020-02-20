import domain.poem.IObtainPoems;
import domain.poem.PoetryReader;
import infrastructure.driven.HardCodedPoetryAdapter;
import infrastructure.driven.PoetryLibraryFileAdapter;
import infrastructure.driver.ConsoleAdapter;

import java.util.Scanner;

public class MainHardCode {

    public static void main(String[] args) {
        //1. verlasse das Hexagon right-Side Adapter (i want to go outside the hexagon)
        IObtainPoems poetryHardAdapter = new HardCodedPoetryAdapter();
        //instanze the hexagon
        PoetryReader poetryReader = new PoetryReader(poetryHardAdapter);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader);

        System.out.println("Here is some...");
        consoleAdapter.ask();
        System.out.println("Type enter to exit");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
