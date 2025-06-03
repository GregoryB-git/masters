/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package S3;

import S3.c;
import S3.d;
import S3.f;
import S3.g;
import S3.h;
import S3.i;
import S3.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class k
extends c {
    public h o;
    public Comparator p;

    public k(h h8, Comparator comparator) {
        this.o = h8;
        this.p = comparator;
    }

    public /* synthetic */ k(h h8, Comparator comparator,  a8) {
        this(h8, comparator);
    }

    public static k M(List list, Map map, c.a.a a8, Comparator comparator) {
        return b.b(list, map, a8, comparator);
    }

    public static k S(Map map, Comparator comparator) {
        return b.b((List)new ArrayList((Collection)map.keySet()), map, c.a.e(), comparator);
    }

    @Override
    public c D(Object object) {
        if (!this.a(object)) {
            return this;
        }
        return new k(this.o.g(object, this.p).c(null, null, h.a.p, null, null), this.p);
    }

    @Override
    public Iterator P() {
        return new d(this.o, null, this.p, true);
    }

    public final h T(Object object) {
        h h8 = this.o;
        while (!h8.isEmpty()) {
            int n8 = this.p.compare(object, h8.getKey());
            if (n8 < 0) {
                h8 = h8.a();
                continue;
            }
            if (n8 == 0) {
                return h8;
            }
            h8 = h8.f();
        }
        return null;
    }

    @Override
    public boolean a(Object object) {
        if (this.T(object) != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object d(Object object) {
        if ((object = this.T(object)) != null) {
            return object.getValue();
        }
        return null;
    }

    @Override
    public Comparator f() {
        return this.p;
    }

    @Override
    public Object g() {
        return this.o.i().getKey();
    }

    @Override
    public Object i() {
        return this.o.h().getKey();
    }

    @Override
    public boolean isEmpty() {
        return this.o.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return new d(this.o, null, this.p, false);
    }

    @Override
    public Object k(Object object) {
        h h8 = this.o;
        h h9 = null;
        while (!h8.isEmpty()) {
            int n8 = this.p.compare(object, h8.getKey());
            if (n8 == 0) {
                if (!h8.a().isEmpty()) {
                    object = h8.a();
                    while (!object.f().isEmpty()) {
                        object = object.f();
                    }
                    return object.getKey();
                }
                if (h9 != null) {
                    return h9.getKey();
                }
                return null;
            }
            if (n8 < 0) {
                h8 = h8.a();
                continue;
            }
            h h10 = h8.f();
            h9 = h8;
            h8 = h10;
        }
        h8 = new StringBuilder();
        h8.append("Couldn't find predecessor key of non-present key: ");
        h8.append(object);
        throw new IllegalArgumentException(h8.toString());
    }

    @Override
    public void q(h.b b8) {
        this.o.e(b8);
    }

    @Override
    public c s(Object object, Object object2) {
        return new k(this.o.b(object, object2, this.p).c(null, null, h.a.p, null, null), this.p);
    }

    @Override
    public int size() {
        return this.o.size();
    }

    public static class S3.k$b {
        public final List a;
        public final Map b;
        public final c.a.a c;
        public j d;
        public j e;

        public S3.k$b(List list, Map map, c.a.a a8) {
            this.a = list;
            this.b = map;
            this.c = a8;
        }

        public static k b(List object, Map object2, c.a.a a8, Comparator comparator) {
            object2 = new S3.k$b((List)object, (Map)object2, a8);
            Collections.sort((List)object, (Comparator)comparator);
            a8 = new a(object.size()).iterator();
            int n8 = object.size();
            while (a8.hasNext()) {
                object = (b)a8.next();
                int n9 = object.b;
                n8 -= n9;
                if (object.a) {
                    object2.c(h.a.p, n9, n8);
                    continue;
                }
                object2.c(h.a.p, n9, n8);
                n9 = object.b;
                object2.c(h.a.o, n9, n8 -= n9);
            }
            object = object2 = object2.d;
            if (object2 == null) {
                object = g.j();
            }
            return new k((h)object, comparator, null);
        }

        public final h a(int n8, int n9) {
            if (n9 == 0) {
                return g.j();
            }
            if (n9 == 1) {
                Object object = this.a.get(n8);
                return new f(object, this.d(object), null, null);
            }
            int n10 = n8 + (n9 /= 2);
            h h8 = this.a(n8, n9);
            h h9 = this.a(n10 + 1, n9);
            Object object = this.a.get(n10);
            return new f(object, this.d(object), h8, h9);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void c(h.a object, int n8, int n9) {
            h h8 = this.a(n9 + 1, n8 - 1);
            Object object2 = this.a.get(n9);
            object = object == h.a.o ? new i(object2, this.d(object2), null, h8) : new f(object2, this.d(object2), null, h8);
            if (this.d == null) {
                this.d = object;
            } else {
                this.e.u((h)object);
            }
            this.e = object;
        }

        public final Object d(Object object) {
            return this.b.get(this.c.a(object));
        }

        public static class a
        implements Iterable {
            public long o;
            public final int p;

            public a(int n8) {
                int n9;
                this.p = n9 = (int)Math.floor((double)(Math.log((double)(++n8)) / Math.log((double)2.0)));
                this.o = (long)Math.pow((double)2.0, (double)n9) - 1L & (long)n8;
            }

            public Iterator iterator() {
                return new Iterator(){
                    public int o;
                    {
                        this.o = a.this.p - 1;
                    }

                    public b b() {
                        long l8 = a.this.o;
                        long l9 = 1 << this.o;
                        b b8 = new b();
                        boolean bl = (l8 & l9) == 0L;
                        b8.a = bl;
                        b8.b = (int)Math.pow((double)2.0, (double)this.o);
                        --this.o;
                        return b8;
                    }

                    public boolean hasNext() {
                        if (this.o >= 0) {
                            return true;
                        }
                        return false;
                    }

                    public void remove() {
                    }
                };
            }

        }

        public static class b {
            public boolean a;
            public int b;
        }

    }

}

