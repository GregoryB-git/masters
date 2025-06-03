package com.google.android.exoplayer2.drm;

import android.os.Handler;
import android.os.Message;

class DefaultDrmSessionManager$MediaDrmEventListener
  implements ExoMediaDrm.OnEventListener<T>
{
  private DefaultDrmSessionManager$MediaDrmEventListener(DefaultDrmSessionManager paramDefaultDrmSessionManager) {}
  
  public void onEvent(ExoMediaDrm<? extends T> paramExoMediaDrm, byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    if (DefaultDrmSessionManager.access$300(this$0) == 0) {
      this$0.mediaDrmHandler.obtainMessage(paramInt1, paramArrayOfByte1).sendToTarget();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */