package core.basesyntax;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class FileReaderServiceImpl implements FileReaderService {

    @Override
    public List<String> read(File file) {
        StringBuilder content = new StringBuilder();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        
        } catch (IOException e) {
            throw new RuntimeException("Не вдалося прочитати файл: " + file.getAbsolutePath(), e);
        }
    
        return List.of(content.toString().trim().split("\n"));
    }
}