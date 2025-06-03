// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class l
{
    public Map a;
    public Object b;
    
    public l() {
        this.a = new HashMap();
    }
    
    public String a(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("<value>: ");
        sb.append(this.b);
        sb.append("\n");
        String s2 = sb.toString();
        if (this.a.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append(s);
            sb2.append("<empty>");
            return sb2.toString();
        }
        for (final Map.Entry<Object, V> entry : this.a.entrySet()) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(s2);
            sb3.append(s);
            sb3.append(entry.getKey());
            sb3.append(":\n");
            final l l = (l)entry.getValue();
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s);
            sb4.append("\t");
            sb3.append(l.a(sb4.toString()));
            sb3.append("\n");
            s2 = sb3.toString();
        }
        return s2;
    }
}
