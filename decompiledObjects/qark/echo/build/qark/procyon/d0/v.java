// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import java.util.HashSet;

public abstract class v
{
    public static final HashSet a;
    public static String b;
    
    static {
        a = new HashSet();
        v.b = "media3.common";
    }
    
    public static void a(final String s) {
        // monitorenter(v.class)
        // monitorexit(v.class)
        Label_0060: {
            try {
                if (v.a.add(s)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(v.b);
                    sb.append(", ");
                    sb.append(s);
                    v.b = sb.toString();
                }
            }
            finally {
                break Label_0060;
            }
            return;
        }
    }
    // monitorexit(v.class)
    
    public static String b() {
        synchronized (v.class) {
            return v.b;
        }
    }
}
