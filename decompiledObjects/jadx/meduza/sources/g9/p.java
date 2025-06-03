package g9;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.loader.FlutterLoader;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6043a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6047e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(u uVar, TaskCompletionSource taskCompletionSource, Context context, f fVar, m9.z zVar) {
        this.f6045c = uVar;
        this.f6046d = taskCompletionSource;
        this.f6044b = context;
        this.f6047e = fVar;
        this.f = zVar;
    }

    public /* synthetic */ p(FlutterLoader flutterLoader, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.f6045c = flutterLoader;
        this.f6044b = context;
        this.f6046d = strArr;
        this.f6047e = handler;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6043a) {
            case 0:
                u uVar = (u) this.f6045c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6046d;
                Context context = this.f6044b;
                f fVar = (f) this.f6047e;
                m9.z zVar = (m9.z) this.f;
                uVar.getClass();
                try {
                    uVar.a(context, (e9.e) Tasks.await(taskCompletionSource.getTask()), fVar, zVar);
                    return;
                } catch (InterruptedException | ExecutionException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                ((FlutterLoader) this.f6045c).lambda$ensureInitializationCompleteAsync$0(this.f6044b, (String[]) this.f6046d, (Handler) this.f6047e, (Runnable) this.f);
                return;
        }
    }
}
