package e7;

import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class y3 extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4781e;
    public final /* synthetic */ c3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(c3 c3Var, j2 j2Var, int i10) {
        super(j2Var);
        this.f4781e = i10;
        this.f = c3Var;
    }

    @Override // e7.v
    public final void c() {
        switch (this.f4781e) {
            case 0:
                ((k3) this.f).N();
                break;
            case 1:
                ((k3) this.f).M();
                break;
            default:
                ((i6) this.f).zzl().l();
                String str = (String) ((i6) this.f).f4344y.pollFirst();
                if (str != null) {
                    i6 i6Var = (i6) this.f;
                    ((b.z) i6Var.zzb()).getClass();
                    i6Var.Q = SystemClock.elapsedRealtime();
                    ((i6) this.f).zzj().f4067w.c("Sending trigger URI notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    ((i6) this.f).t.f4360a.sendBroadcast(intent);
                }
                ((i6) this.f).E();
                break;
        }
    }
}
