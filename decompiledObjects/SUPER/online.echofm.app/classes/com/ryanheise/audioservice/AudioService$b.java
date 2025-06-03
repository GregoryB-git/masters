package com.ryanheise.audioservice;

import a0.o;

public class AudioService$b
  extends o
{
  public AudioService$b(AudioService paramAudioService, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt2, paramInt3);
  }
  
  public void d(int paramInt)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().H(paramInt);
  }
  
  public void e(int paramInt)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().x(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */