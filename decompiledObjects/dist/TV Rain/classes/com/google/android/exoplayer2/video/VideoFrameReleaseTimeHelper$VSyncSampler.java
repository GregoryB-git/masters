package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.google.android.exoplayer2.util.Util;

final class VideoFrameReleaseTimeHelper$VSyncSampler
  implements Choreographer.FrameCallback, Handler.Callback
{
  private static final int CREATE_CHOREOGRAPHER = 0;
  private static final VSyncSampler INSTANCE = new VSyncSampler();
  private static final int MSG_ADD_OBSERVER = 1;
  private static final int MSG_REMOVE_OBSERVER = 2;
  private Choreographer choreographer;
  private final HandlerThread choreographerOwnerThread;
  private final Handler handler;
  private int observerCount;
  public volatile long sampledVsyncTimeNs = -9223372036854775807L;
  
  private VideoFrameReleaseTimeHelper$VSyncSampler()
  {
    Object localObject = new HandlerThread("ChoreographerOwner:Handler");
    choreographerOwnerThread = ((HandlerThread)localObject);
    ((Thread)localObject).start();
    localObject = Util.createHandler(((HandlerThread)localObject).getLooper(), this);
    handler = ((Handler)localObject);
    ((Handler)localObject).sendEmptyMessage(0);
  }
  
  private void addObserverInternal()
  {
    int i = observerCount + 1;
    observerCount = i;
    if (i == 1) {
      choreographer.postFrameCallback(this);
    }
  }
  
  private void createChoreographerInstanceInternal()
  {
    choreographer = Choreographer.getInstance();
  }
  
  public static VSyncSampler getInstance()
  {
    return INSTANCE;
  }
  
  private void removeObserverInternal()
  {
    int i = observerCount - 1;
    observerCount = i;
    if (i == 0)
    {
      choreographer.removeFrameCallback(this);
      sampledVsyncTimeNs = -9223372036854775807L;
    }
  }
  
  public void addObserver()
  {
    handler.sendEmptyMessage(1);
  }
  
  public void doFrame(long paramLong)
  {
    sampledVsyncTimeNs = paramLong;
    choreographer.postFrameCallbackDelayed(this, 500L);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          return false;
        }
        removeObserverInternal();
        return true;
      }
      addObserverInternal();
      return true;
    }
    createChoreographerInstanceInternal();
    return true;
  }
  
  public void removeObserver()
  {
    handler.sendEmptyMessage(2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper.VSyncSampler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */