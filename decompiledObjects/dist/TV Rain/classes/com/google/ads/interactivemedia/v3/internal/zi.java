package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class zi
  implements zy
{
  public zi(za paramza, Constructor paramConstructor) {}
  
  public final Object a()
  {
    try
    {
      Object localObject = a.newInstance(null);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      StringBuilder localStringBuilder1 = new StringBuilder("Failed to invoke ");
      localStringBuilder1.append(a);
      localStringBuilder1.append(" with no args");
      throw new RuntimeException(localStringBuilder1.toString(), localInvocationTargetException.getTargetException());
    }
    catch (InstantiationException localInstantiationException)
    {
      StringBuilder localStringBuilder2 = new StringBuilder("Failed to invoke ");
      localStringBuilder2.append(a);
      localStringBuilder2.append(" with no args");
      throw new RuntimeException(localStringBuilder2.toString(), localInstantiationException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */