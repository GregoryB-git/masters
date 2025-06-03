package l6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import k6.g;
import k6.j;

/* loaded from: classes.dex */
public final class k<R extends k6.j> extends k6.f<R> {

    /* renamed from: a, reason: collision with root package name */
    public final BasePendingResult f9697a;

    public k(BasePendingResult basePendingResult) {
        this.f9697a = basePendingResult;
    }

    @Override // k6.g
    public final void addStatusListener(g.a aVar) {
        this.f9697a.addStatusListener(aVar);
    }

    @Override // k6.g
    public final R await() {
        return (R) this.f9697a.await();
    }

    @Override // k6.g
    public final R await(long j10, TimeUnit timeUnit) {
        return (R) this.f9697a.await(j10, timeUnit);
    }

    @Override // k6.g
    public final void cancel() {
        this.f9697a.cancel();
    }

    @Override // k6.g
    public final boolean isCanceled() {
        return this.f9697a.isCanceled();
    }

    @Override // k6.g
    public final void setResultCallback(k6.k<? super R> kVar) {
        this.f9697a.setResultCallback(kVar);
    }

    @Override // k6.g
    public final void setResultCallback(k6.k<? super R> kVar, long j10, TimeUnit timeUnit) {
        this.f9697a.setResultCallback(kVar, j10, timeUnit);
    }

    @Override // k6.g
    public final <S extends k6.j> k6.m<S> then(k6.l<? super R, ? extends S> lVar) {
        return this.f9697a.then(lVar);
    }
}
