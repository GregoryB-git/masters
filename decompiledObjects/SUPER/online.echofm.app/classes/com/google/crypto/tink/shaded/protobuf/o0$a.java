package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public class o0$a
  implements PrivilegedExceptionAction
{
  public Unsafe a()
  {
    for (Object localObject : Unsafe.class.getDeclaredFields())
    {
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = ((Field)localObject).get(null);
      if (Unsafe.class.isInstance(localObject)) {
        return (Unsafe)Unsafe.class.cast(localObject);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.o0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */