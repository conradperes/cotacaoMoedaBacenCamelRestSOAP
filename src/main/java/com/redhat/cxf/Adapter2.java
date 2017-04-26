
package com.redhat.cxf;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.redhat.DataTypeAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (com.redhat.DataTypeAdapter.printDate(value));
    }

}
