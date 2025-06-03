package y6;

import dalvik.system.PathClassLoader;

public final class c
  extends PathClassLoader
{
  public c(ClassLoader paramClassLoader, String paramString)
  {
    super(paramString, paramClassLoader);
  }
  
  public final Class loadClass(String paramString, boolean paramBoolean)
  {
    if ((!paramString.startsWith("java.")) && (!paramString.startsWith("android."))) {}
    try
    {
      Class localClass = findClass(paramString);
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return super.loadClass(paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     y6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */