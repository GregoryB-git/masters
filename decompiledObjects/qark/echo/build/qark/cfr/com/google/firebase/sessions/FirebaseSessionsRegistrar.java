/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firebase.sessions;

import B3.c;
import B3.h;
import B3.r;
import R4.l;
import R4.m;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.F;
import s3.e;
import s4.i;
import y3.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata
@Keep
public final class FirebaseSessionsRegistrar
implements ComponentRegistrar {
    @NotNull
    public static final a Companion = new a(null);
    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final B3.F backgroundDispatcher;
    private static final B3.F blockingDispatcher;
    private static final B3.F firebaseApp;
    private static final B3.F firebaseInstallationsApi;
    private static final B3.F transportFactory;

    static {
        firebaseApp = B3.F.b(e.class);
        firebaseInstallationsApi = B3.F.b(i.class);
        backgroundDispatcher = B3.F.a(y3.a.class, F.class);
        blockingDispatcher = B3.F.a(b.class, F.class);
        transportFactory = B3.F.b(g.class);
    }

    public static /* synthetic */ l a(B3.e e8) {
        return FirebaseSessionsRegistrar.getComponents$lambda-0(e8);
    }

    private static final l getComponents$lambda-0(B3.e object) {
        Object object2 = object.h(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(object2, "container.get(firebaseApp)");
        object2 = (e)object2;
        Object object3 = object.h(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(object3, "container.get(firebaseInstallationsApi)");
        object3 = (i)object3;
        Object object4 = object.h(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(object4, "container.get(backgroundDispatcher)");
        object4 = (F)object4;
        Object object5 = object.h(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(object5, "container.get(blockingDispatcher)");
        object5 = (F)object5;
        object = object.b(transportFactory);
        Intrinsics.checkNotNullExpressionValue(object, "container.getProvider(transportFactory)");
        return new l((e)object2, (i)object3, (F)object4, (F)object5, (r4.b)object);
    }

    @NotNull
    public List<c> getComponents() {
        return W5.m.i(c.e(l.class).h("fire-sessions").b(r.j(firebaseApp)).b(r.j(firebaseInstallationsApi)).b(r.j(backgroundDispatcher)).b(r.j(blockingDispatcher)).b(r.l(transportFactory)).f(new m()).d(), O4.h.b("fire-sessions", "1.1.0"));
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }
    }

}

