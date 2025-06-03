package v6;

import android.os.Build.VERSION;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class i
{
  public static final Method a;
  public static final Method b;
  public static Boolean c;
  
  static
  {
    Process.myUid();
    Method localMethod2;
    try
    {
      Method localMethod1 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE });
    }
    catch (Exception localException1)
    {
      localMethod2 = null;
    }
    a = localMethod2;
    Method localMethod3;
    try
    {
      localMethod2 = WorkSource.class.getMethod("add", new Class[] { Integer.TYPE, String.class });
    }
    catch (Exception localException2)
    {
      localMethod3 = null;
    }
    b = localMethod3;
    try
    {
      WorkSource.class.getMethod("size", new Class[0]);
    }
    catch (Exception localException7)
    {
      try
      {
        WorkSource.class.getMethod("get", new Class[] { Integer.TYPE });
      }
      catch (Exception localException7)
      {
        try
        {
          WorkSource.class.getMethod("getName", new Class[] { Integer.TYPE });
          int i;
          if (Build.VERSION.SDK_INT >= 28) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            try
            {
              WorkSource.class.getMethod("createWorkChain", new Class[0]);
            }
            catch (Exception localException3)
            {
              Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", localException3);
            }
          }
          if (Build.VERSION.SDK_INT >= 28) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            try
            {
              Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { Integer.TYPE, String.class });
            }
            catch (Exception localException4)
            {
              Log.w("WorkSourceUtil", "Missing WorkChain class", localException4);
            }
          }
          if (Build.VERSION.SDK_INT >= 28) {
            i = 1;
          } else {
            i = 0;
          }
          if (i == 0) {}
        }
        catch (Exception localException7)
        {
          try
          {
            for (;;)
            {
              WorkSource.class.getMethod("isEmpty", new Class[0]).setAccessible(true);
              c = null;
              return;
              localException5 = localException5;
              continue;
              localException6 = localException6;
            }
            localException7 = localException7;
          }
          catch (Exception localException8)
          {
            for (;;) {}
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     v6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */