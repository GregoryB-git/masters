package com.google.protobuf;

import java.lang.reflect.Method;

public abstract class j
{
  public static final Class a = ;
  
  public static k a()
  {
    k localk = b("getEmptyRegistry");
    if (localk == null) {
      localk = k.d;
    }
    return localk;
  }
  
  public static final k b(String paramString)
  {
    Class localClass = a;
    if (localClass == null) {
      return null;
    }
    try
    {
      paramString = (k)localClass.getDeclaredMethod(paramString, new Class[0]).invoke(null, new Object[0]);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static Class c()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.ExtensionRegistry");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */