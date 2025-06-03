/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package X2;

import W2.k;
import W2.m;
import W2.n;
import X2.a;
import X2.g0;
import X2.h0;
import X2.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class C {
    public static boolean a(Collection collection, Iterator iterator) {
        m.j((Object)collection);
        m.j((Object)iterator);
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= collection.add(iterator.next());
        }
        return bl;
    }

    public static boolean b(Iterator iterator, n n8) {
        if (C.o(iterator, n8) != -1) {
            return true;
        }
        return false;
    }

    public static void c(Iterator iterator) {
        m.j((Object)iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public static boolean d(Iterator iterator, Object object) {
        if (object == null) {
            while (iterator.hasNext()) {
                if (iterator.next() != null) continue;
                return true;
            }
        } else {
            while (iterator.hasNext()) {
                if (!object.equals(iterator.next())) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator iterator, Iterator iterator2) {
        while (iterator.hasNext()) {
            if (!iterator2.hasNext()) {
                return false;
            }
            if (k.a(iterator.next(), iterator2.next())) continue;
            return false;
        }
        return iterator2.hasNext() ^ true;
    }

    public static g0 f() {
        return C.g();
    }

    public static h0 g() {
        return b.r;
    }

    public static Iterator h() {
        return c.o;
    }

    public static g0 i(Iterator iterator, final n n8) {
        m.j((Object)iterator);
        m.j(n8);
        return new X2.b(){

            @Override
            public Object b() {
                while (Iterator.this.hasNext()) {
                    Object object = Iterator.this.next();
                    if (!n8.apply(object)) continue;
                    return object;
                }
                return this.d();
            }
        };
    }

    public static Object j(Iterator iterator, n n8) {
        m.j((Object)iterator);
        m.j(n8);
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (!n8.apply(object)) continue;
            return object;
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator iterator) {
        Object object;
        do {
            object = iterator.next();
        } while (iterator.hasNext());
        return object;
    }

    public static Object l(Iterator iterator, Object object) {
        if (iterator.hasNext()) {
            object = C.k(iterator);
        }
        return object;
    }

    public static Object m(Iterator iterator, Object object) {
        if (iterator.hasNext()) {
            object = iterator.next();
        }
        return object;
    }

    public static Object n(Iterator iterator) {
        Object object = iterator.next();
        if (!iterator.hasNext()) {
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("expected one element but was: <");
        stringBuilder.append(object);
        for (int i8 = 0; i8 < 4 && iterator.hasNext(); ++i8) {
            stringBuilder.append(", ");
            stringBuilder.append(iterator.next());
        }
        if (iterator.hasNext()) {
            stringBuilder.append(", ...");
        }
        stringBuilder.append('>');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int o(Iterator iterator, n n8) {
        m.k(n8, "predicate");
        int n9 = 0;
        while (iterator.hasNext()) {
            if (n8.apply(iterator.next())) {
                return n9;
            }
            ++n9;
        }
        return -1;
    }

    public static Object p(Iterator iterator) {
        if (iterator.hasNext()) {
            Object object = iterator.next();
            iterator.remove();
            return object;
        }
        return null;
    }

    public static boolean q(Iterator iterator, Collection collection) {
        m.j((Object)collection);
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) continue;
            iterator.remove();
            bl = true;
        }
        return bl;
    }

    public static boolean r(Iterator iterator, n n8) {
        m.j(n8);
        boolean bl = false;
        while (iterator.hasNext()) {
            if (!n8.apply(iterator.next())) continue;
            iterator.remove();
            bl = true;
        }
        return bl;
    }

    public static g0 s(Object object) {
        return new d(object);
    }

    public static final class b
    extends a {
        public static final h0 r = new b(new Object[0], 0);
        public final Object[] q;

        public b(Object[] arrobject, int n8) {
            super(arrobject.length, n8);
            this.q = arrobject;
        }

        @Override
        public Object b(int n8) {
            return this.q[n8];
        }
    }

    public static final class c
    extends Enum
    implements Iterator {
        public static final /* enum */ c o = new c();
        public static final /* synthetic */ c[] p;

        static {
            p = c.e();
        }

        public static /* synthetic */ c[] e() {
            return new c[]{o};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])p.clone();
        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            i.c(false);
        }
    }

    public static final class d
    extends g0 {
        public static final Object p = new Object();
        public Object o;

        public d(Object object) {
            this.o = object;
        }

        public boolean hasNext() {
            if (this.o != p) {
                return true;
            }
            return false;
        }

        public Object next() {
            Object object = this.o;
            Object object2 = p;
            if (object != object2) {
                this.o = object2;
                return object;
            }
            throw new NoSuchElementException();
        }
    }

}

