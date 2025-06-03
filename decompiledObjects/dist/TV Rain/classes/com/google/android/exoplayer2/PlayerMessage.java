package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

public final class PlayerMessage
{
  private boolean deleteAfterDelivery;
  private Handler handler;
  private boolean isCanceled;
  private boolean isDelivered;
  private boolean isProcessed;
  private boolean isSent;
  @Nullable
  private Object payload;
  private long positionMs;
  private final Sender sender;
  private final Target target;
  private final Timeline timeline;
  private int type;
  private int windowIndex;
  
  public PlayerMessage(Sender paramSender, Target paramTarget, Timeline paramTimeline, int paramInt, Handler paramHandler)
  {
    sender = paramSender;
    target = paramTarget;
    timeline = paramTimeline;
    handler = paramHandler;
    windowIndex = paramInt;
    positionMs = -9223372036854775807L;
    deleteAfterDelivery = true;
  }
  
  public boolean blockUntilDelivered()
    throws InterruptedException
  {
    try
    {
      Assertions.checkState(isSent);
      if (handler.getLooper().getThread() != Thread.currentThread()) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      while (!isProcessed) {
        wait();
      }
      boolean bool = isDelivered;
      return bool;
    }
    finally {}
  }
  
  public PlayerMessage cancel()
  {
    try
    {
      Assertions.checkState(isSent);
      isCanceled = true;
      markAsProcessed(false);
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean getDeleteAfterDelivery()
  {
    return deleteAfterDelivery;
  }
  
  public Handler getHandler()
  {
    return handler;
  }
  
  @Nullable
  public Object getPayload()
  {
    return payload;
  }
  
  public long getPositionMs()
  {
    return positionMs;
  }
  
  public Target getTarget()
  {
    return target;
  }
  
  public Timeline getTimeline()
  {
    return timeline;
  }
  
  public int getType()
  {
    return type;
  }
  
  public int getWindowIndex()
  {
    return windowIndex;
  }
  
  public boolean isCanceled()
  {
    try
    {
      boolean bool = isCanceled;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void markAsProcessed(boolean paramBoolean)
  {
    try
    {
      isDelivered = (paramBoolean | isDelivered);
      isProcessed = true;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public PlayerMessage send()
  {
    Assertions.checkState(isSent ^ true);
    if (positionMs == -9223372036854775807L) {
      Assertions.checkArgument(deleteAfterDelivery);
    }
    isSent = true;
    sender.sendMessage(this);
    return this;
  }
  
  public PlayerMessage setDeleteAfterDelivery(boolean paramBoolean)
  {
    Assertions.checkState(isSent ^ true);
    deleteAfterDelivery = paramBoolean;
    return this;
  }
  
  public PlayerMessage setHandler(Handler paramHandler)
  {
    Assertions.checkState(isSent ^ true);
    handler = paramHandler;
    return this;
  }
  
  public PlayerMessage setPayload(@Nullable Object paramObject)
  {
    Assertions.checkState(isSent ^ true);
    payload = paramObject;
    return this;
  }
  
  public PlayerMessage setPosition(int paramInt, long paramLong)
  {
    boolean bool1 = isSent;
    boolean bool2 = true;
    Assertions.checkState(bool1 ^ true);
    if (paramLong == -9223372036854775807L) {
      bool2 = false;
    }
    Assertions.checkArgument(bool2);
    if ((paramInt >= 0) && ((timeline.isEmpty()) || (paramInt < timeline.getWindowCount())))
    {
      windowIndex = paramInt;
      positionMs = paramLong;
      return this;
    }
    throw new IllegalSeekPositionException(timeline, paramInt, paramLong);
  }
  
  public PlayerMessage setPosition(long paramLong)
  {
    Assertions.checkState(isSent ^ true);
    positionMs = paramLong;
    return this;
  }
  
  public PlayerMessage setType(int paramInt)
  {
    Assertions.checkState(isSent ^ true);
    type = paramInt;
    return this;
  }
  
  public static abstract interface Sender
  {
    public abstract void sendMessage(PlayerMessage paramPlayerMessage);
  }
  
  public static abstract interface Target
  {
    public abstract void handleMessage(int paramInt, @Nullable Object paramObject)
      throws ExoPlaybackException;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.PlayerMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */