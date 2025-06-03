package i9;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class w extends e9.a {

    /* renamed from: i, reason: collision with root package name */
    public f0 f7832i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7833j;

    /* renamed from: b, reason: collision with root package name */
    public final d2.h0 f7826b = new d2.h0(8);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7827c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final s f7829e = new s();
    public final z f = new z(this);

    /* renamed from: g, reason: collision with root package name */
    public final d5.n f7830g = new d5.n();

    /* renamed from: h, reason: collision with root package name */
    public final y f7831h = new y();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7828d = new HashMap();

    @Override // e9.a
    public final void A() {
        x6.b.Z("MemoryPersistence shutdown without start", this.f7833j, new Object[0]);
        this.f7833j = false;
    }

    @Override // e9.a
    public final void B() {
        x6.b.Z("MemoryPersistence double-started!", !this.f7833j, new Object[0]);
        this.f7833j = true;
    }

    @Override // e9.a
    public final a j() {
        return this.f7830g;
    }

    @Override // e9.a
    public final b k(e9.e eVar) {
        r rVar = (r) this.f7828d.get(eVar);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        this.f7828d.put(eVar, rVar2);
        return rVar2;
    }

    @Override // e9.a
    public final d l() {
        return this.f7826b;
    }

    @Override // e9.a
    public final f m(e9.e eVar) {
        return this.f7829e;
    }

    @Override // e9.a
    public final a0 n(e9.e eVar, f fVar) {
        v vVar = (v) this.f7827c.get(eVar);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this);
        this.f7827c.put(eVar, vVar2);
        return vVar2;
    }

    @Override // e9.a
    public final b0 o() {
        return new eb.y();
    }

    @Override // e9.a
    public final f0 p() {
        return this.f7832i;
    }

    @Override // e9.a
    public final g0 q() {
        return this.f7831h;
    }

    @Override // e9.a
    public final l1 r() {
        return this.f;
    }

    @Override // e9.a
    public final boolean u() {
        return this.f7833j;
    }

    @Override // e9.a
    public final <T> T x(String str, n9.l<T> lVar) {
        this.f7832i.f();
        try {
            return lVar.get();
        } finally {
            this.f7832i.d();
        }
    }

    @Override // e9.a
    public final void y(String str, Runnable runnable) {
        this.f7832i.f();
        try {
            runnable.run();
        } finally {
            this.f7832i.d();
        }
    }
}
