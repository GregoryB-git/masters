package io.flutter.util;

import aa.v;
import aa.w;
import android.os.Build.VERSION;
import android.os.Trace;
import java.lang.reflect.Method;
import z1.a;

public final class TraceSection
  implements AutoCloseable
{
  private TraceSection(String paramString)
  {
    begin(paramString);
  }
  
  public static void begin(String paramString)
  {
    Trace.beginSection(a.c(cropSectionName(paramString)));
  }
  
  public static void beginAsyncSection(String paramString, int paramInt)
  {
    paramString = cropSectionName(paramString);
    int i = Build.VERSION.SDK_INT;
    paramString = a.c(paramString);
    if (i >= 29) {
      v.j(paramInt, paramString);
    } else {
      try
      {
        if (a.c == null) {
          a.c = Trace.class.getMethod("asyncTraceBegin", new Class[] { Long.TYPE, String.class, Integer.TYPE });
        }
        a.c.invoke(null, new Object[] { Long.valueOf(a.a), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        a.a("asyncTraceBegin", paramString);
      }
    }
  }
  
  private static String cropSectionName(String paramString)
  {
    if (paramString.length() >= 124)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString.substring(0, 124));
      localStringBuilder.append("...");
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
  
  public static void end() {}
  
  public static void endAsyncSection(String paramString, int paramInt)
  {
    paramString = cropSectionName(paramString);
    int i = Build.VERSION.SDK_INT;
    paramString = a.c(paramString);
    if (i >= 29) {
      w.i(paramInt, paramString);
    } else {
      try
      {
        if (a.d == null) {
          a.d = Trace.class.getMethod("asyncTraceEnd", new Class[] { Long.TYPE, String.class, Integer.TYPE });
        }
        a.d.invoke(null, new Object[] { Long.valueOf(a.a), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        a.a("asyncTraceEnd", paramString);
      }
    }
  }
  
  public static TraceSection scoped(String paramString)
  {
    return new TraceSection(paramString);
  }
  
  public void close() {}
}

/* Location:
 * Qualified Name:     io.flutter.util.TraceSection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */