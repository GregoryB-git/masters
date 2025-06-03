// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.text.ParseException;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;

public final class AFf1gSDK
{
    public static List<BigDecimal> AFKeystoreWrapper(final Object o) {
        final ArrayList list = (ArrayList)o;
        final Float n = list.get(0);
        final Float n2 = list.get(1);
        final Float n3 = list.get(2);
        final ArrayList<BigDecimal> list2 = new ArrayList<BigDecimal>();
        try {
            list2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(n.toString())));
            list2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(n2.toString())));
            list2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(n3.toString())));
            return list2;
        }
        catch (ParseException ex) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", ex);
            return list2;
        }
    }
    
    public enum AFa1vSDK
    {
        AFInAppEventParameterName("rs"), 
        AFInAppEventType("am"), 
        AFKeystoreWrapper("uk"), 
        AFLogger("gs"), 
        valueOf("mm");
        
        String values;
        
        private AFa1vSDK(final String values) {
            this.values = values;
        }
    }
    
    public enum AFa1xSDK
    {
        AFInAppEventType, 
        valueOf, 
        values;
    }
    
    public enum AFa1zSDK
    {
        AFInAppEventParameterName(2), 
        AFInAppEventType(0), 
        AFKeystoreWrapper(3), 
        valueOf(1), 
        values(4);
        
        private int afRDLog;
        
        private AFa1zSDK(final int afRDLog) {
            this.afRDLog = afRDLog;
        }
    }
}
