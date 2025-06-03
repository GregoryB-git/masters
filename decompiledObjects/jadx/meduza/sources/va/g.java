package va;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f16028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16029b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f16030c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f16031d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f16032e;
    public f f;

    public g(String str, int i10) {
        this.f16028a = str;
        this.f16029b = i10;
    }

    public final synchronized void a(w.g gVar) {
        HandlerThread handlerThread = new HandlerThread(this.f16028a, this.f16029b);
        this.f16030c = handlerThread;
        handlerThread.start();
        this.f16031d = new Handler(this.f16030c.getLooper());
        this.f16032e = gVar;
    }
}
