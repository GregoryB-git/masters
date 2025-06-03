package u5;

import android.content.Context;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import t5.b;

public class s
  extends SurfaceView
  implements k
{
  public final boolean o;
  public boolean p = false;
  public boolean q = false;
  public FlutterRenderer r;
  public final SurfaceHolder.Callback s = new a();
  public final j t = new b();
  
  public s(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet);
    o = paramBoolean;
    n();
  }
  
  public s(Context paramContext, boolean paramBoolean)
  {
    this(paramContext, null, paramBoolean);
  }
  
  private void n()
  {
    if (o)
    {
      getHolder().setFormat(-2);
      setZOrderOnTop(true);
    }
    getHolder().addCallback(s);
    setAlpha(0.0F);
  }
  
  public void a()
  {
    if (r != null)
    {
      if (getWindowToken() != null)
      {
        b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
        m();
      }
      setAlpha(0.0F);
      r.k(t);
      r = null;
    }
    else
    {
      b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }
  }
  
  public void b()
  {
    FlutterRenderer localFlutterRenderer = r;
    if (localFlutterRenderer == null)
    {
      b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
      return;
    }
    localFlutterRenderer.f(t);
    if (o())
    {
      b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
      l();
    }
    q = false;
  }
  
  public void c(FlutterRenderer paramFlutterRenderer)
  {
    b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
    if (r != null)
    {
      b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
      r.p();
      r.k(t);
    }
    r = paramFlutterRenderer;
    b();
  }
  
  public boolean gatherTransparentRegion(Region paramRegion)
  {
    if (getAlpha() < 1.0F) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    int i = arrayOfInt[0];
    paramRegion.op(i, arrayOfInt[1], getRight() + i - getLeft(), arrayOfInt[1] + getBottom() - getTop(), Region.Op.DIFFERENCE);
    return true;
  }
  
  public FlutterRenderer getAttachedRenderer()
  {
    return r;
  }
  
  public void j()
  {
    if (r == null)
    {
      b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
      return;
    }
    q = true;
  }
  
  public final void k(int paramInt1, int paramInt2)
  {
    if (r != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" x ");
      localStringBuilder.append(paramInt2);
      b.f("FlutterSurfaceView", localStringBuilder.toString());
      r.q(paramInt1, paramInt2);
      return;
    }
    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
  }
  
  public final void l()
  {
    if ((r != null) && (getHolder() != null))
    {
      r.o(getHolder().getSurface(), q);
      return;
    }
    throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
  }
  
  public final void m()
  {
    FlutterRenderer localFlutterRenderer = r;
    if (localFlutterRenderer != null)
    {
      localFlutterRenderer.p();
      return;
    }
    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
  }
  
  public boolean o()
  {
    return p;
  }
  
  public final boolean p()
  {
    boolean bool;
    if ((r != null) && (!q)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public class a
    implements SurfaceHolder.Callback
  {
    public a() {}
    
    public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
      if (s.e(s.this)) {
        s.g(s.this, paramInt2, paramInt3);
      }
    }
    
    public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
      s.d(s.this, true);
      if (s.e(s.this)) {
        s.f(s.this);
      }
    }
    
    public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
      s.d(s.this, false);
      if (s.e(s.this)) {
        s.h(s.this);
      }
    }
  }
  
  public class b
    implements j
  {
    public b() {}
    
    public void b() {}
    
    public void e()
    {
      b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
      setAlpha(1.0F);
      if (s.i(s.this) != null) {
        s.i(s.this).k(this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     u5.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */