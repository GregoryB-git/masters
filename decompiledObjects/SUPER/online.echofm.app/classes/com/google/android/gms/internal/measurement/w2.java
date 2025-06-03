package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

public final class w2
  extends ContentObserver
{
  public w2(Handler paramHandler)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    t2.c().set(true);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.w2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */