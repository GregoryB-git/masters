package A;

import android.graphics.Color;

public abstract class a
{
  public static final ThreadLocal a = new ThreadLocal();
  
  public static int a(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d1 = (3.2406D * paramDouble1 + -1.5372D * paramDouble2 + -0.4986D * paramDouble3) / 100.0D;
    double d2 = (-0.9689D * paramDouble1 + 1.8758D * paramDouble2 + 0.0415D * paramDouble3) / 100.0D;
    paramDouble3 = (0.0557D * paramDouble1 + -0.204D * paramDouble2 + 1.057D * paramDouble3) / 100.0D;
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
    return Color.rgb(e((int)Math.round(paramDouble1 * 255.0D), 0, 255), e((int)Math.round(paramDouble2 * 255.0D), 0, 255), e((int)Math.round(paramDouble3 * 255.0D), 0, 255));
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return 255 - (255 - paramInt2) * (255 - paramInt1) / 255;
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = b(j, i);
    return Color.argb(k, d(Color.red(paramInt1), j, Color.red(paramInt2), i, k), d(Color.green(paramInt1), j, Color.green(paramInt2), i, k), d(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
  }
  
  public static int d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    return (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255);
  }
  
  public static int e(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= paramInt2) {
      paramInt2 = Math.min(paramInt1, paramInt3);
    }
    return paramInt2;
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    if ((paramInt2 >= 0) && (paramInt2 <= 255)) {
      return paramInt1 & 0xFFFFFF | paramInt2 << 24;
    }
    throw new IllegalArgumentException("alpha must be between 0 and 255.");
  }
}

/* Location:
 * Qualified Name:     A.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */