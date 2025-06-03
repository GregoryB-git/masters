package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;

public abstract class P3
{
  public static final O3 a = new Q3();
  public static final O3 b = c();
  
  public static O3 a()
  {
    O3 localO3 = b;
    if (localO3 != null) {
      return localO3;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  public static O3 b()
  {
    return a;
  }
  
  public static O3 c()
  {
    try
    {
      O3 localO3 = (O3)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localO3;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.P3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */