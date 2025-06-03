package com.google.firebase.sessions;

import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import R4.l;
import W5.o;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.i;
import y3.InterfaceC2271a;
import y3.InterfaceC2272b;

@Keep
@Metadata
/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    public static final a Companion = new a(null);
    private static final F firebaseApp = F.b(C1947e.class);
    private static final F firebaseInstallationsApi = F.b(i.class);
    private static final F backgroundDispatcher = F.a(InterfaceC2271a.class, p6.F.class);
    private static final F blockingDispatcher = F.a(InterfaceC2272b.class, p6.F.class);
    private static final F transportFactory = F.b(g.class);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final l m8getComponents$lambda0(InterfaceC0344e interfaceC0344e) {
        Object h7 = interfaceC0344e.h(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(h7, "container.get(firebaseApp)");
        C1947e c1947e = (C1947e) h7;
        Object h8 = interfaceC0344e.h(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(h8, "container.get(firebaseInstallationsApi)");
        i iVar = (i) h8;
        Object h9 = interfaceC0344e.h(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(h9, "container.get(backgroundDispatcher)");
        p6.F f7 = (p6.F) h9;
        Object h10 = interfaceC0344e.h(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(h10, "container.get(blockingDispatcher)");
        p6.F f8 = (p6.F) h10;
        InterfaceC1922b b7 = interfaceC0344e.b(transportFactory);
        Intrinsics.checkNotNullExpressionValue(b7, "container.getProvider(transportFactory)");
        return new l(c1947e, iVar, f7, f8, b7);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0342c> getComponents() {
        List<C0342c> i7;
        i7 = o.i(C0342c.e(l.class).h(LIBRARY_NAME).b(r.j(firebaseApp)).b(r.j(firebaseInstallationsApi)).b(r.j(backgroundDispatcher)).b(r.j(blockingDispatcher)).b(r.l(transportFactory)).f(new h() { // from class: R4.m
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                l m8getComponents$lambda0;
                m8getComponents$lambda0 = FirebaseSessionsRegistrar.m8getComponents$lambda0(interfaceC0344e);
                return m8getComponents$lambda0;
            }
        }).d(), O4.h.b(LIBRARY_NAME, "1.1.0"));
        return i7;
    }
}
