package A2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class X implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0317c f400b;

    public X(AbstractC0317c abstractC0317c, int i7) {
        this.f400b = abstractC0317c;
        this.f399a = i7;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC0317c abstractC0317c = this.f400b;
        if (iBinder == null) {
            AbstractC0317c.d0(abstractC0317c, 16);
            return;
        }
        obj = abstractC0317c.f426n;
        synchronized (obj) {
            try {
                AbstractC0317c abstractC0317c2 = this.f400b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC0317c2.f427o = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0325k)) ? new M(iBinder) : (InterfaceC0325k) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f400b.e0(0, null, this.f399a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f400b.f426n;
        synchronized (obj) {
            this.f400b.f427o = null;
        }
        Handler handler = this.f400b.f424l;
        handler.sendMessage(handler.obtainMessage(6, this.f399a, 1));
    }
}
