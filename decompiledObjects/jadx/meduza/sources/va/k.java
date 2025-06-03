package va;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16040a = "Sqflite";

    /* renamed from: b, reason: collision with root package name */
    public final int f16041b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f16042c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f16043d;

    public k(int i10) {
        this.f16041b = i10;
    }

    @Override // va.i
    public final void a(d dVar, Runnable runnable) {
        this.f16043d.post(runnable);
    }

    @Override // va.i
    public final void b() {
        HandlerThread handlerThread = this.f16042c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f16042c = null;
            this.f16043d = null;
        }
    }

    @Override // va.i
    public final void start() {
        HandlerThread handlerThread = new HandlerThread(this.f16040a, this.f16041b);
        this.f16042c = handlerThread;
        handlerThread.start();
        this.f16043d = new Handler(this.f16042c.getLooper());
    }
}
