package com.mrmrmr7.task.data_actions;

import com.mrmrmr7.task.data_actions.exceptions.EmptyFileExeption;
import com.mrmrmr7.task.symbol_structuries.Text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TextAction {
    private final static Logger logger = LogManager.getLogger(TextAction.class);

    public static String getTextFromFile(String path) {
        if (Files.notExists(Paths.get(path))) {
            logger.info("File not found: " + path);
            return "";
        }

        List<String> text;

        try {
            text = Files.readAllLines(Paths.get(path));
            if (text.size() == 0) {
                throw new EmptyFileExeption();
            }
        }  catch (EmptyFileExeption emptyFileExeption) {
            logger.warn("File is empty: " + path);
            text = new ArrayList<>();
        } catch (IOException e) {
            logger.error("File unreadable: " + path);
            text = new ArrayList<>();
        }

        StringBuilder res = new StringBuilder();

        text.forEach(s -> {
            res.append(s + "\n");
        });

        return res.toString();
    }

    public static void sortParagraphsBySentenceCount(Text text) {
        Collections.sort(text.getParagraphes(), new DataComparator());
    }

}
