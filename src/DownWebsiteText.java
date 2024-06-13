import java.io.*;
import java.net.URL;
import org.jsoup.*;
import java.net.MalformedURLException;
public class DownWebsiteText {
    public static String DownloadWebText(String webpage, String line){
        try {
            //URL url = new URL(webpage);
            line = Jsoup.connect(webpage).get().html();
        }
        catch (IOException ie) {
            System.out.println("IOException");
        }


        return line;
    }

}
