package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class zr
  extends Number
{
  private final String a;
  
  public zr(String paramString)
  {
    a = paramString;
  }
  
  private final Object writeReplace()
    throws ObjectStreamException
  {
    return new BigDecimal(a);
  }
  
  public final double doubleValue()
  {
    return Double.parseDouble(a);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof zr))
    {
      Object localObject = (zr)paramObject;
      paramObject = a;
      localObject = a;
      return (paramObject == localObject) || (((String)paramObject).equals(localObject));
    }
    return false;
  }
  
  public final float floatValue()
  {
    return Float.parseFloat(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final int intValue()
  {
    try
    {
      int i = Integer.parseInt(a);
      return i;
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      try
      {
        long l = Long.parseLong(a);
        return (int)l;
      }
      catch (NumberFormatException localNumberFormatException2) {}
    }
    return new BigDecimal(a).intValue();
  }
  
  public final long longValue()
  {
    try
    {
      long l = Long.parseLong(a);
      return l;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return new BigDecimal(a).longValue();
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */