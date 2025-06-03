package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;

public abstract class n
{
  public static final Class a = ;
  
  public static o a()
  {
    if (a != null) {}
    try
    {
      o localo = b("getEmptyRegistry");
      return localo;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return o.e;
  }
  
  public static final o b(String paramString)
  {
    return (o)a.getDeclaredMethod(paramString, new Class[0]).invoke(null, new Object[0]);
  }
  
  public static Class c()
  {
    try
    {
      Class localClass = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */