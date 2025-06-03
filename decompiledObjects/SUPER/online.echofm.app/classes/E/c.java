package E;

import android.os.CancellationSignal;

public final class c
{
  public boolean a;
  public b b;
  public Object c;
  public boolean d;
  
  public void a()
  {
    try
    {
      if (a) {
        return;
      }
    }
    finally
    {
      break label105;
      a = true;
      d = true;
      b localb = b;
      Object localObject2 = c;
      if (localb != null) {
        try
        {
          localb.a();
        }
        finally
        {
          break label66;
        }
      }
      if (localObject3 != null) {
        a.a(localObject3);
      }
      label66:
      label105:
      try
      {
        d = false;
        notifyAll();
        throw ((Throwable)localObject3);
      }
      finally
      {
        throw ((Throwable)localObject4);
        try
        {
          d = false;
          notifyAll();
          return;
        }
        finally {}
      }
    }
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = a;
      return bool;
    }
    finally {}
  }
  
  public void c(b paramb)
  {
    label52:
    try
    {
      d();
      if (b == paramb) {
        return;
      }
    }
    finally
    {
      break label52;
      b = paramb;
      if ((a) && (paramb != null))
      {
        paramb.a();
        return;
      }
      return;
    }
  }
  
  public final void d()
  {
    for (;;)
    {
      if (d) {}
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException) {}
      return;
    }
  }
  
  public static abstract class a
  {
    public static void a(Object paramObject)
    {
      ((CancellationSignal)paramObject).cancel();
    }
    
    public static CancellationSignal b()
    {
      return new CancellationSignal();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     E.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */