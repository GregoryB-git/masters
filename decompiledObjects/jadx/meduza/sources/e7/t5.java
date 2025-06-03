package e7;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public long f4678a;

    /* renamed from: b, reason: collision with root package name */
    public long f4679b;

    /* renamed from: c, reason: collision with root package name */
    public final s5 f4680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q5 f4681d;

    public t5(q5 q5Var) {
        this.f4681d = q5Var;
        this.f4680c = new s5(this, (j2) q5Var.f3407b, 0);
        ((b.z) q5Var.zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4678a = elapsedRealtime;
        this.f4679b = elapsedRealtime;
    }

    public final boolean a(long j10, boolean z10, boolean z11) {
        this.f4681d.l();
        this.f4681d.t();
        if (((j2) this.f4681d.f3407b).d()) {
            q1 q1Var = this.f4681d.j().f4466z;
            ((b.z) this.f4681d.zzb()).getClass();
            q1Var.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f4678a;
        if (!z10 && j11 < 1000) {
            this.f4681d.zzj().f4067w.c("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f4679b;
            this.f4679b = j10;
        }
        this.f4681d.zzj().f4067w.c("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        r6.L(this.f4681d.p().v(!this.f4681d.h().A()), bundle, true);
        if (!z11) {
            this.f4681d.o().Q("auto", "_e", bundle);
        }
        this.f4678a = j10;
        this.f4680c.a();
        this.f4680c.b(h0.f4258l0.a(null).longValue());
        return true;
    }
}
