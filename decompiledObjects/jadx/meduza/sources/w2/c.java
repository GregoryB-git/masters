package w2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f16192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16193c;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f16193c = systemForegroundService;
        this.f16191a = i10;
        this.f16192b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16193c.f1528e.notify(this.f16191a, this.f16192b);
    }
}
