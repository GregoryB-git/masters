package t1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class b
{
  public static long a;
  public static Method b;
  public static Method c;
  public static Method d;
  
  public static void a(String paramString, int paramInt)
  {
    try
    {
      if (c == null)
      {
        d.a(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    b(paramString, paramInt);
  }
  
  public static void b(String paramString, int paramInt)
  {
    try
    {
      if (c == null) {
        c = Trace.class.getMethod("asyncTraceBegin", new Class[] { Long.TYPE, String.class, Integer.TYPE });
      }
    }
    catch (Exception paramString)
    {
      break label79;
    }
    c.invoke(null, new Object[] { Long.valueOf(a), paramString, Integer.valueOf(paramInt) });
    return;
    label79:
    g("asyncTraceBegin", paramString);
  }
  
  public static void c(String paramString)
  {
    c.a(paramString);
  }
  
  public static void d(String paramString, int paramInt)
  {
    try
    {
      if (d == null)
      {
        d.b(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    e(paramString, paramInt);
  }
  
  public static void e(String paramString, int paramInt)
  {
    try
    {
      if (d == null) {
        d = Trace.class.getMethod("asyncTraceEnd", new Class[] { Long.TYPE, String.class, Integer.TYPE });
      }
    }
    catch (Exception paramString)
    {
      break label79;
    }
    d.invoke(null, new Object[] { Long.valueOf(a), paramString, Integer.valueOf(paramInt) });
    return;
    label79:
    g("asyncTraceEnd", paramString);
  }
  
  public static void f() {}
  
  public static void g(String paramString, Exception paramException)
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
  
  public static boolean h()
  {
    try
    {
      if (b == null)
      {
        boolean bool = a.a();
        return bool;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    return i();
  }
  
  public static boolean i()
  {
    try
    {
      if (b == null)
      {
        a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        b = Trace.class.getMethod("isTagEnabled", new Class[] { Long.TYPE });
      }
    }
    catch (Exception localException)
    {
      break label76;
    }
    boolean bool = ((Boolean)b.invoke(null, new Object[] { Long.valueOf(a) })).booleanValue();
    return bool;
    label76:
    g("isTagEnabled", localException);
    return false;
  }
}

/* Location:
 * Qualified Name:     t1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */