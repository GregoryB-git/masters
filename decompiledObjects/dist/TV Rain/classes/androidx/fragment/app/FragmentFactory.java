package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import z2;

public class FragmentFactory
{
  private static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> sClassCacheMap = new SimpleArrayMap();
  
  public static boolean isFragmentClass(@NonNull ClassLoader paramClassLoader, @NonNull String paramString)
  {
    try
    {
      boolean bool = Fragment.class.isAssignableFrom(loadClass(paramClassLoader, paramString));
      return bool;
    }
    catch (ClassNotFoundException paramClassLoader) {}
    return false;
  }
  
  @NonNull
  private static Class<?> loadClass(@NonNull ClassLoader paramClassLoader, @NonNull String paramString)
    throws ClassNotFoundException
  {
    Object localObject1 = sClassCacheMap;
    Object localObject2 = (SimpleArrayMap)((SimpleArrayMap)localObject1).get(paramClassLoader);
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = new SimpleArrayMap();
      ((SimpleArrayMap)localObject1).put(paramClassLoader, localObject3);
    }
    localObject1 = (Class)((SimpleArrayMap)localObject3).get(paramString);
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = Class.forName(paramString, false, paramClassLoader);
      ((SimpleArrayMap)localObject3).put(paramString, localObject2);
    }
    return (Class<?>)localObject2;
  }
  
  @NonNull
  public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader paramClassLoader, @NonNull String paramString)
  {
    try
    {
      paramClassLoader = loadClass(paramClassLoader, paramString);
      return paramClassLoader;
    }
    catch (ClassCastException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class is a valid subclass of Fragment"), paramClassLoader);
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class name exists"), paramClassLoader);
    }
  }
  
  @NonNull
  public Fragment instantiate(@NonNull ClassLoader paramClassLoader, @NonNull String paramString)
  {
    try
    {
      paramClassLoader = (Fragment)loadFragmentClass(paramClassLoader, paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      return paramClassLoader;
    }
    catch (InvocationTargetException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": calling Fragment constructor caused an exception"), paramClassLoader);
    }
    catch (NoSuchMethodException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": could not find Fragment constructor"), paramClassLoader);
    }
    catch (IllegalAccessException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramClassLoader);
    }
    catch (InstantiationException paramClassLoader)
    {
      throw new Fragment.InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramClassLoader);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */