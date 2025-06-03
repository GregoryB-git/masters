// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase;

import org.jetbrains.annotations.NotNull;
import W5.m;
import y3.d;
import y3.b;
import kotlin.jvm.internal.Intrinsics;
import B3.h;
import B3.r;
import java.util.concurrent.Executor;
import p6.F;
import y3.a;
import B3.c;
import java.util.List;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.google.firebase.components.ComponentRegistrar;

@Metadata
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar
{
    @NotNull
    @Override
    public List<c> getComponents() {
        final c d = c.c(B3.F.a(a.class, F.class)).b(r.j(B3.F.a(a.class, Executor.class))).f(FirebaseCommonKtxRegistrar$a.a).d();
        Intrinsics.checkNotNullExpressionValue(d, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        final c d2 = c.c(B3.F.a(y3.c.class, F.class)).b(r.j(B3.F.a(y3.c.class, Executor.class))).f(FirebaseCommonKtxRegistrar$b.a).d();
        Intrinsics.checkNotNullExpressionValue(d2, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        final c d3 = c.c(B3.F.a(b.class, F.class)).b(r.j(B3.F.a(b.class, Executor.class))).f(FirebaseCommonKtxRegistrar$c.a).d();
        Intrinsics.checkNotNullExpressionValue(d3, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        final c d4 = c.c(B3.F.a(d.class, F.class)).b(r.j(B3.F.a(d.class, Executor.class))).f(FirebaseCommonKtxRegistrar$d.a).d();
        Intrinsics.checkNotNullExpressionValue(d4, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        return (List<c>)m.i(d, d2, d3, d4);
    }
}
