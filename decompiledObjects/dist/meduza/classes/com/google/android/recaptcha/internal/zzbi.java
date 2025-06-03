package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
import nc.a2;
import nc.c1;
import nc.d0;
import nc.e0;
import nc.o1;
import nc.r0;
import sc.d;
import sc.n;
import x6.b;

public final class zzbi
{
  private final d0 zza;
  private final d0 zzb;
  private final d0 zzc;
  private final d0 zzd;
  
  public zzbi()
  {
    a2 locala2 = new a2(null);
    Object localObject = r0.a;
    zza = new d(locala2.plus(n.a));
    localObject = e0.a(new c1(Executors.newSingleThreadExecutor()));
    b.g0((d0)localObject, null, new zzbh(null), 3);
    zzb = ((d0)localObject);
    zzc = e0.a(r0.b);
    localObject = e0.a(new c1(Executors.newSingleThreadExecutor()));
    b.g0((d0)localObject, null, new zzbg(null), 3);
    zzd = ((d0)localObject);
  }
  
  public final d0 zza()
  {
    return zzc;
  }
  
  public final d0 zzb()
  {
    return zza;
  }
  
  public final d0 zzc()
  {
    return zzd;
  }
  
  public final d0 zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */