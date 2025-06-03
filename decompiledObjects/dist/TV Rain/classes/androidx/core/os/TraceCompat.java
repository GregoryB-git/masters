package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o3;

@Deprecated
public final class TraceCompat
{
  private static final String TAG = "TraceCompat";
  private static Method sAsyncTraceBeginMethod;
  private static Method sAsyncTraceEndMethod;
  private static Method sIsTagEnabledMethod;
  private static Method sTraceCounterMethod;
  private static long sTraceTagApp;
  
  static
  {
    if (Build.VERSION.SDK_INT < 29) {
      try
      {
        sTraceTagApp = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Class localClass1 = Long.TYPE;
        sIsTagEnabledMethod = Trace.class.getMethod("isTagEnabled", new Class[] { localClass1 });
        Class localClass2 = Integer.TYPE;
        sAsyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", new Class[] { localClass1, String.class, localClass2 });
        sAsyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", new Class[] { localClass1, String.class, localClass2 });
        sTraceCounterMethod = Trace.class.getMethod("traceCounter", new Class[] { localClass1, String.class, localClass2 });
      }
      catch (Exception localException)
      {
        Log.i("TraceCompat", "Unable to initialize via reflection.", localException);
      }
    }
  }
  
  public static void beginAsyncSection(@NonNull String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.beginAsyncSection(paramString, paramInt);
    } else {
      try
      {
        sAsyncTraceBeginMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        Log.v("TraceCompat", "Unable to invoke asyncTraceBegin() via reflection.");
      }
    }
  }
  
  public static void beginSection(@NonNull String paramString)
  {
    Api18Impl.beginSection(paramString);
  }
  
  public static void endAsyncSection(@NonNull String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.endAsyncSection(paramString, paramInt);
    } else {
      try
      {
        sAsyncTraceEndMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        Log.v("TraceCompat", "Unable to invoke endAsyncSection() via reflection.");
      }
    }
  }
  
  public static void endSection() {}
  
  public static boolean isEnabled()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Api29Impl.isEnabled();
    }
    try
    {
      boolean bool = ((Boolean)sIsTagEnabledMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp) })).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
    }
    return false;
  }
  
  public static void setCounter(@NonNull String paramString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Api29Impl.setCounter(paramString, paramInt);
    } else {
      try
      {
        sTraceCounterMethod.invoke(null, new Object[] { Long.valueOf(sTraceTagApp), paramString, Integer.valueOf(paramInt) });
      }
      catch (Exception paramString)
      {
        Log.v("TraceCompat", "Unable to invoke traceCounter() via reflection.");
      }
    }
  }
  
  @RequiresApi(18)
  public static class Api18Impl
  {
    @DoNotInline
    public static void beginSection(String paramString)
    {
      Trace.beginSection(paramString);
    }
    
    @DoNotInline
    public static void endSection() {}
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void beginAsyncSection(String paramString, int paramInt)
    {
      o3.z(paramString, paramInt);
    }
    
    @DoNotInline
    public static void endAsyncSection(String paramString, int paramInt)
    {
      o3.D(paramString, paramInt);
    }
    
    @DoNotInline
    public static boolean isEnabled()
    {
      return o3.B();
    }
    
    @DoNotInline
    public static void setCounter(String paramString, long paramLong)
    {
      o3.A(paramString, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.TraceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */