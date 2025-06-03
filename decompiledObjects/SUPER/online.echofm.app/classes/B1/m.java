package B1;

import T1.a;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;

public final class m
  implements SensorEventListener
{
  public static final a b = new a(null);
  public b a;
  
  public final void a(b paramb)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      a = paramb;
      return;
    }
    finally
    {
      a.b(paramb, this);
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramSensor, "sensor");
      return;
    }
    finally
    {
      a.b(paramSensor, this);
    }
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramSensorEvent, "event");
      b localb = a;
      if (localb != null)
      {
        paramSensorEvent = values;
        float f1 = paramSensorEvent[0];
        float f2 = paramSensorEvent[1];
        float f3 = paramSensorEvent[2];
        double d1 = f1 / 9.80665F;
        double d2 = f2 / 9.80665F;
        double d3 = f3 / 9.80665F;
        if (Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3) > 2.3D) {
          localb.a();
        }
      }
    }
    finally
    {
      break label109;
    }
    return;
    label109:
    a.b(paramSensorEvent, this);
  }
  
  public static final class a {}
  
  public static abstract interface b
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     B1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */