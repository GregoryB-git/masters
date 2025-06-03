package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat
  implements Parcelable
{
  public static final long ACTION_FAST_FORWARD = 64L;
  public static final long ACTION_PAUSE = 2L;
  public static final long ACTION_PLAY = 4L;
  public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
  public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
  public static final long ACTION_PLAY_FROM_URI = 8192L;
  public static final long ACTION_PLAY_PAUSE = 512L;
  public static final long ACTION_PREPARE = 16384L;
  public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
  public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
  public static final long ACTION_PREPARE_FROM_URI = 131072L;
  public static final long ACTION_REWIND = 8L;
  public static final long ACTION_SEEK_TO = 256L;
  public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576L;
  public static final long ACTION_SET_PLAYBACK_SPEED = 4194304L;
  public static final long ACTION_SET_RATING = 128L;
  public static final long ACTION_SET_REPEAT_MODE = 262144L;
  public static final long ACTION_SET_SHUFFLE_MODE = 2097152L;
  @Deprecated
  public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288L;
  public static final long ACTION_SKIP_TO_NEXT = 32L;
  public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
  public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
  public static final long ACTION_STOP = 1L;
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator()
  {
    public PlaybackStateCompat createFromParcel(Parcel paramAnonymousParcel)
    {
      return new PlaybackStateCompat(paramAnonymousParcel);
    }
    
    public PlaybackStateCompat[] newArray(int paramAnonymousInt)
    {
      return new PlaybackStateCompat[paramAnonymousInt];
    }
  };
  public static final int ERROR_CODE_ACTION_ABORTED = 10;
  public static final int ERROR_CODE_APP_ERROR = 1;
  public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
  public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
  public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
  public static final int ERROR_CODE_END_OF_QUEUE = 11;
  public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
  public static final int ERROR_CODE_NOT_SUPPORTED = 2;
  public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
  public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
  public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
  public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
  private static final int KEYCODE_MEDIA_PAUSE = 127;
  private static final int KEYCODE_MEDIA_PLAY = 126;
  public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
  public static final int REPEAT_MODE_ALL = 2;
  public static final int REPEAT_MODE_GROUP = 3;
  public static final int REPEAT_MODE_INVALID = -1;
  public static final int REPEAT_MODE_NONE = 0;
  public static final int REPEAT_MODE_ONE = 1;
  public static final int SHUFFLE_MODE_ALL = 1;
  public static final int SHUFFLE_MODE_GROUP = 2;
  public static final int SHUFFLE_MODE_INVALID = -1;
  public static final int SHUFFLE_MODE_NONE = 0;
  public static final int STATE_BUFFERING = 6;
  public static final int STATE_CONNECTING = 8;
  public static final int STATE_ERROR = 7;
  public static final int STATE_FAST_FORWARDING = 4;
  public static final int STATE_NONE = 0;
  public static final int STATE_PAUSED = 2;
  public static final int STATE_PLAYING = 3;
  public static final int STATE_REWINDING = 5;
  public static final int STATE_SKIPPING_TO_NEXT = 10;
  public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
  public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
  public static final int STATE_STOPPED = 1;
  public final long mActions;
  public final long mActiveItemId;
  public final long mBufferedPosition;
  public List<CustomAction> mCustomActions;
  public final int mErrorCode;
  public final CharSequence mErrorMessage;
  public final Bundle mExtras;
  public final long mPosition;
  public final float mSpeed;
  public final int mState;
  private PlaybackState mStateFwk;
  public final long mUpdateTime;
  
  public PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List<CustomAction> paramList, long paramLong5, Bundle paramBundle)
  {
    mState = paramInt1;
    mPosition = paramLong1;
    mBufferedPosition = paramLong2;
    mSpeed = paramFloat;
    mActions = paramLong3;
    mErrorCode = paramInt2;
    mErrorMessage = paramCharSequence;
    mUpdateTime = paramLong4;
    mCustomActions = new ArrayList(paramList);
    mActiveItemId = paramLong5;
    mExtras = paramBundle;
  }
  
  public PlaybackStateCompat(Parcel paramParcel)
  {
    mState = paramParcel.readInt();
    mPosition = paramParcel.readLong();
    mSpeed = paramParcel.readFloat();
    mUpdateTime = paramParcel.readLong();
    mBufferedPosition = paramParcel.readLong();
    mActions = paramParcel.readLong();
    mErrorMessage = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mCustomActions = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    mActiveItemId = paramParcel.readLong();
    mExtras = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    mErrorCode = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat fromPlaybackState(Object paramObject)
  {
    Object localObject = null;
    Iterator localIterator = null;
    if (paramObject != null)
    {
      PlaybackState localPlaybackState = (PlaybackState)paramObject;
      List localList = Api21Impl.getCustomActions(localPlaybackState);
      paramObject = localIterator;
      if (localList != null)
      {
        localObject = new ArrayList(localList.size());
        localIterator = localList.iterator();
        for (;;)
        {
          paramObject = localObject;
          if (!localIterator.hasNext()) {
            break;
          }
          ((ArrayList)localObject).add(CustomAction.fromCustomAction(localIterator.next()));
        }
      }
      localObject = Api22Impl.getExtras(localPlaybackState);
      MediaSessionCompat.ensureClassLoader((Bundle)localObject);
      localObject = new PlaybackStateCompat(Api21Impl.getState(localPlaybackState), Api21Impl.getPosition(localPlaybackState), Api21Impl.getBufferedPosition(localPlaybackState), Api21Impl.getPlaybackSpeed(localPlaybackState), Api21Impl.getActions(localPlaybackState), 0, Api21Impl.getErrorMessage(localPlaybackState), Api21Impl.getLastPositionUpdateTime(localPlaybackState), (List)paramObject, Api21Impl.getActiveQueueItemId(localPlaybackState), (Bundle)localObject);
      mStateFwk = localPlaybackState;
    }
    return (PlaybackStateCompat)localObject;
  }
  
  public static int toKeyCode(long paramLong)
  {
    if (paramLong == 4L) {
      return 126;
    }
    if (paramLong == 2L) {
      return 127;
    }
    if (paramLong == 32L) {
      return 87;
    }
    if (paramLong == 16L) {
      return 88;
    }
    if (paramLong == 1L) {
      return 86;
    }
    if (paramLong == 64L) {
      return 90;
    }
    if (paramLong == 8L) {
      return 89;
    }
    if (paramLong == 512L) {
      return 85;
    }
    return 0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long getActions()
  {
    return mActions;
  }
  
  public long getActiveQueueItemId()
  {
    return mActiveItemId;
  }
  
  public long getBufferedPosition()
  {
    return mBufferedPosition;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public long getCurrentPosition(Long paramLong)
  {
    long l1 = mPosition;
    float f = mSpeed;
    long l2;
    if (paramLong != null) {
      l2 = paramLong.longValue();
    } else {
      l2 = SystemClock.elapsedRealtime() - mUpdateTime;
    }
    return Math.max(0L, l1 + (f * (float)l2));
  }
  
  public List<CustomAction> getCustomActions()
  {
    return mCustomActions;
  }
  
  public int getErrorCode()
  {
    return mErrorCode;
  }
  
  public CharSequence getErrorMessage()
  {
    return mErrorMessage;
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public long getLastPositionUpdateTime()
  {
    return mUpdateTime;
  }
  
  public float getPlaybackSpeed()
  {
    return mSpeed;
  }
  
  public Object getPlaybackState()
  {
    if (mStateFwk == null)
    {
      PlaybackState.Builder localBuilder = Api21Impl.createBuilder();
      Api21Impl.setState(localBuilder, mState, mPosition, mSpeed, mUpdateTime);
      Api21Impl.setBufferedPosition(localBuilder, mBufferedPosition);
      Api21Impl.setActions(localBuilder, mActions);
      Api21Impl.setErrorMessage(localBuilder, mErrorMessage);
      Iterator localIterator = mCustomActions.iterator();
      while (localIterator.hasNext()) {
        Api21Impl.addCustomAction(localBuilder, (PlaybackState.CustomAction)((CustomAction)localIterator.next()).getCustomAction());
      }
      Api21Impl.setActiveQueueItemId(localBuilder, mActiveItemId);
      Api22Impl.setExtras(localBuilder, mExtras);
      mStateFwk = Api21Impl.build(localBuilder);
    }
    return mStateFwk;
  }
  
  public long getPosition()
  {
    return mPosition;
  }
  
  public int getState()
  {
    return mState;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=");
    localStringBuilder.append(mState);
    localStringBuilder.append(", position=");
    localStringBuilder.append(mPosition);
    localStringBuilder.append(", buffered position=");
    localStringBuilder.append(mBufferedPosition);
    localStringBuilder.append(", speed=");
    localStringBuilder.append(mSpeed);
    localStringBuilder.append(", updated=");
    localStringBuilder.append(mUpdateTime);
    localStringBuilder.append(", actions=");
    localStringBuilder.append(mActions);
    localStringBuilder.append(", error code=");
    localStringBuilder.append(mErrorCode);
    localStringBuilder.append(", error message=");
    localStringBuilder.append(mErrorMessage);
    localStringBuilder.append(", custom actions=");
    localStringBuilder.append(mCustomActions);
    localStringBuilder.append(", active item id=");
    return z2.r(localStringBuilder, mActiveItemId, "}");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mState);
    paramParcel.writeLong(mPosition);
    paramParcel.writeFloat(mSpeed);
    paramParcel.writeLong(mUpdateTime);
    paramParcel.writeLong(mBufferedPosition);
    paramParcel.writeLong(mActions);
    TextUtils.writeToParcel(mErrorMessage, paramParcel, paramInt);
    paramParcel.writeTypedList(mCustomActions);
    paramParcel.writeLong(mActiveItemId);
    paramParcel.writeBundle(mExtras);
    paramParcel.writeInt(mErrorCode);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Actions {}
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void addCustomAction(PlaybackState.Builder paramBuilder, PlaybackState.CustomAction paramCustomAction)
    {
      paramBuilder.addCustomAction(paramCustomAction);
    }
    
    @DoNotInline
    public static PlaybackState.CustomAction build(PlaybackState.CustomAction.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    @DoNotInline
    public static PlaybackState build(PlaybackState.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    @DoNotInline
    public static PlaybackState.Builder createBuilder()
    {
      return new PlaybackState.Builder();
    }
    
    @DoNotInline
    public static PlaybackState.CustomAction.Builder createCustomActionBuilder(String paramString, CharSequence paramCharSequence, int paramInt)
    {
      return new PlaybackState.CustomAction.Builder(paramString, paramCharSequence, paramInt);
    }
    
    @DoNotInline
    public static String getAction(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getAction();
    }
    
    @DoNotInline
    public static long getActions(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getActions();
    }
    
    @DoNotInline
    public static long getActiveQueueItemId(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getActiveQueueItemId();
    }
    
    @DoNotInline
    public static long getBufferedPosition(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getBufferedPosition();
    }
    
    @DoNotInline
    public static List<PlaybackState.CustomAction> getCustomActions(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getCustomActions();
    }
    
    @DoNotInline
    public static CharSequence getErrorMessage(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getErrorMessage();
    }
    
    @DoNotInline
    public static Bundle getExtras(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getExtras();
    }
    
    @DoNotInline
    public static int getIcon(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getIcon();
    }
    
    @DoNotInline
    public static long getLastPositionUpdateTime(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getLastPositionUpdateTime();
    }
    
    @DoNotInline
    public static CharSequence getName(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getName();
    }
    
    @DoNotInline
    public static float getPlaybackSpeed(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getPlaybackSpeed();
    }
    
    @DoNotInline
    public static long getPosition(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getPosition();
    }
    
    @DoNotInline
    public static int getState(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getState();
    }
    
    @DoNotInline
    public static void setActions(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setActions(paramLong);
    }
    
    @DoNotInline
    public static void setActiveQueueItemId(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setActiveQueueItemId(paramLong);
    }
    
    @DoNotInline
    public static void setBufferedPosition(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setBufferedPosition(paramLong);
    }
    
    @DoNotInline
    public static void setErrorMessage(PlaybackState.Builder paramBuilder, CharSequence paramCharSequence)
    {
      paramBuilder.setErrorMessage(paramCharSequence);
    }
    
    @DoNotInline
    public static void setExtras(PlaybackState.CustomAction.Builder paramBuilder, Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
    
    @DoNotInline
    public static void setState(PlaybackState.Builder paramBuilder, int paramInt, long paramLong1, float paramFloat, long paramLong2)
    {
      paramBuilder.setState(paramInt, paramLong1, paramFloat, paramLong2);
    }
  }
  
  @RequiresApi(22)
  public static class Api22Impl
  {
    @DoNotInline
    public static Bundle getExtras(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getExtras();
    }
    
    @DoNotInline
    public static void setExtras(PlaybackState.Builder paramBuilder, Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
  }
  
  public static final class Builder
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
    
    public Builder()
    {
      mCustomActions = new ArrayList();
      mActiveItemId = -1L;
    }
    
    public Builder(PlaybackStateCompat paramPlaybackStateCompat)
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
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator()
    {
      public PlaybackStateCompat.CustomAction createFromParcel(Parcel paramAnonymousParcel)
      {
        return new PlaybackStateCompat.CustomAction(paramAnonymousParcel);
      }
      
      public PlaybackStateCompat.CustomAction[] newArray(int paramAnonymousInt)
      {
        return new PlaybackStateCompat.CustomAction[paramAnonymousInt];
      }
    };
    private final String mAction;
    private PlaybackState.CustomAction mCustomActionFwk;
    private final Bundle mExtras;
    private final int mIcon;
    private final CharSequence mName;
    
    public CustomAction(Parcel paramParcel)
    {
      mAction = paramParcel.readString();
      mName = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      mIcon = paramParcel.readInt();
      mExtras = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
    {
      mAction = paramString;
      mName = paramCharSequence;
      mIcon = paramInt;
      mExtras = paramBundle;
    }
    
    public static CustomAction fromCustomAction(Object paramObject)
    {
      if (paramObject != null)
      {
        paramObject = (PlaybackState.CustomAction)paramObject;
        Object localObject = PlaybackStateCompat.Api21Impl.getExtras((PlaybackState.CustomAction)paramObject);
        MediaSessionCompat.ensureClassLoader((Bundle)localObject);
        localObject = new CustomAction(PlaybackStateCompat.Api21Impl.getAction((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.Api21Impl.getName((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.Api21Impl.getIcon((PlaybackState.CustomAction)paramObject), (Bundle)localObject);
        mCustomActionFwk = ((PlaybackState.CustomAction)paramObject);
        return (CustomAction)localObject;
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String getAction()
    {
      return mAction;
    }
    
    public Object getCustomAction()
    {
      PlaybackState.CustomAction localCustomAction = mCustomActionFwk;
      Object localObject = localCustomAction;
      if (localCustomAction == null)
      {
        localObject = PlaybackStateCompat.Api21Impl.createCustomActionBuilder(mAction, mName, mIcon);
        PlaybackStateCompat.Api21Impl.setExtras((PlaybackState.CustomAction.Builder)localObject, mExtras);
        localObject = PlaybackStateCompat.Api21Impl.build((PlaybackState.CustomAction.Builder)localObject);
      }
      return localObject;
    }
    
    public Bundle getExtras()
    {
      return mExtras;
    }
    
    public int getIcon()
    {
      return mIcon;
    }
    
    public CharSequence getName()
    {
      return mName;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("Action:mName='");
      localStringBuilder.append(mName);
      localStringBuilder.append(", mIcon=");
      localStringBuilder.append(mIcon);
      localStringBuilder.append(", mExtras=");
      localStringBuilder.append(mExtras);
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(mAction);
      TextUtils.writeToParcel(mName, paramParcel, paramInt);
      paramParcel.writeInt(mIcon);
      paramParcel.writeBundle(mExtras);
    }
    
    public static final class Builder
    {
      private final String mAction;
      private Bundle mExtras;
      private final int mIcon;
      private final CharSequence mName;
      
      public Builder(String paramString, CharSequence paramCharSequence, int paramInt)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          if (!TextUtils.isEmpty(paramCharSequence))
          {
            if (paramInt != 0)
            {
              mAction = paramString;
              mName = paramCharSequence;
              mIcon = paramInt;
              return;
            }
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
          }
          throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
      }
      
      public PlaybackStateCompat.CustomAction build()
      {
        return new PlaybackStateCompat.CustomAction(mAction, mName, mIcon, mExtras);
      }
      
      public Builder setExtras(Bundle paramBundle)
      {
        mExtras = paramBundle;
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface MediaKeyAction {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface RepeatMode {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ShuffleMode {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface State {}
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */