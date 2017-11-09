package lectie6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Report> report;
    private static String trackingNumber;


    public static void main(String[] args) throws IOException {
        report = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert tracking number: ");
        trackingNumber = scanner.nextLine();

        String defaultURL = "http://www.posta.md/en/tracking?id=RB295349616SG";/*RS916319658NL*/
        int indexTrackingNumber = defaultURL.indexOf("=");
        String defaultTrackingNumber = defaultURL.substring(indexTrackingNumber + 1);
        String url = defaultURL.replace(defaultTrackingNumber, trackingNumber);

        URL postaMoldovei = new URL(url);
        URLConnection connection = postaMoldovei.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            //System.out.println(InputLine);
            if(inputLine.contains("row clearfix")) {

                inputLine = in.readLine();
                String date = parseLine(inputLine);

                inputLine = in.readLine();
                String location = parseLine(inputLine);

                inputLine = in.readLine();
                String country = parseLine(inputLine);

                inputLine = in.readLine();
                String event = parseLine(inputLine);

                inputLine = in.readLine();
                String extra = parseLine(inputLine);

                report.add(new Report(date,location,country,event,extra));



            }
        }
        in.close();

        System.out.println(report);



    }

    private static String parseLine(String inputLine) {
        int indexStart = inputLine.indexOf(">");
        int indexEnd = inputLine.lastIndexOf("<");

        String  result = "";
       result = inputLine.substring(indexStart +1, indexEnd);


       return  result;

    }
}
