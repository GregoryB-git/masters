package o3;

import android.os.Build.VERSION;
import android.util.Log;
import g;

public final class a
{
  public static void a(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = c(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
  
  public static void b(String paramString1, String paramString2, Exception paramException)
  {
    paramString1 = c(paramString1);
    if (Log.isLoggable(paramString1, 6)) {
      Log.e(paramString1, paramString2, paramException);
    }
  }
  
  public static String c(String paramString)
  {
    if (Build.VERSION.SDK_INT < 26)
    {
      String str = g.d("TRuntime.", paramString);
      paramString = str;
      if (str.length() > 23) {
        paramString = str.substring(0, 23);
      }
      return paramString;
    }
    return g.d("TRuntime.", paramString);
  }
}

/* Location:
 * Qualified Name:     o3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */