package e7;

import com.google.android.gms.measurement.internal.zzgd;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a5 extends zzgd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4074a;

    public a5(AtomicReference atomicReference) {
        this.f4074a = atomicReference;
    }

    @Override // e7.p0
    public final void zza(List<w5> list) {
        synchronized (this.f4074a) {
            this.f4074a.set(list);
            this.f4074a.notifyAll();
        }
    }
}
