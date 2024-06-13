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
        System.out.print("Enter the number for the download option you want: 1 html , 2 size, 3 text ");
        int o = scanner.nextInt();
        if(o == 1) {
            DownWebsite.DownloadWebPage(url, i);

            // infinite loop downloading contents of said website
            while (true) {
                if (i < j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        DownWebsite.DownloadWebPage(url, j);
                        CheckWebsite.Checkhtml();
                        j = 0;
                        i = 1;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                } else if (i > j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        DownWebsite.DownloadWebPage(url, i);
                        CheckWebsite.Checkhtml();
                        j = 1;
                        i = 0;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                }
            }
        }
        else if(o == 2){


            // infinite loop downloading contents of said website
            while (true) {
                int a = 0;
                int b = 0;
                b = DownWebsiteSize.DownloadWebsize(url);
                if (i < j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        a = DownWebsiteSize.DownloadWebsize(url);
                        CheckWebsite.Checksize(a,b);
                        j = 0;
                        i = 1;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                } else if (i > j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        b = DownWebsiteSize.DownloadWebsize(url);
                        CheckWebsite.Checksize(a, b);
                        j = 1;
                        i = 0;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                }
            }

        }
        else if(o == 3){
            String line1 = "";
            String line2 = "";
           line2 = DownWebsiteText.DownloadWebText(url, line2);

            // infinite loop downloading contents of said website
            while (true) {
                if (i < j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        line1 = DownWebsiteText.DownloadWebText(url, line1);
                        CheckWebsite.Checkstring(line1, line2);
                        j = 0;
                        i = 1;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                } else if (i > j) {
                    try {
                        TimeUnit.MINUTES.sleep(s);
                        line2 = DownWebsiteText.DownloadWebText(url, line2);
                        CheckWebsite.Checkstring(line1, line2);
                        j = 1;
                        i = 0;
                    } catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                }
            }
        }
        else{
            System.out.print("Error option for download undefined");
        }
    }
















}
