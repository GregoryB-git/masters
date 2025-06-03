package u5;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import t5.b;

public class t$a
  implements TextureView.SurfaceTextureListener
{
  public t$a(t paramt) {}
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
    t.d(a, true);
    if (t.e(a)) {
      t.f(a);
    }
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
    t.d(a, false);
    if (t.e(a)) {
      t.h(a);
    }
    if (t.i(a) != null)
    {
      t.i(a).release();
      t.k(a, null);
    }
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
    if (t.e(a)) {
      t.g(a, paramInt1, paramInt2);
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
}

/* Location:
 * Qualified Name:     u5.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */