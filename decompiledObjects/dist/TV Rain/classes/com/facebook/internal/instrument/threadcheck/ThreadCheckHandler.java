package com.facebook.internal.instrument.threadcheck;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentData.Builder;
import com.facebook.internal.instrument.InstrumentData.Type;
import java.util.Locale;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ThreadCheckHandler
{
  private static final String TAG = "com.facebook.internal.instrument.threadcheck.ThreadCheckHandler";
  private static boolean enabled = false;
  
  public static void enable()
  {
    enabled = true;
  }
  
  private static void log(String paramString1, Class<?> paramClass, String paramString2, String paramString3)
  {
    if (!enabled) {
      return;
    }
    paramClass = String.format(Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", new Object[] { paramString1, paramClass.getName(), paramString2, paramString3, Looper.myLooper(), Looper.getMainLooper() });
    paramString1 = new Exception();
    Log.e(TAG, paramClass, paramString1);
    InstrumentData.Builder.build(paramString1, InstrumentData.Type.ThreadCheck).save();
  }
  
  public static void uiThreadViolationDetected(Class<?> paramClass, String paramString1, String paramString2)
  {
    log("@UiThread", paramClass, paramString1, paramString2);
  }
  
  public static void workerThreadViolationDetected(Class<?> paramClass, String paramString1, String paramString2)
  {
    log("@WorkerThread", paramClass, paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.threadcheck.ThreadCheckHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */