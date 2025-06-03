package com.google.android.exoplayer2.drm;

public abstract interface DefaultDrmSession$ProvisioningManager<T extends ExoMediaCrypto>
{
  public abstract void onProvisionCompleted();
  
  public abstract void onProvisionError(Exception paramException);
  
  public abstract void provisionRequired(DefaultDrmSession<T> paramDefaultDrmSession);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */