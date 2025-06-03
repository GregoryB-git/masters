/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package N4;

import com.google.protobuf.t;

public final class l
extends Enum
implements t.a {
    public static final /* enum */ l p;
    public static final /* enum */ l q;
    public static final t.b r;
    public static final /* synthetic */ l[] s;
    public final int o;

    static {
        l l8;
        l l9;
        p = l8 = new l(0);
        q = l9 = new l(1);
        s = new l[]{l8, l9};
        r = new t.b(){};
    }

    public l(int n9) {
        this.o = n9;
    }

    public static l c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                return null;
            }
            return q;
        }
        return p;
    }

    public static t.c e() {
        return b.a;
    }

    public static l valueOf(String string2) {
        return (l)Enum.valueOf(l.class, (String)string2);
    }

    public static l[] values() {
        return (l[])s.clone();
    }

    @Override
    public final int g() {
        return this.o;
    }

    public static final class b
    implements t.c {
        public static final t.c a = new b();
    }

}

