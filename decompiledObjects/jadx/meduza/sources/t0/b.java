package t0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
