package o2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f11700a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11701b;

    public b(boolean z10) {
        this.f11701b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ec.i.e(runnable, "runnable");
        StringBuilder l10 = defpackage.f.l(this.f11701b ? "WM.task-" : "androidx.work-");
        l10.append(this.f11700a.incrementAndGet());
        return new Thread(runnable, l10.toString());
    }
}
