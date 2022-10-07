package Week3Day5.f;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        PopulationStatistics populationStatistics = new PopulationStatistics();
        String path = "./from_to.txt";
        List<PopulationMove> pml = populationStatistics.readByLine(path);
        for (PopulationMove pm: pml) {
            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());

    }
}