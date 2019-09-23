package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;
import java.io.*;
import java.util.Date;

@XmlRootElement(name = "ToDoList")
@XmlType(name = "ToDoList", propOrder = {"id", "caption", "description", "priority", "deadline", "status", "complete"})
public class JaxbTest {
    private Long id;
    private String caption;
    private String description;
    private String priority;
    private Date deadline;
    private String status;
    private Date complete;

    @XmlAttribute
    public void ToDoList() {
        this.id = id;
        this.caption = caption;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
        this.complete = complete;
    }

        @XmlTransient

        public Long getId () {
            return id;
        }


        public String getCaption () {
            return caption;
        }


        public String getDescription () {
            return description;
        }

        public String getPriority () {
            return priority;
        }

        public Date getDeadline () {
            return deadline;
        }

        public String getStatus () {
            return status;
        }


        public Date getComplete () {
            return complete;
        }
        ;


    public static JaxbTest unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(JaxbTest.class);
//        String path = new File("task.xml").getAbsolutePath();
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
