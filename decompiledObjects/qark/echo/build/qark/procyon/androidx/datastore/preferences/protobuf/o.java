// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class o
{
    public static boolean b = true;
    public static final Class c;
    public static volatile o d;
    public static final o e;
    public final Map a;
    
    static {
        c = c();
        e = new o(true);
    }
    
    public o(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static o b() {
        final o d = o.d;
        if (d == null) {
            // monitorenter(o.class)
            while (true) {
                try {
                    o d2;
                    if ((d2 = o.d) == null) {
                        if (o.b) {
                            d2 = n.a();
                        }
                        else {
                            d2 = o.e;
                        }
                        o.d = d2;
                    }
                    // monitorexit(o.class)
                    return d2;
                }
                // monitorexit(o.class)
                finally {}
                continue;
            }
        }
        return d;
    }
    
    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
    
    public w.c a(final O o, final int n) {
        android.support.v4.media.a.a(this.a.get(new a(o, n)));
        return null;
    }
    
    public static final class a
    {
        public final Object a;
        public final int b;
        
        public a(final Object a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final a a = (a)o;
            boolean b3 = b2;
            if (this.a == a.a) {
                b3 = b2;
                if (this.b == a.b) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
