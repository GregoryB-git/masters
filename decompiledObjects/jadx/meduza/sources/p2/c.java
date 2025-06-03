package p2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c implements o2.n {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12859a;

    public c() {
        Handler handler;
        Handler handler2;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = Handler.createAsync(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e10) {
                e = e10;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f12859a = handler2;
            } catch (InstantiationException e11) {
                e = e11;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f12859a = handler2;
            } catch (NoSuchMethodException e12) {
                e = e12;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f12859a = handler2;
            } catch (InvocationTargetException e13) {
                Throwable cause = e13.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handler2 = handler;
        }
        this.f12859a = handler2;
    }

    @Override // o2.n
    public final void a(Runnable runnable, long j10) {
        this.f12859a.postDelayed(runnable, j10);
    }

    @Override // o2.n
    public final void b(Runnable runnable) {
        this.f12859a.removeCallbacks(runnable);
    }
}
