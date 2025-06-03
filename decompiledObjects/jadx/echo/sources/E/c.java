package E;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1517a;

    /* renamed from: b, reason: collision with root package name */
    public b f1518b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1520d;

    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f1517a) {
                    return;
                }
                this.f1517a = true;
                this.f1520d = true;
                b bVar = this.f1518b;
                Object obj = this.f1519c;
                if (bVar != null) {
                    try {
                        bVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f1520d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.f1520d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public boolean b() {
        boolean z7;
        synchronized (this) {
            z7 = this.f1517a;
        }
        return z7;
    }

    public void c(b bVar) {
        synchronized (this) {
            try {
                d();
                if (this.f1518b == bVar) {
                    return;
                }
                this.f1518b = bVar;
                if (this.f1517a && bVar != null) {
                    bVar.a();
                }
            } finally {
            }
        }
    }

    public final void d() {
        while (this.f1520d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
