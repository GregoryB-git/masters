package n5;

import android.os.Handler;
import android.os.HandlerThread;

public class o
{
  public final String a;
  public final int b;
  public HandlerThread c;
  public Handler d;
  public Runnable e;
  public m f;
  
  public o(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public boolean b()
  {
    m localm = f;
    boolean bool;
    if ((localm != null) && (localm.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Integer d()
  {
    Object localObject = f;
    if (localObject != null) {
      localObject = ((m)localObject).a();
    } else {
      localObject = null;
    }
    return (Integer)localObject;
  }
  
  public void e(m paramm)
  {
    d.post(new n(this, paramm));
  }
  
  public void f()
  {
    try
    {
      HandlerThread localHandlerThread = c;
      if (localHandlerThread != null)
      {
        localHandlerThread.quit();
        c = null;
        d = null;
      }
    }
    finally
    {
      break label36;
    }
    return;
    label36:
    throw ((Throwable)localObject);
  }
  
  public void g(Runnable paramRunnable)
  {
    try
    {
      Object localObject = new android/os/HandlerThread;
      ((HandlerThread)localObject).<init>(a, b);
      c = ((HandlerThread)localObject);
      ((Thread)localObject).start();
      localObject = new android/os/Handler;
      ((Handler)localObject).<init>(c.getLooper());
      d = ((Handler)localObject);
      e = paramRunnable;
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public void h(m paramm)
  {
    b.run();
    f = paramm;
    e.run();
  }
}

/* Location:
 * Qualified Name:     n5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */