import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CheckWebsite {
    public static void Checkhtml(){

    try {
        //checks if the contents of the website in set website are equal or not, if not and time from set website met, calls notify
            File file1 = new File("0.html");
            File file2 = new File("1.html");
            boolean isTwoEqual = FileUtils.contentEquals(file1, file2);
            if (isTwoEqual == false) {
                Notify.Message();
            }

    }
    catch (IOException ie) {
        System.out.println("IOException");
    }

    }
    public static void Checksize(int a, int b){
        System.out.println(a);
        System.out.println(b);
       if(a != b){
           Notify.Message();
       }

    }
    public static void Checkstring(String a, String b){

       // System.out.print(a);
            //checks if the contents of the website in set website are equal or not, if not and time from set website met, calls notify
            boolean isTwoEqual = a.equals(b);
            if (isTwoEqual == false) {
                Notify.Message();
            }
    }
}