package android.support.v4.media.session;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat$Builder
{
  private long mActions;
  private long mActiveItemId;
  private long mBufferedPosition;
  private final List<PlaybackStateCompat.CustomAction> mCustomActions;
  private int mErrorCode;
  private CharSequence mErrorMessage;
  private Bundle mExtras;
  private long mPosition;
  private float mRate;
  private int mState;
  private long mUpdateTime;
  
  public PlaybackStateCompat$Builder()
  {
    mCustomActions = new ArrayList();
    mActiveItemId = -1L;
  }
  
  public PlaybackStateCompat$Builder(PlaybackStateCompat paramPlaybackStateCompat)
  {
    ArrayList localArrayList = new ArrayList();
    mCustomActions = localArrayList;
    mActiveItemId = -1L;
    mState = mState;
    mPosition = mPosition;
    mRate = mSpeed;
    mUpdateTime = mUpdateTime;
    mBufferedPosition = mBufferedPosition;
    mActions = mActions;
    mErrorCode = mErrorCode;
    mErrorMessage = mErrorMessage;
    List localList = mCustomActions;
    if (localList != null) {
      localArrayList.addAll(localList);
    }
    mActiveItemId = mActiveItemId;
    mExtras = mExtras;
  }
  
  public Builder addCustomAction(PlaybackStateCompat.CustomAction paramCustomAction)
  {
    if (paramCustomAction != null)
    {
      mCustomActions.add(paramCustomAction);
      return this;
    }
    throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
  }
  
  public Builder addCustomAction(String paramString1, String paramString2, int paramInt)
  {
    return addCustomAction(new PlaybackStateCompat.CustomAction(paramString1, paramString2, paramInt, null));
  }
  
  public PlaybackStateCompat build()
  {
    return new PlaybackStateCompat(mState, mPosition, mBufferedPosition, mRate, mActions, mErrorCode, mErrorMessage, mUpdateTime, mCustomActions, mActiveItemId, mExtras);
  }
  
  public Builder setActions(long paramLong)
  {
    mActions = paramLong;
    return this;
  }
  
  public Builder setActiveQueueItemId(long paramLong)
  {
    mActiveItemId = paramLong;
    return this;
  }
  
  public Builder setBufferedPosition(long paramLong)
  {
    mBufferedPosition = paramLong;
    return this;
  }
  
  public Builder setErrorMessage(int paramInt, CharSequence paramCharSequence)
  {
    mErrorCode = paramInt;
    mErrorMessage = paramCharSequence;
    return this;
  }
  
  @Deprecated
  public Builder setErrorMessage(CharSequence paramCharSequence)
  {
    mErrorMessage = paramCharSequence;
    return this;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    mExtras = paramBundle;
    return this;
  }
  
  public Builder setState(int paramInt, long paramLong, float paramFloat)
  {
    return setState(paramInt, paramLong, paramFloat, SystemClock.elapsedRealtime());
  }
  
  public Builder setState(int paramInt, long paramLong1, float paramFloat, long paramLong2)
  {
    mState = paramInt;
    mPosition = paramLong1;
    mUpdateTime = paramLong2;
    mRate = paramFloat;
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */