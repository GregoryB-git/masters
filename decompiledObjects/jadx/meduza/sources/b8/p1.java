package b8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzagw;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class p1 implements c8.t, c8.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2130a;

    public p1(FirebaseAuth firebaseAuth) {
        this.f2130a = firebaseAuth;
    }

    @Override // c8.z0
    public final void a(zzagw zzagwVar, r rVar) {
        FirebaseAuth firebaseAuth = this.f2130a;
        firebaseAuth.getClass();
        FirebaseAuth.n(firebaseAuth, rVar, zzagwVar, true, true);
    }

    @Override // c8.t
    public final void zza(Status status) {
        int i10 = status.f2816a;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            FirebaseAuth firebaseAuth = this.f2130a;
            firebaseAuth.s();
            c8.r0 r0Var = firebaseAuth.f3078x;
            if (r0Var != null) {
                c8.r rVar = r0Var.f2515b;
                rVar.f2513e.removeCallbacks(rVar.f);
            }
        }
    }
}
