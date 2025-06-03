package com.facebook.internal.instrument.crashshield;

import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentData.Builder;
import com.facebook.internal.instrument.InstrumentData.Type;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class CrashShieldHandler
{
  private static boolean enabled = false;
  private static final Set<Object> sCrashingObjects = Collections.newSetFromMap(new WeakHashMap());
  
  public static void enable()
  {
    enabled = true;
  }
  
  public static void handleThrowable(Throwable paramThrowable, Object paramObject)
  {
    if (!enabled) {
      return;
    }
    sCrashingObjects.add(paramObject);
    if (FacebookSdk.getAutoLogAppEventsEnabled())
    {
      ExceptionAnalyzer.execute(paramThrowable);
      InstrumentData.Builder.build(paramThrowable, InstrumentData.Type.CrashShield).save();
    }
    scheduleCrashInDebug(paramThrowable);
  }
  
  public static boolean isObjectCrashing(Object paramObject)
  {
    return sCrashingObjects.contains(paramObject);
  }
  
  public static void methodFinished(Object paramObject) {}
  
  public static void reset() {}
  
  public static void resetCrashingObjects()
  {
    sCrashingObjects.clear();
  }
  
  private static void scheduleCrashInDebug(Throwable paramThrowable) {}
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.crashshield.CrashShieldHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */