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
 *  java.util.concurrent.ScheduledExecutorService
 */
package com.google.firebase.remoteconfig;

import B3.F;
import B3.c;
import B3.h;
import B3.r;
import P4.x;
import P4.y;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s3.e;
import s4.i;
import u3.a;
import y3.b;

@Keep
public class RemoteConfigRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ x a(F f8, B3.e e8) {
        return RemoteConfigRegistrar.lambda$getComponents$0(f8, e8);
    }

    private static /* synthetic */ x lambda$getComponents$0(F f8, B3.e e8) {
        return new x((Context)e8.a(Context.class), (ScheduledExecutorService)e8.h(f8), (e)e8.a(e.class), (i)e8.a(i.class), ((a)e8.a(a.class)).b("frc"), e8.g(w3.a.class));
    }

    public List<c> getComponents() {
        F f8 = F.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList((Object[])new c[]{c.e(x.class).h("fire-rc").b(r.k(Context.class)).b(r.j(f8)).b(r.k(e.class)).b(r.k(i.class)).b(r.k(a.class)).b(r.i(w3.a.class)).f(new y(f8)).e().d(), O4.h.b("fire-rc", "21.5.0")});
    }
}

