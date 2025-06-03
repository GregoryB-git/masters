package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;

public final class yk
  extends yd
{
  private static final Class<?>[] a = { Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
  private Object b;
  
  public yk(Boolean paramBoolean)
  {
    a(paramBoolean);
  }
  
  public yk(Number paramNumber)
  {
    a(paramNumber);
  }
  
  public yk(String paramString)
  {
    a(paramString);
  }
  
  private final void a(Object paramObject)
  {
    if ((paramObject instanceof Character))
    {
      b = String.valueOf(((Character)paramObject).charValue());
      return;
    }
    boolean bool1 = paramObject instanceof Number;
    boolean bool2 = false;
    if (!bool1)
    {
      int i;
      if ((paramObject instanceof String))
      {
        i = 1;
      }
      else
      {
        Class localClass = paramObject.getClass();
        Class[] arrayOfClass = a;
        int j = arrayOfClass.length;
        for (i = 0;; i++)
        {
          if (i >= j) {
            break label94;
          }
          if (arrayOfClass[i].isAssignableFrom(localClass)) {
            break;
          }
        }
        label94:
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      bool2 = true;
    }
    uw.a(bool2);
    b = paramObject;
  }
  
  private static boolean a(yk paramyk)
  {
    paramyk = b;
    if ((paramyk instanceof Number))
    {
      paramyk = (Number)paramyk;
      return ((paramyk instanceof BigInteger)) || ((paramyk instanceof Long)) || ((paramyk instanceof Integer)) || ((paramyk instanceof Short)) || ((paramyk instanceof Byte));
    }
    return false;
  }
  
  public final Number a()
  {
    Object localObject = b;
    if ((localObject instanceof String)) {
      return new zr((String)localObject);
    }
    return (Number)localObject;
  }
  
  public final String b()
  {
    Object localObject = b;
    if ((localObject instanceof Number)) {
      return a().toString();
    }
    if ((localObject instanceof Boolean)) {
      return ((Boolean)localObject).toString();
    }
    return (String)localObject;
  }
  
  public final double c()
  {
    if ((b instanceof Number)) {
      return a().doubleValue();
    }
    return Double.parseDouble(b());
  }
  
  public final long d()
  {
    if ((b instanceof Number)) {
      return a().longValue();
    }
    return Long.parseLong(b());
  }
  
  public final int e()
  {
    if ((b instanceof Number)) {
      return a().intValue();
    }
    return Integer.parseInt(b());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (yk.class == paramObject.getClass()))
    {
      yk localyk = (yk)paramObject;
      if (b == null) {
        return b == null;
      }
      if ((a(this)) && (a(localyk))) {
        return a().longValue() == localyk.a().longValue();
      }
      paramObject = b;
      if (((paramObject instanceof Number)) && ((b instanceof Number)))
      {
        double d1 = a().doubleValue();
        double d2 = localyk.a().doubleValue();
        return (d1 == d2) || ((Double.isNaN(d1)) && (Double.isNaN(d2)));
      }
      return paramObject.equals(b);
    }
    return false;
  }
  
  public final boolean f()
  {
    Object localObject = b;
    if ((localObject instanceof Boolean)) {
      return ((Boolean)localObject).booleanValue();
    }
    return Boolean.parseBoolean(b());
  }
  
  public final boolean h()
  {
    return b instanceof Boolean;
  }
  
  public final int hashCode()
  {
    if (b == null) {
      return 31;
    }
    if (a(this)) {}
    Object localObject;
    for (long l = a().longValue();; l = Double.doubleToLongBits(a().doubleValue()))
    {
      return (int)(l >>> 32 ^ l);
      localObject = b;
      if (!(localObject instanceof Number)) {
        break;
      }
    }
    return localObject.hashCode();
  }
  
  public final boolean i()
  {
    return b instanceof Number;
  }
  
  public final boolean j()
  {
    return b instanceof String;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.yk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */