/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Map
 *  java.util.TreeMap
 */
package X2;

import W2.m;
import W2.s;
import X2.D;
import X2.I;
import X2.K;
import X2.P;
import X2.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class J {
    public J() {
    }

    public /* synthetic */ J(I i8) {
        this();
    }

    public static d a() {
        return J.b(P.d());
    }

    public static d b(Comparator comparator) {
        m.j((Object)comparator);
        return new d(){

            @Override
            public Map c() {
                return new TreeMap(Comparator.this);
            }
        };
    }

    public static final class b
    implements s,
    Serializable {
        public final int o;

        public b(int n8) {
            this.o = i.b(n8, "expectedValuesPerKey");
        }

        public List a() {
            return new ArrayList(this.o);
        }
    }

    public static abstract class c
    extends J {
        public c() {
            super(null);
        }

        public abstract D c();
    }

    public static abstract class d {
        public c a() {
            return this.b(2);
        }

        public c b(final int n8) {
            i.b(n8, "expectedValuesPerKey");
            return new c(){

                @Override
                public D c() {
                    return K.b(d.this.c(), new b(n8));
                }
            };
        }

        public abstract Map c();

    }

}

