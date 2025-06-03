package b8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class k1 extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c8.y0 f2103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f2104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2105d;

    public k1(FirebaseAuth firebaseAuth, d0 d0Var, c8.y0 y0Var, f0 f0Var) {
        this.f2102a = d0Var;
        this.f2103b = y0Var;
        this.f2104c = f0Var;
        this.f2105d = firebaseAuth;
    }

    @Override // b8.f0
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.f2104c.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // b8.f0
    public final void onCodeSent(String str, e0 e0Var) {
        this.f2104c.onCodeSent(str, e0Var);
    }

    @Override // b8.f0
    public final void onVerificationCompleted(c0 c0Var) {
        this.f2104c.onVerificationCompleted(c0Var);
    }

    @Override // b8.f0
    public final void onVerificationFailed(u7.h hVar) {
        if (zzadr.zza(hVar)) {
            d0 d0Var = this.f2102a;
            d0Var.f2077j = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + d0Var.f2073e);
            FirebaseAuth.l(this.f2102a);
            return;
        }
        if (TextUtils.isEmpty(this.f2103b.b())) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.f2102a.f2073e + ", error - " + hVar.getMessage());
            this.f2104c.onVerificationFailed(hVar);
            return;
        }
        if (zzadr.zzb(hVar) && this.f2105d.p().c() && TextUtils.isEmpty(this.f2103b.a())) {
            d0 d0Var2 = this.f2102a;
            d0Var2.f2078k = true;
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + d0Var2.f2073e);
            FirebaseAuth.l(this.f2102a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.f2102a.f2073e + ", error - " + hVar.getMessage());
        this.f2104c.onVerificationFailed(hVar);
    }
}
