package A2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: A2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0322h {

    /* renamed from: a, reason: collision with root package name */
    public static int f493a = 4225;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f494b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static j0 f495c = null;

    /* renamed from: d, reason: collision with root package name */
    public static HandlerThread f496d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f497e = false;

    public static int a() {
        return f493a;
    }

    public static AbstractC0322h b(Context context) {
        synchronized (f494b) {
            try {
                if (f495c == null) {
                    f495c = new j0(context.getApplicationContext(), f497e ? c().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f495c;
    }

    public static HandlerThread c() {
        synchronized (f494b) {
            try {
                HandlerThread handlerThread = f496d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f496d = handlerThread2;
                handlerThread2.start();
                return f496d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(e0 e0Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i7, ServiceConnection serviceConnection, String str3, boolean z7) {
        d(new e0(str, str2, i7, z7), serviceConnection, str3);
    }

    public abstract boolean f(e0 e0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
