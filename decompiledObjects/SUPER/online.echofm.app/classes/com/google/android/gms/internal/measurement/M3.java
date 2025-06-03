package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class M3
{
  public static volatile M3 b;
  public static final M3 c = new M3(true);
  public final Map a = Collections.emptyMap();
  
  public M3(boolean paramBoolean) {}
  
  public static M3 a()
  {
    M3 localM31 = b;
    if (localM31 != null) {
      return localM31;
    }
    M3 localM32;
    label45:
    try
    {
      localM31 = b;
      if (localM31 != null) {
        return localM31;
      }
    }
    finally
    {
      break label45;
      localM32 = X3.a(M3.class);
      b = localM32;
      return localM32;
    }
  }
  
  public final Y3.d b(I4 paramI4, int paramInt)
  {
    a.a(a.get(new a(paramI4, paramInt)));
    return null;
  }
  
  public static final class a
  {
    public final Object a;
    public final int b;
    
    public a(Object paramObject, int paramInt)
    {
      a = paramObject;
      b = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return (a == a) && (b == b);
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(a) * 65535 + b;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.M3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */