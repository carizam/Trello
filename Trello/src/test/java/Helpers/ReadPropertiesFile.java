package Helpers;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {

    private FileReader reader;
    private ReadPropertiesFile archivito;

    public ReadPropertiesFile() throws Exception{

        reader = new FileReader("C:\\Users\\cariza\\IdeaProjects\\Trello\\src\\test\\resources\\config.properties");
        Properties prop = new Properties();
        prop.load(reader);

        String userName = prop.getProperty("username");
        String pword = prop.getProperty("password");
        String nameB = prop.getProperty("title");
    }
}
