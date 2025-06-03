package androidx.core.app;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NotificationChannelCompat$Builder
{
  private final NotificationChannelCompat mChannel;
  
  public NotificationChannelCompat$Builder(@NonNull String paramString, int paramInt)
  {
    mChannel = new NotificationChannelCompat(paramString, paramInt);
  }
  
  @NonNull
  public NotificationChannelCompat build()
  {
    return mChannel;
  }
  
  @NonNull
  public Builder setConversationId(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 30)
    {
      NotificationChannelCompat localNotificationChannelCompat = mChannel;
      mParentId = paramString1;
      mConversationId = paramString2;
    }
    return this;
  }
  
  @NonNull
  public Builder setDescription(@Nullable String paramString)
  {
    mChannel.mDescription = paramString;
    return this;
  }
  
  @NonNull
  public Builder setGroup(@Nullable String paramString)
  {
    mChannel.mGroupId = paramString;
    return this;
  }
  
  @NonNull
  public Builder setImportance(int paramInt)
  {
    mChannel.mImportance = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setLightColor(int paramInt)
  {
    mChannel.mLightColor = paramInt;
    return this;
  }
  
  @NonNull
  public Builder setLightsEnabled(boolean paramBoolean)
  {
    mChannel.mLights = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setName(@Nullable CharSequence paramCharSequence)
  {
    mChannel.mName = paramCharSequence;
    return this;
  }
  
  @NonNull
  public Builder setShowBadge(boolean paramBoolean)
  {
    mChannel.mShowBadge = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setSound(@Nullable Uri paramUri, @Nullable AudioAttributes paramAudioAttributes)
  {
    NotificationChannelCompat localNotificationChannelCompat = mChannel;
    mSound = paramUri;
    mAudioAttributes = paramAudioAttributes;
    return this;
  }
  
  @NonNull
  public Builder setVibrationEnabled(boolean paramBoolean)
  {
    mChannel.mVibrationEnabled = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setVibrationPattern(@Nullable long[] paramArrayOfLong)
  {
    NotificationChannelCompat localNotificationChannelCompat = mChannel;
    boolean bool;
    if ((paramArrayOfLong != null) && (paramArrayOfLong.length > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    mVibrationEnabled = bool;
    mVibrationPattern = paramArrayOfLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationChannelCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */