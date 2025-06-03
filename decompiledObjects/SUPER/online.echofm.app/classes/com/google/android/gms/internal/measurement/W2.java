package com.google.android.gms.internal.measurement;

import android.util.Log;

public final class W2
  extends S2
{
  public W2(a3 parama3, String paramString, Long paramLong, boolean paramBoolean)
  {
    super(parama3, paramString, paramLong, true, null);
  }
  
  public final Long o(Object paramObject)
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
      String str;
      StringBuilder localStringBuilder;
      for (;;) {}
    }
    str = super.k();
    paramObject = String.valueOf(paramObject);
    localStringBuilder = new StringBuilder("Invalid long value for ");
    localStringBuilder.append(str);
    localStringBuilder.append(": ");
    localStringBuilder.append((String)paramObject);
    Log.e("PhenotypeFlag", localStringBuilder.toString());
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.W2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */