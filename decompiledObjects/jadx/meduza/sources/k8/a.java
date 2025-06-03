package k8;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final m.a f9132a = new m.a(4);

    public static <T> Task<T> a(Task<T> task, Task<T> task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        o oVar = new o(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        m.a aVar = f9132a;
        task.continueWithTask(aVar, oVar);
        task2.continueWithTask(aVar, oVar);
        return taskCompletionSource.getTask();
    }
}
