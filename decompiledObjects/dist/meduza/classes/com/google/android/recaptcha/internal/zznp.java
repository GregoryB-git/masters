package com.google.android.recaptcha.internal;

import java.util.Map.Entry;

final class zznp
  implements Map.Entry
{
  private final Map.Entry zza;
  
  public final Object getKey()
  {
    return zza.getKey();
  }
  
  public final Object getValue()
  {
    if ((zzns)zza.getValue() == null) {
      return null;
    }
    throw null;
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof zzoi)) {
      return ((zzns)zza.getValue()).zzc((zzoi)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
  
  public final zzns zza()
  {
    return (zzns)zza.getValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */