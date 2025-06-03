package w;

import yc.b;

public final class l
{
  public static final l k;
  public final float a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final float f;
  public final float[] g;
  public final float h;
  public final float i;
  public final float j;
  
  static
  {
    float[] arrayOfFloat = b.d;
    float f1 = (float)(b.c() * 63.66197723675813D / 100.0D);
    Object localObject1 = b.b;
    float f2 = arrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f3 = localObject2[0];
    float f4 = arrayOfFloat[1];
    float f5 = localObject2[1];
    float f6 = arrayOfFloat[2];
    f3 = localObject2[2] * f6 + (f5 * f4 + f3 * f2);
    localObject2 = localObject1[1];
    f5 = localObject2[0];
    float f7 = localObject2[1];
    f5 = localObject2[2] * f6 + (f7 * f4 + f5 * f2);
    localObject1 = localObject1[2];
    float f8 = localObject1[0];
    f7 = localObject1[1];
    f2 = f6 * localObject1[2] + (f4 * f7 + f2 * f8);
    if (1.0F >= 0.9D) {
      f4 = 0.69F;
    } else {
      f4 = 0.655F;
    }
    f6 = (1.0F - (float)Math.exp((-f1 - 42.0F) / 92.0F) * 0.2777778F) * 1.0F;
    double d1 = f6;
    if (d1 > 1.0D) {
      f6 = 1.0F;
    } else if (d1 < 0.0D) {
      f6 = 0.0F;
    }
    localObject1 = new float[3];
    localObject1[0] = (100.0F / f3 * f6 + 1.0F - f6);
    localObject1[1] = (100.0F / f5 * f6 + 1.0F - f6);
    localObject1[2] = (100.0F / f2 * f6 + 1.0F - f6);
    f6 = 1.0F / (5.0F * f1 + 1.0F);
    f7 = f6 * f6 * f6 * f6;
    f6 = 1.0F - f7;
    f1 = 0.1F * f6 * f6 * (float)Math.cbrt(f1 * 5.0D) + f7 * f1;
    f7 = b.c() / arrayOfFloat[1];
    d1 = f7;
    f6 = (float)Math.sqrt(d1);
    f8 = 0.725F / (float)Math.pow(d1, 0.2D);
    arrayOfFloat = new float[3];
    arrayOfFloat[0] = ((float)Math.pow(localObject1[0] * f1 * f3 / 100.0D, 0.42D));
    arrayOfFloat[1] = ((float)Math.pow(localObject1[1] * f1 * f5 / 100.0D, 0.42D));
    f3 = (float)Math.pow(localObject1[2] * f1 * f2 / 100.0D, 0.42D);
    arrayOfFloat[2] = f3;
    f5 = arrayOfFloat[0];
    f5 = f5 * 400.0F / (f5 + 27.13F);
    f2 = arrayOfFloat[1];
    f2 = f2 * 400.0F / (f2 + 27.13F);
    k = new l(f7, (400.0F * f3 / (f3 + 27.13F) * 0.05F + (f5 * 2.0F + f2)) * f8, f8, f8, f4, 1.0F, (float[])localObject1, f1, (float)Math.pow(f1, 0.25D), f6 + 1.48F);
  }
  
  public l(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float[] paramArrayOfFloat, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    f = paramFloat1;
    a = paramFloat2;
    b = paramFloat3;
    c = paramFloat4;
    d = paramFloat5;
    e = paramFloat6;
    g = paramArrayOfFloat;
    h = paramFloat7;
    i = paramFloat8;
    j = paramFloat9;
  }
}

/* Location:
 * Qualified Name:     w.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */