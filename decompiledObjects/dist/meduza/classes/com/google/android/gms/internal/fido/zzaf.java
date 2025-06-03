package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Map.Entry;

public final class zzaf
{
  public static final Appendable zza(Appendable paramAppendable, Iterator paramIterator, zzag paramzzag, String paramString)
  {
    if (paramIterator.hasNext())
    {
      paramString = (Map.Entry)paramIterator.next();
      paramAppendable.append(zzag.zzd(paramString.getKey()));
      for (;;)
      {
        paramAppendable.append(" : ");
        paramAppendable.append(zzag.zzd(paramString.getValue()));
        if (!paramIterator.hasNext()) {
          break;
        }
        paramAppendable.append(zzag.zzc(paramzzag));
        paramString = (Map.Entry)paramIterator.next();
        paramAppendable.append(zzag.zzd(paramString.getKey()));
      }
    }
    return paramAppendable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */