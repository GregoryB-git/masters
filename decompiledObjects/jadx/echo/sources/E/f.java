package E;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class f {

    public static class a implements Executor {

        /* renamed from: o, reason: collision with root package name */
        public final Handler f1522o;

        public a(Handler handler) {
            this.f1522o = (Handler) H.e.b(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f1522o.post((Runnable) H.e.b(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f1522o + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
