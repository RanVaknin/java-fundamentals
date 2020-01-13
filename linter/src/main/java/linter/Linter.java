package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Linter {
    public static String linter(String path) throws FileNotFoundException {
        String result = "";
        File gates = new File(path);
        Scanner scanner = new Scanner(gates);

        if (!scanner.hasNext()) {
            result = "File is empty.";
        } else {
            int i = 0;
            while (scanner.hasNext()) {
                i++;
                String line = scanner.nextLine();
                if (line.isEmpty()
                        || line.contains("{") || line.contains("}")
                        || line.contains("else") || line.contains("if")) {
                    continue;
                }
                if (!line.contains(";")) {
                    result += "line " + i + ": Missing semicolon.\n";
                }
            }
        }
            result = result.trim();
            System.out.println(result);
            return result;
        }
        public static void main (String[]args) throws FileNotFoundException {
            linter("resources/empty.js");

        }
    }

