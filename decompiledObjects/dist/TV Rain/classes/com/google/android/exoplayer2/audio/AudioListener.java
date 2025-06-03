package com.google.android.exoplayer2.audio;

public abstract interface AudioListener
{
  public void onAudioAttributesChanged(AudioAttributes paramAudioAttributes) {}
  
  public void onAudioSessionId(int paramInt) {}
  
  public void onVolumeChanged(float paramFloat) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */