package c8;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* loaded from: classes.dex */
public final class o0 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f2499a;

    public o0(RecaptchaAction recaptchaAction) {
        this.f2499a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f2499a);
        }
        Exception exception = task.getException();
        m6.j.i(exception);
        if (!(exception instanceof k0)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }
}
