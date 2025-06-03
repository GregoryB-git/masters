package e7;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzig;

/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4417a = 1;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ k6 f4418b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ IInterface f4419c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4420d;

    public k2(zzig zzigVar, f fVar, k6 k6Var) {
        this.f4420d = fVar;
        this.f4418b = k6Var;
        this.f4419c = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4417a) {
            case 0:
                zzig.zza((zzig) this.f4419c, this.f4418b, (e) this.f4420d);
                return;
            case 1:
                ((zzig) this.f4419c).f2908a.c0();
                if (((f) this.f4420d).f4184c.D() == null) {
                    ((zzig) this.f4419c).f2908a.n((f) this.f4420d, this.f4418b);
                    return;
                } else {
                    ((zzig) this.f4419c).f2908a.I((f) this.f4420d, this.f4418b);
                    return;
                }
            default:
                String str = null;
                try {
                    try {
                        if (((w4) this.f4420d).j().y().p()) {
                            Object obj = this.f4420d;
                            n0 n0Var = ((w4) obj).f4735e;
                            if (n0Var == null) {
                                ((w4) obj).zzj().f4060o.b("Failed to get app instance id");
                            } else {
                                m6.j.i(this.f4418b);
                                str = n0Var.V1(this.f4418b);
                                if (str != null) {
                                    ((w4) this.f4420d).o().P(str);
                                    ((w4) this.f4420d).j().f4458q.b(str);
                                }
                                ((w4) this.f4420d).H();
                            }
                        } else {
                            ((w4) this.f4420d).zzj().t.b("Analytics storage consent denied; will not get app instance id");
                            ((w4) this.f4420d).o().P(null);
                            ((w4) this.f4420d).j().f4458q.b(null);
                        }
                    } catch (RemoteException e10) {
                        ((w4) this.f4420d).zzj().f4060o.c("Failed to get app instance id", e10);
                    }
                    return;
                } finally {
                    ((w4) this.f4420d).k().N(null, (zzdq) this.f4419c);
                }
        }
    }

    public /* synthetic */ k2(zzig zzigVar, k6 k6Var, e eVar) {
        this.f4419c = zzigVar;
        this.f4418b = k6Var;
        this.f4420d = eVar;
    }

    public k2(w4 w4Var, k6 k6Var, zzdq zzdqVar) {
        this.f4418b = k6Var;
        this.f4419c = zzdqVar;
        this.f4420d = w4Var;
    }
}
