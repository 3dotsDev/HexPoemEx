package infrastructure.driven;

import org.apache.commons.io.IOUtils;
import domain.poem.IObtainPoems;

import java.io.File;
import java.io.FileInputStream;

public class PoetryLibraryFileAdapter implements IObtainPoems {

    private String poem;

    public PoetryLibraryFileAdapter(String filePath) {
        try {
            FileInputStream fisTargetFile = new FileInputStream(new File(filePath));
            poem = IOUtils.toString(fisTargetFile, "UTF-8");
        } catch (Exception ex) {
            poem = ex.getMessage();
        }
    }

    public String getMeAPoem() {
        return poem;
    }
}
