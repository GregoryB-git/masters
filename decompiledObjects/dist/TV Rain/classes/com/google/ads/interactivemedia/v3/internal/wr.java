package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class wr
  extends Surface
{
  private static int a;
  private static boolean b;
  private final wq c;
  private boolean d;
  
  private wr(wq paramwq, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    super(paramSurfaceTexture);
    c = paramwq;
  }
  
  public static wr a(Context paramContext, boolean paramBoolean)
  {
    if (wl.a >= 17)
    {
      int i = 0;
      boolean bool;
      if ((paramBoolean) && (!a(paramContext))) {
        bool = false;
      } else {
        bool = true;
      }
      rp.c(bool);
      paramContext = new wq();
      if (paramBoolean) {
        i = a;
      }
      return paramContext.a(i);
    }
    throw new UnsupportedOperationException("Unsupported prior to API level 17");
  }
  
  public static boolean a(Context paramContext)
  {
    try
    {
      if (!b)
      {
        i = wl.a;
        if (i < 24) {}
        do
        {
          do
          {
            i = 0;
            break;
          } while (((i < 26) && (("samsung".equals(wl.c)) || ("XT1650".equals(wl.d)))) || ((i < 26) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))));
          paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        } while ((paramContext == null) || (!paramContext.contains("EGL_EXT_protected_content")));
        if (paramContext.contains("EGL_KHR_surfaceless_context")) {
          i = 1;
        } else {
          i = 2;
        }
        a = i;
        b = true;
      }
      int i = a;
      return i != 0;
    }
    finally {}
  }
  
  public final void release()
  {
    super.release();
    synchronized (c)
    {
      if (!d)
      {
        c.a();
        d = true;
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */