package infrastructure.driver;

class ConsolePublicationStrategie implements IWriteLines {

    @Override
    public void writeLine(String text) {
        System.out.println(text);
    }
}
