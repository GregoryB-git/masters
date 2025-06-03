package ec;

import jc.c;

public final class t
{
  public static final u a;
  public static final c[] b = new c[0];
  
  static
  {
    Object localObject = null;
    try
    {
      u localu = (u)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
      localObject = localu;
    }
    catch (ClassCastException|ClassNotFoundException|InstantiationException|IllegalAccessException localClassCastException)
    {
      for (;;) {}
    }
    if (localObject == null) {
      localObject = new u();
    }
    a = (u)localObject;
  }
  
  public static d a(Class paramClass)
  {
    a.getClass();
    return new d(paramClass);
  }
}

/* Location:
 * Qualified Name:     ec.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */