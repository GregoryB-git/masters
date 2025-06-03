package z1;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a
{
  public static long a;
  public static Method b;
  public static Method c;
  public static Method d;
  
  public static void a(String paramString, Exception paramException)
  {
    if ((paramException instanceof InvocationTargetException))
    {
      paramString = paramException.getCause();
      if ((paramString instanceof RuntimeException)) {
        throw ((RuntimeException)paramString);
      }
      throw new RuntimeException(paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unable to call ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" via reflection");
    Log.v("Trace", localStringBuilder.toString(), paramException);
  }
  
  public static boolean b()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return b.a();
    }
    boolean bool1 = false;
    try
    {
      if (b == null)
      {
        a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        b = Trace.class.getMethod("isTagEnabled", new Class[] { Long.TYPE });
      }
      boolean bool2 = ((Boolean)b.invoke(null, new Object[] { Long.valueOf(a) })).booleanValue();
      bool1 = bool2;
    }
    catch (Exception localException)
    {
      a("isTagEnabled", localException);
    }
    return bool1;
  }
  
  public static String c(String paramString)
  {
    if (paramString.length() <= 127) {
      return paramString;
    }
    return paramString.substring(0, 127);
  }
}

/* Location:
 * Qualified Name:     z1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */