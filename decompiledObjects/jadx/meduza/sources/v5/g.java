package v5;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* loaded from: classes.dex */
public final class g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f15899o = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15900a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15901b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f15902c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f15903d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f15904e;
    public SurfaceTexture f;

    public g(Handler handler) {
        this.f15900a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f15900a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
