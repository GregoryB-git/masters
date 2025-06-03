// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.sessions;

import B3.h;
import R4.m;
import B3.r;
import B3.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import R4.l;
import y3.b;
import y3.a;
import s4.i;
import s3.e;
import kotlin.jvm.internal.g;
import B3.F;
import org.jetbrains.annotations.NotNull;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.google.firebase.components.ComponentRegistrar;

@Metadata
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar
{
    @NotNull
    public static final a Companion;
    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final F backgroundDispatcher;
    private static final F blockingDispatcher;
    private static final F firebaseApp;
    private static final F firebaseInstallationsApi;
    private static final F transportFactory;
    
    static {
        Companion = new a(null);
        firebaseApp = F.b(e.class);
        firebaseInstallationsApi = F.b(i.class);
        backgroundDispatcher = F.a(y3.a.class, p6.F.class);
        blockingDispatcher = F.a(b.class, p6.F.class);
        transportFactory = F.b(c2.g.class);
    }
    
    private static final l getComponents$lambda-0(final B3.e e) {
        final Object h = e.h(FirebaseSessionsRegistrar.firebaseApp);
        Intrinsics.checkNotNullExpressionValue(h, "container.get(firebaseApp)");
        final e e2 = (e)h;
        final Object h2 = e.h(FirebaseSessionsRegistrar.firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(h2, "container.get(firebaseInstallationsApi)");
        final i i = (i)h2;
        final Object h3 = e.h(FirebaseSessionsRegistrar.backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(h3, "container.get(backgroundDispatcher)");
        final p6.F f = (p6.F)h3;
        final Object h4 = e.h(FirebaseSessionsRegistrar.blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(h4, "container.get(blockingDispatcher)");
        final p6.F f2 = (p6.F)h4;
        final r4.b b = e.b(FirebaseSessionsRegistrar.transportFactory);
        Intrinsics.checkNotNullExpressionValue(b, "container.getProvider(transportFactory)");
        return new l(e2, i, f, f2, b);
    }
    
    @NotNull
    @Override
    public List<c> getComponents() {
        return (List<c>)W5.m.i(c.e(l.class).h("fire-sessions").b(r.j(FirebaseSessionsRegistrar.firebaseApp)).b(r.j(FirebaseSessionsRegistrar.firebaseInstallationsApi)).b(r.j(FirebaseSessionsRegistrar.backgroundDispatcher)).b(r.j(FirebaseSessionsRegistrar.blockingDispatcher)).b(r.l(FirebaseSessionsRegistrar.transportFactory)).f(new m()).d(), O4.h.b("fire-sessions", "1.1.0"));
    }
    
    public static final class a
    {
    }
}
