package m6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f10258a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static s0 f10259b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f10260c;

    public static s0 a(Context context) {
        synchronized (f10258a) {
            if (f10259b == null) {
                f10259b = new s0(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f10259b;
    }

    public abstract j6.b b(p0 p0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public abstract void c(p0 p0Var, ServiceConnection serviceConnection);
}
