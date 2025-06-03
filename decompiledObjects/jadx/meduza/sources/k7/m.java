package k7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f9117a;

    public /* synthetic */ m(n nVar) {
        this.f9117a = nVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9117a.f9120b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f9117a.a().post(new k(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9117a.f9120b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f9117a.a().post(new l(this));
    }
}
