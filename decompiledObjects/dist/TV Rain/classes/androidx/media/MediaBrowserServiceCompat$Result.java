package androidx.media;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.Nullable;
import z2;

public class MediaBrowserServiceCompat$Result<T>
{
  private final Object mDebug;
  private boolean mDetachCalled;
  private int mFlags;
  private boolean mSendErrorCalled;
  private boolean mSendResultCalled;
  
  public MediaBrowserServiceCompat$Result(Object paramObject)
  {
    mDebug = paramObject;
  }
  
  private void checkExtraFields(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    if (paramBundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
    {
      float f = paramBundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
      if ((f < -1.0E-5F) || (f > 1.00001F)) {
        throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
      }
    }
  }
  
  public void detach()
  {
    if (!mDetachCalled)
    {
      if (!mSendResultCalled)
      {
        if (!mSendErrorCalled)
        {
          mDetachCalled = true;
          return;
        }
        localStringBuilder = z2.t("detach() called when sendError() had already been called for: ");
        localStringBuilder.append(mDebug);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      localStringBuilder = z2.t("detach() called when sendResult() had already been called for: ");
      localStringBuilder.append(mDebug);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = z2.t("detach() called when detach() had already been called for: ");
    localStringBuilder.append(mDebug);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public int getFlags()
  {
    return mFlags;
  }
  
  public boolean isDone()
  {
    boolean bool;
    if ((!mDetachCalled) && (!mSendResultCalled) && (!mSendErrorCalled)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onErrorSent(@Nullable Bundle paramBundle)
  {
    paramBundle = z2.t("It is not supported to send an error for ");
    paramBundle.append(mDebug);
    throw new UnsupportedOperationException(paramBundle.toString());
  }
  
  public void onProgressUpdateSent(@Nullable Bundle paramBundle)
  {
    paramBundle = z2.t("It is not supported to send an interim update for ");
    paramBundle.append(mDebug);
    throw new UnsupportedOperationException(paramBundle.toString());
  }
  
  public void onResultSent(@Nullable T paramT) {}
  
  public void sendError(@Nullable Bundle paramBundle)
  {
    if ((!mSendResultCalled) && (!mSendErrorCalled))
    {
      mSendErrorCalled = true;
      onErrorSent(paramBundle);
      return;
    }
    paramBundle = z2.t("sendError() called when either sendResult() or sendError() had already been called for: ");
    paramBundle.append(mDebug);
    throw new IllegalStateException(paramBundle.toString());
  }
  
  public void sendProgressUpdate(@Nullable Bundle paramBundle)
  {
    if ((!mSendResultCalled) && (!mSendErrorCalled))
    {
      checkExtraFields(paramBundle);
      onProgressUpdateSent(paramBundle);
      return;
    }
    paramBundle = z2.t("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
    paramBundle.append(mDebug);
    throw new IllegalStateException(paramBundle.toString());
  }
  
  public void sendResult(@Nullable T paramT)
  {
    if ((!mSendResultCalled) && (!mSendErrorCalled))
    {
      mSendResultCalled = true;
      onResultSent(paramT);
      return;
    }
    paramT = z2.t("sendResult() called when either sendResult() or sendError() had already been called for: ");
    paramT.append(mDebug);
    throw new IllegalStateException(paramT.toString());
  }
  
  public void setFlags(int paramInt)
  {
    mFlags = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.media.MediaBrowserServiceCompat.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */