package e7;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class d5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k6 f4151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4 f4152c;

    public /* synthetic */ d5(w4 w4Var, k6 k6Var, int i10) {
        this.f4150a = i10;
        this.f4151b = k6Var;
        this.f4152c = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4150a) {
            case 0:
                w4 w4Var = this.f4152c;
                n0 n0Var = w4Var.f4735e;
                if (n0Var == null) {
                    w4Var.zzj().f4063r.b("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        m6.j.i(this.f4151b);
                        n0Var.Y1(this.f4151b);
                        this.f4152c.H();
                        break;
                    } catch (RemoteException e10) {
                        this.f4152c.zzj().f4060o.c("Failed to send app backgrounded to the service", e10);
                    }
                }
            default:
                w4 w4Var2 = this.f4152c;
                n0 n0Var2 = w4Var2.f4735e;
                if (n0Var2 == null) {
                    w4Var2.zzj().f4060o.b("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        m6.j.i(this.f4151b);
                        n0Var2.E0(this.f4151b);
                        this.f4152c.H();
                        break;
                    } catch (RemoteException e11) {
                        this.f4152c.zzj().f4060o.c("Failed to send measurementEnabled to the service", e11);
                        return;
                    }
                }
        }
    }
}
