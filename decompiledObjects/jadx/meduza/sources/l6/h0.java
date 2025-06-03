package l6;

import android.os.Looper;
import k6.a;

/* loaded from: classes.dex */
public final class h0 extends x {

    /* renamed from: b, reason: collision with root package name */
    public final k6.d f9687b;

    public h0(k6.d dVar) {
        this.f9687b = dVar;
    }

    @Override // k6.e
    public final com.google.android.gms.common.api.internal.a a(h6.h hVar) {
        return this.f9687b.doRead((k6.d) hVar);
    }

    @Override // k6.e
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k6.j, A>> T b(T t) {
        return (T) this.f9687b.doWrite((k6.d) t);
    }

    @Override // k6.e
    public final Looper c() {
        return this.f9687b.getLooper();
    }

    @Override // k6.e
    public final void d() {
    }

    @Override // k6.e
    public final void e() {
    }
}
