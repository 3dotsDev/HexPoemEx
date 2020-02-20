package infrastructure.driven;

import domain.poem.IObtainPoems;
import domain.poem.PoetryReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoetryLibraryFileAdapterTest {
    @Test
    public void should_provides_verses_when_ask_for_poetry_with_support_of_fileAdapter() {

        IObtainPoems poetryFileAdapter = new PoetryLibraryFileAdapter("/Users/dalmaso/IdeaProjects/poemTest.txt");
        //instanze the hexagon
        PoetryReader poetryReader = new PoetryReader(poetryFileAdapter);
        String verses = poetryReader.giveMeSomePoetry();

        assertEquals("FilebasePoem ChingChangChungssss", verses);

    }
}
