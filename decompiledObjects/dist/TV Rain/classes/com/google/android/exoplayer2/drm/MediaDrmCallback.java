package com.google.android.exoplayer2.drm;

import java.util.UUID;

public abstract interface MediaDrmCallback
{
  public abstract byte[] executeKeyRequest(UUID paramUUID, ExoMediaDrm.KeyRequest paramKeyRequest)
    throws Exception;
  
  public abstract byte[] executeProvisionRequest(UUID paramUUID, ExoMediaDrm.ProvisionRequest paramProvisionRequest)
    throws Exception;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.MediaDrmCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */