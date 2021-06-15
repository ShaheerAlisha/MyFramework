package com.qa.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteData extends PropManager {

    //Method to write data to a CSV file
    public static void writeToCSV(String bookingRef, String msg) {

        String filePath = PropManager.getProp("outputFilePath");
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file, true);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // add data to csv
            String[] data = {bookingRef, msg};
            writer.writeNext(data);

            // closing writer connection
            writer.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
