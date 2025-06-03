package com.google.android.gms.internal.firebase_auth_api;

import android.net.Uri;
import android.text.TextUtils;
import b8.c1;
import b8.t0;
import java.util.ArrayList;
import java.util.List;
import m6.j;

public final class zzagl
{
  private String zza;
  private String zzb;
  private boolean zzc;
  private String zzd;
  private String zze;
  private com.google.android.gms.internal.firebase-auth-api.zzahb zzf;
  private String zzg;
  private long zzh;
  private long zzi;
  private boolean zzj;
  private c1 zzk;
  private List<zzagz> zzl;
  private zzaj<t0> zzm;
  
  public zzagl()
  {
    zzf = new zzahb();
    zzm = zzaj.zzh();
  }
  
  public zzagl(String paramString1, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, zzahb paramzzahb, String paramString5, String paramString6, long paramLong1, long paramLong2, boolean paramBoolean2, c1 paramc1, List<zzagz> paramList, zzaj<t0> paramzzaj)
  {
    zza = paramString1;
    zzb = paramString2;
    zzc = paramBoolean1;
    zzd = paramString3;
    zze = paramString4;
    if (paramzzahb == null)
    {
      paramString1 = new zzahb();
    }
    else
    {
      paramString2 = paramzzahb.zza();
      paramString1 = new zzahb();
      if (paramString2 != null) {
        paramString1.zza().addAll(paramString2);
      }
    }
    zzf = paramString1;
    zzg = paramString6;
    zzh = paramLong1;
    zzi = paramLong2;
    zzj = false;
    zzk = null;
    if (paramList == null) {
      paramList = new ArrayList();
    }
    zzl = paramList;
    zzm = paramzzaj;
  }
  
  public final long zza()
  {
    return zzh;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagl zza(c1 paramc1)
  {
    zzk = paramc1;
    return this;
  }
  
  public final zzagl zza(zzaj<t0> paramzzaj)
  {
    j.i(paramzzaj);
    zzm = paramzzaj;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagl zza(String paramString)
  {
    zzd = paramString;
    return this;
  }
  
  public final zzagl zza(List<zzahc> paramList)
  {
    j.i(paramList);
    zzahb localzzahb = new zzahb();
    zzf = localzzahb;
    localzzahb.zza().addAll(paramList);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagl zza(boolean paramBoolean)
  {
    zzj = paramBoolean;
    return this;
  }
  
  public final long zzb()
  {
    return zzi;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagl zzb(String paramString)
  {
    zzb = paramString;
    return this;
  }
  
  public final Uri zzc()
  {
    if (!TextUtils.isEmpty(zze)) {
      return Uri.parse(zze);
    }
    return null;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagl zzc(String paramString)
  {
    zze = paramString;
    return this;
  }
  
  public final zzaj<t0> zzd()
  {
    return zzm;
  }
  
  public final c1 zze()
  {
    return zzk;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahb zzf()
  {
    return zzf;
  }
  
  public final String zzg()
  {
    return zzd;
  }
  
  public final String zzh()
  {
    return zzb;
  }
  
  public final String zzi()
  {
    return zza;
  }
  
  public final String zzj()
  {
    return zzg;
  }
  
  public final List<zzagz> zzk()
  {
    return zzl;
  }
  
  public final List<zzahc> zzl()
  {
    return zzf.zza();
  }
  
  public final boolean zzm()
  {
    return zzc;
  }
  
  public final boolean zzn()
  {
    return zzj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */