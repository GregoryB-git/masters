package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

public abstract class Q4
{
  public static final P4 a = ;
  public static final P4 b = new R4();
  
  public static P4 a()
  {
    return a;
  }
  
  public static P4 b()
  {
    return b;
  }
  
  public static P4 c()
  {
    try
    {
      P4 localP4 = (P4)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localP4;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Q4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */