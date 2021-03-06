package com.company;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class TaskList {

    public static void main(String argv[]) {

        try {

//            File fXmlFile = new File("D:/Denis/ToDo/task.xml"); //- Путь до файла (кривой)
            String path = new File("task.xml").getAbsolutePath(); // - путь до файла из кооня проекта
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(path);

            doc.getDocumentElement().normalize();

            System.out.println("Список всех задач:");

            NodeList nList = doc.getElementsByTagName("Task");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("----------------------------");

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Номер задачи : " + eElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Заголовок задачи : " + eElement.getElementsByTagName("caption").item(0).getTextContent());
                    System.out.println("Описание задачи : " + eElement.getElementsByTagName("Description").item(0).getTextContent());
                    System.out.println("Приоритет : " + eElement.getElementsByTagName("Priority").item(0).getTextContent());
                    System.out.println("Дэдлайн : " + eElement.getElementsByTagName("Deadline").item(0).getTextContent());
                    System.out.println("Статус задачи : " + eElement.getElementsByTagName("Status").item(0).getTextContent());
                    System.out.println("Время исполнения задачи: " + eElement.getElementsByTagName("Complete").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
