package com.google.protobuf;

import java.lang.reflect.Method;

public final class C
  implements a0
{
  public static final J b = new a();
  public final J a;
  
  public C()
  {
    this(b());
  }
  
  public C(J paramJ)
  {
    a = ((J)t.b(paramJ, "messageInfoFactory"));
  }
  
  public static J b()
  {
    return new b(new J[] { q.c(), c() });
  }
  
  public static J c()
  {
    try
    {
      J localJ = (J)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localJ;
    }
    catch (Exception localException) {}
    return b;
  }
  
  public static boolean d(I paramI)
  {
    boolean bool;
    if (paramI.b() == V.o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Z e(Class paramClass, I paramI)
  {
    if (r.class.isAssignableFrom(paramClass))
    {
      if (d(paramI)) {
        paramClass = N.I(paramClass, paramI, S.b(), A.b(), b0.J(), n.b(), H.b());
      } else {
        paramClass = N.I(paramClass, paramI, S.b(), A.b(), b0.J(), null, H.b());
      }
      return paramClass;
    }
    if (d(paramI)) {
      paramClass = N.I(paramClass, paramI, S.a(), A.a(), b0.F(), n.a(), H.a());
    } else {
      paramClass = N.I(paramClass, paramI, S.a(), A.a(), b0.G(), null, H.a());
    }
    return paramClass;
  }
  
  public Z a(Class paramClass)
  {
    b0.H(paramClass);
    I localI = a.a(paramClass);
    if (localI.a())
    {
      g0 localg0;
      if (r.class.isAssignableFrom(paramClass)) {
        localg0 = b0.J();
      }
      for (paramClass = n.b();; paramClass = n.a())
      {
        return O.j(localg0, paramClass, localI.c());
        localg0 = b0.F();
      }
    }
    return e(paramClass, localI);
  }
  
  public class a
    implements J
  {
    public I a(Class paramClass)
    {
      throw new IllegalStateException("This should never be called.");
    }
    
    public boolean b(Class paramClass)
    {
      return false;
    }
  }
  
  public static class b
    implements J
  {
    public J[] a;
    
    public b(J... paramVarArgs)
    {
      a = paramVarArgs;
    }
    
    public I a(Class paramClass)
    {
      for (localObject : a) {
        if (((J)localObject).b(paramClass)) {
          return ((J)localObject).a(paramClass);
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No factory is available for message type: ");
      ((StringBuilder)localObject).append(paramClass.getName());
      throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
    }
    
    public boolean b(Class paramClass)
    {
      J[] arrayOfJ = a;
      int i = arrayOfJ.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfJ[j].b(paramClass)) {
          return true;
        }
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */