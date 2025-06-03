package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"HandlerLeak"})
class DefaultDrmSessionManager$MediaDrmHandler
  extends Handler
{
  public DefaultDrmSessionManager$MediaDrmHandler(DefaultDrmSessionManager paramDefaultDrmSessionManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    byte[] arrayOfByte = (byte[])obj;
    Iterator localIterator = DefaultDrmSessionManager.access$200(this$0).iterator();
    while (localIterator.hasNext())
    {
      DefaultDrmSession localDefaultDrmSession = (DefaultDrmSession)localIterator.next();
      if (localDefaultDrmSession.hasSessionId(arrayOfByte)) {
        localDefaultDrmSession.onMediaDrmEvent(what);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */