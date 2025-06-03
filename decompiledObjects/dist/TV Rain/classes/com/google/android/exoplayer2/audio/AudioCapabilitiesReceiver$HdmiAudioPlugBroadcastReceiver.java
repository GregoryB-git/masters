package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver
  extends BroadcastReceiver
{
  private AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver paramAudioCapabilitiesReceiver) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!isInitialStickyBroadcast())
    {
      paramContext = AudioCapabilities.getCapabilities(paramIntent);
      if (!paramContext.equals(this$0.audioCapabilities))
      {
        paramIntent = this$0;
        audioCapabilities = paramContext;
        AudioCapabilitiesReceiver.access$100(paramIntent).onAudioCapabilitiesChanged(paramContext);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.HdmiAudioPlugBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */