package com.akarsh.designpatterns;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OracleFileParsing {


    public static void main(String[] args){
        System.out.println(getUniqueUsersInLast(2));
    }

    public static long getUniqueUsersInLast(int hours){
        try(
                FileReader reader = new FileReader("./data.csv");
                BufferedReader bufferedReader = new BufferedReader(reader);

        ) {
            // 1 hr = 60 * 60 * 1000 = 36_00_000
            long now = new Date().getTime();
            bufferedReader.lines()
                    .skip(1)
                    .parallel()
                    .map(OracleFileParsing::getRow)
                    .filter(row -> (now - row.date().getTime()) <= (hours * 36_00_000L))
                    .filter(row -> !row.user().equals("-"))
                    .forEach(row -> System.out.println(row.user()));


//                    .filter(row -> {System.out.println(row); return true;})
//                    .count();

            return 0L;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    private static boolean isaBoolean(int hours, Row row, long now) {
////        System.out.println((now - row.date().getTime()));
//        System.out.println(now  + " " + row.date().getTime());
//        return (now - row.date().getTime()) <= (hours * 36_00_000L);
//    }

    public static Row getRow(String line) {
        System.out.println(line);
        String[] split = line.split(",");
//        String[] dateSplit = split[0].split("-");
//        String[] timeSplit = split[1].split(":");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parseDate = null;
        try {
            parseDate = dateFormat.parse(split[0] + " " + split[1]);
        } catch (ParseException ex){
            System.err.println(ex.getMessage());
        }

        return new Row(parseDate, split[2], split[3], split[4], split[5]);
    }


//    new Date(
//            Integer.parseInt(dateSplit[0]),
//                Integer.parseInt(dateSplit[1]),
//            Integer.parseInt(dateSplit[2]),
//            Integer.parseInt(timeSplit[0]),
//            Integer.parseInt(timeSplit[1]),
//            Integer.parseInt(timeSplit[2])
//            )
}


record Row(Date date, String url, String httpMethod, String status, String user) {}