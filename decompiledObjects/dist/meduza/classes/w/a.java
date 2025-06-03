package w;

import android.graphics.Color;
import yc.b;

public final class a
{
  public final float a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final float f;
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    a = paramFloat1;
    b = paramFloat2;
    c = paramFloat3;
    d = paramFloat4;
    e = paramFloat5;
    f = paramFloat6;
  }
  
  public static a a(int paramInt)
  {
    l locall = l.k;
    float f1 = b.b(Color.red(paramInt));
    float f2 = b.b(Color.green(paramInt));
    float f3 = b.b(Color.blue(paramInt));
    Object localObject1 = b.e;
    Object localObject2 = localObject1[0];
    float f4 = localObject2[0];
    float f5 = localObject2[1];
    f5 = localObject2[2] * f3 + (f5 * f2 + f4 * f1);
    localObject2 = localObject1[1];
    float f6 = localObject2[0];
    f4 = localObject2[1];
    f4 = localObject2[2] * f3 + (f4 * f2 + f6 * f1);
    localObject1 = localObject1[2];
    f6 = localObject1[0];
    float f7 = localObject1[1];
    f6 = f3 * localObject1[2] + (f2 * f7 + f1 * f6);
    localObject1 = b.b;
    localObject2 = localObject1[0];
    f1 = localObject2[0];
    float f8 = localObject2[1];
    float f9 = localObject2[2];
    localObject2 = localObject1[1];
    float f10 = localObject2[0];
    f3 = localObject2[1];
    float f11 = localObject2[2];
    localObject1 = localObject1[2];
    float f12 = localObject1[0];
    f7 = localObject1[1];
    f2 = localObject1[2];
    localObject1 = g;
    f1 = localObject1[0] * (f9 * f6 + (f8 * f4 + f1 * f5));
    f3 = localObject1[1] * (f11 * f6 + (f3 * f4 + f10 * f5));
    f4 = localObject1[2] * (f6 * f2 + (f4 * f7 + f5 * f12));
    f5 = h;
    f5 = (float)Math.pow(Math.abs(f1) * f5 / 100.0D, 0.42D);
    f2 = h;
    f2 = (float)Math.pow(Math.abs(f3) * f2 / 100.0D, 0.42D);
    f6 = h;
    f6 = (float)Math.pow(Math.abs(f4) * f6 / 100.0D, 0.42D);
    f5 = Math.signum(f1) * 400.0F * f5 / (f5 + 27.13F);
    f2 = Math.signum(f3) * 400.0F * f2 / (f2 + 27.13F);
    f4 = Math.signum(f4) * 400.0F * f6 / (f6 + 27.13F);
    double d1 = f5;
    double d2 = f2;
    double d3 = f4;
    f3 = (float)(d2 * -12.0D + d1 * 11.0D + d3) / 11.0F;
    f1 = (float)(f5 + f2 - d3 * 2.0D) / 9.0F;
    f6 = f2 * 20.0F;
    f2 = (21.0F * f4 + (f5 * 20.0F + f6)) / 20.0F;
    f7 = (f5 * 40.0F + f6 + f4) / 20.0F;
    f4 = (float)Math.atan2(f1, f3) * 180.0F / 3.1415927F;
    if (f4 < 0.0F)
    {
      f5 = f4 + 360.0F;
    }
    else
    {
      f5 = f4;
      if (f4 >= 360.0F) {
        f5 = f4 - 360.0F;
      }
    }
    f6 = 3.1415927F * f5 / 180.0F;
    f7 = (float)Math.pow(f7 * b / a, d * j) * 100.0F;
    Math.sqrt(f7 / 100.0F);
    if (f5 < 20.14D) {
      f4 = 360.0F + f5;
    } else {
      f4 = f5;
    }
    f4 = (float)(Math.cos(f4 * 3.141592653589793D / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F * e * c * (float)Math.sqrt(f1 * f1 + f3 * f3) / (f2 + 0.305F);
    f3 = (float)Math.pow(1.64D - Math.pow(0.29D, f), 0.73D) * (float)Math.pow(f4, 0.9D);
    f4 = (float)Math.sqrt(f7 / 100.0D) * f3;
    f1 = i;
    Math.sqrt(f3 * d / (a + 4.0F));
    f3 = 1.7F * f7 / (0.007F * f7 + 1.0F);
    f1 = (float)Math.log(f1 * f4 * 0.0228F + 1.0F) * 43.85965F;
    d2 = f6;
    return new a(f5, f4, f7, f3, (float)Math.cos(d2) * f1, f1 * (float)Math.sin(d2));
  }
  
  public static a b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    l locall = l.k;
    float f1 = d;
    double d1 = paramFloat1 / 100.0D;
    Math.sqrt(d1);
    float f2 = i;
    Math.sqrt(paramFloat2 / (float)Math.sqrt(d1) * d / (a + 4.0F));
    float f3 = 3.1415927F * paramFloat3 / 180.0F;
    f1 = 1.7F * paramFloat1 / (0.007F * paramFloat1 + 1.0F);
    f2 = (float)Math.log(f2 * paramFloat2 * 0.0228D + 1.0D) * 43.85965F;
    d1 = f3;
    return new a(paramFloat3, paramFloat2, paramFloat1, f1, f2 * (float)Math.cos(d1), f2 * (float)Math.sin(d1));
  }
  
  public final int c(l paraml)
  {
    float f1 = b;
    if (f1 != 0.0D)
    {
      d1 = c;
      if (d1 != 0.0D)
      {
        f1 /= (float)Math.sqrt(d1 / 100.0D);
        break label44;
      }
    }
    f1 = 0.0F;
    label44:
    float f2 = (float)Math.pow(f1 / Math.pow(1.64D - Math.pow(0.29D, f), 0.73D), 1.1111111111111112D);
    double d1 = a * 3.1415927F / 180.0F;
    float f3 = (float)(Math.cos(2.0D + d1) + 3.8D);
    float f4 = a;
    f1 = (float)Math.pow(c / 100.0D, 1.0D / d / j);
    float f5 = e;
    float f6 = c;
    f1 = f4 * f1 / b;
    f4 = (float)Math.sin(d1);
    float f7 = (float)Math.cos(d1);
    f2 = (0.305F + f1) * 23.0F * f2 / (f2 * 108.0F * f4 + (11.0F * f2 * f7 + f3 * 0.25F * 3846.1538F * f5 * f6 * 23.0F));
    f3 = f7 * f2;
    f2 *= f4;
    f4 = f1 * 460.0F;
    f1 = (288.0F * f2 + (451.0F * f3 + f4)) / 1403.0F;
    f6 = (f4 - 891.0F * f3 - 261.0F * f2) / 1403.0F;
    f5 = (f4 - f3 * 220.0F - f2 * 6300.0F) / 1403.0F;
    f2 = (float)Math.max(0.0D, Math.abs(f1) * 27.13D / (400.0D - Math.abs(f1)));
    f1 = Math.signum(f1);
    f3 = 100.0F / h;
    f2 = (float)Math.pow(f2, 2.380952380952381D);
    f7 = (float)Math.max(0.0D, Math.abs(f6) * 27.13D / (400.0D - Math.abs(f6)));
    f4 = Math.signum(f6);
    f6 = 100.0F / h;
    f7 = (float)Math.pow(f7, 2.380952380952381D);
    float f8 = (float)Math.max(0.0D, Math.abs(f5) * 27.13D / (400.0D - Math.abs(f5)));
    float f9 = Math.signum(f5);
    f5 = 100.0F / h;
    f8 = (float)Math.pow(f8, 2.380952380952381D);
    paraml = g;
    f1 = f3 * f1 * f2 / paraml[0];
    f3 = f6 * f4 * f7 / paraml[1];
    f4 = f5 * f9 * f8 / paraml[2];
    paraml = b.c;
    Object localObject = paraml[0];
    f6 = localObject[0];
    f5 = localObject[1];
    float f10 = localObject[2];
    localObject = paraml[1];
    f9 = localObject[0];
    f8 = localObject[1];
    f2 = localObject[2];
    paraml = paraml[2];
    float f11 = paraml[0];
    f7 = paraml[1];
    float f12 = paraml[2];
    return x.a.a(f10 * f4 + (f5 * f3 + f6 * f1), f2 * f4 + (f8 * f3 + f9 * f1), f4 * f12 + (f3 * f7 + f1 * f11));
  }
}

/* Location:
 * Qualified Name:     w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */