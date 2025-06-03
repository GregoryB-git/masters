package n5;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f18029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18030b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f18031c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f18032d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f18033e;

    /* renamed from: f, reason: collision with root package name */
    public m f18034f;

    public o(String str, int i7) {
        this.f18029a = str;
        this.f18030b = i7;
    }

    public boolean b() {
        m mVar = this.f18034f;
        return mVar != null && mVar.b();
    }

    public Integer d() {
        m mVar = this.f18034f;
        if (mVar != null) {
            return mVar.a();
        }
        return null;
    }

    public void e(final m mVar) {
        this.f18032d.post(new Runnable() { // from class: n5.n
            @Override // java.lang.Runnable
            public final void run() {
                o.this.c(mVar);
            }
        });
    }

    public synchronized void f() {
        HandlerThread handlerThread = this.f18031c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f18031c = null;
            this.f18032d = null;
        }
    }

    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f18029a, this.f18030b);
        this.f18031c = handlerThread;
        handlerThread.start();
        this.f18032d = new Handler(this.f18031c.getLooper());
        this.f18033e = runnable;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(m mVar) {
        mVar.f18026b.run();
        this.f18034f = mVar;
        this.f18033e.run();
    }
}
