package k8;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9139d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f9140a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9141b;

    /* renamed from: c, reason: collision with root package name */
    public final b f9142c;

    public static final class a {
        public static void a(dc.a aVar, dc.a aVar2) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return;
            }
            String str = (String) aVar2.invoke();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            a aVar3 = i.f9139d;
        }

        public static String b() {
            return Thread.currentThread().getName();
        }
    }

    public i(ExecutorService executorService, ExecutorService executorService2) {
        ec.i.e(executorService, "backgroundExecutorService");
        ec.i.e(executorService2, "blockingExecutorService");
        this.f9140a = new b(executorService);
        this.f9141b = new b(executorService);
        Tasks.forResult(null);
        this.f9142c = new b(executorService2);
    }

    public static final void a() {
        a aVar = f9139d;
        aVar.getClass();
        a.a(new c(aVar), d.f9136a);
    }
}
