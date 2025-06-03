package e7;

import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.measurement.internal.zzig;

/* loaded from: classes.dex */
public final class r2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k6 f4612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzig f4613c;

    public /* synthetic */ r2(zzig zzigVar, k6 k6Var, int i10) {
        this.f4611a = i10;
        this.f4612b = k6Var;
        this.f4613c = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgc.zzd C;
        switch (this.f4611a) {
            case 0:
                this.f4613c.f2908a.c0();
                i6 i6Var = this.f4613c.f2908a;
                k6 k6Var = this.f4612b;
                i6Var.zzl().l();
                i6Var.d0();
                m6.j.i(k6Var);
                m6.j.e(k6Var.f4437a);
                boolean z10 = false;
                if (i6Var.R().x(null, h0.f4275u0)) {
                    ((b.z) i6Var.zzb()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int q10 = i6Var.R().q(null, h0.f4240d0);
                    i6Var.R();
                    long longValue = currentTimeMillis - h0.f4242e.a(null).longValue();
                    for (int i10 = 0; i10 < q10 && i6Var.L(null, longValue); i10++) {
                    }
                } else {
                    i6Var.R();
                    long intValue = h0.f4257l.a(null).intValue();
                    for (int i11 = 0; i11 < intValue && i6Var.L(k6Var.f4437a, 0L); i11++) {
                    }
                }
                if (i6Var.R().x(null, h0.f4277v0)) {
                    i6Var.D();
                }
                if (i6Var.R().x(null, h0.L0)) {
                    g6 g6Var = i6Var.f4338r;
                    String str = k6Var.f4437a;
                    zzgf.zzo.zza zza = zzgf.zzo.zza.zza(k6Var.O);
                    g6Var.l();
                    if (g6Var.h().x(null, h0.K0) && zza == zzgf.zzo.zza.CLIENT_UPLOAD_ELIGIBLE && !g6.r(str) && (C = g6Var.o().C(str)) != null && C.zzq() && !C.zzh().zze().isEmpty()) {
                        z10 = true;
                    }
                    if (z10) {
                        String str2 = k6Var.f4437a;
                        ((b.z) i6Var.zzb()).getClass();
                        i6Var.t(str2, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            default:
                this.f4613c.f2908a.c0();
                i6 i6Var2 = this.f4613c.f2908a;
                k6 k6Var2 = this.f4612b;
                a0.j.q(i6Var2);
                m6.j.e(k6Var2.f4437a);
                i6Var2.W(k6Var2);
                i6Var2.U(k6Var2);
                break;
        }
    }
}
