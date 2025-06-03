package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Constructor;

public abstract class s
{
  public static final q a = new r();
  public static final q b = c();
  
  public static q a()
  {
    q localq = b;
    if (localq != null) {
      return localq;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  public static q b()
  {
    return a;
  }
  
  public static q c()
  {
    try
    {
      q localq = (q)Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localq;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */