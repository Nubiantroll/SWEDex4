import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SetWebsite {
    public static void set()

            throws IOException
    {


        int i = 0;
        int j = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();
        System.out.print("Enter the notification Interval in Minutes: ");
        int s = scanner.nextInt();
        DownWebsite.DownloadWebPage(url, i);
        // infinite loop downloading contents of said website
        while(true){
            if(i < j) { try {
                TimeUnit.MINUTES.sleep(s);
                DownWebsite.DownloadWebPage(url, j);
                j = 0;
                i = 1;
            }
            catch(InterruptedException e){
                System.err.format("IOException: %s%n", e);
            }
            }
            else if(i > j){ try {
                TimeUnit.MINUTES.sleep(s);
                DownWebsite.DownloadWebPage(url, i);
                j = 1;
                i = 0;
            }
            catch(InterruptedException e){
                System.err.format("IOException: %s%n", e);
            }
            }
        }

    }
















}
