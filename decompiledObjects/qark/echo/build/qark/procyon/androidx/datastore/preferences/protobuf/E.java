// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class E
{
    public static final E a;
    public static final E b;
    
    static {
        a = new b(null);
        b = new c(null);
    }
    
    public static E a() {
        return E.a;
    }
    
    public static E b() {
        return E.b;
    }
    
    public abstract void c(final Object p0, final long p1);
    
    public abstract void d(final Object p0, final Object p1, final long p2);
    
    public abstract List e(final Object p0, final long p1);
    
    public static final class b extends E
    {
        public static final Class c;
        
        static {
            c = Collections.unmodifiableList(Collections.emptyList()).getClass();
        }
        
        public b() {
            super(null);
        }
        
        public static List f(final Object o, final long n) {
            return (List)p0.A(o, n);
        }
        
        public static List g(final Object o, final long n, final int initialCapacity) {
            final List f = f(o, n);
            Object o2 = null;
            Label_0080: {
                if (!f.isEmpty()) {
                    List<E> list;
                    if (b.c.isAssignableFrom(f.getClass())) {
                        list = (List<E>)new ArrayList<Object>(f.size() + initialCapacity);
                        ((ArrayList<Object>)list).addAll(f);
                    }
                    else {
                        if (!(f instanceof o0)) {
                            if (f instanceof Y && f instanceof y.b) {
                                final y.b b = (y.b)f;
                                if (!b.p()) {
                                    o2 = b.h(f.size() + initialCapacity);
                                    break Label_0080;
                                }
                            }
                            return f;
                        }
                        list = (List<E>)new C(f.size() + initialCapacity);
                        ((C)list).addAll(f);
                    }
                    p0.O(o, n, list);
                    return list;
                }
                if (f instanceof D) {
                    o2 = new C(initialCapacity);
                }
                else if (f instanceof Y && f instanceof y.b) {
                    o2 = ((y.b)f).h(initialCapacity);
                }
                else {
                    o2 = new ArrayList(initialCapacity);
                }
            }
            p0.O(o, n, o2);
            return (List)o2;
        }
        
        @Override
        public void c(final Object o, final long n) {
            final List list = (List)p0.A(o, n);
            List<Object> list2;
            if (list instanceof D) {
                list2 = (List<Object>)((D)list).m();
            }
            else {
                if (b.c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if (list instanceof Y && list instanceof y.b) {
                    final y.b b = (y.b)list;
                    if (b.p()) {
                        b.j();
                    }
                    return;
                }
                list2 = Collections.unmodifiableList((List<?>)list);
            }
            p0.O(o, n, list2);
        }
        
        @Override
        public void d(final Object o, final Object o2, final long n) {
            List f = f(o2, n);
            final List g = g(o, n, f.size());
            final int size = g.size();
            final int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            p0.O(o, n, f);
        }
        
        @Override
        public List e(final Object o, final long n) {
            return g(o, n, 10);
        }
    }
    
    public static final class c extends E
    {
        public c() {
            super(null);
        }
        
        public static y.b f(final Object o, final long n) {
            return (y.b)p0.A(o, n);
        }
        
        @Override
        public void c(final Object o, final long n) {
            f(o, n).j();
        }
        
        @Override
        public void d(final Object o, final Object o2, final long n) {
            final y.b f = f(o, n);
            final y.b f2 = f(o2, n);
            final int size = f.size();
            final int size2 = f2.size();
            Object h = f;
            if (size > 0) {
                h = f;
                if (size2 > 0) {
                    h = f;
                    if (!f.p()) {
                        h = f.h(size2 + size);
                    }
                    ((List<Object>)h).addAll(f2);
                }
            }
            List<Object> list = (List<Object>)f2;
            if (size > 0) {
                list = (List<Object>)h;
            }
            p0.O(o, n, list);
        }
        
        @Override
        public List e(final Object o, final long n) {
            Object o2;
            final y.b b = (y.b)(o2 = f(o, n));
            if (!b.p()) {
                final int size = b.size();
                int n2;
                if (size == 0) {
                    n2 = 10;
                }
                else {
                    n2 = size * 2;
                }
                o2 = b.h(n2);
                p0.O(o, n, o2);
            }
            return (List)o2;
        }
    }
}
