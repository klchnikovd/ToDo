package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.io.*;



@XmlRootElement(name = "ToDoList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"id", "caption", "Description", "Priority", "Deadline", "Status", "Complete"})

//@XmlType(name = "Task", propOrder = {"id", "caption", "description", "priority", "deadline", "status", "complete"})
public final class JaxbTest {
//    public String Task;
    public String id;
    public String caption;
    public String Description;
    public String Priority;
    public String Deadline;
    public String Status;
    public String Complete;




//    @XmlAttribute
    public JaxbTest() {
        this.id = id;
        this.caption = caption;
        this.Description = Description;
        this.Priority = Priority;
        this.Deadline = Deadline;
        this.Status = Status;
        this.Complete = Complete;
//        this.Task = Task;
    }
//        @XmlTransient

        public String getId () {
            return id;
    }
//        public String getTask () {
//            return null;
//        }

        public String getCaption () {
            return caption;
        }


        public String getDescription () {
            return Description;
        }

        public String getPriority () {
            return Priority;
        }

        public String getDeadline () {
            return Deadline;
        }

        public String getStatus() {
            return Status;
        }


        public String getComplete () {
            return Complete;
        }
        ;


    public static JaxbTest unmarshall() throws JAXBException, IOException {
            JAXBContext context = JAXBContext.newInstance(JaxbTest.class);
//            String path = new File("task.xml").getAbsolutePath();
            return (JaxbTest) context.createUnmarshaller()
                    .unmarshal(new FileReader("task.xml"));
    }

//        public static JaxbTest main (String[]args) throws JAXBException, FileNotFoundException {
//            String xmldata = "<ToDoList>" +
//                    "<id>1</id>" +
//                    "<caption>5</caption>" +
//                    "<Description>4</Description>" +
//                    "<Priority>1</Priority>" +
//                    "<Deadline>1</Deadline>" +
//                    "<Status>1</Status>" +
//                    "<Complete>1<Complete>" +
//                    "</ToDoList>";
//            StringReader reader = new StringReader(xmldata);
//            JAXBContext context = JAXBContext.newInstance(JaxbTest.class);
//            return (JaxbTest) context.createUnmarshaller()
//                    .unmarshal(new FileReader("./task.xml"));
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        JaxbTest task = (JaxbTest) unmarshaller.unmarshal(reader);
        }





//package com.company;
//
//public class JaxbTest {
//
//    String Task;
//    int id;
//    String caption;
//    String Description;
//
//
//    public int getid() {
//        return id;
//    }
//
//    public void setid(String name) {
//        this.id = id;
//    }
//
//    public String getcaption() {
//        return caption;
//    }
//
//    public void setcaption() {
//        this.caption = caption;
//    }
//
//    public String getDescription() {
//        return Description;
//    }
//
//    public void setId() {
//        this.Description = Description;
//    }
//
//}
