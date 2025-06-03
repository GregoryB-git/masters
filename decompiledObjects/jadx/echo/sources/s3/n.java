package s3;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class n {
    public static n a(long j7, long j8, long j9) {
        return new C1943a(j7, j8, j9);
    }

    public static n e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
