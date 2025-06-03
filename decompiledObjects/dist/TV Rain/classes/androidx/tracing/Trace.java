package androidx.tracing;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o3;

public final class Trace
{
  public static final String TAG = "Trace";
  private static Method sAsyncTraceBeginMethod;
  private static Method sAsyncTraceEndMethod;
  private static Method sIsTagEnabledMethod;
  private static Method sTraceCounterMethod;
  private static long sTraceTagApp;
  
  @SuppressLint({"NewApi"})
  public static void beginAsyncSection(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceBeginMethod == null)
      {
        TraceApi29Impl.beginAsyncSection(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    beginAsyncSectionFallback(paramString, paramInt);
  }
  
  private static void beginAsyncSectionFallback(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceBeginMethod == null) {
        sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", new Class[] { Long.TYPE, String.class, Integer.TYPE });
      }
      sAsyncTraceBeginMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
    }
    catch (Exception paramString)
    {
      handleException("asyncTraceBegin", paramString);
    }
  }
  
  public static void beginSection(@NonNull String paramString)
  {
    TraceApi18Impl.beginSection(paramString);
  }
  
  @SuppressLint({"NewApi"})
  public static void endAsyncSection(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceEndMethod == null)
      {
        TraceApi29Impl.endAsyncSection(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    endAsyncSectionFallback(paramString, paramInt);
  }
  
  private static void endAsyncSectionFallback(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sAsyncTraceEndMethod == null) {
        sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", new Class[] { Long.TYPE, String.class, Integer.TYPE });
      }
      sAsyncTraceEndMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
    }
    catch (Exception paramString)
    {
      handleException("asyncTraceEnd", paramString);
    }
  }
  
  public static void endSection() {}
  
  private static void handleException(@NonNull String paramString, @NonNull Exception paramException)
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
  
  @SuppressLint({"NewApi"})
  public static boolean isEnabled()
  {
    try
    {
      if (sIsTagEnabledMethod == null)
      {
        boolean bool = o3.B();
        return bool;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    return isEnabledFallback();
  }
  
  private static boolean isEnabledFallback()
  {
    try
    {
      if (sIsTagEnabledMethod == null)
      {
        sTraceTagApp = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
        sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", new Class[] { Long.TYPE });
      }
      boolean bool = ((Boolean)sIsTagEnabledMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp) })).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      handleException("isTagEnabled", localException);
    }
    return false;
  }
  
  @SuppressLint({"NewApi"})
  public static void setCounter(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sTraceCounterMethod == null)
      {
        TraceApi29Impl.setCounter(paramString, paramInt);
        return;
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError)
    {
      for (;;) {}
    }
    setCounterFallback(paramString, paramInt);
  }
  
  private static void setCounterFallback(@NonNull String paramString, int paramInt)
  {
    try
    {
      if (sTraceCounterMethod == null) {
        sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", new Class[] { Long.TYPE, String.class, Integer.TYPE });
      }
      sTraceCounterMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
    }
    catch (Exception paramString)
    {
      handleException("traceCounter", paramString);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.tracing.Trace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */