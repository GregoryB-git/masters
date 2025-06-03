package okhttp3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import okhttp3.RealCall;

/* loaded from: classes.dex */
public final class Dispatcher {

    /* renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f12231c;

    /* renamed from: a, reason: collision with root package name */
    public int f12229a = 64;

    /* renamed from: b, reason: collision with root package name */
    public int f12230b = 5;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f12232d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f12233e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();

    public final void a(RealCall.AsyncCall asyncCall) {
        ArrayDeque arrayDeque = this.f12233e;
        synchronized (this) {
            if (!arrayDeque.remove(asyncCall)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.b():void");
    }
}
