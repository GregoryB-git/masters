package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
public final class vj
  implements SurfaceTexture.OnFrameAvailableListener, Runnable
{
  private static final int[] a = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
  private final Handler b;
  private final int[] c;
  private final vl d;
  private EGLDisplay e;
  private EGLContext f;
  private EGLSurface g;
  private SurfaceTexture h;
  
  public vj(Handler paramHandler)
  {
    this(paramHandler, null);
  }
  
  private vj(Handler paramHandler, vl paramvl)
  {
    b = paramHandler;
    d = null;
    c = new int[1];
  }
  
  public final void a()
  {
    b.removeCallbacks(this);
    try
    {
      Object localObject1 = h;
      if (localObject1 != null)
      {
        ((SurfaceTexture)localObject1).release();
        GLES20.glDeleteTextures(1, c, 0);
      }
      return;
    }
    finally
    {
      Object localObject3 = e;
      if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY)))
      {
        EGLDisplay localEGLDisplay = e;
        localObject3 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject3, (EGLSurface)localObject3, EGL14.EGL_NO_CONTEXT);
      }
      localObject3 = g;
      if ((localObject3 != null) && (!((EGLSurface)localObject3).equals(EGL14.EGL_NO_SURFACE))) {
        EGL14.eglDestroySurface(e, g);
      }
      localObject3 = f;
      if (localObject3 != null) {
        EGL14.eglDestroyContext(e, (EGLContext)localObject3);
      }
      if (wl.a >= 19) {
        EGL14.eglReleaseThread();
      }
      localObject3 = e;
      if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY))) {
        EGL14.eglTerminate(e);
      }
      e = null;
      f = null;
      g = null;
      h = null;
    }
  }
  
  public final void a(int paramInt)
  {
    EGLDisplay localEGLDisplay = EGL14.eglGetDisplay(0);
    if (localEGLDisplay != null)
    {
      Object localObject1 = new int[2];
      if (EGL14.eglInitialize(localEGLDisplay, (int[])localObject1, 0, (int[])localObject1, 1))
      {
        e = localEGLDisplay;
        Object localObject2 = new EGLConfig[1];
        localObject1 = new int[1];
        boolean bool = EGL14.eglChooseConfig(localEGLDisplay, a, 0, (EGLConfig[])localObject2, 0, 1, (int[])localObject1, 0);
        if ((bool) && (localObject1[0] > 0))
        {
          localEGLDisplay = localObject2[0];
          if (localEGLDisplay != null)
          {
            localObject2 = e;
            if (paramInt == 0)
            {
              localObject1 = new int[3];
              Object tmp90_89 = localObject1;
              tmp90_89[0] = '゘';
              Object tmp96_90 = tmp90_89;
              tmp96_90[1] = 2;
              Object tmp100_96 = tmp96_90;
              tmp100_96[2] = '〸';
              tmp100_96;
            }
            else
            {
              localObject1 = new int[5];
              Object tmp115_114 = localObject1;
              tmp115_114[0] = '゘';
              Object tmp121_115 = tmp115_114;
              tmp121_115[1] = 2;
              Object tmp125_121 = tmp121_115;
              tmp125_121[2] = '㋀';
              Object tmp131_125 = tmp125_121;
              tmp131_125[3] = 1;
              Object tmp135_131 = tmp131_125;
              tmp135_131[4] = '〸';
              tmp135_131;
            }
            EGLContext localEGLContext = EGL14.eglCreateContext((EGLDisplay)localObject2, localEGLDisplay, EGL14.EGL_NO_CONTEXT, (int[])localObject1, 0);
            if (localEGLContext != null)
            {
              f = localEGLContext;
              localObject2 = e;
              if (paramInt == 1)
              {
                localObject1 = EGL14.EGL_NO_SURFACE;
              }
              else
              {
                if (paramInt == 2)
                {
                  localObject1 = new int[7];
                  Object tmp195_194 = localObject1;
                  tmp195_194[0] = 'し';
                  Object tmp201_195 = tmp195_194;
                  tmp201_195[1] = 1;
                  Object tmp205_201 = tmp201_195;
                  tmp205_201[2] = 'ざ';
                  Object tmp211_205 = tmp205_201;
                  tmp211_205[3] = 1;
                  Object tmp215_211 = tmp211_205;
                  tmp215_211[4] = '㋀';
                  Object tmp221_215 = tmp215_211;
                  tmp221_215[5] = 1;
                  Object tmp225_221 = tmp221_215;
                  tmp225_221[6] = '〸';
                  tmp225_221;
                }
                else
                {
                  localObject1 = new int[5];
                  Object tmp241_240 = localObject1;
                  tmp241_240[0] = 'し';
                  Object tmp247_241 = tmp241_240;
                  tmp247_241[1] = 1;
                  Object tmp251_247 = tmp247_241;
                  tmp251_247[2] = 'ざ';
                  Object tmp257_251 = tmp251_247;
                  tmp257_251[3] = 1;
                  Object tmp261_257 = tmp257_251;
                  tmp261_257[4] = '〸';
                  tmp261_257;
                }
                localObject1 = EGL14.eglCreatePbufferSurface((EGLDisplay)localObject2, localEGLDisplay, (int[])localObject1, 0);
                if (localObject1 == null) {
                  break label346;
                }
              }
              if (EGL14.eglMakeCurrent((EGLDisplay)localObject2, (EGLSurface)localObject1, (EGLSurface)localObject1, localEGLContext))
              {
                g = ((EGLSurface)localObject1);
                GLES20.glGenTextures(1, c, 0);
                rp.d();
                localObject1 = new SurfaceTexture(c[0]);
                h = ((SurfaceTexture)localObject1);
                ((SurfaceTexture)localObject1).setOnFrameAvailableListener(this);
                return;
              }
              throw new vi("eglMakeCurrent failed", (byte)0);
              label346:
              throw new vi("eglCreatePbufferSurface failed", (byte)0);
            }
            throw new vi("eglCreateContext failed", (byte)0);
          }
        }
        throw new vi(wl.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(localObject1[0]), localObject2[0] }), (byte)0);
      }
      throw new vi("eglInitialize failed", (byte)0);
    }
    throw new vi("eglGetDisplay failed", (byte)0);
  }
  
  public final SurfaceTexture b()
  {
    return (SurfaceTexture)rp.a(h);
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    b.post(this);
  }
  
  public final void run()
  {
    Object localObject = d;
    if (localObject != null) {
      ((vl)localObject).a();
    }
    localObject = h;
    if (localObject != null) {}
    try
    {
      ((SurfaceTexture)localObject).updateTexImage();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */