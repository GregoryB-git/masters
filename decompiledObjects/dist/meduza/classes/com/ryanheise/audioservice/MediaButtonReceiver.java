package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import i1.a;

public class MediaButtonReceiver
  extends a
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(paramIntent.getAction())) && (AudioService.F != null))
    {
      paramContext = AudioService.H;
      if (paramContext != null) {
        ((b.c)paramContext).a("onNotificationDeleted", b.k(new Object[0]), null);
      }
      return;
    }
    super.onReceive(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.MediaButtonReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */