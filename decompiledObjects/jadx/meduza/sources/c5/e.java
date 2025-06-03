package c5;

import com.google.android.gms.tasks.OnFailureListener;
import d5.i;
import e7.y0;
import v5.e0;

/* loaded from: classes.dex */
public final class e implements c, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public long f2347a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2348b;

    public /* synthetic */ e(Object obj, long j10) {
        this.f2348b = obj;
        this.f2347a = j10;
    }

    @Override // c5.c
    public final long a(long j10) {
        return ((c4.c) this.f2348b).f2266e[(int) j10] - this.f2347a;
    }

    @Override // c5.c
    public final long b(long j10, long j11) {
        return ((c4.c) this.f2348b).f2265d[(int) j10];
    }

    @Override // c5.c
    public final long d(long j10, long j11) {
        return 0L;
    }

    @Override // c5.c
    public final long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // c5.c
    public final i f(long j10) {
        return new i(((c4.c) this.f2348b).f2264c[(int) j10], r0.f2263b[r8], null);
    }

    @Override // c5.c
    public final long g(long j10, long j11) {
        c4.c cVar = (c4.c) this.f2348b;
        return e0.f(cVar.f2266e, j10 + this.f2347a, true);
    }

    @Override // c5.c
    public final boolean h() {
        return true;
    }

    @Override // c5.c
    public final long i() {
        return 0L;
    }

    @Override // c5.c
    public final long j(long j10) {
        return ((c4.c) this.f2348b).f2262a;
    }

    @Override // c5.c
    public final long k(long j10, long j11) {
        return ((c4.c) this.f2348b).f2262a;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        y0 y0Var = (y0) this.f2348b;
        y0Var.f4775c.set(this.f2347a);
    }
}
