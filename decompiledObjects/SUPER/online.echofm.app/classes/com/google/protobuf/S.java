package com.google.protobuf;

import java.lang.reflect.Constructor;

public abstract class S
{
  public static final P a = ;
  public static final P b = new Q();
  
  public static P a()
  {
    return a;
  }
  
  public static P b()
  {
    return b;
  }
  
  public static P c()
  {
    try
    {
      P localP = (P)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localP;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */