package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
class DefaultDrmSession$PostRequestHandler
  extends Handler
{
  public DefaultDrmSession$PostRequestHandler(DefaultDrmSession paramDefaultDrmSession, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private long getRetryDelayMillis(int paramInt)
  {
    return Math.min((paramInt - 1) * 1000, 5000);
  }
  
  private boolean maybeRetryRequest(Message paramMessage)
  {
    if (arg1 == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return false;
    }
    int i = arg2 + 1;
    if (i > DefaultDrmSession.access$200(this$0)) {
      return false;
    }
    paramMessage = Message.obtain(paramMessage);
    arg2 = i;
    sendMessageDelayed(paramMessage, getRetryDelayMillis(i));
    return true;
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = obj;
    try
    {
      int i = what;
      Object localObject2;
      if (i != 0)
      {
        if (i == 1)
        {
          localObject2 = this$0;
          localObject2 = callback.executeKeyRequest(uuid, (ExoMediaDrm.KeyRequest)localObject1);
        }
        else
        {
          localObject2 = new java/lang/RuntimeException;
          ((RuntimeException)localObject2).<init>();
          throw ((Throwable)localObject2);
        }
      }
      else
      {
        localObject2 = this$0;
        localObject2 = callback.executeProvisionRequest(uuid, (ExoMediaDrm.ProvisionRequest)localObject1);
      }
    }
    catch (Exception localException)
    {
      if (maybeRetryRequest(paramMessage)) {
        return;
      }
    }
    this$0.postResponseHandler.obtainMessage(what, Pair.create(localObject1, localException)).sendToTarget();
  }
  
  public void post(int paramInt, Object paramObject, boolean paramBoolean)
  {
    obtainMessage(paramInt, paramBoolean, 0, paramObject).sendToTarget();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DefaultDrmSession.PostRequestHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */