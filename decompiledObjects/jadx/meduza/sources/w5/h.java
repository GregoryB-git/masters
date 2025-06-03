package w5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import v5.e0;
import v5.j;

/* loaded from: classes.dex */
public final class h extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f16378d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f16379e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16380a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16381b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16382c;

    public static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public v5.g f16383a;

        /* renamed from: b, reason: collision with root package name */
        public Handler f16384b;

        /* renamed from: c, reason: collision with root package name */
        public Error f16385c;

        /* renamed from: d, reason: collision with root package name */
        public RuntimeException f16386d;

        /* renamed from: e, reason: collision with root package name */
        public h f16387e;

        public a() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i10) {
            EGLSurface eglCreatePbufferSurface;
            this.f16383a.getClass();
            v5.g gVar = this.f16383a;
            gVar.getClass();
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            v5.j.b("eglGetDisplay failed", eglGetDisplay != null);
            int[] iArr = new int[2];
            v5.j.b("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
            gVar.f15902c = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, v5.g.f15899o, 0, eGLConfigArr, 0, 1, iArr2, 0);
            v5.j.b(e0.m("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = EGL14.eglCreateContext(gVar.f15902c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            v5.j.b("eglCreateContext failed", eglCreateContext != null);
            gVar.f15903d = eglCreateContext;
            EGLDisplay eGLDisplay = gVar.f15902c;
            if (i10 == 1) {
                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                v5.j.b("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
            }
            v5.j.b("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
            gVar.f15904e = eglCreatePbufferSurface;
            GLES20.glGenTextures(1, gVar.f15901b, 0);
            v5.j.a();
            SurfaceTexture surfaceTexture = new SurfaceTexture(gVar.f15901b[0]);
            gVar.f = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(gVar);
            SurfaceTexture surfaceTexture2 = this.f16383a.f;
            surfaceTexture2.getClass();
            this.f16387e = new h(this, surfaceTexture2, i10 != 0);
        }

        public final void b() {
            this.f16383a.getClass();
            v5.g gVar = this.f16383a;
            gVar.f15900a.removeCallbacks(gVar);
            try {
                SurfaceTexture surfaceTexture = gVar.f;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, gVar.f15901b, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = gVar.f15902c;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = gVar.f15902c;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = gVar.f15904e;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(gVar.f15902c, gVar.f15904e);
                }
                EGLContext eGLContext = gVar.f15903d;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(gVar.f15902c, eGLContext);
                }
                if (e0.f15881a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = gVar.f15902c;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(gVar.f15902c);
                }
                gVar.f15902c = null;
                gVar.f15903d = null;
                gVar.f15904e = null;
                gVar.f = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    v5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f16385c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    v5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f16386d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (j.a e12) {
                    v5.m.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f16386d = new IllegalStateException(e12);
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

    public h(a aVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f16381b = aVar;
        this.f16380a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = e0.f15881a;
        boolean z10 = false;
        if (!(i10 >= 24 && (i10 >= 26 || !("samsung".equals(e0.f15883c) || "XT1650".equals(e0.f15884d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z10 = true;
        }
        return z10 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w5.h b(android.content.Context r4, boolean r5) {
        /*
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L23
            java.lang.Class<w5.h> r2 = w5.h.class
            monitor-enter(r2)
            boolean r3 = w5.h.f16379e     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            int r4 = a(r4)     // Catch: java.lang.Throwable -> L20
            w5.h.f16378d = r4     // Catch: java.lang.Throwable -> L20
            w5.h.f16379e = r1     // Catch: java.lang.Throwable -> L20
        L13:
            int r4 = w5.h.f16378d     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L19
            r4 = r1
            goto L1a
        L19:
            r4 = r0
        L1a:
            monitor-exit(r2)
            if (r4 == 0) goto L1e
            goto L23
        L1e:
            r4 = r0
            goto L24
        L20:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L23:
            r4 = r1
        L24:
            x6.b.H(r4)
            w5.h$a r4 = new w5.h$a
            r4.<init>()
            if (r5 == 0) goto L31
            int r5 = w5.h.f16378d
            goto L32
        L31:
            r5 = r0
        L32:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.f16384b = r2
            v5.g r3 = new v5.g
            r3.<init>(r2)
            r4.f16383a = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.f16384b     // Catch: java.lang.Throwable -> L7d
            android.os.Message r5 = r2.obtainMessage(r1, r5, r0)     // Catch: java.lang.Throwable -> L7d
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L7d
        L51:
            w5.h r5 = r4.f16387e     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.RuntimeException r5 = r4.f16386d     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.Error r5 = r4.f16385c     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            r4.wait()     // Catch: java.lang.InterruptedException -> L61 java.lang.Throwable -> L7d
            goto L51
        L61:
            r0 = r1
            goto L51
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L6d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L6d:
            java.lang.RuntimeException r5 = r4.f16386d
            if (r5 != 0) goto L7c
            java.lang.Error r5 = r4.f16385c
            if (r5 != 0) goto L7b
            w5.h r4 = r4.f16387e
            r4.getClass()
            return r4
        L7b:
            throw r5
        L7c:
            throw r5
        L7d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.h.b(android.content.Context, boolean):w5.h");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f16381b) {
            if (!this.f16382c) {
                a aVar = this.f16381b;
                aVar.f16384b.getClass();
                aVar.f16384b.sendEmptyMessage(2);
                this.f16382c = true;
            }
        }
    }
}
