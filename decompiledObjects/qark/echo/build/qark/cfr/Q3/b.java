/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package Q3;

import Q3.e;
import d4.i;
import d4.m;
import d4.n;
import java.util.Iterator;

public class b {
    public final i a;
    public final e b;

    public b(e e8, i i8) {
        this.a = i8;
        this.b = e8;
    }

    public boolean b() {
        return this.a.k().isEmpty() ^ true;
    }

    public Iterable c() {
        return new Iterable(this.a.iterator()){
            public final /* synthetic */ Iterator o;
            {
                this.o = iterator;
            }

            public Iterator iterator() {
                return new Iterator(){

                    public b b() {
                        m m8 = (m)a.this.o.next();
                        return new b(b.this.b.W(m8.c().e()), i.d(m8.d()));
                    }

                    public boolean hasNext() {
                        return a.this.o.hasNext();
                    }

                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }

        };
    }

    public long d() {
        return this.a.k().E();
    }

    public String e() {
        return this.b.X();
    }

    public Object f() {
        Object object;
        Object object2 = object = this.a.k().t().getValue();
        if (object instanceof Long) {
            object2 = (double)((Long)object);
        }
        return object2;
    }

    public e g() {
        return this.b;
    }

    public Object h() {
        return this.a.k().getValue();
    }

    public Object i(boolean bl) {
        return this.a.k().L(bl);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSnapshot { key = ");
        stringBuilder.append(this.b.X());
        stringBuilder.append(", value = ");
        stringBuilder.append(this.a.k().L(true));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

}

