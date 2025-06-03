package c0;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class a
{
  public static Method a;
  
  static
  {
    if (Build.VERSION.SDK_INT < 24) {
      try
      {
        a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] { Locale.class });
      }
      catch (Exception localException)
      {
        throw new IllegalStateException(localException);
      }
    }
  }
  
  public static String a(Locale paramLocale)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return b.c(b.a(b.b(paramLocale)));
    }
    try
    {
      String str = a.a((Locale)a.invoke(null, new Object[] { paramLocale }));
      return str;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InvocationTargetException localInvocationTargetException) {}
    Log.w("ICUCompat", localInvocationTargetException);
    return a.a(paramLocale);
  }
  
  public static final class a
  {
    public static String a(Locale paramLocale)
    {
      return paramLocale.getScript();
    }
  }
  
  public static final class b
  {
    public static ULocale a(Object paramObject)
    {
      return ULocale.addLikelySubtags((ULocale)paramObject);
    }
    
    public static ULocale b(Locale paramLocale)
    {
      return ULocale.forLocale(paramLocale);
    }
    
    public static String c(Object paramObject)
    {
      return ((ULocale)paramObject).getScript();
    }
  }
}

/* Location:
 * Qualified Name:     c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */