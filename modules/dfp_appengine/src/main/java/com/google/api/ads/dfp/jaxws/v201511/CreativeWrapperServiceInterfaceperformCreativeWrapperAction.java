
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CreativeWrapper} objects that match the
 *             given {@link Statement#query}.
 *             
 *             @param creativeWrapperAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of labels
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCreativeWrapperAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCreativeWrapperAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeWrapperAction" type="{https://www.google.com/apis/ads/publisher/v201511}CreativeWrapperAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creativeWrapperAction",
    "filterStatement"
})
@XmlRootElement(name = "performCreativeWrapperAction")
public class CreativeWrapperServiceInterfaceperformCreativeWrapperAction {

    protected CreativeWrapperAction creativeWrapperAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the creativeWrapperAction property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperAction }
     *     
     */
    public CreativeWrapperAction getCreativeWrapperAction() {
        return creativeWrapperAction;
    }

    /**
     * Sets the value of the creativeWrapperAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperAction }
     *     
     */
    public void setCreativeWrapperAction(CreativeWrapperAction value) {
        this.creativeWrapperAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}