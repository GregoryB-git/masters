package A2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

public abstract class h
{
  public static int a = 4225;
  public static final Object b = new Object();
  public static j0 c;
  public static HandlerThread d;
  public static boolean e = false;
  
  public static int a()
  {
    return a;
  }
  
  public static h b(Context paramContext)
  {
    j0 localj0;
    Context localContext;
    synchronized (b)
    {
      if (c != null) {
        break label56;
      }
      localj0 = new A2/j0;
      localContext = paramContext.getApplicationContext();
      if (e) {
        paramContext = c().getLooper();
      }
    }
    paramContext = paramContext.getMainLooper();
    localj0.<init>(localContext, paramContext);
    c = localj0;
    label56:
    return c;
  }
  
  public static HandlerThread c()
  {
    HandlerThread localHandlerThread2;
    synchronized (b)
    {
      HandlerThread localHandlerThread1 = d;
      if (localHandlerThread1 != null) {
        return localHandlerThread1;
      }
    }
  }
  
  public abstract void d(e0 parame0, ServiceConnection paramServiceConnection, String paramString);
  
  public final void e(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3, boolean paramBoolean)
  {
    d(new e0(paramString1, paramString2, paramInt, paramBoolean), paramServiceConnection, paramString3);
  }
  
  public abstract boolean f(e0 parame0, ServiceConnection paramServiceConnection, String paramString, Executor paramExecutor);
}

/* Location:
 * Qualified Name:     A2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */