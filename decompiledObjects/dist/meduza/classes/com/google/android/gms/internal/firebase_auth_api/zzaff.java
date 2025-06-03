package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.tasks.OnFailureListener;
import f;
import p6.a;

final class zzaff
  implements OnFailureListener
{
  public zzaff(com.google.android.gms.internal.firebase-auth-api.zzafd paramzzafd) {}
  
  public final void onFailure(Exception paramException)
  {
    zzafd.zza().c(f.j("SmsRetrieverClient failed to start: ", paramException.getMessage()), new Object[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaff
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */