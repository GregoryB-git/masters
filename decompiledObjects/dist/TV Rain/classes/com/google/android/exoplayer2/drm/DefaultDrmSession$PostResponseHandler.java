package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
class DefaultDrmSession$PostResponseHandler
  extends Handler
{
  public DefaultDrmSession$PostResponseHandler(DefaultDrmSession paramDefaultDrmSession, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = (Pair)obj;
    Object localObject2 = first;
    localObject1 = second;
    int i = what;
    if (i != 0)
    {
      if (i == 1) {
        DefaultDrmSession.access$100(this$0, localObject2, localObject1);
      }
    }
    else {
      DefaultDrmSession.access$000(this$0, localObject2, localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSession.PostResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */