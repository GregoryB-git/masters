package b8;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class h1 implements OnCompleteListener<c8.y0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f2089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2091c;

    public h1(FirebaseAuth firebaseAuth, d0 d0Var, String str) {
        this.f2089a = d0Var;
        this.f2090b = str;
        this.f2091c = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<c8.y0> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", "Error while validating application identity: " + (exception != null ? exception.getMessage() : ""));
            if (exception != null) {
                c8.y yVar = c8.y.f2542b;
                if ((exception instanceof n) || ((exception instanceof l) && ((l) exception).f2106a.endsWith("UNAUTHORIZED_DOMAIN"))) {
                    FirebaseAuth.o((u7.h) exception, this.f2089a, this.f2090b);
                    return;
                }
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        FirebaseAuth firebaseAuth = this.f2091c;
        d0 d0Var = this.f2089a;
        c8.y0 result = task.getResult();
        firebaseAuth.getClass();
        long longValue = d0Var.f2070b.longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str = d0Var.f2073e;
        m6.j.e(str);
        String b10 = result.b();
        String a10 = result.a();
        String c10 = result.c();
        if (zzae.zzc(b10) && firebaseAuth.p() != null && firebaseAuth.p().c()) {
            b10 = "NO_RECAPTCHA";
        }
        String str2 = b10;
        zzahk zzahkVar = new zzahk(str, longValue, d0Var.f2074g != null, firebaseAuth.f3064i, firebaseAuth.f3066k, c10, a10, str2, firebaseAuth.t());
        f0 h10 = firebaseAuth.h(d0Var.f2071c, str);
        if (TextUtils.isEmpty(result.c())) {
            c8.a1 a1Var = new c8.a1(c10, a10, str2);
            if (!d0Var.f2077j) {
                h10 = new k1(firebaseAuth, d0Var, a1Var, h10);
            }
        }
        firebaseAuth.f3061e.zza(firebaseAuth.f3057a, zzahkVar, h10, d0Var.f, d0Var.f2072d);
    }
}
