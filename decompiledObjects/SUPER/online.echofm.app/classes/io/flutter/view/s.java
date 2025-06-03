package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterJNI.b;
import java.util.Objects;

public class s
{
  public static s e;
  public static b f;
  public long a = -1L;
  public FlutterJNI b;
  public c c = new c(0L);
  public final FlutterJNI.b d = new a();
  
  public s(FlutterJNI paramFlutterJNI)
  {
    b = paramFlutterJNI;
  }
  
  public static s f(DisplayManager paramDisplayManager, FlutterJNI paramFlutterJNI)
  {
    if (e == null) {
      e = new s(paramFlutterJNI);
    }
    if (f == null)
    {
      Object localObject = e;
      Objects.requireNonNull(localObject);
      localObject = new b((s)localObject, paramDisplayManager);
      f = (b)localObject;
      ((b)localObject).a();
    }
    if (ea == -1L)
    {
      float f1 = paramDisplayManager.getDisplay(0).getRefreshRate();
      ea = ((1.0E9D / f1));
      paramFlutterJNI.setRefreshRateFPS(f1);
    }
    return e;
  }
  
  public void g()
  {
    b.setAsyncWaitForVsyncDelegate(d);
  }
  
  public class a
    implements FlutterJNI.b
  {
    public a() {}
    
    public void a(long paramLong)
    {
      Choreographer.getInstance().postFrameCallback(b(paramLong));
    }
    
    public final Choreographer.FrameCallback b(long paramLong)
    {
      if (s.d(s.this) != null)
      {
        s.c.a(s.d(s.this), paramLong);
        s.c localc = s.d(s.this);
        s.e(s.this, null);
        return localc;
      }
      return new s.c(s.this, paramLong);
    }
  }
  
  public class b
    implements DisplayManager.DisplayListener
  {
    public DisplayManager a;
    
    public b(DisplayManager paramDisplayManager)
    {
      a = paramDisplayManager;
    }
    
    public void a()
    {
      a.registerDisplayListener(this, null);
    }
    
    public void onDisplayAdded(int paramInt) {}
    
    public void onDisplayChanged(int paramInt)
    {
      if (paramInt == 0)
      {
        float f = a.getDisplay(0).getRefreshRate();
        s.b(s.this, (1.0E9D / f));
        s.c(s.this).setRefreshRateFPS(f);
      }
    }
    
    public void onDisplayRemoved(int paramInt) {}
  }
  
  public class c
    implements Choreographer.FrameCallback
  {
    public long o;
    
    public c(long paramLong)
    {
      o = paramLong;
    }
    
    public void doFrame(long paramLong)
    {
      paramLong = System.nanoTime() - paramLong;
      if (paramLong < 0L) {
        paramLong = 0L;
      }
      s.c(s.this).onVsync(paramLong, s.a(s.this), o);
      s.e(s.this, this);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */