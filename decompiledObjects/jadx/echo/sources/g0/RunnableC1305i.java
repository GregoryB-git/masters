package g0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1305i implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f14291u = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: o, reason: collision with root package name */
    public final Handler f14292o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f14293p;

    /* renamed from: q, reason: collision with root package name */
    public EGLDisplay f14294q;

    /* renamed from: r, reason: collision with root package name */
    public EGLContext f14295r;

    /* renamed from: s, reason: collision with root package name */
    public EGLSurface f14296s;

    /* renamed from: t, reason: collision with root package name */
    public SurfaceTexture f14297t;

    /* renamed from: g0.i$a */
    public interface a {
    }

    public RunnableC1305i(Handler handler) {
        this(handler, null);
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f14291u, 0, eGLConfigArr, 0, 1, iArr, 0);
        AbstractC1306j.b(eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, M.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1306j.b(eglCreateContext != null, "eglCreateContext failed");
        return eglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7) {
        EGLSurface eglCreatePbufferSurface;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1306j.b(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC1306j.b(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eglCreatePbufferSurface;
    }

    public static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC1306j.a();
    }

    public static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1306j.b(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC1306j.b(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC1297a.e(this.f14297t);
    }

    public void h(int i7) {
        EGLDisplay f7 = f();
        this.f14294q = f7;
        EGLConfig a7 = a(f7);
        EGLContext b7 = b(this.f14294q, a7, i7);
        this.f14295r = b7;
        this.f14296s = c(this.f14294q, a7, b7, i7);
        e(this.f14293p);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f14293p[0]);
        this.f14297t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f14292o.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f14297t;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f14293p, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f14294q;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f14294q;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f14296s;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f14294q, this.f14296s);
            }
            EGLContext eGLContext = this.f14295r;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f14294q, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f14294q;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f14294q);
            }
            this.f14294q = null;
            this.f14295r = null;
            this.f14296s = null;
            this.f14297t = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14292o.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f14297t;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC1305i(Handler handler, a aVar) {
        this.f14292o = handler;
        this.f14293p = new int[1];
    }

    public final void d() {
    }
}
