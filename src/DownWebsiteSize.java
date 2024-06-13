import org.jsoup.*;

public class DownWebsiteSize {
    public static int DownloadWebsize(String webpage){

            org.jsoup.nodes.Document dom = Jsoup.parse(webpage);
            String text = dom.text();

            return text.split(" ").length;
        }
    }



