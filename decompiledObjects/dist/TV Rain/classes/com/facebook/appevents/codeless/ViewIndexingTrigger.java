package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

class ViewIndexingTrigger
  implements SensorEventListener
{
  private static final double SHAKE_THRESHOLD_GRAVITY = 2.299999952316284D;
  private OnShakeListener mListener;
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    CrashShieldHandler.isObjectCrashing(this);
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (mListener != null)
      {
        paramSensorEvent = values;
        float f1 = paramSensorEvent[0];
        float f2 = paramSensorEvent[1];
        float f3 = paramSensorEvent[2];
        double d1 = f1 / 9.80665F;
        double d2 = f2 / 9.80665F;
        double d3 = f3 / 9.80665F;
        if (Math.sqrt(d3 * d3 + (d2 * d2 + d1 * d1)) > 2.299999952316284D) {
          mListener.onShake();
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramSensorEvent, this);
    }
  }
  
  public void setOnShakeListener(OnShakeListener paramOnShakeListener)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      mListener = paramOnShakeListener;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramOnShakeListener, this);
    }
  }
  
  public static abstract interface OnShakeListener
  {
    public abstract void onShake();
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexingTrigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */