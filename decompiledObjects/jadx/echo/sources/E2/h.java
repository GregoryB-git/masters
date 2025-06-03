package E2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1600a = new h();

    public static e d() {
        return f1600a;
    }

    @Override // E2.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // E2.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // E2.e
    public final long c() {
        return System.nanoTime();
    }
}
