package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public abstract interface zzaq
{
  public static final zzaq zzc = new zzax();
  public static final zzaq zzd = new zzao();
  public static final zzaq zze = new zzaj("continue");
  public static final zzaq zzf = new zzaj("break");
  public static final zzaq zzg = new zzaj("return");
  public static final zzaq zzh = new zzag(Boolean.TRUE);
  public static final zzaq zzi = new zzag(Boolean.FALSE);
  public static final zzaq zzj = new zzas("");
  
  public abstract zzaq zza(String paramString, zzh paramzzh, List<zzaq> paramList);
  
  public abstract zzaq zzc();
  
  public abstract Boolean zzd();
  
  public abstract Double zze();
  
  public abstract String zzf();
  
  public abstract Iterator<zzaq> zzh();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */