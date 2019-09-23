package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.*;
import java.io.*;
import java.util.Date;

@XmlRootElement(name = "ToDoList")
@XmlType(propOrder = {"id", "caption", "Description", "Priority", "Deadline", "Status", "Complete"})
public class JaxbTest {
    private Long id;
    private String caption;
    private String Description;
    private String Priority;
    private Date Deadline;
    private String Status;
    private Date Complete;

        @XmlTransient
        public void setDescription (String Description){
            this.Description = Description;
        }

        public Long getId () {
            return null;
        }


        public String getCaption () {
            return null;
        }


        public String getDescription () {
            return null;
        }

        public String getPriority () {
            return null;
        }

        public String getDeadline () {
            return null;
        }

        public String getStatus () {
            return null;
        }


        public String getComplete () {
            return null;
        }
        ;

        public static JaxbTest main (String[]args) throws JAXBException, FileNotFoundException {
            String xmldata = "<ToDoList>" +
                    "<id>1</id>" +
                    "<caption>5</caption>" +
                    "<Description>4</Description>" +
                    "<Priority>1</Priority>" +
                    "<Deadline>1</Deadline>" +
                    "<Status>1</Status>" +
                    "<Complete>1<Complete>" +
                    "</ToDoList>";
            StringReader reader = new StringReader(xmldata);
            JAXBContext context = JAXBContext.newInstance(JaxbTest.class);
            return (JaxbTest) context.createUnmarshaller()
                    .unmarshal(new FileReader("./task.xml"));
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        JaxbTest task = (JaxbTest) unmarshaller.unmarshal(reader);
        }
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
