package com.google.android.gms.internal.auth;

import a6.a;
import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import k6.e;
import k6.g;
import k6.j;

public final class zzal
{
  private static final Status zza = new Status(13, null, null, null);
  
  public final g<Object> addWorkAccount(e parame, String paramString)
  {
    return parame.b(new zzae(this, a.a, parame, paramString));
  }
  
  public final g<j> removeWorkAccount(e parame, Account paramAccount)
  {
    return parame.b(new zzag(this, a.a, parame, paramAccount));
  }
  
  public final void setWorkAuthenticatorEnabled(e parame, boolean paramBoolean)
  {
    setWorkAuthenticatorEnabledWithResult(parame, paramBoolean);
  }
  
  public final g<j> setWorkAuthenticatorEnabledWithResult(e parame, boolean paramBoolean)
  {
    return parame.b(new zzac(this, a.a, parame, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */