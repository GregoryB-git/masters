package z;

public class a
{
  public final float a;
  public final float b;
  public final float c;
  public final float d;
  public final float e;
  public final float f;
  public final float g;
  public final float h;
  public final float i;
  
  public a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    a = paramFloat1;
    b = paramFloat2;
    c = paramFloat3;
    d = paramFloat4;
    e = paramFloat5;
    f = paramFloat6;
    g = paramFloat7;
    h = paramFloat8;
    i = paramFloat9;
  }
  
  public static a b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 100.0F;
    float f2 = 1000.0F;
    float f3 = 0.0F;
    Object localObject1 = null;
    float f4 = 1000.0F;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (Math.abs(f3 - f1) <= 0.01F) {
        break;
      }
      float f5 = (f1 - f3) / 2.0F + f3;
      int j = e(f5, paramFloat2, paramFloat1).p();
      float f6 = b.b(j);
      float f7 = Math.abs(paramFloat3 - f6);
      float f8 = f2;
      float f9 = f4;
      localObject2 = localObject1;
      if (f7 < 0.2F)
      {
        a locala = c(j);
        float f10 = locala.a(e(locala.k(), locala.i(), paramFloat1));
        f8 = f2;
        f9 = f4;
        localObject2 = localObject1;
        if (f10 <= 1.0F)
        {
          localObject2 = locala;
          f8 = f7;
          f9 = f10;
        }
      }
      if ((f8 == 0.0F) && (f9 == 0.0F)) {
        break;
      }
      if (f6 < paramFloat3)
      {
        f3 = f5;
        f2 = f8;
        f4 = f9;
        localObject1 = localObject2;
      }
      else
      {
        f1 = f5;
        f2 = f8;
        f4 = f9;
        localObject1 = localObject2;
      }
    }
    return (a)localObject2;
  }
  
  public static a c(int paramInt)
  {
    return d(paramInt, l.k);
  }
  
  public static a d(int paramInt, l paraml)
  {
    float[] arrayOfFloat = b.f(paramInt);
    Object localObject1 = b.a;
    float f1 = arrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f2 = localObject2[0];
    float f3 = arrayOfFloat[1];
    float f4 = localObject2[1];
    float f5 = arrayOfFloat[2];
    float f6 = localObject2[2];
    arrayOfFloat = localObject1[1];
    float f7 = arrayOfFloat[0];
    float f8 = arrayOfFloat[1];
    float f9 = arrayOfFloat[2];
    localObject1 = localObject1[2];
    float f10 = localObject1[0];
    float f11 = localObject1[1];
    float f12 = localObject1[2];
    f6 = paraml.i()[0] * (f2 * f1 + f4 * f3 + f6 * f5);
    f7 = paraml.i()[1] * (f7 * f1 + f8 * f3 + f9 * f5);
    f1 = paraml.i()[2] * (f1 * f10 + f3 * f11 + f5 * f12);
    f11 = (float)Math.pow(paraml.c() * Math.abs(f6) / 100.0D, 0.42D);
    f3 = (float)Math.pow(paraml.c() * Math.abs(f7) / 100.0D, 0.42D);
    f5 = (float)Math.pow(paraml.c() * Math.abs(f1) / 100.0D, 0.42D);
    f6 = Math.signum(f6) * 400.0F * f11 / (f11 + 27.13F);
    f12 = Math.signum(f7) * 400.0F * f3 / (f3 + 27.13F);
    f5 = Math.signum(f1) * 400.0F * f5 / (f5 + 27.13F);
    double d1 = f6;
    double d2 = f12;
    double d3 = f5;
    f3 = (float)(d1 * 11.0D + d2 * -12.0D + d3) / 11.0F;
    f11 = (float)(f6 + f12 - d3 * 2.0D) / 9.0F;
    f1 = f12 * 20.0F;
    f12 = (f6 * 20.0F + f1 + 21.0F * f5) / 20.0F;
    f10 = (f6 * 40.0F + f1 + f5) / 20.0F;
    f5 = (float)Math.atan2(f11, f3) * 180.0F / 3.1415927F;
    if (f5 < 0.0F) {
      f6 = f5 + 360.0F;
    }
    for (;;)
    {
      break;
      f6 = f5;
      if (f5 >= 360.0F) {
        f6 = f5 - 360.0F;
      }
    }
    f1 = 3.1415927F * f6 / 180.0F;
    f9 = (float)Math.pow(f10 * paraml.f() / paraml.a(), paraml.b() * paraml.j()) * 100.0F;
    f8 = 4.0F / paraml.b();
    f7 = (float)Math.sqrt(f9 / 100.0F);
    f10 = paraml.a();
    f2 = paraml.d();
    if (f6 < 20.14D) {
      f5 = 360.0F + f6;
    } else {
      f5 = f6;
    }
    f5 = (float)(Math.cos(f5 * 3.141592653589793D / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F * paraml.g() * paraml.h() * (float)Math.sqrt(f3 * f3 + f11 * f11) / (f12 + 0.305F);
    f11 = (float)Math.pow(1.64D - Math.pow(0.29D, paraml.e()), 0.73D) * (float)Math.pow(f5, 0.9D);
    f3 = f11 * (float)Math.sqrt(f9 / 100.0D);
    f5 = f3 * paraml.d();
    f12 = (float)Math.sqrt(f11 * paraml.b() / (paraml.a() + 4.0F));
    f11 = 1.7F * f9 / (0.007F * f9 + 1.0F);
    f4 = (float)Math.log(0.0228F * f5 + 1.0F) * 43.85965F;
    d1 = f1;
    return new a(f6, f3, f9, f2 * (f8 * f7 * (f10 + 4.0F)), f5, f12 * 50.0F, f11, f4 * (float)Math.cos(d1), f4 * (float)Math.sin(d1));
  }
  
  public static a e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return f(paramFloat1, paramFloat2, paramFloat3, l.k);
  }
  
  public static a f(float paramFloat1, float paramFloat2, float paramFloat3, l paraml)
  {
    float f1 = 4.0F / paraml.b();
    double d1 = paramFloat1 / 100.0D;
    float f2 = (float)Math.sqrt(d1);
    float f3 = paraml.a();
    float f4 = paraml.d();
    float f5 = paramFloat2 * paraml.d();
    float f6 = (float)Math.sqrt(paramFloat2 / (float)Math.sqrt(d1) * paraml.b() / (paraml.a() + 4.0F));
    float f7 = 3.1415927F * paramFloat3 / 180.0F;
    float f8 = 1.7F * paramFloat1 / (0.007F * paramFloat1 + 1.0F);
    float f9 = (float)Math.log(f5 * 0.0228D + 1.0D) * 43.85965F;
    d1 = f7;
    return new a(paramFloat3, paramFloat2, paramFloat1, f1 * f2 * (f3 + 4.0F) * f4, f5, f6 * 50.0F, f8, f9 * (float)Math.cos(d1), f9 * (float)Math.sin(d1));
  }
  
  public static int m(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return n(paramFloat1, paramFloat2, paramFloat3, l.k);
  }
  
  public static int n(float paramFloat1, float paramFloat2, float paramFloat3, l paraml)
  {
    if ((paramFloat2 >= 1.0D) && (Math.round(paramFloat3) > 0.0D) && (Math.round(paramFloat3) < 100.0D))
    {
      float f1;
      if (paramFloat1 < 0.0F) {
        f1 = 0.0F;
      } else {
        f1 = Math.min(360.0F, paramFloat1);
      }
      Object localObject = null;
      int j = 1;
      float f2 = 0.0F;
      paramFloat1 = paramFloat2;
      float f3 = paramFloat2;
      paramFloat2 = f2;
      while (Math.abs(paramFloat2 - f3) >= 0.4F)
      {
        a locala = b(f1, paramFloat1, paramFloat3);
        if (j != 0)
        {
          if (locala != null) {
            return locala.o(paraml);
          }
          paramFloat1 = (f3 - paramFloat2) / 2.0F + paramFloat2;
          j = 0;
        }
        else
        {
          if (locala == null)
          {
            f3 = paramFloat1;
          }
          else
          {
            localObject = locala;
            paramFloat2 = paramFloat1;
          }
          paramFloat1 = (f3 - paramFloat2) / 2.0F + paramFloat2;
        }
      }
      if (localObject == null) {
        return b.a(paramFloat3);
      }
      return ((a)localObject).o(paraml);
    }
    return b.a(paramFloat3);
  }
  
  public float a(a parama)
  {
    float f1 = l() - parama.l();
    float f2 = g() - parama.g();
    float f3 = h() - parama.h();
    return (float)(Math.pow(Math.sqrt(f1 * f1 + f2 * f2 + f3 * f3), 0.63D) * 1.41D);
  }
  
  public float g()
  {
    return h;
  }
  
  public float h()
  {
    return i;
  }
  
  public float i()
  {
    return b;
  }
  
  public float j()
  {
    return a;
  }
  
  public float k()
  {
    return c;
  }
  
  public float l()
  {
    return g;
  }
  
  public int o(l paraml)
  {
    if ((i() != 0.0D) && (k() != 0.0D)) {
      f1 = i() / (float)Math.sqrt(k() / 100.0D);
    } else {
      f1 = 0.0F;
    }
    float f2 = (float)Math.pow(f1 / Math.pow(1.64D - Math.pow(0.29D, paraml.e()), 0.73D), 1.1111111111111112D);
    double d1 = j() * 3.1415927F / 180.0F;
    float f3 = (float)(Math.cos(2.0D + d1) + 3.8D);
    float f1 = paraml.a();
    float f4 = (float)Math.pow(k() / 100.0D, 1.0D / paraml.b() / paraml.j());
    float f5 = paraml.g();
    float f6 = paraml.h();
    f1 = f1 * f4 / paraml.f();
    f4 = (float)Math.sin(d1);
    float f7 = (float)Math.cos(d1);
    f5 = (0.305F + f1) * 23.0F * f2 / (f3 * 0.25F * 3846.1538F * f5 * f6 * 23.0F + 11.0F * f2 * f7 + f2 * 108.0F * f4);
    f2 = f7 * f5;
    f3 = f5 * f4;
    f4 = f1 * 460.0F;
    f1 = (451.0F * f2 + f4 + 288.0F * f3) / 1403.0F;
    f5 = (f4 - 891.0F * f2 - 261.0F * f3) / 1403.0F;
    f7 = (f4 - f2 * 220.0F - f3 * 6300.0F) / 1403.0F;
    f3 = (float)Math.max(0.0D, Math.abs(f1) * 27.13D / (400.0D - Math.abs(f1)));
    f2 = Math.signum(f1);
    f1 = 100.0F / paraml.c();
    f4 = (float)Math.pow(f3, 2.380952380952381D);
    f6 = (float)Math.max(0.0D, Math.abs(f5) * 27.13D / (400.0D - Math.abs(f5)));
    f3 = Math.signum(f5);
    f5 = 100.0F / paraml.c();
    f6 = (float)Math.pow(f6, 2.380952380952381D);
    float f8 = (float)Math.max(0.0D, Math.abs(f7) * 27.13D / (400.0D - Math.abs(f7)));
    f7 = Math.signum(f7);
    float f9 = 100.0F / paraml.c();
    f8 = (float)Math.pow(f8, 2.380952380952381D);
    f1 = f2 * f1 * f4 / paraml.i()[0];
    f2 = f3 * f5 * f6 / paraml.i()[1];
    f3 = f7 * f9 * f8 / paraml.i()[2];
    paraml = b.b;
    Object localObject = paraml[0];
    f4 = localObject[0];
    f9 = localObject[1];
    float f10 = localObject[2];
    localObject = paraml[1];
    float f11 = localObject[0];
    f8 = localObject[1];
    f6 = localObject[2];
    paraml = paraml[2];
    f7 = paraml[0];
    f5 = paraml[1];
    float f12 = paraml[2];
    return A.a.a(f4 * f1 + f9 * f2 + f10 * f3, f11 * f1 + f8 * f2 + f6 * f3, f1 * f7 + f2 * f5 + f3 * f12);
  }
  
  public int p()
  {
    return o(l.k);
  }
}

/* Location:
 * Qualified Name:     z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */