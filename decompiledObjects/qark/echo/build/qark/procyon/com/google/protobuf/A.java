// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public abstract class A
{
    public static final A a;
    public static final A b;
    
    static {
        a = new b(null);
        b = new c(null);
    }
    
    public static A a() {
        return A.a;
    }
    
    public static A b() {
        return A.b;
    }
    
    public abstract void c(final Object p0, final long p1);
    
    public abstract void d(final Object p0, final Object p1, final long p2);
    
    public static final class b extends A
    {
        public static final Class c;
        
        static {
            c = Collections.unmodifiableList(Collections.emptyList()).getClass();
        }
        
        public b() {
            super(null);
        }
        
        public static List e(final Object o, final long n) {
            return (List)k0.C(o, n);
        }
        
        public static List f(final Object o, final long n, final int initialCapacity) {
            final List e = e(o, n);
            Object o2 = null;
            Label_0080: {
                if (!e.isEmpty()) {
                    List<E> list;
                    if (b.c.isAssignableFrom(e.getClass())) {
                        list = (List<E>)new ArrayList<Object>(e.size() + initialCapacity);
                        ((ArrayList<Object>)list).addAll(e);
                    }
                    else {
                        if (!(e instanceof j0)) {
                            if (e instanceof U && e instanceof t.e) {
                                final t.e e2 = (t.e)e;
                                if (!e2.p()) {
                                    o2 = e2.h(e.size() + initialCapacity);
                                    break Label_0080;
                                }
                            }
                            return e;
                        }
                        list = (List<E>)new y(e.size() + initialCapacity);
                        ((y)list).addAll(e);
                    }
                    k0.R(o, n, list);
                    return list;
                }
                if (e instanceof z) {
                    o2 = new y(initialCapacity);
                }
                else if (e instanceof U && e instanceof t.e) {
                    o2 = ((t.e)e).h(initialCapacity);
                }
                else {
                    o2 = new ArrayList(initialCapacity);
                }
            }
            k0.R(o, n, o2);
            return (List)o2;
        }
        
        @Override
        public void c(final Object o, final long n) {
            final List list = (List)k0.C(o, n);
            List<Object> list2;
            if (list instanceof z) {
                list2 = (List<Object>)((z)list).m();
            }
            else {
                if (b.c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if (list instanceof U && list instanceof t.e) {
                    final t.e e = (t.e)list;
                    if (e.p()) {
                        e.j();
                    }
                    return;
                }
                list2 = Collections.unmodifiableList((List<?>)list);
            }
            k0.R(o, n, list2);
        }
        
        @Override
        public void d(final Object o, final Object o2, final long n) {
            List e = e(o2, n);
            final List f = f(o, n, e.size());
            final int size = f.size();
            final int size2 = e.size();
            if (size > 0 && size2 > 0) {
                f.addAll(e);
            }
            if (size > 0) {
                e = f;
            }
            k0.R(o, n, e);
        }
    }
    
    public static final class c extends A
    {
        public c() {
            super(null);
        }
        
        public static t.e e(final Object o, final long n) {
            return (t.e)k0.C(o, n);
        }
        
        @Override
        public void c(final Object o, final long n) {
            e(o, n).j();
        }
        
        @Override
        public void d(final Object o, final Object o2, final long n) {
            final t.e e = e(o, n);
            final t.e e2 = e(o2, n);
            final int size = e.size();
            final int size2 = e2.size();
            Object h = e;
            if (size > 0) {
                h = e;
                if (size2 > 0) {
                    h = e;
                    if (!e.p()) {
                        h = e.h(size2 + size);
                    }
                    ((List<Object>)h).addAll(e2);
                }
            }
            List<Object> list = (List<Object>)e2;
            if (size > 0) {
                list = (List<Object>)h;
            }
            k0.R(o, n, list);
        }
    }
}
