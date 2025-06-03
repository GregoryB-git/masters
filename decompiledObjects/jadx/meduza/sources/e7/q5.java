package e7;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzdj;

/* loaded from: classes.dex */
public final class q5 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public zzdj f4594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4595e;
    public final v5 f;

    /* renamed from: o, reason: collision with root package name */
    public final t5 f4596o;

    /* renamed from: p, reason: collision with root package name */
    public final l3.l f4597p;

    public q5(j2 j2Var) {
        super(j2Var);
        this.f4595e = true;
        this.f = new v5(this);
        this.f4596o = new t5(this);
        this.f4597p = new l3.l(this);
    }

    @Override // e7.j0
    public final boolean s() {
        return false;
    }

    public final void v() {
        l();
        if (this.f4594d == null) {
            this.f4594d = new zzdj(Looper.getMainLooper());
        }
    }
}
