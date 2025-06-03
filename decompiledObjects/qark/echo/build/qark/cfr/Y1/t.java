/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class t
extends Enum {
    public static final /* enum */ t A;
    public static final /* synthetic */ t[] B;
    public static final /* enum */ t v;
    public static final /* enum */ t w;
    public static final /* enum */ t x;
    public static final /* enum */ t y;
    public static final /* enum */ t z;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    static {
        v = new t(true, true, true, false, true, true, true);
        w = new t(true, true, false, false, false, true, true);
        x = new t(false, true, false, false, false, false, false);
        y = new t(false, false, true, false, true, false, false);
        z = new t(false, true, true, false, true, true, true);
        A = new t(false, false, false, true, false, false, false);
        B = t.c();
    }

    public t(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.o = bl;
        this.p = bl2;
        this.q = bl3;
        this.r = bl4;
        this.s = bl5;
        this.t = bl6;
        this.u = bl7;
    }

    public static final /* synthetic */ t[] c() {
        return new t[]{v, w, x, y, z, A};
    }

    public static t valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (t)Enum.valueOf(t.class, (String)string2);
    }

    public static t[] values() {
        t[] arrt = B;
        return (t[])Arrays.copyOf((Object[])arrt, (int)arrt.length);
    }

    public final boolean e() {
        return this.s;
    }

    public final boolean h() {
        return this.r;
    }

    public final boolean j() {
        return this.o;
    }

    public final boolean l() {
        return this.u;
    }

    public final boolean m() {
        return this.p;
    }

    public final boolean n() {
        return this.q;
    }
}

