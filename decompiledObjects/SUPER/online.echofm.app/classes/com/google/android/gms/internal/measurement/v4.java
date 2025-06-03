package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;

public final class v4
  implements b5
{
  public static final J4 b = new z4();
  public final J4 a;
  
  public v4()
  {
    this(new B4(new J4[] { Z3.c(), b() }));
  }
  
  public v4(J4 paramJ4)
  {
    a = ((J4)a4.f(paramJ4, "messageInfoFactory"));
  }
  
  public static J4 b()
  {
    try
    {
      J4 localJ4 = (J4)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localJ4;
    }
    catch (Exception localException) {}
    return b;
  }
  
  public static boolean c(G4 paramG4)
  {
    return x4.a[paramG4.b().ordinal()] != 1;
  }
  
  public final Z4 a(Class paramClass)
  {
    a5.o(paramClass);
    G4 localG4 = a.a(paramClass);
    if (localG4.c())
    {
      if (Y3.class.isAssignableFrom(paramClass)) {
        return O4.j(a5.u(), P3.b(), localG4.a());
      }
      return O4.j(a5.f(), P3.a(), localG4.a());
    }
    if (Y3.class.isAssignableFrom(paramClass))
    {
      bool = c(localG4);
      localObject1 = Q4.b();
      localq4 = q4.c();
      localObject2 = a5.u();
      if (bool) {
        return M4.n(paramClass, localG4, (P4)localObject1, localq4, (x5)localObject2, P3.b(), H4.b());
      }
      return M4.n(paramClass, localG4, (P4)localObject1, localq4, (x5)localObject2, null, H4.b());
    }
    boolean bool = c(localG4);
    Object localObject2 = Q4.a();
    q4 localq4 = q4.a();
    Object localObject1 = a5.f();
    if (bool) {
      return M4.n(paramClass, localG4, (P4)localObject2, localq4, (x5)localObject1, P3.a(), H4.a());
    }
    return M4.n(paramClass, localG4, (P4)localObject2, localq4, (x5)localObject1, null, H4.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.v4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */