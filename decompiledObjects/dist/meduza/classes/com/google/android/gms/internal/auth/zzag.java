package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import k6.e;
import k6.j;

final class zzag
  extends com.google.android.gms.common.api.internal.a
{
  public zzag(zzal paramzzal, k6.a parama, e parame, Account paramAccount)
  {
    super(parama, parame);
  }
  
  public final j createFailedResult(Status paramStatus)
  {
    return new zzak(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */