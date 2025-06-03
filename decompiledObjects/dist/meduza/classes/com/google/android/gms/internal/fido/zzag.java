package com.google.android.gms.internal.fido;

import java.util.Iterator;

public final class zzag
{
  private final String zza = ",\n  ";
  
  private zzag(String paramString) {}
  
  public static zzag zza(String paramString)
  {
    return new zzag(",\n  ");
  }
  
  public static final CharSequence zzd(Object paramObject)
  {
    paramObject.getClass();
    if ((paramObject instanceof CharSequence)) {
      paramObject = (CharSequence)paramObject;
    } else {
      paramObject = paramObject.toString();
    }
    return (CharSequence)paramObject;
  }
  
  public final Appendable zzb(Appendable paramAppendable, Iterator paramIterator)
  {
    if (paramIterator.hasNext()) {
      for (;;)
      {
        paramAppendable.append(zzd(paramIterator.next()));
        if (!paramIterator.hasNext()) {
          break;
        }
        paramAppendable.append(zza);
      }
    }
    return paramAppendable;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */