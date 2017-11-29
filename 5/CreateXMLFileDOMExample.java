import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class CreateXMLFileDOMExample {
 
    private static final String FILENAME = "staff.xml";
 
    public static void main(String[] args) {
        try {
            Document document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().newDocument();
 
            // �������� �������
            Element company = document.createElement("company");
            document.appendChild(company);
 
            // ������� ���� staff
            Element staff = document.createElement("staff");
            company.appendChild(staff);
 
            // ���������� ������������� ����������
            Attr id = document.createAttribute("id");
            id.setTextContent("1");
            staff.setAttributeNode(id);
 
            // ��� ����� ������� ���
            // staff.setAttribute("id", "1");
             
            // ���������� ���
            Element firstname = document.createElement("firstname");
            firstname.setTextContent("����");
            staff.appendChild(firstname);
 
            // ���������� �������
            Element lastname = document.createElement("lastname");
            lastname.setTextContent("������");
            staff.appendChild(lastname);
 
            // ���������� �������
            Element nickname = document.createElement("nickname");
            nickname.setTextContent("ivanov");
            staff.appendChild(nickname);
 
            // ���������� ��������
            Element salary = document.createElement("salary");
            salary.setTextContent("100000");
            staff.appendChild(salary);
 
            // ��������� ��������� ������������� XML ��������� � ����
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(
                    new File(System.getProperty("user.dir")
                            + File.separator + FILENAME));
             
            // ��� ����������� ������� ����� ������� ��������� ������
            // ��������� �� ����������� �����
            // StreamResult result = new StreamResult(System.out);
 
            transformer.transform(source, result);
 
            System.out.println("�������� ��������!");
             
        } catch (ParserConfigurationException
                | TransformerConfigurationException ex) {
            Logger.getLogger(CreateXMLFileDOMExample.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(CreateXMLFileDOMExample.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }
}