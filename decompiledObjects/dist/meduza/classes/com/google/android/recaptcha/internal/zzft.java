package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.Map;
import nc.d0;
import nc.e0;
import rb.h;
import ub.e;
import vb.a;
import x6.b;

public final class zzft
  implements zzfo
{
  private final d0 zza;
  private final zzgf zzb;
  private final zzhx zzc;
  private final Map zzd;
  
  public zzft(d0 paramd0, zzgf paramzzgf, zzhx paramzzhx, Map paramMap)
  {
    zza = paramd0;
    zzb = paramzzgf;
    zzc = paramzzhx;
    zzd = paramMap;
  }
  
  private final Object zzg(List paramList, zzgd paramzzgd, e parame)
  {
    paramList = e0.b(new zzfq(paramzzgd, paramList, this, null), parame);
    if (paramList == a.a) {
      return paramList;
    }
    return h.a;
  }
  
  private final Object zzh(Exception paramException, zzgd paramzzgd, e parame)
  {
    paramException = e0.b(new zzfr(paramException, paramzzgd, this, null), parame);
    if (paramException == a.a) {
      return paramException;
    }
    return h.a;
  }
  
  public final void zza(String paramString)
  {
    paramString = new zzfs(new zzgd(zzb), this, paramString, null);
    b.g0(zza, null, paramString, 3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */