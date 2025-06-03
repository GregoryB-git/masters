package c8;

import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2485a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2486b;

    /* renamed from: c, reason: collision with root package name */
    public zzagt f2487c;

    /* renamed from: d, reason: collision with root package name */
    public u7.f f2488d;

    /* renamed from: e, reason: collision with root package name */
    public FirebaseAuth f2489e;
    public b.a0 f;

    public m0(u7.f fVar, FirebaseAuth firebaseAuth) {
        b.a0 a0Var = new b.a0();
        this.f2485a = new Object();
        this.f2486b = new HashMap();
        this.f2488d = fVar;
        this.f2489e = firebaseAuth;
        this.f = a0Var;
    }

    public final Task<RecaptchaTasksClient> a(String str, Boolean bool) {
        Task<RecaptchaTasksClient> task;
        if (zzae.zzc(str)) {
            str = "*";
        }
        if (!bool.booleanValue()) {
            synchronized (this.f2485a) {
                task = (Task) this.f2486b.get(str);
            }
            if (task != null) {
                return task;
            }
        }
        FirebaseAuth firebaseAuth = this.f2489e;
        return firebaseAuth.f3061e.zza(firebaseAuth.f3066k, "RECAPTCHA_ENTERPRISE").continueWithTask(new l0(this, str));
    }

    public final Task<String> b(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task<RecaptchaTasksClient> task;
        if (zzae.zzc(str)) {
            str = "*";
        }
        synchronized (this.f2485a) {
            task = (Task) this.f2486b.get(str);
        }
        if (bool.booleanValue() || task == null) {
            task = a(str, bool);
        }
        return task.continueWithTask(new o0(recaptchaAction));
    }

    public final boolean c() {
        String zzb;
        zzagt zzagtVar = this.f2487c;
        if (zzagtVar == null || (zzb = zzagtVar.zzb("PHONE_PROVIDER")) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }
}
