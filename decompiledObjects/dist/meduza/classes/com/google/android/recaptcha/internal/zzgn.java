package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.k;
import sb.m;

public final class zzgn
  implements zzgx
{
  public static final zzgn zza = new zzgn();
  
  private static final boolean zzb(List paramList)
  {
    ArrayList localArrayList = new ArrayList(m.j(paramList));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(Boolean.valueOf(((zzue)paramList.next()).zzR()));
    }
    return !localArrayList.contains(Boolean.FALSE);
  }
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (zzb(k.r(paramVarArgs)))
    {
      int i = paramVarArgs.length;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        zzue localzzue = paramVarArgs[paramInt];
        paramzzgd.zzc().zzb(localzzue.zzi());
      }
      return;
    }
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */