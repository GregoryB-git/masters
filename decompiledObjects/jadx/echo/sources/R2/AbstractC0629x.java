package R2;

import A2.AbstractC0328n;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1026t0;

/* renamed from: R2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0629x {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Handler f5582d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0571o3 f5583a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f5584b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f5585c;

    public AbstractC0629x(InterfaceC0571o3 interfaceC0571o3) {
        AbstractC0328n.i(interfaceC0571o3);
        this.f5583a = interfaceC0571o3;
        this.f5584b = new RunnableC0622w(this, interfaceC0571o3);
    }

    public final void a() {
        this.f5585c = 0L;
        f().removeCallbacks(this.f5584b);
    }

    public final void b(long j7) {
        a();
        if (j7 >= 0) {
            this.f5585c = this.f5583a.b().a();
            if (f().postDelayed(this.f5584b, j7)) {
                return;
            }
            this.f5583a.j().G().b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f5585c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (f5582d != null) {
            return f5582d;
        }
        synchronized (AbstractC0629x.class) {
            try {
                if (f5582d == null) {
                    f5582d = new HandlerC1026t0(this.f5583a.a().getMainLooper());
                }
                handler = f5582d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
