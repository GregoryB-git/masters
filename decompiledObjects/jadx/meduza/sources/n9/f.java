package n9;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f11360a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b, reason: collision with root package name */
    public static final m.a f11361b = new m.a(5);

    /* renamed from: c, reason: collision with root package name */
    public static final m f11362c = new m(AsyncTask.THREAD_POOL_EXECUTOR);
}
