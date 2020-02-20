package domain.poem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PoetryReaderTest {

    @Test
    public void should_give_verses_when_ask_for_poetry_with_support_from_library() {
        IObtainPoems poetryLibrary = mock(IObtainPoems.class);
        when(poetryLibrary.getMeAPoem()).thenReturn("ChingChangChung");

        PoetryReader poetryReader = new PoetryReader(poetryLibrary);
        String verses = poetryReader.giveMeSomePoetry();

        assertEquals("ChingChangChung", verses);
    }
}
