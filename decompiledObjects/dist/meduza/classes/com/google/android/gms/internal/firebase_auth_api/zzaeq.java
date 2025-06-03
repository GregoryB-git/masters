package com.google.android.gms.internal.firebase_auth_api;

import b8.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import m6.j;

public final class zzaeq<ResultT, CallbackT>
  implements zzaeh<ResultT>
{
  private final zzaeg<ResultT, CallbackT> zza;
  private final TaskCompletionSource<ResultT> zzb;
  
  public zzaeq(zzaeg<ResultT, CallbackT> paramzzaeg, TaskCompletionSource<ResultT> paramTaskCompletionSource)
  {
    zza = paramzzaeg;
    zzb = paramTaskCompletionSource;
  }
  
  public final void zza(ResultT paramResultT, Status paramStatus)
  {
    j.j(zzb, "completion source cannot be null");
    if (paramStatus != null)
    {
      paramResultT = zza;
      if (zzq != null)
      {
        paramStatus = zzb;
        localObject = FirebaseAuth.getInstance(zzc);
        paramResultT = zza;
        zzzs localzzzs = zzq;
        if ((!"reauthenticateWithCredential".equals(paramResultT.zza())) && (!"reauthenticateWithCredentialWithData".equals(zza.zza()))) {
          paramResultT = null;
        } else {
          paramResultT = zza.zzd;
        }
        paramStatus.setException(zzadr.zza((FirebaseAuth)localObject, localzzzs, paramResultT));
        return;
      }
      Object localObject = zzn;
      if (localObject != null)
      {
        zzb.setException(zzadr.zza(paramStatus, (f)localObject, zzo, zzp));
        return;
      }
      zzb.setException(zzadr.zza(paramStatus));
      return;
    }
    zzb.setResult(paramResultT);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaeq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */