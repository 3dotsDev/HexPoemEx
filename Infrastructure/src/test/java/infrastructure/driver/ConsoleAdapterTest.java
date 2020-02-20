package infrastructure.driver;

import domain.poem.IObtainPoems;
import domain.poem.IRequestVerses;
import domain.poem.PoetryReader;
import infrastructure.driven.HardCodedPoetryAdapter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConsoleAdapterTest {

    @Test
    public void should_give_verses_when_ask_for_poetry() {

        // IRequestVerses : left-side port
        IRequestVerses poetryReader = new PoetryReader(new HardCodedPoetryAdapter());
        String verses = poetryReader.giveMeSomePoetry();

        assertEquals("HardCodeBase ChingChangChung", verses);
    }

    @Test
    public void should_provides_verses_when_ask_for_poetry_with_support_of_console_Adapter() {

        //1. verlasse das Hexagon right-Side Adapter (i want to go outside the hexagon)
        IObtainPoems poetryLibrary = mock(IObtainPoems.class);
        when(poetryLibrary.getMeAPoem()).thenReturn("ChingChangChung");

        //instanze the hexagon
        PoetryReader poetryReader = new PoetryReader(poetryLibrary);


        IWriteLines publicationStrategy = mock(IWriteLines.class);
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(poetryReader, publicationStrategy);
        consoleAdapter.ask();
        Mockito.verify(publicationStrategy, Mockito.times(1)).writeLine("Poem: ChingChangChung");
    }
}
