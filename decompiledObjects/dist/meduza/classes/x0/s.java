package x0;

import g;
import r.h;

public class s
{
  public static final h<ClassLoader, h<String, Class<?>>> a = new h();
  
  public static Class<?> a(ClassLoader paramClassLoader, String paramString)
  {
    Object localObject1 = a;
    Object localObject2 = (h)((h)localObject1).getOrDefault(paramClassLoader, null);
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = new h();
      ((h)localObject1).put(paramClassLoader, localObject3);
    }
    localObject1 = (Class)((h)localObject3).getOrDefault(paramString, null);
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = Class.forName(paramString, false, paramClassLoader);
      ((h)localObject3).put(paramString, localObject2);
    }
    return (Class<?>)localObject2;
  }
  
  public static Class<? extends i> b(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = a(paramClassLoader, paramString);
      return paramClassLoader;
    }
    catch (ClassCastException paramClassLoader)
    {
      throw new i.l(g.e("Unable to instantiate fragment ", paramString, ": make sure class is a valid subclass of Fragment"), paramClassLoader);
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      throw new i.l(g.e("Unable to instantiate fragment ", paramString, ": make sure class name exists"), paramClassLoader);
    }
  }
}

/* Location:
 * Qualified Name:     x0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */