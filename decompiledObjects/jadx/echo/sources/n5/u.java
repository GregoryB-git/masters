package n5;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class u implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f18046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18047b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f18048c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f18049d;

    public u(String str, int i7) {
        this.f18046a = str;
        this.f18047b = i7;
    }

    @Override // n5.q
    public void a() {
        HandlerThread handlerThread = this.f18048c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f18048c = null;
            this.f18049d = null;
        }
    }

    @Override // n5.q
    public /* synthetic */ void b(k kVar, Runnable runnable) {
        p.a(this, kVar, runnable);
    }

    @Override // n5.q
    public void c(m mVar) {
        this.f18049d.post(mVar.f18026b);
    }

    @Override // n5.q
    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f18046a, this.f18047b);
        this.f18048c = handlerThread;
        handlerThread.start();
        this.f18049d = new Handler(this.f18048c.getLooper());
    }
}
