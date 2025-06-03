/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package j5;

import j5.j;
import j5.k;
import j5.n;

public final class l
extends Enum {
    public static final /* enum */ l q = new l(new j(), 1);
    public static final /* enum */ l r = new l(new k(), 23);
    public static final /* synthetic */ l[] s;
    public final n o;
    public final int p;

    static {
        s = l.c();
    }

    public l(n n9, int n10) {
        this.o = n9;
        this.p = n10;
    }

    public static /* synthetic */ l[] c() {
        return new l[]{q, r};
    }

    public static l valueOf(String string2) {
        return (l)Enum.valueOf(l.class, (String)string2);
    }

    public static l[] values() {
        return (l[])s.clone();
    }
}

