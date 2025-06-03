// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

public class G implements F
{
    public static int f(final int n, final Object o, final Object o2) {
        final E e = (E)o;
        final D d = (D)o2;
        final boolean empty = e.isEmpty();
        int n2 = 0;
        if (empty) {
            return 0;
        }
        for (final Map.Entry<Object, V> entry : e.entrySet()) {
            n2 += d.a(n, entry.getKey(), entry.getValue());
        }
        return n2;
    }
    
    public static E g(final Object o, final Object o2) {
        final E e = (E)o;
        final E e2 = (E)o2;
        E s = e;
        if (!e2.isEmpty()) {
            s = e;
            if (!e.n()) {
                s = e.s();
            }
            s.p(e2);
        }
        return s;
    }
    
    @Override
    public Object a(final Object o, final Object o2) {
        return g(o, o2);
    }
    
    @Override
    public int b(final int n, final Object o, final Object o2) {
        return f(n, o, o2);
    }
    
    @Override
    public Object c(final Object o) {
        ((E)o).o();
        return o;
    }
    
    @Override
    public D.a d(final Object o) {
        return ((D)o).c();
    }
    
    @Override
    public Map e(final Object o) {
        return (E)o;
    }
}
