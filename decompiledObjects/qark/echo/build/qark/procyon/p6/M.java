// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import V5.o;
import V5.n;
import u6.j;
import X5.d;

public abstract class M
{
    public static final String a(final Object o) {
        return o.getClass().getSimpleName();
    }
    
    public static final String b(final Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final String c(final d obj) {
        if (obj instanceof j) {
            return obj.toString();
        }
        Object o3 = null;
        try {
            final n.a o = n.o;
            final StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append('@');
            sb.append(b(obj));
            n.a(sb.toString());
        }
        finally {
            final n.a o2 = n.o;
            final Throwable t;
            o3 = n.a(o.a(t));
        }
        if (n.b(o3) != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(obj.getClass().getName());
            sb2.append('@');
            sb2.append(b(obj));
            o3 = sb2.toString();
        }
        return (String)o3;
    }
}
