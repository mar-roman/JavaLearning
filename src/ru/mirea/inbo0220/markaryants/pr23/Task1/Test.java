package ru.mirea.inbo0220.markaryants.pr23.Task1;

import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        CSVParser csv = new CSVParser();
        List<String> lines = Files.readAllLines
                (Paths.get("src/ru/mirea/inbo0220/markaryants/pr23/Task1/movementList.csv"));
        for (int i = 1; i < lines.size(); i++) {
            csv.CalculateData(lines.get(i));
        }
        csv.printCSV();
    }
}