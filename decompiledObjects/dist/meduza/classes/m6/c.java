package m6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import j6.b;
import java.util.concurrent.Executor;

public abstract class c
{
  public static final Object a = new Object();
  public static s0 b;
  public static HandlerThread c;
  
  public static s0 a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        s0 locals0 = new m6/s0;
        locals0.<init>(paramContext.getApplicationContext(), paramContext.getMainLooper());
        b = locals0;
      }
      return b;
    }
  }
  
  public abstract b b(p0 paramp0, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor);
  
  public abstract void c(p0 paramp0, ServiceConnection paramServiceConnection);
}

/* Location:
 * Qualified Name:     m6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */