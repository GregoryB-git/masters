package x5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

public final class d
  implements SensorEventListener
{
  public final float[] a = new float[16];
  public final float[] b = new float[16];
  public final float[] c = new float[16];
  public final float[] d = new float[3];
  public final Display e;
  public final a[] f;
  public boolean g;
  
  public d(Display paramDisplay, a... paramVarArgs)
  {
    e = paramDisplay;
    f = paramVarArgs;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    SensorManager.getRotationMatrixFromVector(a, values);
    float[] arrayOfFloat = a;
    int i = e.getRotation();
    int j = 0;
    if (i != 0)
    {
      k = 130;
      m = 129;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            m = 1;
          } else {
            throw new IllegalStateException();
          }
        }
        else
        {
          m = 130;
          k = 129;
        }
      }
      else {
        k = 2;
      }
      paramSensorEvent = b;
      System.arraycopy(arrayOfFloat, 0, paramSensorEvent, 0, paramSensorEvent.length);
      SensorManager.remapCoordinateSystem(b, k, m, arrayOfFloat);
    }
    SensorManager.remapCoordinateSystem(a, 1, 131, b);
    SensorManager.getOrientation(b, d);
    float f1 = d[2];
    Matrix.rotateM(a, 0, 90.0F, 1.0F, 0.0F, 0.0F);
    paramSensorEvent = a;
    if (!g)
    {
      c.a(c, paramSensorEvent);
      g = true;
    }
    arrayOfFloat = b;
    System.arraycopy(paramSensorEvent, 0, arrayOfFloat, 0, arrayOfFloat.length);
    Matrix.multiplyMM(paramSensorEvent, 0, b, 0, c, 0);
    arrayOfFloat = a;
    paramSensorEvent = f;
    int m = paramSensorEvent.length;
    for (int k = j; k < m; k++) {
      paramSensorEvent[k].a(arrayOfFloat, f1);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(float[] paramArrayOfFloat, float paramFloat);
  }
}

/* Location:
 * Qualified Name:     x5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */