package v5;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class g
  implements SurfaceTexture.OnFrameAvailableListener, Runnable
{
  public static final int[] o = { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
  public final Handler a;
  public final int[] b;
  public EGLDisplay c;
  public EGLContext d;
  public EGLSurface e;
  public SurfaceTexture f;
  
  public g(Handler paramHandler)
  {
    a = paramHandler;
    b = new int[1];
  }
  
  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    a.post(this);
  }
  
  public final void run()
  {
    SurfaceTexture localSurfaceTexture = f;
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
}

/* Location:
 * Qualified Name:     v5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */