package D0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import g0.AbstractC1297a;
import g0.AbstractC1306j;
import g0.RunnableC1305i;

/* loaded from: classes.dex */
public final class o extends Surface {

    /* renamed from: r, reason: collision with root package name */
    public static int f1165r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f1166s;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1167o;

    /* renamed from: p, reason: collision with root package name */
    public final b f1168p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1169q;

    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: o, reason: collision with root package name */
        public RunnableC1305i f1170o;

        /* renamed from: p, reason: collision with root package name */
        public Handler f1171p;

        /* renamed from: q, reason: collision with root package name */
        public Error f1172q;

        /* renamed from: r, reason: collision with root package name */
        public RuntimeException f1173r;

        /* renamed from: s, reason: collision with root package name */
        public o f1174s;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public o a(int i7) {
            boolean z7;
            start();
            this.f1171p = new Handler(getLooper(), this);
            this.f1170o = new RunnableC1305i(this.f1171p);
            synchronized (this) {
                z7 = false;
                this.f1171p.obtainMessage(1, i7, 0).sendToTarget();
                while (this.f1174s == null && this.f1173r == null && this.f1172q == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f1173r;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f1172q;
            if (error == null) {
                return (o) AbstractC1297a.e(this.f1174s);
            }
            throw error;
        }

        public final void b(int i7) {
            AbstractC1297a.e(this.f1170o);
            this.f1170o.h(i7);
            this.f1174s = new o(this, this.f1170o.g(), i7 != 0);
        }

        public void c() {
            AbstractC1297a.e(this.f1171p);
            this.f1171p.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC1297a.e(this.f1170o);
            this.f1170o.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            try {
                if (i7 != 1) {
                    if (i7 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC1306j.a e7) {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f1173r = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f1172q = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e9) {
                    g0.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f1173r = e9;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public o(b bVar, SurfaceTexture surfaceTexture, boolean z7) {
        super(surfaceTexture);
        this.f1168p = bVar;
        this.f1167o = z7;
    }

    public static int a(Context context) {
        if (AbstractC1306j.d(context)) {
            return AbstractC1306j.e() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z7;
        synchronized (o.class) {
            try {
                if (!f1166s) {
                    f1165r = a(context);
                    f1166s = true;
                }
                z7 = f1165r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public static o c(Context context, boolean z7) {
        AbstractC1297a.f(!z7 || b(context));
        return new b().a(z7 ? f1165r : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f1168p) {
            try {
                if (!this.f1169q) {
                    this.f1168p.c();
                    this.f1169q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
