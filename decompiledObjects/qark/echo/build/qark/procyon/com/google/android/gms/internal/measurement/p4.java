// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public final class p4 extends q4
{
    public static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public p4() {
        super(null);
    }
    
    public static List e(final Object o, final long n, final int initialCapacity) {
        final List f = f(o, n);
        Object o2 = null;
        Label_0080: {
            if (!f.isEmpty()) {
                List<E> list;
                if (p4.c.isAssignableFrom(f.getClass())) {
                    list = (List<E>)new ArrayList<Object>(f.size() + initialCapacity);
                    ((ArrayList<Object>)list).addAll(f);
                }
                else {
                    if (!(f instanceof y5)) {
                        if (f instanceof S4 && f instanceof h4) {
                            final h4 h4 = (h4)f;
                            if (!h4.c()) {
                                o2 = h4.e(f.size() + initialCapacity);
                                break Label_0080;
                            }
                        }
                        return f;
                    }
                    list = (List<E>)new o4(f.size() + initialCapacity);
                    ((l3)list).addAll(f);
                }
                D5.j(o, n, list);
                return list;
            }
            if (f instanceof n4) {
                o2 = new o4(initialCapacity);
            }
            else if (f instanceof S4 && f instanceof h4) {
                o2 = ((h4)f).e(initialCapacity);
            }
            else {
                o2 = new ArrayList(initialCapacity);
            }
        }
        D5.j(o, n, o2);
        return (List)o2;
    }
    
    public static List f(final Object o, final long n) {
        return (List)D5.B(o, n);
    }
    
    @Override
    public final void b(final Object o, final Object o2, final long n) {
        List f = f(o2, n);
        final List e = e(o, n, f.size());
        final int size = e.size();
        final int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        D5.j(o, n, f);
    }
    
    @Override
    public final void d(final Object o, final long n) {
        final List list = (List)D5.B(o, n);
        List<Object> list2;
        if (list instanceof n4) {
            list2 = (List<Object>)((n4)list).w();
        }
        else {
            if (p4.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof S4 && list instanceof h4) {
                final h4 h4 = (h4)list;
                if (h4.c()) {
                    h4.G();
                }
                return;
            }
            list2 = Collections.unmodifiableList((List<?>)list);
        }
        D5.j(o, n, list2);
    }
}
