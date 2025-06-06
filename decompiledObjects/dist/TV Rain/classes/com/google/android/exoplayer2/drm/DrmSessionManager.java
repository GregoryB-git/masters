package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.os.Looper;

@TargetApi(16)
public abstract interface DrmSessionManager<T extends ExoMediaCrypto>
{
  public abstract DrmSession<T> acquireSession(Looper paramLooper, DrmInitData paramDrmInitData);
  
  public abstract boolean canAcquireSession(DrmInitData paramDrmInitData);
  
  public abstract void releaseSession(DrmSession<T> paramDrmSession);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmSessionManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */