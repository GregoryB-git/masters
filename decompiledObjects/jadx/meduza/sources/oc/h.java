package oc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ec.i;
import rb.e;

/* loaded from: classes.dex */
public final class h {
    private static volatile Choreographer choreographer;

    static {
        Object a10;
        try {
            a10 = new f(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            a10 = rb.f.a(th);
        }
        if (a10 instanceof e.a) {
            a10 = null;
        }
    }

    public static final Handler a(Looper looper) {
        Object newInstance;
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            i.c(newInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                newInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) newInstance;
    }
}
