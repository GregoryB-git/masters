package v5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class z implements c {
    @Override // v5.c
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // v5.c
    public final a0 b(Looper looper, Handler.Callback callback) {
        return new a0(new Handler(looper, callback));
    }

    @Override // v5.c
    public final void c() {
    }

    @Override // v5.c
    public final long d() {
        return SystemClock.elapsedRealtime();
    }
}
