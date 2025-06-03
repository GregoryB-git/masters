package c8;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes.dex */
public final class j0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f2470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Continuation f2471d;

    public j0(Continuation continuation, RecaptchaAction recaptchaAction, m0 m0Var, String str) {
        this.f2468a = str;
        this.f2469b = m0Var;
        this.f2470c = recaptchaAction;
        this.f2471d = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        m6.j.i(exception);
        if (!zzadr.zzc(exception)) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + this.f2468a);
        }
        return this.f2469b.b(this.f2468a, Boolean.TRUE, this.f2470c).continueWithTask(this.f2471d);
    }
}
