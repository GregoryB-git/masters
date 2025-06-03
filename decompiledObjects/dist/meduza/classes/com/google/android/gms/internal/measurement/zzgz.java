package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzgz
  extends ContentObserver
{
  public zzgz(zzgx paramzzgx, Handler paramHandler)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    zzgx.zza(zza).set(true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */