package i6;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.n0;
import e7.w4;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7581a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7582b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f7581a = i10;
        this.f7582b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7581a) {
            case 0:
                if (((TaskCompletionSource) this.f7582b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 1:
                u uVar = (u) this.f7582b;
                synchronized (uVar) {
                    if (uVar.f7610a == 1) {
                        uVar.a(1, "Timed out while binding");
                    }
                }
                return;
            default:
                w4 w4Var = (w4) this.f7582b;
                n0 n0Var = w4Var.f4735e;
                if (n0Var == null) {
                    w4Var.zzj().f4060o.b("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    n0Var.k0(w4Var.I(false));
                    w4Var.H();
                    return;
                } catch (RemoteException e10) {
                    w4Var.zzj().f4060o.c("Failed to send Dma consent settings to the service", e10);
                    return;
                }
        }
    }
}
