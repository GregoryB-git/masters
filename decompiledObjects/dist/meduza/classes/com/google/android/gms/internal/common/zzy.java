package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzy
  implements Iterable
{
  public zzy(zzaa paramzzaa, CharSequence paramCharSequence) {}
  
  public final Iterator iterator()
  {
    return zzaa.zze(zzb, zza);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    Iterator localIterator = iterator();
    try
    {
      if (localIterator.hasNext()) {
        for (CharSequence localCharSequence = zzt.zza(localIterator.next(), ", ");; localCharSequence = zzt.zza(localIterator.next(), ", "))
        {
          localStringBuilder.append(localCharSequence);
          if (!localIterator.hasNext()) {
            break;
          }
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
    catch (IOException localIOException)
    {
      throw new AssertionError(localIOException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */