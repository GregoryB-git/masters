package w5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import v5.e0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w5.d f16388a = new w5.d();

    /* renamed from: b, reason: collision with root package name */
    public final b f16389b;

    /* renamed from: c, reason: collision with root package name */
    public final e f16390c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16391d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f16392e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public float f16393g;

    /* renamed from: h, reason: collision with root package name */
    public float f16394h;

    /* renamed from: i, reason: collision with root package name */
    public float f16395i;

    /* renamed from: j, reason: collision with root package name */
    public int f16396j;

    /* renamed from: k, reason: collision with root package name */
    public long f16397k;

    /* renamed from: l, reason: collision with root package name */
    public long f16398l;

    /* renamed from: m, reason: collision with root package name */
    public long f16399m;

    /* renamed from: n, reason: collision with root package name */
    public long f16400n;

    /* renamed from: o, reason: collision with root package name */
    public long f16401o;

    /* renamed from: p, reason: collision with root package name */
    public long f16402p;

    /* renamed from: q, reason: collision with root package name */
    public long f16403q;

    public static final class a {
        public static void a(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                v5.m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public interface b {

        public interface a {
        }

        void a();

        void b(io.flutter.plugins.firebase.auth.g gVar);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final WindowManager f16404a;

        public c(WindowManager windowManager) {
            this.f16404a = windowManager;
        }

        @Override // w5.j.b
        public final void a() {
        }

        @Override // w5.j.b
        public final void b(io.flutter.plugins.firebase.auth.g gVar) {
            gVar.b(this.f16404a.getDefaultDisplay());
        }
    }

    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f16405a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f16406b;

        public d(DisplayManager displayManager) {
            this.f16405a = displayManager;
        }

        @Override // w5.j.b
        public final void a() {
            this.f16405a.unregisterDisplayListener(this);
            this.f16406b = null;
        }

        @Override // w5.j.b
        public final void b(io.flutter.plugins.firebase.auth.g gVar) {
            this.f16406b = gVar;
            this.f16405a.registerDisplayListener(this, e0.l(null));
            gVar.b(this.f16405a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i10) {
            b.a aVar = this.f16406b;
            if (aVar == null || i10 != 0) {
                return;
            }
            ((io.flutter.plugins.firebase.auth.g) aVar).b(this.f16405a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i10) {
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e, reason: collision with root package name */
        public static final e f16407e = new e();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f16408a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f16409b;

        /* renamed from: c, reason: collision with root package name */
        public Choreographer f16410c;

        /* renamed from: d, reason: collision with root package name */
        public int f16411d;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i10 = e0.f15881a;
            Handler handler = new Handler(looper, this);
            this.f16409b = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            this.f16408a = j10;
            Choreographer choreographer = this.f16410c;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                try {
                    this.f16410c = Choreographer.getInstance();
                } catch (RuntimeException e10) {
                    v5.m.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
                }
                return true;
            }
            if (i10 == 1) {
                Choreographer choreographer = this.f16410c;
                if (choreographer != null) {
                    int i11 = this.f16411d + 1;
                    this.f16411d = i11;
                    if (i11 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f16410c;
            if (choreographer2 != null) {
                int i12 = this.f16411d - 1;
                this.f16411d = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f16408a = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            w5.d r0 = new w5.d
            r0.<init>()
            r3.f16388a = r0
            r0 = 0
            if (r4 == 0) goto L3a
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = v5.e0.f15881a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            w5.j$d r2 = new w5.j$d
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3b
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3a
            w5.j$c r2 = new w5.j$c
            r2.<init>(r4)
            goto L3b
        L3a:
            r2 = r0
        L3b:
            r3.f16389b = r2
            if (r2 == 0) goto L41
            w5.j$e r0 = w5.j.e.f16407e
        L41:
            r3.f16390c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f16397k = r0
            r3.f16398l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f16395i = r4
            r4 = 0
            r3.f16396j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.j.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (e0.f15881a < 30 || (surface = this.f16392e) == null || this.f16396j == Integer.MIN_VALUE || this.f16394h == 0.0f) {
            return;
        }
        this.f16394h = 0.0f;
        a.a(surface, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (java.lang.Math.abs(r0 - r10.f16393g) < (!r1 ? 0.02f : 1.0f)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r10.f16388a.f16337e >= 30) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            int r0 = v5.e0.f15881a
            r1 = 30
            if (r0 < r1) goto L97
            android.view.Surface r0 = r10.f16392e
            if (r0 != 0) goto Lc
            goto L97
        Lc:
            w5.d r0 = r10.f16388a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L37
            w5.d r0 = r10.f16388a
            boolean r3 = r0.a()
            if (r3 == 0) goto L35
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            w5.d$a r0 = r0.f16333a
            long r5 = r0.f16342e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L2e
            goto L31
        L2e:
            long r7 = r0.f
            long r7 = r7 / r5
        L31:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L39
        L35:
            r0 = r2
            goto L39
        L37:
            float r0 = r10.f
        L39:
            float r3 = r10.f16393g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L40
            return
        L40:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L85
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L85
            w5.d r1 = r10.f16388a
            boolean r1 = r1.a()
            if (r1 == 0) goto L6f
            w5.d r1 = r10.f16388a
            boolean r2 = r1.a()
            if (r2 == 0) goto L5f
            w5.d$a r1 = r1.f16333a
            long r1 = r1.f
            goto L64
        L5f:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L6f
            r1 = r6
            goto L70
        L6f:
            r1 = r5
        L70:
            if (r1 == 0) goto L76
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L78
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
        L78:
            float r2 = r10.f16393g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L8f
            goto L90
        L85:
            if (r4 == 0) goto L88
            goto L90
        L88:
            w5.d r2 = r10.f16388a
            int r2 = r2.f16337e
            if (r2 < r1) goto L8f
            goto L90
        L8f:
            r6 = r5
        L90:
            if (r6 == 0) goto L97
            r10.f16393g = r0
            r10.c(r5)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.j.b():void");
    }

    public final void c(boolean z10) {
        Surface surface;
        if (e0.f15881a < 30 || (surface = this.f16392e) == null || this.f16396j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.f16391d) {
            float f10 = this.f16393g;
            if (f10 != -1.0f) {
                f = this.f16395i * f10;
            }
        }
        if (z10 || this.f16394h != f) {
            this.f16394h = f;
            a.a(surface, f);
        }
    }
}
