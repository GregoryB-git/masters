package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;

public abstract class o
{
  public static final Class a = ;
  
  public static p a()
  {
    p localp = b("getEmptyRegistry");
    if (localp == null) {
      localp = p.d;
    }
    return localp;
  }
  
  public static final p b(String paramString)
  {
    Class localClass = a;
    if (localClass == null) {
      return null;
    }
    try
    {
      paramString = (p)localClass.getDeclaredMethod(paramString, new Class[0]).invoke(null, new Object[0]);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static Class c()
  {
    try
    {
      Class localClass = Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */