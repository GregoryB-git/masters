package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11554b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f11555a;

    public u(Throwable th, boolean z10) {
        this.f11555a = th;
        this._handled = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f11555a + ']';
    }
}
