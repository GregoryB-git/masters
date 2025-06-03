package c8;

import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public abstract class i0<T> {
    public final Task a(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z10;
        g.s sVar = new g.s(this, 5);
        m0 p10 = firebaseAuth.p();
        if (p10 != null) {
            synchronized (p10.f2485a) {
                zzagt zzagtVar = p10.f2487c;
                z10 = zzagtVar != null && zzagtVar.zzc("EMAIL_PASSWORD_PROVIDER");
            }
            if (z10) {
                return p10.b(str, Boolean.FALSE, recaptchaAction).continueWithTask(sVar).continueWithTask(new j0(sVar, recaptchaAction, p10, str));
            }
        }
        return b(null).continueWithTask(new z5.j(recaptchaAction, firebaseAuth, str, sVar));
    }

    public abstract Task<T> b(String str);
}
