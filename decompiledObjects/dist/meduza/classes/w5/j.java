package w5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import d3.a;
import io.flutter.plugins.firebase.auth.g;
import v5.e0;
import v5.m;

public final class j
{
  public final d a = new d();
  public final b b;
  public final e c;
  public boolean d;
  public Surface e;
  public float f;
  public float g;
  public float h;
  public float i;
  public int j;
  public long k;
  public long l;
  public long m;
  public long n;
  public long o;
  public long p;
  public long q;
  
  public j(Context paramContext)
  {
    Object localObject1 = null;
    if (paramContext != null)
    {
      Context localContext = paramContext.getApplicationContext();
      if (e0.a >= 17)
      {
        paramContext = (DisplayManager)localContext.getSystemService("display");
        if (paramContext != null)
        {
          localObject2 = new d(paramContext);
          break label64;
        }
      }
      localObject2 = null;
      label64:
      paramContext = (Context)localObject2;
      if (localObject2 != null) {
        break label100;
      }
      paramContext = (WindowManager)localContext.getSystemService("window");
      if (paramContext != null)
      {
        paramContext = new c(paramContext);
        break label100;
      }
    }
    paramContext = null;
    label100:
    b = paramContext;
    Object localObject2 = localObject1;
    if (paramContext != null) {
      localObject2 = e.e;
    }
    c = ((e)localObject2);
    k = -9223372036854775807L;
    l = -9223372036854775807L;
    f = -1.0F;
    i = 1.0F;
    j = 0;
  }
  
  public final void a()
  {
    if (e0.a >= 30)
    {
      Surface localSurface = e;
      if ((localSurface != null) && (j != Integer.MIN_VALUE) && (h != 0.0F))
      {
        h = 0.0F;
        a.a(localSurface, 0.0F);
      }
    }
  }
  
  public final void b()
  {
    if ((e0.a >= 30) && (e != null))
    {
      Object localObject;
      long l2;
      float f1;
      if (a.a())
      {
        localObject = a;
        if (((d)localObject).a())
        {
          localObject = a;
          long l1 = e;
          l2 = 0L;
          if (l1 != 0L) {
            l2 = f / l1;
          }
          f1 = (float)(1.0E9D / l2);
        }
        else
        {
          f1 = -1.0F;
        }
      }
      else
      {
        f1 = f;
      }
      float f2 = g;
      if (f1 == f2) {
        return;
      }
      boolean bool1 = f1 < -1.0F;
      boolean bool2 = true;
      if ((bool1) && (f2 != -1.0F))
      {
        if (a.a())
        {
          localObject = a;
          if (((d)localObject).a()) {
            l2 = a.f;
          } else {
            l2 = -9223372036854775807L;
          }
          if (l2 >= 5000000000L)
          {
            bool1 = true;
            break label191;
          }
        }
        bool1 = false;
        label191:
        if (bool1) {
          f2 = 0.02F;
        } else {
          f2 = 1.0F;
        }
        if (Math.abs(f1 - g) >= f2)
        {
          bool1 = bool2;
          break label263;
        }
      }
      else
      {
        if (bool1)
        {
          bool1 = bool2;
          break label263;
        }
        if (a.e >= 30)
        {
          bool1 = bool2;
          break label263;
        }
      }
      bool1 = false;
      label263:
      if (bool1)
      {
        g = f1;
        c(false);
      }
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (e0.a >= 30)
    {
      Surface localSurface = e;
      if ((localSurface != null) && (j != Integer.MIN_VALUE))
      {
        float f1 = 0.0F;
        float f2 = f1;
        if (d)
        {
          float f3 = g;
          f2 = f1;
          if (f3 != -1.0F) {
            f2 = i * f3;
          }
        }
        if ((!paramBoolean) && (h == f2)) {
          return;
        }
        h = f2;
        a.a(localSurface, f2);
      }
    }
  }
  
  public static final class a
  {
    public static void a(Surface paramSurface, float paramFloat)
    {
      int i;
      if (paramFloat == 0.0F) {
        i = 0;
      } else {
        i = 1;
      }
      try
      {
        a.f(paramSurface, paramFloat, i);
      }
      catch (IllegalStateException paramSurface)
      {
        m.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", paramSurface);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b(g paramg);
    
    public static abstract interface a {}
  }
  
  public static final class c
    implements j.b
  {
    public final WindowManager a;
    
    public c(WindowManager paramWindowManager)
    {
      a = paramWindowManager;
    }
    
    public final void a() {}
    
    public final void b(g paramg)
    {
      paramg.b(a.getDefaultDisplay());
    }
  }
  
  public static final class d
    implements j.b, DisplayManager.DisplayListener
  {
    public final DisplayManager a;
    public j.b.a b;
    
    public d(DisplayManager paramDisplayManager)
    {
      a = paramDisplayManager;
    }
    
    public final void a()
    {
      a.unregisterDisplayListener(this);
      b = null;
    }
    
    public final void b(g paramg)
    {
      b = paramg;
      a.registerDisplayListener(this, e0.l(null));
      paramg.b(a.getDisplay(0));
    }
    
    public final void onDisplayAdded(int paramInt) {}
    
    public final void onDisplayChanged(int paramInt)
    {
      j.b.a locala = b;
      if ((locala != null) && (paramInt == 0))
      {
        Display localDisplay = a.getDisplay(0);
        ((g)locala).b(localDisplay);
      }
    }
    
    public final void onDisplayRemoved(int paramInt) {}
  }
  
  public static final class e
    implements Choreographer.FrameCallback, Handler.Callback
  {
    public static final e e = new e();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;
    
    public e()
    {
      Object localObject = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
      ((Thread)localObject).start();
      localObject = ((HandlerThread)localObject).getLooper();
      int i = e0.a;
      localObject = new Handler((Looper)localObject, this);
      b = ((Handler)localObject);
      ((Handler)localObject).sendEmptyMessage(0);
    }
    
    public final void doFrame(long paramLong)
    {
      a = paramLong;
      Choreographer localChoreographer = c;
      localChoreographer.getClass();
      localChoreographer.postFrameCallbackDelayed(this, 500L);
    }
    
    public final boolean handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            return false;
          }
          paramMessage = c;
          if (paramMessage != null)
          {
            i = d - 1;
            d = i;
            if (i == 0)
            {
              paramMessage.removeFrameCallback(this);
              a = -9223372036854775807L;
            }
          }
          return true;
        }
        paramMessage = c;
        if (paramMessage != null)
        {
          i = d + 1;
          d = i;
          if (i == 1) {
            paramMessage.postFrameCallback(this);
          }
        }
        return true;
      }
      try
      {
        c = Choreographer.getInstance();
      }
      catch (RuntimeException paramMessage)
      {
        m.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", paramMessage);
      }
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     w5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */