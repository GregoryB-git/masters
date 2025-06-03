package k7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f9106a;

    public e() {
        this.f9106a = null;
    }

    public e(TaskCompletionSource taskCompletionSource) {
        this.f9106a = taskCompletionSource;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            TaskCompletionSource taskCompletionSource = this.f9106a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(e10);
            }
        }
    }
}
