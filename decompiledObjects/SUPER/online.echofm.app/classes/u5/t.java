package u5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.k;
import t5.b;

public class t
  extends TextureView
  implements k
{
  public boolean o = false;
  public boolean p = false;
  public FlutterRenderer q;
  public Surface r;
  public final TextureView.SurfaceTextureListener s = new a();
  
  public t(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public t(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    o();
  }
  
  private void l(int paramInt1, int paramInt2)
  {
    if (q != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" x ");
      localStringBuilder.append(paramInt2);
      b.f("FlutterTextureView", localStringBuilder.toString());
      q.q(paramInt1, paramInt2);
      return;
    }
    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
  }
  
  private void m()
  {
    if ((q != null) && (getSurfaceTexture() != null))
    {
      Surface localSurface = r;
      if (localSurface != null)
      {
        localSurface.release();
        r = null;
      }
      localSurface = new Surface(getSurfaceTexture());
      r = localSurface;
      q.o(localSurface, p);
      return;
    }
    throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
  }
  
  private void n()
  {
    Object localObject = q;
    if (localObject != null)
    {
      ((FlutterRenderer)localObject).p();
      localObject = r;
      if (localObject != null)
      {
        ((Surface)localObject).release();
        r = null;
      }
      return;
    }
    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
  }
  
  private void o()
  {
    setSurfaceTextureListener(s);
  }
  
  private boolean q()
  {
    boolean bool;
    if ((q != null) && (!p)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    if (q != null)
    {
      if (getWindowToken() != null)
      {
        b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
        n();
      }
      q = null;
    }
    else
    {
      b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
  }
  
  public void b()
  {
    if (q == null)
    {
      b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
      return;
    }
    if (p())
    {
      b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
      m();
    }
    p = false;
  }
  
  public void c(FlutterRenderer paramFlutterRenderer)
  {
    b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
    if (q != null)
    {
      b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
      q.p();
    }
    q = paramFlutterRenderer;
    b();
  }
  
  public FlutterRenderer getAttachedRenderer()
  {
    return q;
  }
  
  public void j()
  {
    if (q == null)
    {
      b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
      return;
    }
    p = true;
  }
  
  public boolean p()
  {
    return o;
  }
  
  public void setRenderSurface(Surface paramSurface)
  {
    r = paramSurface;
  }
  
  public class a
    implements TextureView.SurfaceTextureListener
  {
    public a() {}
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
      t.d(t.this, true);
      if (t.e(t.this)) {
        t.f(t.this);
      }
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
      t.d(t.this, false);
      if (t.e(t.this)) {
        t.h(t.this);
      }
      if (t.i(t.this) != null)
      {
        t.i(t.this).release();
        t.k(t.this, null);
      }
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
      if (t.e(t.this)) {
        t.g(t.this, paramInt1, paramInt2);
      }
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  }
}

/* Location:
 * Qualified Name:     u5.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */