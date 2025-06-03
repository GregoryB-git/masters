package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import c0.d;

public class MediaButtonReceiver
  extends d
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(paramIntent.getAction())))
    {
      AudioService localAudioService = AudioService.R;
      if (localAudioService != null)
      {
        localAudioService.P();
        return;
      }
    }
    super.onReceive(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.MediaButtonReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */