/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package d4;

import V3.k;
import d4.c;
import d4.g;
import java.util.Iterator;

public interface n
extends Comparable,
Iterable {
    public static final c l = new c(){

        @Override
        public int D(n n8) {
            if (n8 == this) {
                return 0;
            }
            return 1;
        }

        @Override
        public boolean Q(d4.b b8) {
            return false;
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public n t() {
            return this;
        }

        @Override
        public String toString() {
            return "<Max Node>";
        }

        @Override
        public n v(d4.b b8) {
            if (b8.s()) {
                return this.t();
            }
            return g.W();
        }
    };

    public n A(k var1);

    public boolean B();

    public int E();

    public d4.b I(d4.b var1);

    public n J(n var1);

    public Object L(boolean var1);

    public n N(d4.b var1, n var2);

    public String O(b var1);

    public Iterator P();

    public boolean Q(d4.b var1);

    public String R();

    public Object getValue();

    public boolean isEmpty();

    public n t();

    public n v(d4.b var1);

    public n y(k var1, n var2);

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* synthetic */ b[] q;

        static {
            b b8;
            b b9;
            o = b8 = new b();
            p = b9 = new b();
            q = new b[]{b8, b9};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }
    }

}

