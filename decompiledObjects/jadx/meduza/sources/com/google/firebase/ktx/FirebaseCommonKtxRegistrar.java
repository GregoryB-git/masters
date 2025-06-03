package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.e;
import d8.k;
import d8.t;
import d8.u;
import ec.i;
import java.util.List;
import java.util.concurrent.Executor;
import nc.a0;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f3224a = new a<>();

        @Override // d8.e
        public final Object g(u uVar) {
            Object e10 = uVar.e(new t<>(y7.a.class, Executor.class));
            i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return x6.b.W((Executor) e10);
        }
    }

    public static final class b<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b<T> f3225a = new b<>();

        @Override // d8.e
        public final Object g(u uVar) {
            Object e10 = uVar.e(new t<>(y7.c.class, Executor.class));
            i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return x6.b.W((Executor) e10);
        }
    }

    public static final class c<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c<T> f3226a = new c<>();

        @Override // d8.e
        public final Object g(u uVar) {
            Object e10 = uVar.e(new t<>(y7.b.class, Executor.class));
            i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return x6.b.W((Executor) e10);
        }
    }

    public static final class d<T> implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T> f3227a = new d<>();

        @Override // d8.e
        public final Object g(u uVar) {
            Object e10 = uVar.e(new t<>(y7.d.class, Executor.class));
            i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return x6.b.W((Executor) e10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a a10 = d8.b.a(new t(y7.a.class, a0.class));
        a10.a(new k((t<?>) new t(y7.a.class, Executor.class), 1, 0));
        a10.f = a.f3224a;
        b.a a11 = d8.b.a(new t(y7.c.class, a0.class));
        a11.a(new k((t<?>) new t(y7.c.class, Executor.class), 1, 0));
        a11.f = b.f3225a;
        b.a a12 = d8.b.a(new t(y7.b.class, a0.class));
        a12.a(new k((t<?>) new t(y7.b.class, Executor.class), 1, 0));
        a12.f = c.f3226a;
        b.a a13 = d8.b.a(new t(y7.d.class, a0.class));
        a13.a(new k((t<?>) new t(y7.d.class, Executor.class), 1, 0));
        a13.f = d.f3227a;
        return va.a.g(a10.b(), a11.b(), a12.b(), a13.b());
    }
}
