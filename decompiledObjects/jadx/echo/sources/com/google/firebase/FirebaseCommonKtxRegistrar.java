package com.google.firebase;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import W5.o;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.AbstractC1853i0;
import p6.F;
import y3.InterfaceC2271a;
import y3.InterfaceC2272b;
import y3.InterfaceC2273c;
import y3.InterfaceC2274d;

@Keep
@Metadata
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11558a = new a();

        @Override // B3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0344e interfaceC0344e) {
            Object h7 = interfaceC0344e.h(B3.F.a(InterfaceC2271a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(h7, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1853i0.a((Executor) h7);
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11559a = new b();

        @Override // B3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0344e interfaceC0344e) {
            Object h7 = interfaceC0344e.h(B3.F.a(InterfaceC2273c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(h7, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1853i0.a((Executor) h7);
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f11560a = new c();

        @Override // B3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0344e interfaceC0344e) {
            Object h7 = interfaceC0344e.h(B3.F.a(InterfaceC2272b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(h7, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1853i0.a((Executor) h7);
        }
    }

    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f11561a = new d();

        @Override // B3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0344e interfaceC0344e) {
            Object h7 = interfaceC0344e.h(B3.F.a(InterfaceC2274d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(h7, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1853i0.a((Executor) h7);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0342c> getComponents() {
        List<C0342c> i7;
        C0342c d7 = C0342c.c(B3.F.a(InterfaceC2271a.class, F.class)).b(r.j(B3.F.a(InterfaceC2271a.class, Executor.class))).f(a.f11558a).d();
        Intrinsics.checkNotNullExpressionValue(d7, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0342c d8 = C0342c.c(B3.F.a(InterfaceC2273c.class, F.class)).b(r.j(B3.F.a(InterfaceC2273c.class, Executor.class))).f(b.f11559a).d();
        Intrinsics.checkNotNullExpressionValue(d8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0342c d9 = C0342c.c(B3.F.a(InterfaceC2272b.class, F.class)).b(r.j(B3.F.a(InterfaceC2272b.class, Executor.class))).f(c.f11560a).d();
        Intrinsics.checkNotNullExpressionValue(d9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0342c d10 = C0342c.c(B3.F.a(InterfaceC2274d.class, F.class)).b(r.j(B3.F.a(InterfaceC2274d.class, Executor.class))).f(d.f11561a).d();
        Intrinsics.checkNotNullExpressionValue(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        i7 = o.i(d7, d8, d9, d10);
        return i7;
    }
}
