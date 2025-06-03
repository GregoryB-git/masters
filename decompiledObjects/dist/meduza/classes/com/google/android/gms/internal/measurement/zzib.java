package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzib
  extends zzhx<Long>
{
  public zzib(zzif paramzzif, String paramString, Long paramLong, boolean paramBoolean)
  {
    super(paramzzif, paramString, paramLong, true, null);
  }
  
  private final Long zzb(Object paramObject)
  {
    if ((paramObject instanceof Long)) {
      return (Long)paramObject;
    }
    if ((paramObject instanceof String)) {}
    try
    {
      long l = Long.parseLong((String)paramObject);
      return Long.valueOf(l);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str1;
      String str2;
      for (;;) {}
    }
    str1 = super.zzb();
    str2 = String.valueOf(paramObject);
    paramObject = new StringBuilder("Invalid long value for ");
    ((StringBuilder)paramObject).append(str1);
    ((StringBuilder)paramObject).append(": ");
    ((StringBuilder)paramObject).append(str2);
    Log.e("PhenotypeFlag", ((StringBuilder)paramObject).toString());
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */