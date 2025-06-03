package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

public final class zzai
  implements zzaq
{
  private final Double zza;
  
  public zzai(Double paramDouble)
  {
    if (paramDouble == null)
    {
      zza = Double.valueOf(NaN.0D);
      return;
    }
    zza = paramDouble;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzai)) {
      return false;
    }
    paramObject = (zzai)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final String toString()
  {
    return zzf();
  }
  
  public final zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList)
  {
    if ("toString".equals(paramString)) {
      return new zzas(zzf());
    }
    throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[] { zzf(), paramString }));
  }
  
  public final zzaq zzc()
  {
    return new zzai(zza);
  }
  
  public final Boolean zzd()
  {
    boolean bool;
    if ((!Double.isNaN(zza.doubleValue())) && (zza.doubleValue() != 0.0D)) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public final Double zze()
  {
    return zza;
  }
  
  public final String zzf()
  {
    if (Double.isNaN(zza.doubleValue())) {
      return "NaN";
    }
    if (Double.isInfinite(zza.doubleValue()))
    {
      if (zza.doubleValue() > 0.0D) {
        return "Infinity";
      }
      return "-Infinity";
    }
    Object localObject = BigDecimal.valueOf(zza.doubleValue());
    BigDecimal localBigDecimal;
    if (((BigDecimal)localObject).signum() == 0) {
      localBigDecimal = new BigDecimal(BigInteger.ZERO, 0);
    } else {
      localBigDecimal = ((BigDecimal)localObject).stripTrailingZeros();
    }
    localObject = new DecimalFormat("0E0");
    ((NumberFormat)localObject).setRoundingMode(RoundingMode.HALF_UP);
    if (localBigDecimal.scale() > 0) {
      i = localBigDecimal.precision();
    } else {
      i = localBigDecimal.scale();
    }
    ((NumberFormat)localObject).setMinimumFractionDigits(i - 1);
    String str = ((Format)localObject).format(localBigDecimal);
    int i = str.indexOf("E");
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
  
  public final Iterator<zzaq> zzh()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */