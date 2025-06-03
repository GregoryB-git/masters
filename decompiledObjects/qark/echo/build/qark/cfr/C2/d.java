/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 */
package C2;

import A2.r;
import A2.t;
import A2.u;
import C2.b;
import C2.c;
import V2.j;
import android.content.Context;
import y2.a;
import y2.d;
import z2.k;
import z2.m;

public final class d
extends y2.d
implements t {
    public static final a.g k;
    public static final a.a l;
    public static final a m;

    static {
        a.g g8;
        k = g8 = new a.g();
        c c8 = new c();
        l = c8;
        m = new a("ClientTelemetry.API", c8, g8);
    }

    public d(Context context, u u8) {
        super(context, m, u8, d.a.c);
    }

    @Override
    public final j a(r r8) {
        m.a a8 = m.a();
        a8.d(K2.d.a);
        a8.c(false);
        a8.b(new b(r8));
        return this.c(a8.a());
    }
}

