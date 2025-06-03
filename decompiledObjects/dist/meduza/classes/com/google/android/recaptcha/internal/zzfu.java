package com.google.android.recaptcha.internal;

import ec.i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lc.k;
import sb.q;

public final class zzfu
{
  private Set zza;
  private Set zzb;
  private Long zzc;
  private int zzd;
  
  private static final boolean zzc(String paramString, Set paramSet)
  {
    i.e(paramString, "<this>");
    Iterator localIterator = k.y0(0, paramString, String.valueOf(new char[] { '.' }[0]), false).iterator();
    for (paramString = ""; localIterator.hasNext(); paramString = paramString.concat("."))
    {
      paramString = paramString.concat(String.valueOf((String)localIterator.next()));
      if (paramSet.contains(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public final void zza(zzrv paramzzrv)
  {
    zza = q.x(paramzzrv.zzf().zzi());
    zzb = q.x(paramzzrv.zzg().zzi());
  }
  
  public final boolean zzb(String paramString)
  {
    Set localSet1 = zza;
    if ((localSet1 != null) && (zzb != null))
    {
      if (localSet1.isEmpty()) {
        return true;
      }
      Set localSet2 = zzb;
      i.c(localSet2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
      if (zzc(paramString, localSet2)) {
        return false;
      }
      return zzc(paramString, localSet1);
    }
    if (zzc == null) {
      zzc = Long.valueOf(System.currentTimeMillis());
    }
    zzd += 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */