package Week3Day5.f;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public void readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while(fileContents.length() < 1_000_000) {
            fileContents += (char) fileReader.read();
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;

        while((str = reader.readLine()) != null) {
            result.add(parse(str));
        }
        reader.close();
        return result;
    }

    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        String[] input = data.split(",");
        return new PopulationMove(input[0], input[1]);  // 전입, 전출
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," +populationMove.getFromSido() + "\n";
    }


}