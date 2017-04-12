
package customerwebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newCustomer" type="{http://CustomerWebService/}customer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editCustomer", propOrder = {
    "newCustomer"
})
public class EditCustomer {

    protected Customer newCustomer;

    /**
     * Gets the value of the newCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getNewCustomer() {
        return newCustomer;
    }

    /**
     * Sets the value of the newCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setNewCustomer(Customer value) {
        this.newCustomer = value;
    }

}
