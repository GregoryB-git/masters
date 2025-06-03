package u5;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import t5.b;

public class s$a
  implements SurfaceHolder.Callback
{
  public s$a(s params) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
    if (s.e(a)) {
      s.g(a, paramInt2, paramInt3);
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
    s.d(a, true);
    if (s.e(a)) {
      s.f(a);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
    s.d(a, false);
    if (s.e(a)) {
      s.h(a);
    }
  }
}

/* Location:
 * Qualified Name:     u5.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */