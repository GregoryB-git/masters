package z;

public final class l
{
  public static final l k = k(b.c, (float)(b.h(50.0F) * 63.66197723675813D / 100.0D), 50.0F, 2.0F, false);
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
  
  public static l k(float[] paramArrayOfFloat, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    Object localObject1 = b.a;
    float f1 = paramArrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f2 = localObject2[0];
    float f3 = paramArrayOfFloat[1];
    float f4 = localObject2[1];
    float f5 = paramArrayOfFloat[2];
    f4 = f2 * f1 + f4 * f3 + localObject2[2] * f5;
    localObject2 = localObject1[1];
    f2 = localObject2[0] * f1 + localObject2[1] * f3 + localObject2[2] * f5;
    localObject1 = localObject1[2];
    f1 = f1 * localObject1[0] + f3 * localObject1[1] + f5 * localObject1[2];
    f3 = paramFloat3 / 10.0F + 0.8F;
    if (f3 >= 0.9D) {}
    for (f5 = b.d(0.59F, 0.69F, (f3 - 0.9F) * 10.0F);; f5 = b.d(0.525F, 0.59F, (f3 - 0.8F) * 10.0F)) {
      break;
    }
    if (paramBoolean) {
      paramFloat3 = 1.0F;
    } else {
      paramFloat3 = (1.0F - (float)Math.exp((-paramFloat1 - 42.0F) / 92.0F) * 0.2777778F) * f3;
    }
    double d1 = paramFloat3;
    if (d1 > 1.0D) {
      paramFloat3 = 1.0F;
    } else if (d1 < 0.0D) {
      paramFloat3 = 0.0F;
    }
    float f6 = 100.0F / f4;
    float f7 = 100.0F / f2;
    float f8 = 100.0F / f1;
    localObject1 = new float[3];
    localObject1[0] = (f6 * paramFloat3 + 1.0F - paramFloat3);
    localObject1[1] = (f7 * paramFloat3 + 1.0F - paramFloat3);
    localObject1[2] = (f8 * paramFloat3 + 1.0F - paramFloat3);
    paramFloat3 = 1.0F / (5.0F * paramFloat1 + 1.0F);
    f6 = paramFloat3 * paramFloat3 * paramFloat3 * paramFloat3;
    paramFloat3 = 1.0F - f6;
    paramFloat1 = f6 * paramFloat1 + 0.1F * paramFloat3 * paramFloat3 * (float)Math.cbrt(paramFloat1 * 5.0D);
    paramFloat2 = b.h(paramFloat2) / paramArrayOfFloat[1];
    d1 = paramFloat2;
    paramFloat3 = (float)Math.sqrt(d1);
    f6 = 0.725F / (float)Math.pow(d1, 0.2D);
    f4 = (float)Math.pow(localObject1[0] * paramFloat1 * f4 / 100.0D, 0.42D);
    f2 = (float)Math.pow(localObject1[1] * paramFloat1 * f2 / 100.0D, 0.42D);
    f1 = (float)Math.pow(localObject1[2] * paramFloat1 * f1 / 100.0D, 0.42D);
    paramArrayOfFloat = new float[3];
    paramArrayOfFloat[0] = f4;
    paramArrayOfFloat[1] = f2;
    paramArrayOfFloat[2] = f1;
    f2 = paramArrayOfFloat[0];
    f2 = f2 * 400.0F / (f2 + 27.13F);
    f4 = paramArrayOfFloat[1];
    f4 = f4 * 400.0F / (f4 + 27.13F);
    f1 = paramArrayOfFloat[2];
    f1 = 400.0F * f1 / (f1 + 27.13F);
    paramArrayOfFloat = new float[3];
    paramArrayOfFloat[0] = f2;
    paramArrayOfFloat[1] = f4;
    paramArrayOfFloat[2] = f1;
    return new l(paramFloat2, (paramArrayOfFloat[0] * 2.0F + paramArrayOfFloat[1] + paramArrayOfFloat[2] * 0.05F) * f6, f6, f6, f5, f3, (float[])localObject1, paramFloat1, (float)Math.pow(paramFloat1, 0.25D), paramFloat3 + 1.48F);
  }
  
  public float a()
  {
    return a;
  }
  
  public float b()
  {
    return d;
  }
  
  public float c()
  {
    return h;
  }
  
  public float d()
  {
    return i;
  }
  
  public float e()
  {
    return f;
  }
  
  public float f()
  {
    return b;
  }
  
  public float g()
  {
    return e;
  }
  
  public float h()
  {
    return c;
  }
  
  public float[] i()
  {
    return g;
  }
  
  public float j()
  {
    return j;
  }
}

/* Location:
 * Qualified Name:     z.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */