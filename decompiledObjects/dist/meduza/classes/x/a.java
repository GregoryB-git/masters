package x;

import android.graphics.Color;

public final class a
{
  static
  {
    new ThreadLocal();
  }
  
  public static int a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = (-0.4986D * paramDouble3 + (-1.5372D * paramDouble2 + 3.2406D * paramDouble1)) / 100.0D;
    double d2 = (0.0415D * paramDouble3 + (1.8758D * paramDouble2 + -0.9689D * paramDouble1)) / 100.0D;
    paramDouble3 = (1.057D * paramDouble3 + (-0.204D * paramDouble2 + 0.0557D * paramDouble1)) / 100.0D;
    if (d1 > 0.0031308D) {
      paramDouble1 = Math.pow(d1, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble1 = d1 * 12.92D;
    }
    if (d2 > 0.0031308D) {
      paramDouble2 = Math.pow(d2, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble2 = d2 * 12.92D;
    }
    if (paramDouble3 > 0.0031308D) {
      paramDouble3 = Math.pow(paramDouble3, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble3 *= 12.92D;
    }
    int i = (int)Math.round(paramDouble1 * 255.0D);
    int j = 0;
    if (i < 0) {
      i = 0;
    } else {
      i = Math.min(i, 255);
    }
    int k = (int)Math.round(paramDouble2 * 255.0D);
    if (k < 0) {
      k = 0;
    } else {
      k = Math.min(k, 255);
    }
    int m = (int)Math.round(paramDouble3 * 255.0D);
    if (m >= 0) {
      j = Math.min(m, 255);
    }
    return Color.rgb(i, k, j);
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = 255 - j;
    int m = 255 - (255 - i) * k / 255;
    int n = Color.red(paramInt1);
    int i1 = Color.red(paramInt2);
    int i2 = 0;
    if (m == 0) {
      n = 0;
    } else {
      n = (i1 * i * k + n * 255 * j) / (m * 255);
    }
    i1 = Color.green(paramInt1);
    int i3 = Color.green(paramInt2);
    if (m == 0) {
      i1 = 0;
    } else {
      i1 = (i3 * i * k + i1 * 255 * j) / (m * 255);
    }
    paramInt1 = Color.blue(paramInt1);
    paramInt2 = Color.blue(paramInt2);
    if (m == 0) {
      paramInt1 = i2;
    } else {
      paramInt1 = (paramInt2 * i * k + paramInt1 * 255 * j) / (m * 255);
    }
    return Color.argb(m, n, i1, paramInt1);
  }
}

/* Location:
 * Qualified Name:     x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */