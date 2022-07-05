

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.swing.text.html.parser.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Укажите путь к папке или файлу с разрешением XML.");
        Scanner way = new Scanner(System.in);
        String wayFile = way.nextLine();

        File dir = new File(wayFile);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "  каталог");
                } else {
                    System.out.println(item.getName() + " файл");
                }
            }
        } else {
            System.out.println("Введите верный путь к папке (Directory).");
            return;
        }
        System.out.println();
        System.out.println("Введите название файла. (Work...(дальнейший путь)");
        Scanner scanner = new Scanner(System.in);
        String nameDoc = scanner.nextLine();

        try {
            FileReader file = new FileReader(nameDoc);
            ArrayList<String> list = new ArrayList<>();
            Scanner wayFiles = new Scanner(file);
            FileWriter writer1 = new FileWriter("f.txt");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(nameDoc);

            while (wayFiles.hasNextLine()) {
                String amp = wayFiles.nextLine();
                if (amp.startsWith("<")) {

                    writer1.write(amp);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Неверное название файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }


    }
}