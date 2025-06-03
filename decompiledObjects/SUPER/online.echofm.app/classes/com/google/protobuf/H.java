package com.google.protobuf;

import java.lang.reflect.Constructor;

public abstract class H
{
  public static final F a = ;
  public static final F b = new G();
  
  public static F a()
  {
    return a;
  }
  
  public static F b()
  {
    return b;
  }
  
  public static F c()
  {
    try
    {
      F localF = (F)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localF;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */