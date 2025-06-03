package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k6.c;
import p6.a;

final class zzafi
  extends zzadp
{
  private final String zza;
  
  public zzafi(com.google.android.gms.internal.firebase-auth-api.zzafd paramzzafd, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, String paramString)
  {
    super(paramzzadp);
    zza = paramString;
  }
  
  public final void zza(Status paramStatus)
  {
    Object localObject = zzafd.zza();
    String str1 = c.a(a);
    String str2 = b;
    StringBuilder localStringBuilder = new StringBuilder("SMS verification code request failed: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" ");
    localStringBuilder.append(str2);
    ((a)localObject).c(localStringBuilder.toString(), new Object[0]);
    localObject = (zzafk)zzafd.zza(zzb).get(zza);
    if (localObject == null) {
      return;
    }
    localObject = zzb.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zzadp)((Iterator)localObject).next()).zza(paramStatus);
    }
    zzb.zzb(zza);
  }
  
  public final void zzb(String paramString)
  {
    zzafd.zza().a("onCodeSent", new Object[0]);
    zzafk localzzafk = (zzafk)zzafd.zza(zzb).get(zza);
    if (localzzafk == null) {
      return;
    }
    Iterator localIterator = zzb.iterator();
    while (localIterator.hasNext()) {
      ((zzadp)localIterator.next()).zzb(paramString);
    }
    zzg = true;
    zzd = paramString;
    if (zza <= 0L)
    {
      zzafd.zzd(zzb, zza);
      return;
    }
    if (!zzc)
    {
      zzafd.zzc(zzb, zza);
      return;
    }
    if (!zzae.zzc(zze)) {
      zzafd.zzb(zzb, zza);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */