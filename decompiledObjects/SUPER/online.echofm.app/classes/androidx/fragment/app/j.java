package androidx.fragment.app;

import t.h;

public abstract class j
{
  public static final h a = new h();
  
  public static boolean b(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      boolean bool = Fragment.class.isAssignableFrom(c(paramClassLoader, paramString));
      return bool;
    }
    catch (ClassNotFoundException paramClassLoader) {}
    return false;
  }
  
  public static Class c(ClassLoader paramClassLoader, String paramString)
  {
    Object localObject1 = a;
    Object localObject2 = (h)((h)localObject1).get(paramClassLoader);
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = new h();
      ((h)localObject1).put(paramClassLoader, localObject3);
    }
    localObject1 = (Class)((h)localObject3).get(paramString);
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = Class.forName(paramString, false, paramClassLoader);
      ((h)localObject3).put(paramString, localObject2);
    }
    return (Class)localObject2;
  }
  
  public static Class d(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      paramClassLoader = c(paramClassLoader, paramString);
      return paramClassLoader;
    }
    catch (ClassCastException paramClassLoader)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unable to instantiate fragment ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(": make sure class is a valid subclass of Fragment");
      throw new Fragment.i(localStringBuilder.toString(), paramClassLoader);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramClassLoader = new StringBuilder();
      paramClassLoader.append("Unable to instantiate fragment ");
      paramClassLoader.append(paramString);
      paramClassLoader.append(": make sure class name exists");
      throw new Fragment.i(paramClassLoader.toString(), localClassNotFoundException);
    }
  }
  
  public abstract Fragment a(ClassLoader paramClassLoader, String paramString);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */