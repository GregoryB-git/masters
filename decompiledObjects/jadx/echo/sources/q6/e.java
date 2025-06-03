package q6;

import V5.n;
import V5.o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f18898a;
    private static volatile Choreographer choreographer;

    static {
        Object a7;
        try {
            n.a aVar = n.f6797o;
            a7 = n.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            n.a aVar2 = n.f6797o;
            a7 = n.a(o.a(th));
        }
        f18898a = (d) (n.c(a7) ? null : a7);
    }

    public static final Handler a(Looper looper, boolean z7) {
        Object newInstance;
        if (!z7) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            newInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.c(newInstance, "null cannot be cast to non-null type android.os.Handler");
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
