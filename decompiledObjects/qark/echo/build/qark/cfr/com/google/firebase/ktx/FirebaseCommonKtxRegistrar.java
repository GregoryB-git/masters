/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package com.google.firebase.ktx;

import B3.c;
import B3.e;
import B3.h;
import B3.r;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.F;
import p6.i0;
import y3.a;
import y3.b;
import y3.c;
import y3.d;

@Metadata
@Keep
public final class FirebaseCommonKtxRegistrar
implements ComponentRegistrar {
    @NotNull
    public List<B3.c> getComponents() {
        B3.c c8 = B3.c.c(B3.F.a(a.class, F.class)).b(r.j(B3.F.a(a.class, Executor.class))).f(.a).d();
        Intrinsics.checkNotNullExpressionValue(c8, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        B3.c c9 = B3.c.c(B3.F.a(c.class, F.class)).b(r.j(B3.F.a(c.class, Executor.class))).f(.a).d();
        Intrinsics.checkNotNullExpressionValue(c9, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        B3.c c10 = B3.c.c(B3.F.a(b.class, F.class)).b(r.j(B3.F.a(b.class, Executor.class))).f(.a).d();
        Intrinsics.checkNotNullExpressionValue(c10, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        B3.c c11 = B3.c.c(B3.F.a(d.class, F.class)).b(r.j(B3.F.a(d.class, Executor.class))).f(.a).d();
        Intrinsics.checkNotNullExpressionValue(c11, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        return m.i(c8, c9, c10, c11);
    }

}

