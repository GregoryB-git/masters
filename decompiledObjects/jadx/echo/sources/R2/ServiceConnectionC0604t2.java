package R2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC0901f0;
import com.google.android.gms.internal.measurement.InterfaceC0874c0;

/* renamed from: R2.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0604t2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f5538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0611u2 f5539b;

    public ServiceConnectionC0604t2(C0611u2 c0611u2, String str) {
        this.f5539b = c0611u2;
        this.f5538a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f5539b.f5547a.j().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC0874c0 o7 = AbstractBinderC0901f0.o(iBinder);
            if (o7 == null) {
                this.f5539b.f5547a.j().L().a("Install Referrer Service implementation was not found");
            } else {
                this.f5539b.f5547a.j().K().a("Install Referrer Service connected");
                this.f5539b.f5547a.e().D(new RunnableC0625w2(this, o7, this));
            }
        } catch (RuntimeException e7) {
            this.f5539b.f5547a.j().L().b("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5539b.f5547a.j().K().a("Install Referrer Service disconnected");
    }
}
