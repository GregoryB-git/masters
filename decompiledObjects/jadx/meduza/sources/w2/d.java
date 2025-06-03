package w2;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16195b;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f16195b = systemForegroundService;
        this.f16194a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16195b.f1528e.cancel(this.f16194a);
    }
}
