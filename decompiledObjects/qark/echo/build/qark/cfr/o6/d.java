/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package o6;

import a6.a;
import a6.b;
import java.util.concurrent.TimeUnit;

public final class d
extends Enum {
    public static final /* enum */ d p = new d(TimeUnit.NANOSECONDS);
    public static final /* enum */ d q = new d(TimeUnit.MICROSECONDS);
    public static final /* enum */ d r = new d(TimeUnit.MILLISECONDS);
    public static final /* enum */ d s = new d(TimeUnit.SECONDS);
    public static final /* enum */ d t = new d(TimeUnit.MINUTES);
    public static final /* enum */ d u = new d(TimeUnit.HOURS);
    public static final /* enum */ d v = new d(TimeUnit.DAYS);
    public static final /* synthetic */ d[] w;
    public static final /* synthetic */ a x;
    public final TimeUnit o;

    static {
        Enum[] arrenum = d.c();
        w = arrenum;
        x = b.a(arrenum);
    }

    public d(TimeUnit timeUnit) {
        this.o = timeUnit;
    }

    public static final /* synthetic */ d[] c() {
        return new d[]{p, q, r, s, t, u, v};
    }

    public static d valueOf(String string2) {
        return (d)Enum.valueOf(d.class, (String)string2);
    }

    public static d[] values() {
        return (d[])w.clone();
    }

    public final TimeUnit e() {
        return this.o;
    }
}

