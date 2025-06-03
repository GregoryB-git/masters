package m7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f10345a;

    public /* synthetic */ d(e eVar) {
        this.f10345a = eVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10345a.f10348b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f10345a.a().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10345a.f10348b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f10345a.a().post(new c(this, 0));
    }
}
