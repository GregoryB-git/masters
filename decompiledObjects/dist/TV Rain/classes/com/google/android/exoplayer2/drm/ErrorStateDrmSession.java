package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;

public final class ErrorStateDrmSession<T extends ExoMediaCrypto>
  implements DrmSession<T>
{
  private final DrmSession.DrmSessionException error;
  
  public ErrorStateDrmSession(DrmSession.DrmSessionException paramDrmSessionException)
  {
    error = ((DrmSession.DrmSessionException)Assertions.checkNotNull(paramDrmSessionException));
  }
  
  public DrmSession.DrmSessionException getError()
  {
    return error;
  }
  
  public T getMediaCrypto()
  {
    return null;
  }
  
  public byte[] getOfflineLicenseKeySetId()
  {
    return null;
  }
  
  public int getState()
  {
    return 1;
  }
  
  public Map<String, String> queryKeyStatus()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.ErrorStateDrmSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */