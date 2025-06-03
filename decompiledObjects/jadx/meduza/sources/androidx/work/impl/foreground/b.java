package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f1541d;

    public b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f1541d = systemForegroundService;
        this.f1538a = i10;
        this.f1539b = notification;
        this.f1540c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            SystemForegroundService.b.a(this.f1541d, this.f1538a, this.f1539b, this.f1540c);
        } else if (i10 >= 29) {
            SystemForegroundService.a.a(this.f1541d, this.f1538a, this.f1539b, this.f1540c);
        } else {
            this.f1541d.startForeground(this.f1538a, this.f1539b);
        }
    }
}
