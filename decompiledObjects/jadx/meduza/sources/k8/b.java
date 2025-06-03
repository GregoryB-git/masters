package k8;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f9133a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9134b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public Task<?> f9135c = Tasks.forResult(null);

    public b(ExecutorService executorService) {
        this.f9133a = executorService;
    }

    public final Task<Void> a(Runnable runnable) {
        Task continueWithTask;
        synchronized (this.f9134b) {
            continueWithTask = this.f9135c.continueWithTask(this.f9133a, new io.flutter.plugins.firebase.auth.g(runnable, 17));
            this.f9135c = continueWithTask;
        }
        return continueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9133a.execute(runnable);
    }
}
