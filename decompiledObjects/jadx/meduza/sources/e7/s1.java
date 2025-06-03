package e7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzbz;

/* loaded from: classes.dex */
public final class s1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f4631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f4632b;

    public s1(t1 t1Var, String str) {
        this.f4632b = t1Var;
        this.f4631a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f4632b.f4668a.zzj().f4063r.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbz zza = zzby.zza(iBinder);
            if (zza == null) {
                this.f4632b.f4668a.zzj().f4063r.b("Install Referrer Service implementation was not found");
            } else {
                this.f4632b.f4668a.zzj().f4067w.b("Install Referrer Service connected");
                this.f4632b.f4668a.zzl().u(new v1(this, zza, this, 0));
            }
        } catch (RuntimeException e10) {
            this.f4632b.f4668a.zzj().f4063r.c("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4632b.f4668a.zzj().f4067w.b("Install Referrer Service disconnected");
    }
}
