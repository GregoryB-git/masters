package com.google.android.gms.auth.api.signin.internal;

import a0.j;
import android.content.Context;
import android.os.Binder;
import v6.h;

public final class zbt
  extends zbo
{
  public final Context a;
  
  public zbt(Context paramContext)
  {
    a = paramContext;
  }
  
  public final void g()
  {
    if (h.a(a, Binder.getCallingUid())) {
      return;
    }
    throw new SecurityException(j.h("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zbt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */