package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import java.security.GeneralSecurityException;

final class zznk<P>
  extends zznl<P>
  implements zzci<P>
{
  public zznk(String paramString, Class<P> paramClass, zzalw<? extends zzaln> paramzzalw)
  {
    super(paramString, paramClass, zzwb.zza.zzc, paramzzalw);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwb zzc(zzaiw paramzzaiw)
  {
    paramzzaiw = zzpn.zza(zza, paramzzaiw, zzb, zzxd.zzd, null);
    paramzzaiw = zzom.zza().zza(paramzzaiw, zzbl.zza());
    if ((paramzzaiw instanceof zzcf))
    {
      paramzzaiw = ((zzcf)paramzzaiw).zzb();
      paramzzaiw = (zzpn)zzom.zza().zza(paramzzaiw, com.google.android.gms.internal.firebase-auth-api.zzpn.class, zzbl.zza());
      return (zzwb)zzwb.zza().zza(paramzzaiw.zzf()).zza(paramzzaiw.zzd()).zza(paramzzaiw.zza()).zze();
    }
    throw new GeneralSecurityException("Key not private key");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */