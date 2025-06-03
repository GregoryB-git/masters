package F;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import t.g;

public abstract class f
{
  public static final g a = new g(16);
  public static final ExecutorService b = h.a("fonts-androidx", 10, 10000);
  public static final Object c = new Object();
  public static final t.h d = new t.h();
  
  public static String a(e parame, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(parame.d());
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public static int b(g.a parama)
  {
    int i = parama.c();
    int j = -3;
    int k = 1;
    if (i != 0)
    {
      if (parama.c() != 1) {
        return -3;
      }
      return -2;
    }
    parama = parama.b();
    i = k;
    if (parama != null) {
      if (parama.length == 0)
      {
        i = k;
      }
      else
      {
        int m = parama.length;
        int n = 0;
        for (k = 0;; k++)
        {
          i = n;
          if (k >= m) {
            break;
          }
          i = parama[k].b();
          if (i != 0)
          {
            if (i < 0) {
              i = j;
            }
            return i;
          }
        }
      }
    }
    return i;
  }
  
  public static e c(String paramString, Context paramContext, e parame, int paramInt)
  {
    g localg = a;
    Typeface localTypeface = (Typeface)localg.c(paramString);
    if (localTypeface != null) {
      return new e(localTypeface);
    }
    try
    {
      parame = d.e(paramContext, parame, null);
      int i = b(parame);
      if (i != 0) {
        return new e(i);
      }
      paramContext = A.h.b(paramContext, null, parame.b(), paramInt);
      if (paramContext != null)
      {
        localg.d(paramString, paramContext);
        return new e(paramContext);
      }
      return new e(-3);
    }
    catch (PackageManager.NameNotFoundException paramString) {}
    return new e(-1);
  }
  
  public static Typeface d(final Context paramContext, final e parame, final int paramInt, Executor paramExecutor, a arg4)
  {
    String str = a(parame, paramInt);
    Object localObject = (Typeface)a.c(str);
    if (localObject != null)
    {
      ???.b(new e((Typeface)localObject));
      return (Typeface)localObject;
    }
    localObject = new b(???);
    t.h localh;
    ArrayList localArrayList;
    synchronized (c)
    {
      localh = d;
      localArrayList = (ArrayList)localh.get(str);
      if (localArrayList != null)
      {
        localArrayList.add(localObject);
        return null;
      }
    }
  }
  
  public static Typeface e(final Context paramContext, final e parame, a parama, final int paramInt1, int paramInt2)
  {
    String str = a(parame, paramInt1);
    Typeface localTypeface = (Typeface)a.c(str);
    if (localTypeface != null)
    {
      parama.b(new e(localTypeface));
      return localTypeface;
    }
    if (paramInt2 == -1)
    {
      paramContext = c(str, paramContext, parame, paramInt1);
      parama.b(paramContext);
      return a;
    }
    paramContext = new a(str, paramContext, parame, paramInt1);
    try
    {
      paramContext = (e)h.c(b, paramContext, paramInt2);
      parama.b(paramContext);
      paramContext = a;
      return paramContext;
    }
    catch (InterruptedException paramContext)
    {
      parama.b(new e(-3));
    }
    return null;
  }
  
  public class a
    implements Callable
  {
    public a(Context paramContext, e parame, int paramInt) {}
    
    public f.e a()
    {
      return f.c(f.this, paramContext, parame, paramInt1);
    }
  }
  
  public class b
    implements H.a
  {
    public b() {}
    
    public void a(f.e parame)
    {
      f.e locale = parame;
      if (parame == null) {
        locale = new f.e(-3);
      }
      b(locale);
    }
  }
  
  public class c
    implements Callable
  {
    public c(Context paramContext, e parame, int paramInt) {}
    
    public f.e a()
    {
      try
      {
        f.e locale = f.c(f.this, paramContext, parame, paramInt);
        return locale;
      }
      finally {}
      return new f.e(-3);
    }
  }
  
  public class d
    implements H.a
  {
    public d() {}
    
    public void a(f.e parame)
    {
      t.h localh;
      ArrayList localArrayList;
      int i;
      synchronized (f.c)
      {
        localh = f.d;
        localArrayList = (ArrayList)localh.get(f.this);
        if (localArrayList == null) {
          return;
        }
      }
    }
  }
  
  public static final class e
  {
    public final Typeface a;
    public final int b;
    
    public e(int paramInt)
    {
      a = null;
      b = paramInt;
    }
    
    public e(Typeface paramTypeface)
    {
      a = paramTypeface;
      b = 0;
    }
    
    public boolean a()
    {
      boolean bool;
      if (b == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     F.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */