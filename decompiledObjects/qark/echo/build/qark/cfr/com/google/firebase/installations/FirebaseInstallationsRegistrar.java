/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package com.google.firebase.installations;

import B3.F;
import B3.c;
import B3.r;
import C3.z;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o4.h;
import o4.i;
import s3.e;
import s4.k;
import y3.a;
import y3.b;

@Keep
public class FirebaseInstallationsRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ s4.i a(B3.e e8) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(e8);
    }

    private static /* synthetic */ s4.i lambda$getComponents$0(B3.e e8) {
        return new s4.h((e)e8.a(e.class), e8.g(i.class), (ExecutorService)e8.h(F.a(a.class, ExecutorService.class)), z.b((Executor)e8.h(F.a(b.class, Executor.class))));
    }

    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(s4.i.class).h("fire-installations").b(r.k(e.class)).b(r.i(i.class)).b(r.j(F.a(a.class, ExecutorService.class))).b(r.j(F.a(b.class, Executor.class))).f(new k()).d(), h.a(), O4.h.b("fire-installations", "17.2.0")});
    }
}

