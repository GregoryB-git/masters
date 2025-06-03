// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q2;

import java.util.Iterator;
import c2.d;
import java.util.HashMap;
import android.util.SparseArray;

public abstract class a
{
    public static SparseArray a;
    public static HashMap b;
    
    static {
        q2.a.a = new SparseArray();
        (q2.a.b = new HashMap()).put(d.o, 0);
        q2.a.b.put(d.p, 1);
        q2.a.b.put(d.q, 2);
        for (final d key : q2.a.b.keySet()) {
            q2.a.a.append((int)q2.a.b.get(key), (Object)key);
        }
    }
    
    public static int a(final d d) {
        final Integer n = q2.a.b.get(d);
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }
    
    public static d b(final int i) {
        final d d = (d)q2.a.a.get(i);
        if (d != null) {
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
