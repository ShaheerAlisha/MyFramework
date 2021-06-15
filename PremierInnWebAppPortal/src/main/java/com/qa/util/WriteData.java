package com.qa.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

/**
 * WriteData utility class contains method to write the data on file
 *
 * @author ShaheerAlisha
 */

public class WriteData extends PropManager {

    /**
     * Static method to write the data to a CSV file
     *
     * @param bookingRef           Booking Reference ID
     * @param roomAvailabilityInfo Room Availability message to be written
     */
    public static void writeToCSV(String bookingRef, String roomAvailabilityInfo) {

        String filePath = PropManager.getProp("outputFilePath");
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file, true);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // add data to csv
            String[] data = {bookingRef, roomAvailabilityInfo};
            writer.writeNext(data);

            // closing writer connection
            writer.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
