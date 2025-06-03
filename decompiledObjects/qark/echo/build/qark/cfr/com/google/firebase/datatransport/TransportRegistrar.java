/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.datatransport;

import B3.c;
import B3.e;
import B3.h;
import B3.r;
import android.content.Context;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import d2.a;
import f2.f;
import f2.u;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ g a(e e8) {
        return TransportRegistrar.lambda$getComponents$0(e8);
    }

    private static /* synthetic */ g lambda$getComponents$0(e e8) {
        u.f((Context)e8.a(Context.class));
        return u.c().g(a.h);
    }

    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(g.class).h("fire-transport").b(r.k(Context.class)).f(new g4.a()).d(), O4.h.b("fire-transport", "18.1.8")});
    }
}

