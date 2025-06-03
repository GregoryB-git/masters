package com.devbrackets.android.exomedia.core.exoplayer;

import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import java.util.UUID;

class ExoMediaPlayer$DelegatedMediaDrmCallback
  implements MediaDrmCallback
{
  private ExoMediaPlayer$DelegatedMediaDrmCallback(ExoMediaPlayer paramExoMediaPlayer) {}
  
  public byte[] executeKeyRequest(UUID paramUUID, ExoMediaDrm.KeyRequest paramKeyRequest)
    throws Exception
  {
    if (ExoMediaPlayer.access$600(this$0) != null) {
      paramUUID = ExoMediaPlayer.access$600(this$0).executeKeyRequest(paramUUID, paramKeyRequest);
    } else {
      paramUUID = new byte[0];
    }
    return paramUUID;
  }
  
  public byte[] executeProvisionRequest(UUID paramUUID, ExoMediaDrm.ProvisionRequest paramProvisionRequest)
    throws Exception
  {
    if (ExoMediaPlayer.access$600(this$0) != null) {
      paramUUID = ExoMediaPlayer.access$600(this$0).executeProvisionRequest(paramUUID, paramProvisionRequest);
    } else {
      paramUUID = new byte[0];
    }
    return paramUUID;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.DelegatedMediaDrmCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */