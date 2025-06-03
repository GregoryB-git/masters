/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.opengl.EGL14
 *  android.opengl.EGLConfig
 *  android.opengl.EGLContext
 *  android.opengl.EGLDisplay
 *  android.opengl.EGLSurface
 *  android.opengl.GLES20
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package g0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import g0.M;
import g0.j;

public final class i
implements SurfaceTexture.OnFrameAvailableListener,
Runnable {
    public static final int[] u = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler o;
    public final int[] p;
    public EGLDisplay q;
    public EGLContext r;
    public EGLSurface s;
    public SurfaceTexture t;

    public i(Handler handler) {
        this(handler, null);
    }

    public i(Handler handler, a a8) {
        this.o = handler;
        this.p = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] arreGLConfig = new EGLConfig[1];
        int[] arrn = new int[1];
        boolean bl = EGL14.eglChooseConfig((EGLDisplay)eGLDisplay, (int[])u, (int)0, (EGLConfig[])arreGLConfig, (int)0, (int)1, (int[])arrn, (int)0);
        boolean bl2 = bl && arrn[0] > 0 && arreGLConfig[0] != null;
        j.b(bl2, M.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{bl, arrn[0], arreGLConfig[0]}));
        return arreGLConfig[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int n8) {
        boolean bl = true;
        int[] arrn = n8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344};
        if ((eGLDisplay = EGL14.eglCreateContext((EGLDisplay)eGLDisplay, (EGLConfig)eGLConfig, (EGLContext)EGL14.EGL_NO_CONTEXT, (int[])arrn, (int)0)) == null) {
            bl = false;
        }
        j.b(bl, "eglCreateContext failed");
        return eGLDisplay;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int n8) {
        boolean bl = true;
        if (n8 == 1) {
            eGLConfig = EGL14.EGL_NO_SURFACE;
        } else {
            int[] arrn;
            if (n8 == 2) {
                int[] arrn2 = arrn = new int[7];
                arrn2[0] = 12375;
                arrn2[1] = 1;
                arrn2[2] = 12374;
                arrn2[3] = 1;
                arrn2[4] = 12992;
                arrn2[5] = 1;
                arrn2[6] = 12344;
            } else {
                arrn = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLConfig = EGL14.eglCreatePbufferSurface((EGLDisplay)eGLDisplay, (EGLConfig)eGLConfig, (int[])arrn, (int)0);
            if (eGLConfig == null) {
                bl = false;
            }
            j.b(bl, "eglCreatePbufferSurface failed");
        }
        j.b(EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay, (EGLSurface)eGLConfig, (EGLSurface)eGLConfig, (EGLContext)eGLContext), "eglMakeCurrent failed");
        return eGLConfig;
    }

    public static void e(int[] arrn) {
        GLES20.glGenTextures((int)1, (int[])arrn, (int)0);
        j.a();
    }

    public static EGLDisplay f() {
        EGLDisplay eGLDisplay = EGL14.eglGetDisplay((int)0);
        boolean bl = eGLDisplay != null;
        j.b(bl, "eglGetDisplay failed");
        int[] arrn = new int[2];
        j.b(EGL14.eglInitialize((EGLDisplay)eGLDisplay, (int[])arrn, (int)0, (int[])arrn, (int)1), "eglInitialize failed");
        return eGLDisplay;
    }

    public final void d() {
    }

    public SurfaceTexture g() {
        return (SurfaceTexture)g0.a.e((Object)this.t);
    }

    public void h(int n8) {
        EGLContext eGLContext;
        EGLDisplay eGLDisplay;
        this.q = eGLDisplay = i.f();
        eGLDisplay = i.a(eGLDisplay);
        this.r = eGLContext = i.b(this.q, (EGLConfig)eGLDisplay, n8);
        this.s = i.c(this.q, (EGLConfig)eGLDisplay, eGLContext, n8);
        i.e(this.p);
        eGLDisplay = new SurfaceTexture(this.p[0]);
        this.t = eGLDisplay;
        eGLDisplay.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener)this);
    }

    public void i() {
        Throwable throwable2;
        block12 : {
            SurfaceTexture surfaceTexture;
            block11 : {
                this.o.removeCallbacks((Runnable)this);
                try {
                    surfaceTexture = this.t;
                    if (surfaceTexture == null) break block11;
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                surfaceTexture.release();
                GLES20.glDeleteTextures((int)1, (int[])this.p, (int)0);
            }
            if ((surfaceTexture = this.q) != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                surfaceTexture = this.q;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent((EGLDisplay)surfaceTexture, (EGLSurface)eGLSurface, (EGLSurface)eGLSurface, (EGLContext)EGL14.EGL_NO_CONTEXT);
            }
            if ((surfaceTexture = this.s) != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay)this.q, (EGLSurface)this.s);
            }
            if ((surfaceTexture = this.r) != null) {
                EGL14.eglDestroyContext((EGLDisplay)this.q, (EGLContext)surfaceTexture);
            }
            EGL14.eglReleaseThread();
            surfaceTexture = this.q;
            if (surfaceTexture != null && !surfaceTexture.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate((EGLDisplay)this.q);
            }
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            return;
        }
        EGLDisplay eGLDisplay = this.q;
        if (eGLDisplay != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_DISPLAY)) {
            eGLDisplay = this.q;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay)eGLDisplay, (EGLSurface)eGLSurface, (EGLSurface)eGLSurface, (EGLContext)EGL14.EGL_NO_CONTEXT);
        }
        if ((eGLDisplay = this.s) != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface((EGLDisplay)this.q, (EGLSurface)this.s);
        }
        if ((eGLDisplay = this.r) != null) {
            EGL14.eglDestroyContext((EGLDisplay)this.q, (EGLContext)eGLDisplay);
        }
        EGL14.eglReleaseThread();
        eGLDisplay = this.q;
        if (eGLDisplay != null && !eGLDisplay.equals((Object)EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglTerminate((EGLDisplay)this.q);
        }
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        throw throwable2;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.o.post((Runnable)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void run() {
        this.d();
        SurfaceTexture surfaceTexture = this.t;
        if (surfaceTexture == null) return;
        try {
            surfaceTexture.updateTexImage();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    public static interface a {
    }

}

