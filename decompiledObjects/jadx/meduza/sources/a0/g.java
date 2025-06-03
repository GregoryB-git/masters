package a0;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final ub.e<R> f4a;

    public g(nc.l lVar) {
        super(false);
        this.f4a = lVar;
    }

    public final void onError(E e10) {
        if (compareAndSet(false, true)) {
            this.f4a.resumeWith(rb.f.a(e10));
        }
    }

    public final void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.f4a.resumeWith(r10);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ContinuationOutcomeReceiver(outcomeReceived = ");
        l10.append(get());
        l10.append(')');
        return l10.toString();
    }
}
