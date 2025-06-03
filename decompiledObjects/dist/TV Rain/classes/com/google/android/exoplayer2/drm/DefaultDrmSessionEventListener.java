package com.google.android.exoplayer2.drm;

public abstract interface DefaultDrmSessionEventListener
{
  public abstract void onDrmKeysLoaded();
  
  public abstract void onDrmKeysRemoved();
  
  public abstract void onDrmKeysRestored();
  
  public void onDrmSessionAcquired() {}
  
  public abstract void onDrmSessionManagerError(Exception paramException);
  
  public void onDrmSessionReleased() {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */