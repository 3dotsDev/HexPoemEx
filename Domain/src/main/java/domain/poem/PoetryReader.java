package domain.poem;

/**
 * Domainserviceclass for Poetry
 * this should be the domainserviceelement if we have domain objects
 */
public class PoetryReader implements IRequestVerses {

    private IObtainPoems poetryLibrary;

    public PoetryReader(IObtainPoems poetryLibrary) { //DI Strategie
        this.poetryLibrary = poetryLibrary;
    }

    public String giveMeSomePoetry() {

        if (this.poetryLibrary != null) {
            return this.poetryLibrary.getMeAPoem();
        }
        return "ChingChangChung";  //failover for dummzpurpose
    }
}
