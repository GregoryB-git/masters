package z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: z2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2296E extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f21650a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2295D f21651b;

    public C2296E(AbstractC2295D abstractC2295D) {
        this.f21651b = abstractC2295D;
    }

    public final void a(Context context) {
        this.f21650a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f21650a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f21650a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f21651b.a();
            b();
        }
    }
}
