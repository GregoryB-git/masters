// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R5;

import java.util.Map;
import java.util.List;
import android.util.Log;
import java.util.ArrayList;

public abstract class j
{
    public static ArrayList a(final Throwable t) {
        final ArrayList<String> list = new ArrayList<String>(3);
        list.add(t.toString());
        list.add(t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append(t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add(sb.toString());
        return list;
    }
    
    public interface a
    {
        Boolean a(final String p0, final Long p1);
        
        Map b(final String p0, final List p1);
        
        Boolean c(final String p0, final String p1);
        
        Boolean d(final String p0, final List p1);
        
        Boolean e(final String p0, final List p1);
        
        Boolean f(final String p0, final Boolean p1);
        
        Boolean g(final String p0, final Double p1);
        
        Boolean remove(final String p0);
    }
}
