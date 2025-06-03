package com.google.android.exoplayer2;

import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;

public abstract interface Player$AudioComponent
{
  public abstract void addAudioListener(AudioListener paramAudioListener);
  
  public abstract void clearAuxEffectInfo();
  
  public abstract AudioAttributes getAudioAttributes();
  
  public abstract int getAudioSessionId();
  
  public abstract float getVolume();
  
  public abstract void removeAudioListener(AudioListener paramAudioListener);
  
  @Deprecated
  public abstract void setAudioAttributes(AudioAttributes paramAudioAttributes);
  
  public abstract void setAudioAttributes(AudioAttributes paramAudioAttributes, boolean paramBoolean);
  
  public abstract void setAuxEffectInfo(AuxEffectInfo paramAuxEffectInfo);
  
  public abstract void setVolume(float paramFloat);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Player.AudioComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */