package nc;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class s0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Future<?> f11548a;

    public s0(ScheduledFuture scheduledFuture) {
        this.f11548a = scheduledFuture;
    }

    @Override // nc.t0
    public final void dispose() {
        this.f11548a.cancel(false);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DisposableFutureHandle[");
        l10.append(this.f11548a);
        l10.append(']');
        return l10.toString();
    }
}
