package m;

import android.os.Looper;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f9850c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f9851d = new b(0);

    /* renamed from: b, reason: collision with root package name */
    public d f9852b;

    public c() {
        super(0);
        this.f9852b = new d();
    }

    public static c v() {
        if (f9850c != null) {
            return f9850c;
        }
        synchronized (c.class) {
            if (f9850c == null) {
                f9850c = new c();
            }
        }
        return f9850c;
    }

    public final boolean w() {
        this.f9852b.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void x(Runnable runnable) {
        d dVar = this.f9852b;
        if (dVar.f9855d == null) {
            synchronized (dVar.f9853b) {
                if (dVar.f9855d == null) {
                    dVar.f9855d = d.v(Looper.getMainLooper());
                }
            }
        }
        dVar.f9855d.post(runnable);
    }
}
