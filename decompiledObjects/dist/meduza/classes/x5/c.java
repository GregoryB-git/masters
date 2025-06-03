package x5;

import android.opengl.Matrix;
import v5.b0;

public final class c
{
  public final float[] a = new float[16];
  public final float[] b = new float[16];
  public final b0<float[]> c = new b0();
  public boolean d;
  
  public static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    Matrix.setIdentityM(paramArrayOfFloat1, 0);
    float f1 = paramArrayOfFloat2[10];
    float f2 = paramArrayOfFloat2[8];
    f2 = (float)Math.sqrt(f2 * f2 + f1 * f1);
    float f3 = paramArrayOfFloat2[10];
    paramArrayOfFloat1[0] = (f3 / f2);
    f1 = paramArrayOfFloat2[8];
    paramArrayOfFloat1[2] = (f1 / f2);
    paramArrayOfFloat1[8] = (-f1 / f2);
    paramArrayOfFloat1[10] = (f3 / f2);
  }
}

/* Location:
 * Qualified Name:     x5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */