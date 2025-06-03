package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzca
  extends ContentObserver
{
  public zzca(Handler paramHandler)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    zzcb.zzb().set(true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */