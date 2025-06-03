// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I3;

import java.util.Iterator;
import java.io.Serializable;
import H3.i;
import E3.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class b
{
    public final Map a;
    public final int b;
    public final int c;
    
    public b(final int b, final int c) {
        this.a = new HashMap();
        this.b = b;
        this.c = c;
    }
    
    public static String c(String s, final int endIndex) {
        String s2 = s;
        if (s != null) {
            s = (s2 = s.trim());
            if (s.length() > endIndex) {
                s2 = s.substring(0, endIndex);
            }
        }
        return s2;
    }
    
    public Map a() {
        synchronized (this) {
            return Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(this.a));
        }
    }
    
    public final String b(final String s) {
        if (s != null) {
            return c(s, this.c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }
    
    public boolean d(String c, String f) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0169: {
            Serializable b;
            try {
                b = this.b(c);
                if (this.a.size() >= this.b) {
                    if (!this.a.containsKey(b)) {
                        f = (String)f.f();
                        b = new StringBuilder();
                        ((StringBuilder)b).append("Ignored entry \"");
                        ((StringBuilder)b).append(c);
                        ((StringBuilder)b).append("\" when adding custom keys. Maximum allowable: ");
                        ((StringBuilder)b).append(this.b);
                        ((f)f).k(((StringBuilder)b).toString());
                        // monitorexit(this)
                        return false;
                    }
                }
            }
            finally {
                break Label_0169;
            }
            c = c(f, this.c);
            if (i.z((String)this.a.get(b), c)) {
                // monitorexit(this)
                return false;
            }
            final Map a = this.a;
            if (f == null) {
                c = "";
            }
            a.put(b, c);
            return true;
        }
    }
    // monitorexit(this)
    
    public void e(final Map map) {
        // monitorenter(this)
        while (true) {
            try {
                final Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
                int i = 0;
                while (iterator.hasNext()) {
                    final Map.Entry<String, V> entry = iterator.next();
                    final String b = this.b(entry.getKey());
                    if (this.a.size() < this.b || this.a.containsKey(b)) {
                        final String s = (String)entry.getValue();
                        final Map a = this.a;
                        String c;
                        if (s == null) {
                            c = "";
                        }
                        else {
                            c = c(s, this.c);
                        }
                        a.put(b, c);
                    }
                    else {
                        ++i;
                    }
                }
                if (i > 0) {
                    final f f = E3.f.f();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignored ");
                    sb.append(i);
                    sb.append(" entries when adding custom keys. Maximum allowable: ");
                    sb.append(this.b);
                    f.k(sb.toString());
                }
                // monitorexit(this)
                return;
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
}
