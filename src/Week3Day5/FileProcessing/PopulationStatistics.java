package Week3Day5.FileProcessing;

import java.io.*;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        String fileName = "migration.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(fileName);
    }

    public void readByLine(String fileName) throws IOException {
       BufferedReader reader = new BufferedReader (new FileReader(fileName));
        String lineOfData;
        while ((lineOfData = reader.readLine()) != null) {
            parse(lineOfData);
        }
        reader.close();
    }

    public PopulationMove parse(String data) {
        String[] dataArr = data.split(",");
        int from = Integer.parseInt(dataArr[0]);
        int to = Integer.parseInt(dataArr[6]);
        System.out.printf("from: %d  to: %d \n", from, to);
        return new PopulationMove(from, to);
    }

}
