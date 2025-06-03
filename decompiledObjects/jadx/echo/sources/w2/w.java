package w2;

import V2.AbstractC0659j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static w f20367e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20368a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f20369b;

    /* renamed from: c, reason: collision with root package name */
    public ServiceConnectionC2095q f20370c = new ServiceConnectionC2095q(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f20371d = 1;

    public w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f20369b = scheduledExecutorService;
        this.f20368a = context.getApplicationContext();
    }

    public static synchronized w b(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f20367e == null) {
                    L2.e.a();
                    f20367e = new w(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new F2.a("MessengerIpcClient"))));
                }
                wVar = f20367e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public final AbstractC0659j c(int i7, Bundle bundle) {
        return g(new C2097s(f(), 2, bundle));
    }

    public final AbstractC0659j d(int i7, Bundle bundle) {
        return g(new v(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i7;
        i7 = this.f20371d;
        this.f20371d = i7 + 1;
        return i7;
    }

    public final synchronized AbstractC0659j g(AbstractC2098t abstractC2098t) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(abstractC2098t);
                StringBuilder sb = new StringBuilder(valueOf.length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.f20370c.g(abstractC2098t)) {
                ServiceConnectionC2095q serviceConnectionC2095q = new ServiceConnectionC2095q(this, null);
                this.f20370c = serviceConnectionC2095q;
                serviceConnectionC2095q.g(abstractC2098t);
            }
        } catch (Throwable th) {
            throw th;
        }
        return abstractC2098t.f20364b.a();
    }
}
