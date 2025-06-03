package com.google.android.gms.internal.auth_api;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbaa;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.a;

final class zbz
  extends zbi
{
  public zbz(zbaa paramzbaa, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void zbb(Status paramStatus, a parama)
  {
    if (paramStatus.D())
    {
      zba.setResult(parama);
      return;
    }
    zba.setException(a0.r(paramStatus));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */