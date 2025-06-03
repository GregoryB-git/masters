/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 */
package d4;

import Y3.m;
import d4.c;
import d4.f;
import d4.g;
import d4.l;
import d4.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public abstract class k
implements n {
    public final n o;
    public String p;

    public k(n n8) {
        this.o = n8;
    }

    public static int D(l l8, f f8) {
        return Double.valueOf((double)((Long)l8.getValue()).longValue()).compareTo((Double)f8.getValue());
    }

    @Override
    public n A(V3.k k8) {
        if (k8.isEmpty()) {
            return this;
        }
        if (k8.Z().s()) {
            return this.o;
        }
        return g.W();
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public int E() {
        return 0;
    }

    @Override
    public d4.b I(d4.b b8) {
        return null;
    }

    @Override
    public Object L(boolean bl) {
        if (bl && !this.o.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)".value", this.getValue());
            hashMap.put((Object)".priority", this.o.getValue());
            return hashMap;
        }
        return this.getValue();
    }

    public int M(n n8) {
        if (n8.isEmpty()) {
            return 1;
        }
        if (n8 instanceof c) {
            return -1;
        }
        m.g(n8.B(), "Node is not leaf node!");
        if (this instanceof l && n8 instanceof f) {
            return k.D((l)this, (f)n8);
        }
        if (this instanceof f && n8 instanceof l) {
            return k.D((l)n8, (f)this) * -1;
        }
        return this.U((k)n8);
    }

    @Override
    public n N(d4.b b8, n n8) {
        if (b8.s()) {
            return this.J(n8);
        }
        if (n8.isEmpty()) {
            return this;
        }
        return g.W().N(b8, n8).J(this.o);
    }

    @Override
    public Iterator P() {
        return Collections.emptyList().iterator();
    }

    @Override
    public boolean Q(d4.b b8) {
        return false;
    }

    @Override
    public String R() {
        if (this.p == null) {
            this.p = m.i(this.O(n.b.o));
        }
        return this.p;
    }

    public abstract b S();

    public String T(n.b b8) {
        int n8 = .a[b8.ordinal()];
        if (n8 != 1 && n8 != 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown hash version: ");
            stringBuilder.append((Object)((Object)b8));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.o.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("priority:");
        stringBuilder.append(this.o.O(b8));
        stringBuilder.append(":");
        return stringBuilder.toString();
    }

    public int U(k k8) {
        b b8;
        b b9 = this.S();
        if (b9.equals((Object)((Object)(b8 = k8.S())))) {
            return this.s(k8);
        }
        return b9.compareTo((Enum)b8);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public abstract int s(k var1);

    @Override
    public n t() {
        return this.o;
    }

    public String toString() {
        String string2 = this.L(true).toString();
        if (string2.length() <= 100) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, 100));
        stringBuilder.append("...");
        return stringBuilder.toString();
    }

    @Override
    public n v(d4.b b8) {
        if (b8.s()) {
            return this.o;
        }
        return g.W();
    }

    @Override
    public n y(V3.k k8, n n8) {
        boolean bl;
        d4.b b8 = k8.Z();
        if (b8 == null) {
            return n8;
        }
        if (n8.isEmpty() && !b8.s()) {
            return this;
        }
        boolean bl2 = k8.Z().s();
        boolean bl3 = bl = true;
        if (bl2) {
            bl3 = k8.size() == 1 ? bl : false;
        }
        m.f(bl3);
        return this.N(b8, g.W().y(k8.c0(), n8));
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* enum */ b r;
        public static final /* synthetic */ b[] s;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            o = b9 = new b();
            p = b10 = new b();
            q = b11 = new b();
            r = b8 = new b();
            s = new b[]{b9, b10, b11, b8};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])s.clone();
        }
    }

}

