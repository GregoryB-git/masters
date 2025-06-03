package b0;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import d0.a;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.f;
import r.h;

public final class l
{
  public static final f<String, Typeface> a = new f(16);
  public static final ThreadPoolExecutor b;
  public static final Object c = new Object();
  public static final h<String, ArrayList<a<a>>> d = new h();
  
  static
  {
    Object localObject = new o();
    localObject = new ThreadPoolExecutor(0, 1, '✐', TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    b = (ThreadPoolExecutor)localObject;
  }
  
  public static a a(String paramString, Context paramContext, g paramg, int paramInt)
  {
    Object localObject = (Typeface)a.get(paramString);
    if (localObject != null) {
      return new a((Typeface)localObject);
    }
    try
    {
      localObject = e.a(paramContext, paramg);
      int i = a;
      int j = 1;
      int k;
      if (i != 0)
      {
        if (i == 1)
        {
          i = -2;
          break label147;
        }
      }
      else
      {
        paramg = b;
        i = j;
        if (paramg == null) {
          break label147;
        }
        if (paramg.length == 0)
        {
          i = j;
          break label147;
        }
        k = paramg.length;
      }
      for (i = 0; i < k; i++)
      {
        j = e;
        if (j != 0)
        {
          if (j < 0)
          {
            i = -3;
            break label147;
          }
          i = j;
          break label147;
        }
      }
      i = 0;
      label147:
      if (i != 0) {
        return new a(i);
      }
      paramg = b;
      paramContext = x.e.a.b(paramContext, paramg, paramInt);
      if (paramContext != null)
      {
        a.put(paramString, paramContext);
        return new a(paramContext);
      }
      return new a(-3);
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return new a(-1);
  }
  
  public static final class a
  {
    public final Typeface a;
    public final int b;
    
    public a(int paramInt)
    {
      a = null;
      b = paramInt;
    }
    
    public a(Typeface paramTypeface)
    {
      a = paramTypeface;
      b = 0;
    }
  }
}

/* Location:
 * Qualified Name:     b0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */