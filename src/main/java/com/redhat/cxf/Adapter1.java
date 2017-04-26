
package com.redhat.cxf;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.redhat.DataTypeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (com.redhat.DataTypeAdapter.printDateTime(value));
    }

}
