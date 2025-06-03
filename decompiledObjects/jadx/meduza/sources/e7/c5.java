package e7;

import com.google.android.gms.measurement.internal.zzge;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c5 extends zzge {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4138a;

    public c5(AtomicReference atomicReference) {
        this.f4138a = atomicReference;
    }

    @Override // e7.s0
    public final void E(f6 f6Var) {
        synchronized (this.f4138a) {
            this.f4138a.set(f6Var);
            this.f4138a.notifyAll();
        }
    }
}
