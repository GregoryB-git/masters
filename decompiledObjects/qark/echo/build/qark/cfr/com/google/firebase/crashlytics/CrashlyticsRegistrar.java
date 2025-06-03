/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.crashlytics;

import B3.c;
import B3.h;
import B3.r;
import D3.f;
import D3.g;
import R4.l;
import S4.b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import r4.a;
import s3.e;
import s4.i;

public class CrashlyticsRegistrar
implements ComponentRegistrar {
    static {
        S4.a.a.a(b.a.o);
    }

    public static /* synthetic */ g a(CrashlyticsRegistrar crashlyticsRegistrar, B3.e e8) {
        return crashlyticsRegistrar.b(e8);
    }

    public final g b(B3.e e8) {
        e e9 = (e)e8.a(e.class);
        a a8 = e8.i(E3.a.class);
        a a9 = e8.i(w3.a.class);
        return g.e(e9, (i)e8.a(i.class), (l)e8.a(l.class), a8, a9);
    }

    @Override
    public List getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(g.class).h("fire-cls").b(r.k(e.class)).b(r.k(i.class)).b(r.k(l.class)).b(r.a(E3.a.class)).b(r.a(w3.a.class)).f(new f(this)).e().d(), O4.h.b("fire-cls", "18.5.1")});
    }
}

