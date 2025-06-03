package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Constructor;

public abstract class W
{
  public static final U a = ;
  public static final U b = new V();
  
  public static U a()
  {
    return a;
  }
  
  public static U b()
  {
    return b;
  }
  
  public static U c()
  {
    try
    {
      U localU = (U)Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localU;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */