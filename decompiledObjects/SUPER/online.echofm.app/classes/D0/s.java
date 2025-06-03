package D0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.Surface;
import g0.M;
import g0.a;

public final class s
{
  public final i a = new i();
  public final b b;
  public final c c;
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
  
  public s(Context paramContext)
  {
    paramContext = f(paramContext);
    b = paramContext;
    if (paramContext != null) {
      paramContext = c.d();
    } else {
      paramContext = null;
    }
    c = paramContext;
    k = -9223372036854775807L;
    l = -9223372036854775807L;
    f = -1.0F;
    i = 1.0F;
    j = 0;
  }
  
  public static boolean c(long paramLong1, long paramLong2)
  {
    boolean bool;
    if (Math.abs(paramLong1 - paramLong2) <= 20000000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static long e(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong2 += (paramLong1 - paramLong2) / paramLong3 * paramLong3;
    if (paramLong1 <= paramLong2)
    {
      long l1 = paramLong2 - paramLong3;
      paramLong3 = paramLong2;
      paramLong2 = l1;
    }
    else
    {
      paramLong3 += paramLong2;
    }
    if (paramLong3 - paramLong1 < paramLong1 - paramLong2) {
      paramLong2 = paramLong3;
    }
    return paramLong2;
  }
  
  public long b(long paramLong)
  {
    long l1;
    if ((p != -1L) && (a.e()))
    {
      l1 = a.a();
      l1 = q + ((float)(l1 * (m - p)) / i);
      if (c(paramLong, l1)) {
        paramLong = l1;
      } else {
        n();
      }
    }
    n = m;
    o = paramLong;
    c localc = c;
    if ((localc != null) && (k != -9223372036854775807L))
    {
      l1 = o;
      if (l1 == -9223372036854775807L) {
        return paramLong;
      }
      return e(paramLong, l1, k) - l;
    }
    return paramLong;
  }
  
  public final void d()
  {
    if (M.a >= 30)
    {
      Surface localSurface = e;
      if ((localSurface != null) && (j != Integer.MIN_VALUE) && (h != 0.0F))
      {
        h = 0.0F;
        a.a(localSurface, 0.0F);
      }
    }
  }
  
  public final b f(Context paramContext)
  {
    Object localObject = null;
    if (paramContext == null) {
      return null;
    }
    DisplayManager localDisplayManager = (DisplayManager)paramContext.getSystemService("display");
    paramContext = (Context)localObject;
    if (localDisplayManager != null) {
      paramContext = new b(localDisplayManager);
    }
    return paramContext;
  }
  
  public void g(float paramFloat)
  {
    f = paramFloat;
    a.g();
    q();
  }
  
  public void h(long paramLong)
  {
    long l1 = n;
    if (l1 != -1L)
    {
      p = l1;
      q = o;
    }
    m += 1L;
    a.f(paramLong * 1000L);
    q();
  }
  
  public void i(float paramFloat)
  {
    i = paramFloat;
    n();
    r(false);
  }
  
  public void j()
  {
    n();
  }
  
  public void k()
  {
    d = true;
    n();
    if (b != null)
    {
      ((c)a.e(c)).a();
      b.b();
    }
    r(false);
  }
  
  public void l()
  {
    d = false;
    b localb = b;
    if (localb != null)
    {
      localb.c();
      ((c)a.e(c)).e();
    }
    d();
  }
  
  public void m(Surface paramSurface)
  {
    Surface localSurface = paramSurface;
    if ((paramSurface instanceof o)) {
      localSurface = null;
    }
    if (e == localSurface) {
      return;
    }
    d();
    e = localSurface;
    r(true);
  }
  
  public final void n()
  {
    m = 0L;
    p = -1L;
    n = -1L;
  }
  
  public void o(int paramInt)
  {
    if (j == paramInt) {
      return;
    }
    j = paramInt;
    r(true);
  }
  
  public final void p(Display paramDisplay)
  {
    long l1;
    if (paramDisplay != null)
    {
      l1 = (1.0E9D / paramDisplay.getRefreshRate());
      k = l1;
      l1 = l1 * 80L / 100L;
    }
    for (;;)
    {
      l = l1;
      break;
      g0.o.h("VideoFrameReleaseHelper", "Unable to query display refresh rate");
      l1 = -9223372036854775807L;
      k = -9223372036854775807L;
    }
  }
  
  public final void q()
  {
    if ((M.a >= 30) && (e != null))
    {
      float f1;
      if (a.e()) {
        f1 = a.b();
      } else {
        f1 = f;
      }
      float f2 = g;
      if (f1 == f2) {
        return;
      }
      boolean bool = f1 < -1.0F;
      if ((bool) && (f2 != -1.0F))
      {
        if ((a.e()) && (a.d() >= 5000000000L)) {
          f2 = 0.02F;
        } else {
          f2 = 1.0F;
        }
        if (Math.abs(f1 - g) < f2) {
          return;
        }
      }
      else if ((!bool) && (a.c() < 30))
      {
        return;
      }
      g = f1;
      r(false);
    }
  }
  
  public final void r(boolean paramBoolean)
  {
    if (M.a >= 30)
    {
      Surface localSurface = e;
      if ((localSurface != null) && (j != Integer.MIN_VALUE))
      {
        if (d)
        {
          f1 = g;
          if (f1 != -1.0F)
          {
            f1 *= i;
            break label60;
          }
        }
        float f1 = 0.0F;
        label60:
        if ((!paramBoolean) && (h == f1)) {
          return;
        }
        h = f1;
        a.a(localSurface, f1);
      }
    }
  }
  
  public static final abstract class a
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
        r.a(paramSurface, paramFloat, i);
      }
      catch (IllegalStateException paramSurface)
      {
        g0.o.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", paramSurface);
      }
    }
  }
  
  public final class b
    implements DisplayManager.DisplayListener
  {
    public final DisplayManager a;
    
    public b(DisplayManager paramDisplayManager)
    {
      a = paramDisplayManager;
    }
    
    public final Display a()
    {
      return a.getDisplay(0);
    }
    
    public void b()
    {
      a.registerDisplayListener(this, M.A());
      s.a(s.this, a());
    }
    
    public void c()
    {
      a.unregisterDisplayListener(this);
    }
    
    public void onDisplayAdded(int paramInt) {}
    
    public void onDisplayChanged(int paramInt)
    {
      if (paramInt == 0) {
        s.a(s.this, a());
      }
    }
    
    public void onDisplayRemoved(int paramInt) {}
  }
  
  public static final class c
    implements Choreographer.FrameCallback, Handler.Callback
  {
    public static final c t = new c();
    public volatile long o = -9223372036854775807L;
    public final Handler p;
    public final HandlerThread q;
    public Choreographer r;
    public int s;
    
    public c()
    {
      Object localObject = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
      q = ((HandlerThread)localObject);
      ((Thread)localObject).start();
      localObject = M.z(((HandlerThread)localObject).getLooper(), this);
      p = ((Handler)localObject);
      ((Handler)localObject).sendEmptyMessage(1);
    }
    
    public static c d()
    {
      return t;
    }
    
    public void a()
    {
      p.sendEmptyMessage(2);
    }
    
    public final void b()
    {
      Choreographer localChoreographer = r;
      if (localChoreographer != null)
      {
        int i = s + 1;
        s = i;
        if (i == 1) {
          localChoreographer.postFrameCallback(this);
        }
      }
    }
    
    public final void c()
    {
      try
      {
        r = Choreographer.getInstance();
      }
      catch (RuntimeException localRuntimeException)
      {
        g0.o.i("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", localRuntimeException);
      }
    }
    
    public void doFrame(long paramLong)
    {
      o = paramLong;
      ((Choreographer)a.e(r)).postFrameCallbackDelayed(this, 500L);
    }
    
    public void e()
    {
      p.sendEmptyMessage(3);
    }
    
    public final void f()
    {
      Choreographer localChoreographer = r;
      if (localChoreographer != null)
      {
        int i = s - 1;
        s = i;
        if (i == 0)
        {
          localChoreographer.removeFrameCallback(this);
          o = -9223372036854775807L;
        }
      }
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return false;
          }
          f();
          return true;
        }
        b();
        return true;
      }
      c();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     D0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */