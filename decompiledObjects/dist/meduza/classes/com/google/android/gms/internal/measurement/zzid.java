package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzid
  extends zzhx<Double>
{
  public zzid(zzif paramzzif, String paramString, Double paramDouble, boolean paramBoolean)
  {
    super(paramzzif, paramString, paramDouble, true, null);
  }
  
  private final Double zzb(Object paramObject)
  {
    if ((paramObject instanceof Double)) {
      return (Double)paramObject;
    }
    if ((paramObject instanceof Float)) {
      return Double.valueOf(((Float)paramObject).doubleValue());
    }
    if ((paramObject instanceof String)) {}
    try
    {
      double d = Double.parseDouble((String)paramObject);
      return Double.valueOf(d);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str1;
      String str2;
      for (;;) {}
    }
    str1 = super.zzb();
    str2 = String.valueOf(paramObject);
    paramObject = new StringBuilder("Invalid double value for ");
    ((StringBuilder)paramObject).append(str1);
    ((StringBuilder)paramObject).append(": ");
    ((StringBuilder)paramObject).append(str2);
    Log.e("PhenotypeFlag", ((StringBuilder)paramObject).toString());
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzid
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */