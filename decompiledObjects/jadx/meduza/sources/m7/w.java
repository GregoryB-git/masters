package m7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f10369a;

    public w() {
        this.f10369a = null;
    }

    public w(TaskCompletionSource taskCompletionSource) {
        this.f10369a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f10369a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f10369a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }
}
