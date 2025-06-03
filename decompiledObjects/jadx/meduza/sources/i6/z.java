package i6;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static z f7621e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7622a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f7623b;

    /* renamed from: c, reason: collision with root package name */
    public u f7624c = new u(this);

    /* renamed from: d, reason: collision with root package name */
    public int f7625d = 1;

    public z(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7623b = scheduledExecutorService;
        this.f7622a = context.getApplicationContext();
    }

    public static synchronized z a(Context context) {
        z zVar;
        synchronized (z.class) {
            if (f7621e == null) {
                zze.zza();
                f7621e = new z(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w6.a("MessengerIpcClient"))));
            }
            zVar = f7621e;
        }
        return zVar;
    }

    public final synchronized Task b(x xVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(xVar.toString()));
        }
        if (!this.f7624c.d(xVar)) {
            u uVar = new u(this);
            this.f7624c = uVar;
            uVar.d(xVar);
        }
        return xVar.f7618b.getTask();
    }
}
