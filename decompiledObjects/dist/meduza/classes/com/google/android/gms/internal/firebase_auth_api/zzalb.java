package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzajx;
import com.google.android.gms.internal.firebase-auth-api.zzakx;
import com.google.android.gms.internal.firebase-auth-api.zzalv;
import com.google.android.gms.internal.firebase-auth-api.zzamf;
import com.google.android.gms.internal.firebase-auth-api.zzamv;

final class zzalb
  implements zzamf
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzalk zza = new zzala();
  private final com.google.android.gms.internal.firebase-auth-api.zzalk zzb;
  
  public zzalb()
  {
    this(new zzalc(new zzalk[] { zzakh.zza(), zza }));
  }
  
  private zzalb(com.google.android.gms.internal.firebase-auth-api.zzalk paramzzalk)
  {
    zzb = ((zzalk)zzaki.zza(paramzzalk, "messageInfoFactory"));
  }
  
  public final <T> zzamc<T> zza(Class<T> paramClass)
  {
    zzame.zza(paramClass);
    com.google.android.gms.internal.firebase-auth-api.zzall localzzall = zzb.zza(paramClass);
    if (localzzall.zzc()) {
      return zzalt.zza(zzame.zza(), zzajz.zza(), localzzall.zza());
    }
    zzalv localzzalv = zzalx.zza();
    zzakx localzzakx = zzakz.zza();
    zzamv localzzamv = zzame.zza();
    int i = zzald.zza[localzzall.zzb().ordinal()];
    int j = 1;
    if (i == 1) {
      j = 0;
    }
    zzajx localzzajx;
    if (j != 0) {
      localzzajx = zzajz.zza();
    } else {
      localzzajx = null;
    }
    return zzalr.zza(paramClass, localzzall, localzzalv, localzzakx, localzzamv, localzzajx, zzali.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */