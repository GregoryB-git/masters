package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

final class zk
  implements zy
{
  public zk(za paramza, Type paramType) {}
  
  public final Object a()
  {
    Object localObject = a;
    if ((localObject instanceof ParameterizedType))
    {
      localObject = ((ParameterizedType)localObject).getActualTypeArguments()[0];
      if ((localObject instanceof Class)) {
        return EnumSet.noneOf((Class)localObject);
      }
      localObject = new StringBuilder("Invalid EnumSet type: ");
      ((StringBuilder)localObject).append(a.toString());
      throw new yg(((StringBuilder)localObject).toString());
    }
    localObject = new StringBuilder("Invalid EnumSet type: ");
    ((StringBuilder)localObject).append(a.toString());
    throw new yg(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */