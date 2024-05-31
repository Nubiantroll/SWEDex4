

import java.io.*;
import java.net.URL;
import java.net.MalformedURLException;

    public class DownWebsite {
        int ver = 0;
        public static void DownloadWebPage(String webpage, int i)
        {
            try {

                String file = i +".html";

                // Create URL object
                URL url = new URL(webpage);
                BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));

                // Enter filename in which you want to download
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                // read each line from stream till end
                String line;
                while ((line = readr.readLine()) != null) {
                    writer.write(line);

                }

                readr.close();
                writer.close();
               System.out.println("Successfully Downloaded.");

            }

            // Exceptions
            catch (MalformedURLException mue) {
                System.out.println("Malformed URL Exception");
            }
            catch (IOException ie) {
                System.out.println("IOException");
            }
        }

    }

