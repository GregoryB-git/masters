package com.google.protobuf;

import java.lang.reflect.Constructor;

public abstract class n
{
  public static final l a = new m();
  public static final l b = c();
  
  public static l a()
  {
    l locall = b;
    if (locall != null) {
      return locall;
    }
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  public static l b()
  {
    return a;
  }
  
  public static l c()
  {
    try
    {
      l locall = (l)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return locall;
    }
    catch (Exception localException) {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */