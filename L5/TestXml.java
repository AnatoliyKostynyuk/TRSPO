package Lab5;

/**
 * Created by Nick Batist on 11/23/17.
 */

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.IOException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class TestXml{
    public static void main (String[] args) throws ParserConfigurationException{
        TestXml t = new TestXml();
        t.readXml() ;
    }
    public void readXml () throws ParserConfigurationException{
        File fXmlFile = new File("resources/formdata.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = null;
        try {
            doc = dBuilder.parse(fXmlFile);
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("record");

        System.out.println("----------------------------");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                System.out.println("Item No : " + eElement.getElementsByTagName("item_no").item(0).getTextContent());
                System.out.println("Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
                System.out.println("price : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                System.out.println("base qty : " + eElement.getElementsByTagName("base_qty").item(0).getTextContent());
                System.out.println("Var qty : " + eElement.getElementsByTagName("var_qty").item(0).getTextContent());
                System.out.println("Base price : " + eElement.getElementsByTagName("base_price_").item(0).getTextContent());

            }}}}