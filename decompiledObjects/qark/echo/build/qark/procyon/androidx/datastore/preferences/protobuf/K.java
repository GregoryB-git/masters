// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public class K implements J
{
    public static int i(final int n, final Object o, final Object o2) {
        final I i = (I)o;
        final H h = (H)o2;
        final boolean empty = i.isEmpty();
        int n2 = 0;
        if (empty) {
            return 0;
        }
        for (final Map.Entry<Object, V> entry : i.entrySet()) {
            n2 += h.a(n, entry.getKey(), entry.getValue());
        }
        return n2;
    }
    
    public static I j(final Object o, final Object o2) {
        final I i = (I)o;
        final I j = (I)o2;
        I s = i;
        if (!j.isEmpty()) {
            s = i;
            if (!i.n()) {
                s = i.s();
            }
            s.p(j);
        }
        return s;
    }
    
    @Override
    public Object a(final Object o, final Object o2) {
        return j(o, o2);
    }
    
    @Override
    public int b(final int n, final Object o, final Object o2) {
        return i(n, o, o2);
    }
    
    @Override
    public Object c(final Object o) {
        ((I)o).o();
        return o;
    }
    
    @Override
    public H.a d(final Object o) {
        return ((H)o).c();
    }
    
    @Override
    public Map e(final Object o) {
        return (I)o;
    }
    
    @Override
    public Object f(final Object o) {
        return I.f().s();
    }
    
    @Override
    public boolean g(final Object o) {
        return ((I)o).n() ^ true;
    }
    
    @Override
    public Map h(final Object o) {
        return (I)o;
    }
}
