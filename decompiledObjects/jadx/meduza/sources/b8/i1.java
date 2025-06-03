package b8;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class i1 extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2095b;

    public i1(FirebaseAuth firebaseAuth, f0 f0Var) {
        this.f2094a = f0Var;
        this.f2095b = firebaseAuth;
    }

    @Override // b8.f0
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // b8.f0
    public final void onCodeSent(String str, e0 e0Var) {
        f0 f0Var = this.f2094a;
        String str2 = this.f2095b.f3062g.f2441b;
        m6.j.i(str2);
        f0Var.onVerificationCompleted(c0.G(str, str2));
    }

    @Override // b8.f0
    public final void onVerificationCompleted(c0 c0Var) {
        this.f2094a.onVerificationCompleted(c0Var);
    }

    @Override // b8.f0
    public final void onVerificationFailed(u7.h hVar) {
        this.f2094a.onVerificationFailed(hVar);
    }
}
