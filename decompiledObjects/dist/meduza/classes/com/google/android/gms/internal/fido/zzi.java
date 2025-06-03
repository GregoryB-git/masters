package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;

@Deprecated
public final class zzi
{
  private final PendingIntent zza;
  
  public zzi(PendingIntent paramPendingIntent)
  {
    zza = paramPendingIntent;
  }
  
  public final boolean hasPendingIntent()
  {
    return zza != null;
  }
  
  public final void launchPendingIntent(Activity paramActivity, int paramInt)
  {
    PendingIntent localPendingIntent = zza;
    if (localPendingIntent != null)
    {
      paramActivity.startIntentSenderForResult(localPendingIntent.getIntentSender(), paramInt, null, 0, 0, 0);
      return;
    }
    throw new IllegalStateException("No PendingIntent available");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */