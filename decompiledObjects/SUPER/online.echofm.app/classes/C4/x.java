package C4;

import F4.a;
import M4.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.e;

public class x
{
  public static final a c = ;
  public static x d;
  public volatile SharedPreferences a;
  public final ExecutorService b;
  
  public x(ExecutorService paramExecutorService)
  {
    b = paramExecutorService;
  }
  
  public static x f()
  {
    try
    {
      if (d == null)
      {
        x localx1 = new C4/x;
        localx1.<init>(Executors.newSingleThreadExecutor());
        d = localx1;
      }
    }
    finally
    {
      break label40;
    }
    x localx2 = d;
    return localx2;
    label40:
    throw localx2;
  }
  
  public void b(String paramString)
  {
    if (paramString == null)
    {
      c.a("Key is null. Cannot clear nullable key");
      return;
    }
    a.edit().remove(paramString).apply();
  }
  
  public g c(String paramString)
  {
    if (paramString == null) {
      c.a("Key is null when getting boolean value on device cache.");
    }
    for (;;)
    {
      return g.a();
      if (a == null)
      {
        j(e());
        if (a == null) {
          return g.a();
        }
      }
      if (!a.contains(paramString)) {
        return g.a();
      }
      try
      {
        g localg = g.e(Boolean.valueOf(a.getBoolean(paramString, false)));
        return localg;
      }
      catch (ClassCastException localClassCastException)
      {
        c.b("Key %s from sharedPreferences has type other than long: %s", new Object[] { paramString, localClassCastException.getMessage() });
      }
    }
  }
  
  public g d(String paramString)
  {
    if (paramString == null) {
      c.a("Key is null when getting double value on device cache.");
    }
    for (;;)
    {
      return g.a();
      if (a == null)
      {
        j(e());
        if (a == null) {
          return g.a();
        }
      }
      if (!a.contains(paramString)) {
        return g.a();
      }
      try
      {
        g localg1 = g.e(Double.valueOf(Double.longBitsToDouble(a.getLong(paramString, 0L))));
        return localg1;
      }
      catch (ClassCastException localClassCastException1)
      {
        try
        {
          g localg2 = g.e(Double.valueOf(Float.valueOf(a.getFloat(paramString, 0.0F)).doubleValue()));
          return localg2;
        }
        catch (ClassCastException localClassCastException2)
        {
          c.b("Key %s from sharedPreferences has type other than double: %s", new Object[] { paramString, localClassCastException2.getMessage() });
        }
      }
    }
  }
  
  public final Context e()
  {
    try
    {
      e.o();
      return e.o().m();
    }
    catch (IllegalStateException localIllegalStateException) {}
    return null;
  }
  
  public g g(String paramString)
  {
    if (paramString == null) {
      c.a("Key is null when getting long value on device cache.");
    }
    for (;;)
    {
      return g.a();
      if (a == null)
      {
        j(e());
        if (a == null) {
          return g.a();
        }
      }
      if (!a.contains(paramString)) {
        return g.a();
      }
      try
      {
        g localg = g.e(Long.valueOf(a.getLong(paramString, 0L)));
        return localg;
      }
      catch (ClassCastException localClassCastException)
      {
        c.b("Key %s from sharedPreferences has type other than long: %s", new Object[] { paramString, localClassCastException.getMessage() });
      }
    }
  }
  
  public g h(String paramString)
  {
    if (paramString == null) {
      c.a("Key is null when getting String value on device cache.");
    }
    for (;;)
    {
      return g.a();
      if (a == null)
      {
        j(e());
        if (a == null) {
          return g.a();
        }
      }
      if (!a.contains(paramString)) {
        return g.a();
      }
      try
      {
        g localg = g.e(a.getString(paramString, ""));
        return localg;
      }
      catch (ClassCastException localClassCastException)
      {
        c.b("Key %s from sharedPreferences has type other than String: %s", new Object[] { paramString, localClassCastException.getMessage() });
      }
    }
  }
  
  public void j(Context paramContext)
  {
    try
    {
      if ((a == null) && (paramContext != null))
      {
        ExecutorService localExecutorService = b;
        w localw = new C4/w;
        localw.<init>(this, paramContext);
        localExecutorService.execute(localw);
      }
    }
    finally
    {
      break label45;
    }
    return;
    label45:
    throw paramContext;
  }
  
  public boolean k(String paramString, double paramDouble)
  {
    if (paramString == null)
    {
      c.a("Key is null when setting double value on device cache.");
      return false;
    }
    if (a == null)
    {
      j(e());
      if (a == null) {
        return false;
      }
    }
    a.edit().putLong(paramString, Double.doubleToRawLongBits(paramDouble)).apply();
    return true;
  }
  
  public boolean l(String paramString, long paramLong)
  {
    if (paramString == null)
    {
      c.a("Key is null when setting long value on device cache.");
      return false;
    }
    if (a == null)
    {
      j(e());
      if (a == null) {
        return false;
      }
    }
    a.edit().putLong(paramString, paramLong).apply();
    return true;
  }
  
  public boolean m(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      c.a("Key is null when setting String value on device cache.");
      return false;
    }
    if (a == null)
    {
      j(e());
      if (a == null) {
        return false;
      }
    }
    if (paramString2 == null)
    {
      a.edit().remove(paramString1).apply();
      return true;
    }
    a.edit().putString(paramString1, paramString2).apply();
    return true;
  }
  
  public boolean n(String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      c.a("Key is null when setting boolean value on device cache.");
      return false;
    }
    if (a == null)
    {
      j(e());
      if (a == null) {
        return false;
      }
    }
    a.edit().putBoolean(paramString, paramBoolean).apply();
    return true;
  }
}

/* Location:
 * Qualified Name:     C4.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */