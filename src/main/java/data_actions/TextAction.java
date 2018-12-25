package data_actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextAction {

    public static String getTextByPath(String path) {
        List<String> text = new ArrayList<>();


        try {
            text = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {

        }

        StringBuilder res = new StringBuilder();

        text.forEach(s -> {
            res.append(s);
        });

        System.out.println(res.toString());

        return res.toString();
    }

}
