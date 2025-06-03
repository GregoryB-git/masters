package g0;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

public final class i
  implements SurfaceTexture.OnFrameAvailableListener, Runnable
{
  public static final int[] u = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
  public final Handler o;
  public final int[] p;
  public EGLDisplay q;
  public EGLContext r;
  public EGLSurface s;
  public SurfaceTexture t;
  
  public i(Handler paramHandler)
  {
    this(paramHandler, null);
  }
  
  public i(Handler paramHandler, a parama)
  {
    o = paramHandler;
    p = new int[1];
  }
  
  public static EGLConfig a(EGLDisplay paramEGLDisplay)
  {
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    int[] arrayOfInt = new int[1];
    boolean bool1 = EGL14.eglChooseConfig(paramEGLDisplay, u, 0, arrayOfEGLConfig, 0, 1, arrayOfInt, 0);
    boolean bool2;
    if ((bool1) && (arrayOfInt[0] > 0) && (arrayOfEGLConfig[0] != null)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    j.b(bool2, M.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(arrayOfInt[0]), arrayOfEGLConfig[0] }));
    return arrayOfEGLConfig[0];
  }
  
  public static EGLContext b(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    boolean bool = true;
    int[] arrayOfInt;
    if (paramInt == 0) {
      arrayOfInt = new int[] { 12440, 2, 12344 };
    } else {
      arrayOfInt = new int[] { 12440, 2, 12992, 1, 12344 };
    }
    paramEGLDisplay = EGL14.eglCreateContext(paramEGLDisplay, paramEGLConfig, EGL14.EGL_NO_CONTEXT, arrayOfInt, 0);
    if (paramEGLDisplay == null) {
      bool = false;
    }
    j.b(bool, "eglCreateContext failed");
    return paramEGLDisplay;
  }
  
  public static EGLSurface c(EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, EGLContext paramEGLContext, int paramInt)
  {
    boolean bool = true;
    if (paramInt == 1)
    {
      paramEGLConfig = EGL14.EGL_NO_SURFACE;
    }
    else
    {
      int[] arrayOfInt;
      if (paramInt == 2)
      {
        arrayOfInt = new int[7];
        int[] tmp28_26 = arrayOfInt;
        tmp28_26[0] = 'し';
        int[] tmp34_28 = tmp28_26;
        tmp34_28[1] = 1;
        int[] tmp38_34 = tmp34_28;
        tmp38_34[2] = 'ざ';
        int[] tmp44_38 = tmp38_34;
        tmp44_38[3] = 1;
        int[] tmp48_44 = tmp44_38;
        tmp48_44[4] = '㋀';
        int[] tmp54_48 = tmp48_44;
        tmp54_48[5] = 1;
        int[] tmp58_54 = tmp54_48;
        tmp58_54[6] = '〸';
        tmp58_54;
      }
      else
      {
        arrayOfInt = new int[] { 12375, 1, 12374, 1, 12344 };
      }
      paramEGLConfig = EGL14.eglCreatePbufferSurface(paramEGLDisplay, paramEGLConfig, arrayOfInt, 0);
      if (paramEGLConfig == null) {
        bool = false;
      }
      j.b(bool, "eglCreatePbufferSurface failed");
    }
    j.b(EGL14.eglMakeCurrent(paramEGLDisplay, paramEGLConfig, paramEGLConfig, paramEGLContext), "eglMakeCurrent failed");
    return paramEGLConfig;
  }
  
  public static void e(int[] paramArrayOfInt)
  {
    GLES20.glGenTextures(1, paramArrayOfInt, 0);
    j.a();
  }
  
  public static EGLDisplay f()
  {
    EGLDisplay localEGLDisplay = EGL14.eglGetDisplay(0);
    boolean bool;
    if (localEGLDisplay != null) {
      bool = true;
    } else {
      bool = false;
    }
    j.b(bool, "eglGetDisplay failed");
    int[] arrayOfInt = new int[2];
    j.b(EGL14.eglInitialize(localEGLDisplay, arrayOfInt, 0, arrayOfInt, 1), "eglInitialize failed");
    return localEGLDisplay;
  }
  
  public final void d() {}
  
  public SurfaceTexture g()
  {
    return (SurfaceTexture)a.e(t);
  }
  
  public void h(int paramInt)
  {
    Object localObject = f();
    q = ((EGLDisplay)localObject);
    localObject = a((EGLDisplay)localObject);
    EGLContext localEGLContext = b(q, (EGLConfig)localObject, paramInt);
    r = localEGLContext;
    s = c(q, (EGLConfig)localObject, localEGLContext, paramInt);
    e(p);
    localObject = new SurfaceTexture(p[0]);
    t = ((SurfaceTexture)localObject);
    ((SurfaceTexture)localObject).setOnFrameAvailableListener(this);
  }
  
  public void i()
  {
    o.removeCallbacks(this);
    try
    {
      SurfaceTexture localSurfaceTexture = t;
      if (localSurfaceTexture != null)
      {
        localSurfaceTexture.release();
        GLES20.glDeleteTextures(1, p, 0);
      }
    }
    finally
    {
      break label176;
    }
    Object localObject2 = q;
    if ((localObject2 != null) && (!((EGLDisplay)localObject2).equals(EGL14.EGL_NO_DISPLAY)))
    {
      localObject2 = q;
      localObject3 = EGL14.EGL_NO_SURFACE;
      EGL14.eglMakeCurrent((EGLDisplay)localObject2, (EGLSurface)localObject3, (EGLSurface)localObject3, EGL14.EGL_NO_CONTEXT);
    }
    localObject2 = s;
    if ((localObject2 != null) && (!((EGLSurface)localObject2).equals(EGL14.EGL_NO_SURFACE))) {
      EGL14.eglDestroySurface(q, s);
    }
    localObject2 = r;
    if (localObject2 != null) {
      EGL14.eglDestroyContext(q, (EGLContext)localObject2);
    }
    EGL14.eglReleaseThread();
    localObject2 = q;
    if ((localObject2 != null) && (!((EGLDisplay)localObject2).equals(EGL14.EGL_NO_DISPLAY))) {
      EGL14.eglTerminate(q);
    }
    q = null;
    r = null;
    s = null;
    t = null;
    return;
    label176:
    Object localObject3 = q;
    if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY)))
    {
      EGLDisplay localEGLDisplay = q;
      localObject3 = EGL14.EGL_NO_SURFACE;
      EGL14.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject3, (EGLSurface)localObject3, EGL14.EGL_NO_CONTEXT);
    }
    localObject3 = s;
    if ((localObject3 != null) && (!((EGLSurface)localObject3).equals(EGL14.EGL_NO_SURFACE))) {
      EGL14.eglDestroySurface(q, s);
    }
    localObject3 = r;
    if (localObject3 != null) {
      EGL14.eglDestroyContext(q, (EGLContext)localObject3);
    }
    EGL14.eglReleaseThread();
    localObject3 = q;
    if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY))) {
      EGL14.eglTerminate(q);
    }
    q = null;
    r = null;
    s = null;
    t = null;
    throw ((Throwable)localObject2);
  }
  
  public void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    o.post(this);
  }
  
  public void run()
  {
    d();
    SurfaceTexture localSurfaceTexture = t;
    if (localSurfaceTexture != null) {}
    try
    {
      localSurfaceTexture.updateTexImage();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
  }
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     g0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */