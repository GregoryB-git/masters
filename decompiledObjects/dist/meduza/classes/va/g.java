package va;

import android.os.Handler;
import android.os.HandlerThread;

public final class g
{
  public final String a;
  public final int b;
  public HandlerThread c;
  public Handler d;
  public Runnable e;
  public f f;
  
  public g(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public final void a(w.g paramg)
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
      e = paramg;
      return;
    }
    finally
    {
      paramg = finally;
      throw paramg;
    }
  }
}

/* Location:
 * Qualified Name:     va.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */