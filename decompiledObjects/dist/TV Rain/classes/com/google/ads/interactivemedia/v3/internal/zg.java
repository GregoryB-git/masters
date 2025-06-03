package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;

final class zg
  implements zy
{
  private final aab a = aab.a();
  
  public zg(za paramza, Class paramClass, Type paramType) {}
  
  public final Object a()
  {
    try
    {
      localObject = a.a(b);
      return localObject;
    }
    catch (Exception localException)
    {
      Object localObject = new StringBuilder("Unable to invoke no-args constructor for ");
      ((StringBuilder)localObject).append(c);
      ((StringBuilder)localObject).append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */