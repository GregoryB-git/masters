// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.NoSuchElementException;
import W2.k;
import W2.n;
import W2.m;
import java.util.Iterator;
import java.util.Collection;

public abstract class C
{
    public static boolean a(final Collection collection, final Iterator iterator) {
        m.j(collection);
        m.j(iterator);
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static boolean b(final Iterator iterator, final n n) {
        return o(iterator, n) != -1;
    }
    
    public static void c(final Iterator iterator) {
        m.j(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static boolean d(final Iterator iterator, final Object o) {
        if (o == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
        }
        else {
            while (iterator.hasNext()) {
                if (o.equals(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean e(final Iterator iterator, final Iterator iterator2) {
        while (iterator.hasNext()) {
            if (!iterator2.hasNext()) {
                return false;
            }
            if (!k.a(iterator.next(), iterator2.next())) {
                return false;
            }
        }
        return iterator2.hasNext() ^ true;
    }
    
    public static g0 f() {
        return g();
    }
    
    public static h0 g() {
        return b.r;
    }
    
    public static Iterator h() {
        return c.o;
    }
    
    public static g0 i(final Iterator iterator, final n n) {
        m.j(iterator);
        m.j(n);
        return new X2.b() {
            @Override
            public Object b() {
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (n.apply(next)) {
                        return next;
                    }
                }
                return this.d();
            }
        };
    }
    
    public static Object j(final Iterator iterator, final n n) {
        m.j(iterator);
        m.j(n);
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }
    
    public static Object k(final Iterator iterator) {
        Object next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }
    
    public static Object l(final Iterator iterator, Object k) {
        if (iterator.hasNext()) {
            k = k(iterator);
        }
        return k;
    }
    
    public static Object m(final Iterator iterator, Object next) {
        if (iterator.hasNext()) {
            next = iterator.next();
        }
        return next;
    }
    
    public static Object n(final Iterator iterator) {
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int n = 0; n < 4 && iterator.hasNext(); ++n) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int o(final Iterator iterator, final n n) {
        m.k(n, "predicate");
        int n2 = 0;
        while (iterator.hasNext()) {
            if (n.apply(iterator.next())) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }
    
    public static Object p(final Iterator iterator) {
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            iterator.remove();
            return next;
        }
        return null;
    }
    
    public static boolean q(final Iterator iterator, final Collection collection) {
        m.j(collection);
        boolean b = false;
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    public static boolean r(final Iterator iterator, final n n) {
        m.j(n);
        boolean b = false;
        while (iterator.hasNext()) {
            if (n.apply(iterator.next())) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    public static g0 s(final Object o) {
        return new d(o);
    }
    
    public static final class b extends a
    {
        public static final h0 r;
        public final Object[] q;
        
        static {
            r = new b(new Object[0], 0);
        }
        
        public b(final Object[] q, final int n) {
            super(q.length, n);
            this.q = q;
        }
        
        @Override
        public Object b(final int n) {
            return this.q[n];
        }
    }
    
    public enum c implements Iterator
    {
        o("INSTANCE", 0);
        
        static {
            p = e();
        }
        
        public c(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ c[] e() {
            return new c[] { c.o };
        }
        
        @Override
        public boolean hasNext() {
            return false;
        }
        
        @Override
        public Object next() {
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            i.c(false);
        }
    }
    
    public static final class d extends g0
    {
        public static final Object p;
        public Object o;
        
        static {
            p = new Object();
        }
        
        public d(final Object o) {
            this.o = o;
        }
        
        @Override
        public boolean hasNext() {
            return this.o != d.p;
        }
        
        @Override
        public Object next() {
            final Object o = this.o;
            final Object p = d.p;
            if (o != p) {
                this.o = p;
                return o;
            }
            throw new NoSuchElementException();
        }
    }
}
