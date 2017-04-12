
package employeewebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editEmployee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newEmployee" type="{http://EmployeeWebService/}employee" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editEmployee", propOrder = {
    "newEmployee"
})
public class EditEmployee {

    protected Employee newEmployee;

    /**
     * Gets the value of the newEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getNewEmployee() {
        return newEmployee;
    }

    /**
     * Sets the value of the newEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setNewEmployee(Employee value) {
        this.newEmployee = value;
    }

}
