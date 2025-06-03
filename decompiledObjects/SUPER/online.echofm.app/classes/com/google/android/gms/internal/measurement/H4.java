package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

public abstract class H4
{
  public static final F4 a = ;
  public static final F4 b = new E4();
  
  public static F4 a()
  {
    return a;
  }
  
  public static F4 b()
  {
    return b;
  }
  
  public static F4 c()
  {
    try
    {
      F4 localF4 = (F4)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localF4;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.H4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */