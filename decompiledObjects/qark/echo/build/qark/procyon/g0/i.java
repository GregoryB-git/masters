// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.opengl.GLES20;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public final class i implements SurfaceTexture$OnFrameAvailableListener, Runnable
{
    public static final int[] u;
    public final Handler o;
    public final int[] p;
    public EGLDisplay q;
    public EGLContext r;
    public EGLSurface s;
    public SurfaceTexture t;
    
    static {
        u = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
    }
    
    public i(final Handler handler) {
        this(handler, null);
    }
    
    public i(final Handler o, final a a) {
        this.o = o;
        this.p = new int[1];
    }
    
    public static EGLConfig a(final EGLDisplay eglDisplay) {
        final EGLConfig[] array = { null };
        final int[] array2 = { 0 };
        final boolean eglChooseConfig = EGL14.eglChooseConfig(eglDisplay, i.u, 0, array, 0, 1, array2, 0);
        j.b(eglChooseConfig && array2[0] > 0 && array[0] != null, M.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", eglChooseConfig, array2[0], array[0]));
        return array[0];
    }
    
    public static EGLContext b(final EGLDisplay eglDisplay, final EGLConfig eglConfig, final int n) {
        boolean b = true;
        int[] array;
        if (n == 0) {
            array = new int[] { 12440, 2, 12344 };
        }
        else {
            array = new int[] { 12440, 2, 12992, 1, 12344 };
        }
        final EGLContext eglCreateContext = EGL14.eglCreateContext(eglDisplay, eglConfig, EGL14.EGL_NO_CONTEXT, array, 0);
        if (eglCreateContext == null) {
            b = false;
        }
        j.b(b, "eglCreateContext failed");
        return eglCreateContext;
    }
    
    public static EGLSurface c(final EGLDisplay eglDisplay, final EGLConfig eglConfig, final EGLContext eglContext, final int n) {
        boolean b = true;
        EGLSurface eglSurface;
        if (n == 1) {
            eglSurface = EGL14.EGL_NO_SURFACE;
        }
        else {
            int[] array;
            if (n == 2) {
                final int[] array2;
                array = (array2 = new int[7]);
                array2[0] = 12375;
                array2[1] = 1;
                array2[2] = 12374;
                array2[3] = 1;
                array2[4] = 12992;
                array2[5] = 1;
                array2[6] = 12344;
            }
            else {
                array = new int[] { 12375, 1, 12374, 1, 12344 };
            }
            eglSurface = EGL14.eglCreatePbufferSurface(eglDisplay, eglConfig, array, 0);
            if (eglSurface == null) {
                b = false;
            }
            j.b(b, "eglCreatePbufferSurface failed");
        }
        j.b(EGL14.eglMakeCurrent(eglDisplay, eglSurface, eglSurface, eglContext), "eglMakeCurrent failed");
        return eglSurface;
    }
    
    public static void e(final int[] array) {
        GLES20.glGenTextures(1, array, 0);
        j.a();
    }
    
    public static EGLDisplay f() {
        final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        j.b(eglGetDisplay != null, "eglGetDisplay failed");
        final int[] array = new int[2];
        j.b(EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1), "eglInitialize failed");
        return eglGetDisplay;
    }
    
    public final void d() {
    }
    
    public SurfaceTexture g() {
        return (SurfaceTexture)g0.a.e(this.t);
    }
    
    public void h(final int n) {
        final EGLDisplay f = f();
        this.q = f;
        final EGLConfig a = a(f);
        final EGLContext b = b(this.q, a, n);
        this.r = b;
        this.s = c(this.q, a, b, n);
        e(this.p);
        (this.t = new SurfaceTexture(this.p[0])).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
    }
    
    public void i() {
        this.o.removeCallbacks((Runnable)this);
        Label_0037: {
            try {
                final SurfaceTexture t = this.t;
                if (t != null) {
                    t.release();
                    GLES20.glDeleteTextures(1, this.p, 0);
                }
                break Label_0037;
            }
            finally {
                final EGLDisplay q = this.q;
                if (q != null && !q.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    final EGLDisplay q2 = this.q;
                    final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(q2, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                final EGLSurface s = this.s;
                if (s != null && !s.equals((Object)EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(this.q, this.s);
                }
                final EGLContext r = this.r;
                if (r != null) {
                    EGL14.eglDestroyContext(this.q, r);
                }
                EGL14.eglReleaseThread();
                final EGLDisplay q3 = this.q;
                if (q3 != null && !q3.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(this.q);
                }
                this.q = null;
                this.r = null;
                this.s = null;
                this.t = null;
                // iftrue(Label_0155:, q5 == null || q5.equals((Object)EGL14.EGL_NO_DISPLAY))
                // iftrue(Label_0124:, r2 == null)
                // iftrue(Label_0106:, s2 == null || s2.equals((Object)EGL14.EGL_NO_SURFACE))
                // iftrue(Label_0075:, q6 == null || q6.equals((Object)EGL14.EGL_NO_DISPLAY))
                while (true) {
                    EGLDisplay q4;
                    EGLSurface egl_NO_SURFACE2;
                    EGLDisplay q5;
                    EGLContext r2;
                    EGLSurface s2;
                    EGLDisplay q6;
                    Block_11_Outer:Label_0124_Outer:Block_9_Outer:
                    while (true) {
                        q4 = this.q;
                        egl_NO_SURFACE2 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(q4, egl_NO_SURFACE2, egl_NO_SURFACE2, EGL14.EGL_NO_CONTEXT);
                        Label_0075: {
                            break Label_0075;
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            this.q = null;
                                            this.r = null;
                                            this.s = null;
                                            this.t = null;
                                            return;
                                            EGL14.eglTerminate(this.q);
                                            continue Block_11_Outer;
                                        }
                                        EGL14.eglReleaseThread();
                                        q5 = this.q;
                                        continue Label_0124_Outer;
                                    }
                                    EGL14.eglDestroyContext(this.q, r2);
                                    continue Block_9_Outer;
                                }
                                r2 = this.r;
                                continue;
                            }
                        }
                        s2 = this.s;
                        break Block_11_Outer;
                        q6 = this.q;
                        continue;
                    }
                    EGL14.eglDestroySurface(this.q, this.s);
                    continue;
                }
            }
        }
    }
    
    public void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.o.post((Runnable)this);
    }
    
    public void run() {
        this.d();
        final SurfaceTexture t = this.t;
        if (t == null) {
            return;
        }
        try {
            t.updateTexImage();
        }
        catch (RuntimeException ex) {}
    }
    
    public interface a
    {
    }
}
