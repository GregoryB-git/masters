package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.UUID;

public final class LocalMediaDrmCallback
  implements MediaDrmCallback
{
  private final byte[] keyResponse;
  
  public LocalMediaDrmCallback(byte[] paramArrayOfByte)
  {
    keyResponse = ((byte[])Assertions.checkNotNull(paramArrayOfByte));
  }
  
  public byte[] executeKeyRequest(UUID paramUUID, ExoMediaDrm.KeyRequest paramKeyRequest)
    throws Exception
  {
    return keyResponse;
  }
  
  public byte[] executeProvisionRequest(UUID paramUUID, ExoMediaDrm.ProvisionRequest paramProvisionRequest)
    throws IOException
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.LocalMediaDrmCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */