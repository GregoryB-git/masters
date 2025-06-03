package c8;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzagt;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 implements Continuation<zzagt, Task<RecaptchaTasksClient>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2479b;

    public l0(m0 m0Var, String str) {
        this.f2478a = str;
        this.f2479b = m0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Task<RecaptchaTasksClient> then(Task<zzagt> task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            m6.j.i(exception);
            String message = exception.getMessage();
            m6.j.i(message);
            return Tasks.forException(new k0(message));
        }
        zzagt result = task.getResult();
        String zza = result.zza();
        if (zzae.zzc(zza)) {
            return Tasks.forException(new k0(defpackage.f.j("No Recaptcha Enterprise siteKey configured for tenant/project ", this.f2478a)));
        }
        List<String> zza2 = zzv.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(defpackage.f.j("Invalid siteKey format ", zza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f2478a);
        }
        m0 m0Var = this.f2479b;
        b.a0 a0Var = m0Var.f;
        u7.f fVar = m0Var.f2488d;
        fVar.a();
        Application application = (Application) fVar.f15084a;
        a0Var.getClass();
        Task<RecaptchaTasksClient> fetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        m0 m0Var2 = this.f2479b;
        String str2 = this.f2478a;
        synchronized (m0Var2.f2485a) {
            m0Var2.f2487c = result;
            m0Var2.f2486b.put(str2, fetchTaskClient);
        }
        return fetchTaskClient;
    }
}
