package com.google.android.gms.internal.firebase_auth_api;

public class zznl<P>
  implements zzbn<P>
{
  public final String zza;
  public final com.google.android.gms.internal.firebase-auth-api.zzwb.zza zzb;
  private final Class<P> zzc;
  
  public zznl(String paramString, Class<P> paramClass, zzwb.zza paramzza, zzalw<? extends zzaln> paramzzalw)
  {
    zza = paramString;
    zzc = paramClass;
    zzb = paramzza;
  }
  
  public static <P> zzbn<P> zza(String paramString, Class<P> paramClass, zzwb.zza paramzza, zzalw<? extends zzaln> paramzzalw)
  {
    return new zznl(paramString, paramClass, paramzza, paramzzalw);
  }
  
  public static <P> zzci<P> zza(String paramString, Class<P> paramClass, zzalw<? extends zzaln> paramzzalw)
  {
    return new zznk(paramString, paramClass, paramzzalw);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwb zza(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    paramzzaiw = zzpm.zza((zzwf)zzwf.zza().zza(zza).zza(paramzzaiw).zza(zzxd.zzd).zze());
    paramzzaiw = zzom.zza().zza(paramzzaiw);
    paramzzaiw = zzoc.zza().zza(paramzzaiw, null);
    paramzzaiw = (zzpn)zzom.zza().zza(paramzzaiw, com.google.android.gms.internal.firebase-auth-api.zzpn.class, zzbl.zza());
    return (zzwb)zzwb.zza().zza(paramzzaiw.zzf()).zza(paramzzaiw.zzd()).zza(paramzzaiw.zza()).zze();
  }
  
  public final Class<P> zza()
  {
    return zzc;
  }
  
  public final P zzb(zzaiw paramzzaiw)
  {
    paramzzaiw = zzpn.zza(zza, paramzzaiw, zzb, zzxd.zzd, null);
    paramzzaiw = zzom.zza().zza(paramzzaiw, zzbl.zza());
    return (P)zzon.zza().zza(paramzzaiw, zzc);
  }
  
  public final String zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */