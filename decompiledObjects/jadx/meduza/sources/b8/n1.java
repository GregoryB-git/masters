package b8;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class n1 implements c8.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2120b;

    public n1(FirebaseAuth firebaseAuth, r rVar) {
        this.f2119a = rVar;
        this.f2120b = firebaseAuth;
    }

    @Override // c8.u
    public final void zza() {
        r rVar = this.f2120b.f;
        if (rVar == null || !rVar.a().equalsIgnoreCase(this.f2119a.a())) {
            return;
        }
        this.f2120b.s();
    }

    @Override // c8.t
    public final void zza(Status status) {
        int i10 = status.f2816a;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            FirebaseAuth firebaseAuth = this.f2120b;
            firebaseAuth.s();
            c8.r0 r0Var = firebaseAuth.f3078x;
            if (r0Var != null) {
                c8.r rVar = r0Var.f2515b;
                rVar.f2513e.removeCallbacks(rVar.f);
            }
        }
    }
}
