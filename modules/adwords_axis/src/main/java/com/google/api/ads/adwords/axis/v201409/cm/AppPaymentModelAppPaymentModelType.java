/**
 * AppPaymentModelAppPaymentModelType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public class AppPaymentModelAppPaymentModelType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppPaymentModelAppPaymentModelType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _APP_PAYMENT_MODEL_PAID = "APP_PAYMENT_MODEL_PAID";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AppPaymentModelAppPaymentModelType APP_PAYMENT_MODEL_PAID = new AppPaymentModelAppPaymentModelType(_APP_PAYMENT_MODEL_PAID);
    public static final AppPaymentModelAppPaymentModelType UNKNOWN = new AppPaymentModelAppPaymentModelType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AppPaymentModelAppPaymentModelType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppPaymentModelAppPaymentModelType enumeration = (AppPaymentModelAppPaymentModelType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppPaymentModelAppPaymentModelType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppPaymentModelAppPaymentModelType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AppPaymentModel.AppPaymentModelType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}