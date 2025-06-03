package com.google.android.gms.internal.auth_api;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbag;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.g;

final class zbae
  extends zbs
{
  public zbae(zbag paramzbag, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void zbb(Status paramStatus, g paramg)
  {
    if (paramStatus.D())
    {
      zba.setResult(paramg);
      return;
    }
    zba.setException(a0.r(paramStatus));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */