package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: p6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1877z {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f18581b = AtomicIntegerFieldUpdater.newUpdater(C1877z.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f18582a;

    public C1877z(Throwable th, boolean z7) {
        this.f18582a = th;
        this._handled = z7 ? 1 : 0;
    }

    public final boolean a() {
        return f18581b.get(this) != 0;
    }

    public final boolean b() {
        return f18581b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.f18582a + ']';
    }

    public /* synthetic */ C1877z(Throwable th, boolean z7, int i7, kotlin.jvm.internal.g gVar) {
        this(th, (i7 & 2) != 0 ? false : z7);
    }
}
