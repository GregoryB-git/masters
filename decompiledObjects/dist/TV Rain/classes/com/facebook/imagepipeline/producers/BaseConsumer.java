package com.facebook.imagepipeline.producers;

import com.facebook.common.logging.FLog;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class BaseConsumer<T>
  implements Consumer<T>
{
  private boolean mIsFinished = false;
  
  public static boolean isLast(int paramInt)
  {
    boolean bool = true;
    if ((paramInt & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isNotLast(int paramInt)
  {
    return isLast(paramInt) ^ true;
  }
  
  public static int simpleStatusForIsLast(boolean paramBoolean)
  {
    return paramBoolean;
  }
  
  public static boolean statusHasAnyFlag(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & paramInt2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean statusHasFlag(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & paramInt2) == paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int turnOffStatusFlag(int paramInt1, int paramInt2)
  {
    return paramInt1 & paramInt2;
  }
  
  public static int turnOnStatusFlag(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public void onCancellation()
  {
    try
    {
      boolean bool = mIsFinished;
      if (bool) {
        return;
      }
      mIsFinished = true;
      try
      {
        onCancellationImpl();
      }
      catch (Exception localException)
      {
        onUnhandledException(localException);
      }
      return;
    }
    finally {}
  }
  
  public abstract void onCancellationImpl();
  
  public void onFailure(Throwable paramThrowable)
  {
    try
    {
      boolean bool = mIsFinished;
      if (bool) {
        return;
      }
      mIsFinished = true;
      try
      {
        onFailureImpl(paramThrowable);
      }
      catch (Exception paramThrowable)
      {
        onUnhandledException(paramThrowable);
      }
      return;
    }
    finally {}
  }
  
  public abstract void onFailureImpl(Throwable paramThrowable);
  
  public void onNewResult(@Nullable T paramT, int paramInt)
  {
    try
    {
      boolean bool = mIsFinished;
      if (bool) {
        return;
      }
      mIsFinished = isLast(paramInt);
      try
      {
        onNewResultImpl(paramT, paramInt);
      }
      catch (Exception paramT)
      {
        onUnhandledException(paramT);
      }
      return;
    }
    finally {}
  }
  
  public abstract void onNewResultImpl(T paramT, int paramInt);
  
  public void onProgressUpdate(float paramFloat)
  {
    try
    {
      boolean bool = mIsFinished;
      if (bool) {
        return;
      }
      try
      {
        onProgressUpdateImpl(paramFloat);
      }
      catch (Exception localException)
      {
        onUnhandledException(localException);
      }
      return;
    }
    finally {}
  }
  
  public void onProgressUpdateImpl(float paramFloat) {}
  
  public void onUnhandledException(Exception paramException)
  {
    FLog.wtf(getClass(), "unhandled exception", paramException);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BaseConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */