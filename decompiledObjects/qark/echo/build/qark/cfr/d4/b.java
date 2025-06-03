/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import Y3.m;

public class b
implements Comparable {
    public static final b p = new b("[MIN_NAME]");
    public static final b q = new b("[MAX_KEY]");
    public static final b r = new b(".priority");
    public static final b s = new b(".info");
    public final String o;

    public b(String string2) {
        this.o = string2;
    }

    public /* synthetic */ b(String string2,  a8) {
        this(string2);
    }

    public static b j(String string2) {
        Integer n8 = m.k(string2);
        if (n8 != null) {
            return new b(string2, n8);
        }
        if (string2.equals((Object)".priority")) {
            return r;
        }
        m.f(string2.contains((CharSequence)"/") ^ true);
        return new b(string2);
    }

    public static b l() {
        return s;
    }

    public static b m() {
        return q;
    }

    public static b n() {
        return p;
    }

    public static b o() {
        return r;
    }

    public String e() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (b)object;
        return this.o.equals((Object)object.o);
    }

    public int h(b b8) {
        if (this == b8) {
            return 0;
        }
        if (!this.o.equals((Object)"[MIN_NAME]")) {
            if (b8.o.equals((Object)"[MAX_KEY]")) {
                return -1;
            }
            if (!b8.o.equals((Object)"[MIN_NAME]")) {
                if (this.o.equals((Object)"[MAX_KEY]")) {
                    return 1;
                }
                if (this.r()) {
                    if (b8.r()) {
                        int n8;
                        int n9 = n8 = m.a(this.p(), b8.p());
                        if (n8 == 0) {
                            n9 = m.a(this.o.length(), b8.o.length());
                        }
                        return n9;
                    }
                    return -1;
                }
                if (b8.r()) {
                    return 1;
                }
                return this.o.compareTo(b8.o);
            }
            return 1;
        }
        return -1;
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    public int p() {
        return 0;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this.equals(r);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChildKey(\"");
        stringBuilder.append(this.o);
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }

    public static class b
    extends b {
        public final int t;

        public b(String string2, int n8) {
            super(string2, null);
            this.t = n8;
        }

        @Override
        public int p() {
            return this.t;
        }

        @Override
        public boolean r() {
            return true;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IntegerChildName(\"");
            stringBuilder.append(this.o);
            stringBuilder.append("\")");
            return stringBuilder.toString();
        }
    }

}

