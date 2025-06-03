package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;

public final class G
  implements f0
{
  public static final N b = new a();
  public final N a;
  
  public G()
  {
    this(b());
  }
  
  public G(N paramN)
  {
    a = ((N)z.b(paramN, "messageInfoFactory"));
  }
  
  public static N b()
  {
    return new b(new N[] { w.c(), c() });
  }
  
  public static N c()
  {
    try
    {
      N localN = (N)Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      return localN;
    }
    catch (Exception localException) {}
    return b;
  }
  
  public static boolean d(M paramM)
  {
    boolean bool;
    if (paramM.b() == Z.o) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static e0 e(Class paramClass, M paramM)
  {
    if (x.class.isAssignableFrom(paramClass))
    {
      if (d(paramM)) {
        paramClass = S.T(paramClass, paramM, W.b(), E.b(), g0.L(), s.b(), L.b());
      } else {
        paramClass = S.T(paramClass, paramM, W.b(), E.b(), g0.L(), null, L.b());
      }
      return paramClass;
    }
    if (d(paramM)) {
      paramClass = S.T(paramClass, paramM, W.a(), E.a(), g0.G(), s.a(), L.a());
    } else {
      paramClass = S.T(paramClass, paramM, W.a(), E.a(), g0.H(), null, L.a());
    }
    return paramClass;
  }
  
  public e0 a(Class paramClass)
  {
    g0.I(paramClass);
    M localM = a.a(paramClass);
    if (localM.a())
    {
      if (x.class.isAssignableFrom(paramClass)) {
        paramClass = g0.L();
      }
      for (q localq = s.b();; localq = s.a())
      {
        return T.m(paramClass, localq, localM.c());
        paramClass = g0.G();
      }
    }
    return e(paramClass, localM);
  }
  
  public class a
    implements N
  {
    public M a(Class paramClass)
    {
      throw new IllegalStateException("This should never be called.");
    }
    
    public boolean b(Class paramClass)
    {
      return false;
    }
  }
  
  public static class b
    implements N
  {
    public N[] a;
    
    public b(N... paramVarArgs)
    {
      a = paramVarArgs;
    }
    
    public M a(Class paramClass)
    {
      for (localObject : a) {
        if (((N)localObject).b(paramClass)) {
          return ((N)localObject).a(paramClass);
        }
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No factory is available for message type: ");
      ((StringBuilder)localObject).append(paramClass.getName());
      throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
    }
    
    public boolean b(Class paramClass)
    {
      N[] arrayOfN = a;
      int i = arrayOfN.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfN[j].b(paramClass)) {
          return true;
        }
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */