package u;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class p extends s {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f14820b;

    @Override // u.s
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // u.s
    public final void b(t tVar) {
        new Notification.BigTextStyle(tVar.f14847b).setBigContentTitle(null).bigText(this.f14820b);
    }

    @Override // u.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
