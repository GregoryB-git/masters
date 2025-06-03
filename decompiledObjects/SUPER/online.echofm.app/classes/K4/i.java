package K4;

import F4.a;
import M4.k;
import M4.o;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;

public class i
{
  public static final a e = ;
  public final Runtime a;
  public final ActivityManager b;
  public final ActivityManager.MemoryInfo c;
  public final Context d;
  
  public i(Context paramContext)
  {
    this(Runtime.getRuntime(), paramContext);
  }
  
  public i(Runtime paramRuntime, Context paramContext)
  {
    a = paramRuntime;
    d = paramContext;
    paramRuntime = (ActivityManager)paramContext.getSystemService("activity");
    b = paramRuntime;
    paramContext = new ActivityManager.MemoryInfo();
    c = paramContext;
    paramRuntime.getMemoryInfo(paramContext);
  }
  
  public int a()
  {
    return o.c(k.t.c(c.totalMem));
  }
  
  public int b()
  {
    return o.c(k.t.c(a.maxMemory()));
  }
  
  public int c()
  {
    return o.c(k.r.c(b.getMemoryClass()));
  }
}

/* Location:
 * Qualified Name:     K4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */