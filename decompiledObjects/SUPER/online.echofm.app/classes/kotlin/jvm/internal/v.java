package kotlin.jvm.internal;

import m6.c;
import m6.d;
import m6.e;
import m6.f;
import m6.g;

public abstract class v
{
  public static final w a;
  public static final c[] b = new c[0];
  
  static
  {
    Object localObject = null;
    try
    {
      w localw = (w)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
      localObject = localw;
    }
    catch (ClassCastException|ClassNotFoundException|InstantiationException|IllegalAccessException localClassCastException)
    {
      for (;;) {}
    }
    if (localObject == null) {
      localObject = new w();
    }
    a = (w)localObject;
  }
  
  public static e a(i parami)
  {
    return a.a(parami);
  }
  
  public static c b(Class paramClass)
  {
    return a.b(paramClass);
  }
  
  public static d c(Class paramClass)
  {
    return a.c(paramClass, "");
  }
  
  public static f d(n paramn)
  {
    return a.d(paramn);
  }
  
  public static g e(p paramp)
  {
    return a.e(paramp);
  }
  
  public static String f(h paramh)
  {
    return a.f(paramh);
  }
  
  public static String g(l paraml)
  {
    return a.g(paraml);
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */