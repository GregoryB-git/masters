package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class acy
  extends acv
{
  private static Class a;
  private final Object b = b();
  private final Field c = c();
  
  private static Object b()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = Class.forName("sun.misc.Unsafe");
      a = (Class)localObject2;
      localObject2 = ((Class)localObject2).getDeclaredField("theUnsafe");
      ((AccessibleObject)localObject2).setAccessible(true);
      localObject2 = ((Field)localObject2).get(null);
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localObject1;
  }
  
  private final boolean b(AccessibleObject paramAccessibleObject)
  {
    if ((b != null) && (c != null)) {}
    try
    {
      long l = ((Long)a.getMethod("objectFieldOffset", new Class[] { Field.class }).invoke(b, new Object[] { c })).longValue();
      a.getMethod("putBoolean", new Class[] { Object.class, Long.TYPE, Boolean.TYPE }).invoke(b, new Object[] { paramAccessibleObject, Long.valueOf(l), Boolean.TRUE });
      return true;
    }
    catch (Exception paramAccessibleObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  private static Field c()
  {
    try
    {
      Field localField = AccessibleObject.class.getDeclaredField("override");
      return localField;
    }
    catch (NoSuchFieldException localNoSuchFieldException) {}
    return null;
  }
  
  public final void a(AccessibleObject paramAccessibleObject)
  {
    if (!b(paramAccessibleObject)) {
      try
      {
        paramAccessibleObject.setAccessible(true);
        return;
      }
      catch (SecurityException localSecurityException)
      {
        StringBuilder localStringBuilder = new StringBuilder("Gson couldn't modify fields for ");
        localStringBuilder.append(paramAccessibleObject);
        localStringBuilder.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
        throw new yg(localStringBuilder.toString(), localSecurityException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.acy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */