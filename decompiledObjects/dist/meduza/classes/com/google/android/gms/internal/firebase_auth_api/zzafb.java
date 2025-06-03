package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.e0;
import b8.f0;
import u7.h;

final class zzafb
  extends f0
{
  public zzafb(f0 paramf0, String paramString) {}
  
  public final void onCodeAutoRetrievalTimeOut(String paramString)
  {
    zzafc.zza(zzb);
    zza.onCodeAutoRetrievalTimeOut(paramString);
  }
  
  public final void onCodeSent(String paramString, e0 parame0)
  {
    zza.onCodeSent(paramString, parame0);
  }
  
  public final void onVerificationCompleted(c0 paramc0)
  {
    zzafc.zza(zzb);
    zza.onVerificationCompleted(paramc0);
  }
  
  public final void onVerificationFailed(h paramh)
  {
    zzafc.zza(zzb);
    zza.onVerificationFailed(paramh);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */