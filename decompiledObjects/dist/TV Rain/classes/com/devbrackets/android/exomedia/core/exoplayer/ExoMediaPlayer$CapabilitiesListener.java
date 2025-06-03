package com.devbrackets.android.exomedia.core.exoplayer;

import com.devbrackets.android.exomedia.core.listener.InternalErrorListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;

class ExoMediaPlayer$CapabilitiesListener
  implements DefaultDrmSessionEventListener
{
  private ExoMediaPlayer$CapabilitiesListener(ExoMediaPlayer paramExoMediaPlayer) {}
  
  public void onDrmKeysLoaded() {}
  
  public void onDrmKeysRemoved() {}
  
  public void onDrmKeysRestored() {}
  
  public void onDrmSessionManagerError(Exception paramException)
  {
    if (ExoMediaPlayer.access$700(this$0) != null) {
      ExoMediaPlayer.access$700(this$0).onDrmSessionManagerError(paramException);
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.CapabilitiesListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */