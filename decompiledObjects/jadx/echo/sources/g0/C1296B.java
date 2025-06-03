package g0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: g0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1296B implements InterfaceC1299c {
    @Override // g0.InterfaceC1299c
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // g0.InterfaceC1299c
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // g0.InterfaceC1299c
    public long c() {
        return System.nanoTime();
    }

    @Override // g0.InterfaceC1299c
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // g0.InterfaceC1299c
    public InterfaceC1307k e(Looper looper, Handler.Callback callback) {
        return new C(new Handler(looper, callback));
    }

    @Override // g0.InterfaceC1299c
    public void f() {
    }
}
