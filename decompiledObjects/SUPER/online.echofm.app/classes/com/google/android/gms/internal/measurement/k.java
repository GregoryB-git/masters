package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

public final class k
  implements s
{
  public final Double o;
  
  public k(Double paramDouble)
  {
    if (paramDouble == null)
    {
      o = Double.valueOf(NaN.0D);
      return;
    }
    o = paramDouble;
  }
  
  public final s c()
  {
    return new k(o);
  }
  
  public final Boolean d()
  {
    boolean bool;
    if ((!Double.isNaN(o.doubleValue())) && (o.doubleValue() != 0.0D)) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = (k)paramObject;
    return o.equals(o);
  }
  
  public final Double f()
  {
    return o;
  }
  
  public final String g()
  {
    if (Double.isNaN(o.doubleValue())) {
      return "NaN";
    }
    if (Double.isInfinite(o.doubleValue()))
    {
      if (o.doubleValue() > 0.0D) {
        return "Infinity";
      }
      return "-Infinity";
    }
    Object localObject = BigDecimal.valueOf(o.doubleValue());
    BigDecimal localBigDecimal;
    if (((BigDecimal)localObject).signum() == 0) {
      localBigDecimal = new BigDecimal(BigInteger.ZERO, 0);
    } else {
      localBigDecimal = j.a((BigDecimal)localObject);
    }
    localObject = new DecimalFormat("0E0");
    ((NumberFormat)localObject).setRoundingMode(RoundingMode.HALF_UP);
    if (localBigDecimal.scale() > 0) {}
    for (int i = localBigDecimal.precision();; i = localBigDecimal.scale()) {
      break;
    }
    ((NumberFormat)localObject).setMinimumFractionDigits(i - 1);
    String str = ((Format)localObject).format(localBigDecimal);
    i = str.indexOf("E");
    localObject = str;
    if (i > 0)
    {
      i = Integer.parseInt(str.substring(i + 1));
      if (((i < 0) && (i > -7)) || ((i >= 0) && (i < 21))) {
        localObject = localBigDecimal.toPlainString();
      } else {
        localObject = str.replace("E-", "e-").replace("E", "e+");
      }
    }
    return (String)localObject;
  }
  
  public final int hashCode()
  {
    return o.hashCode();
  }
  
  public final Iterator k()
  {
    return null;
  }
  
  public final s s(String paramString, f3 paramf3, List paramList)
  {
    if ("toString".equals(paramString)) {
      return new u(g());
    }
    throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[] { g(), paramString }));
  }
  
  public final String toString()
  {
    return g();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */