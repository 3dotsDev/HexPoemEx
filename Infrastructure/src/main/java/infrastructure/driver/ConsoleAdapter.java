package infrastructure.driver;


import domain.poem.IRequestVerses;

public class ConsoleAdapter {

    private IRequestVerses poetryReader;
    private IWriteLines publicationStrategy;

    public ConsoleAdapter(IRequestVerses poetryReader) {
        this(poetryReader, new ConsolePublicationStrategie());
    }

    public ConsoleAdapter(IRequestVerses poetryReader, IWriteLines publicationStrategy) {
        this.poetryReader = poetryReader;
        this.publicationStrategy = publicationStrategy;
    }

    public void ask() {

        //from infra to domain

        //businesslogic
        String verses = this.poetryReader.giveMeSomePoetry();

        //from domain to infra
        this.publicationStrategy.writeLine("Poem: " + verses);
    }

}
