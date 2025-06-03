package e7;

import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzgc;

/* loaded from: classes.dex */
public final class b2 extends r.f<String, zzb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f4101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(w1 w1Var) {
        super(20);
        this.f4101a = w1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r.f
    public final zzb create(String str) {
        String str2 = str;
        m6.j.e(str2);
        w1 w1Var = this.f4101a;
        w1Var.p();
        m6.j.e(str2);
        if (!w1Var.H(str2)) {
            return null;
        }
        if (!w1Var.f4723q.containsKey(str2) || w1Var.f4723q.getOrDefault(str2, null) == 0) {
            w1Var.L(str2);
        } else {
            w1Var.y(str2, (zzgc.zzd) w1Var.f4723q.getOrDefault(str2, null));
        }
        return w1Var.f4725s.snapshot().get(str2);
    }
}
