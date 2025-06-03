package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import d;
import e;

public class NotificationChannelCompat
{
  public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
  private static final int DEFAULT_LIGHT_COLOR = 0;
  private static final boolean DEFAULT_SHOW_BADGE = true;
  public AudioAttributes mAudioAttributes;
  private boolean mBypassDnd;
  private boolean mCanBubble;
  public String mConversationId;
  public String mDescription;
  public String mGroupId;
  @NonNull
  public final String mId;
  public int mImportance;
  private boolean mImportantConversation;
  public int mLightColor = 0;
  public boolean mLights;
  private int mLockscreenVisibility;
  public CharSequence mName;
  public String mParentId;
  public boolean mShowBadge = true;
  public Uri mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
  public boolean mVibrationEnabled;
  public long[] mVibrationPattern;
  
  @RequiresApi(26)
  public NotificationChannelCompat(@NonNull NotificationChannel paramNotificationChannel)
  {
    this(paramNotificationChannel.getId(), paramNotificationChannel.getImportance());
    mName = paramNotificationChannel.getName();
    mDescription = paramNotificationChannel.getDescription();
    mGroupId = paramNotificationChannel.getGroup();
    mAudioAttributes = paramNotificationChannel.getAudioAttributes();
    mLights = paramNotificationChannel.shouldShowLights();
    mVibrationEnabled = paramNotificationChannel.shouldVibrate();
    mVibrationPattern = paramNotificationChannel.getVibrationPattern();
    int i = Build.VERSION.SDK_INT;
    if (i >= 30)
    {
      mParentId = d.m(paramNotificationChannel);
      mConversationId = d.D(paramNotificationChannel);
    }
    mBypassDnd = paramNotificationChannel.canBypassDnd();
    mLockscreenVisibility = paramNotificationChannel.getLockscreenVisibility();
    if (i >= 29) {
      mCanBubble = e.w(paramNotificationChannel);
    }
    if (i >= 30) {
      mImportantConversation = d.w(paramNotificationChannel);
    }
  }
  
  public NotificationChannelCompat(@NonNull String paramString, int paramInt)
  {
    mId = ((String)Preconditions.checkNotNull(paramString));
    mImportance = paramInt;
    mAudioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
  }
  
  public boolean canBubble()
  {
    return mCanBubble;
  }
  
  public boolean canBypassDnd()
  {
    return mBypassDnd;
  }
  
  public boolean canShowBadge()
  {
    return mShowBadge;
  }
  
  @Nullable
  public AudioAttributes getAudioAttributes()
  {
    return mAudioAttributes;
  }
  
  @Nullable
  public String getConversationId()
  {
    return mConversationId;
  }
  
  @Nullable
  public String getDescription()
  {
    return mDescription;
  }
  
  @Nullable
  public String getGroup()
  {
    return mGroupId;
  }
  
  @NonNull
  public String getId()
  {
    return mId;
  }
  
  public int getImportance()
  {
    return mImportance;
  }
  
  public int getLightColor()
  {
    return mLightColor;
  }
  
  public int getLockscreenVisibility()
  {
    return mLockscreenVisibility;
  }
  
  @Nullable
  public CharSequence getName()
  {
    return mName;
  }
  
  public NotificationChannel getNotificationChannel()
  {
    int i = Build.VERSION.SDK_INT;
    if (i < 26) {
      return null;
    }
    NotificationChannel localNotificationChannel = new NotificationChannel(mId, mName, mImportance);
    localNotificationChannel.setDescription(mDescription);
    localNotificationChannel.setGroup(mGroupId);
    localNotificationChannel.setShowBadge(mShowBadge);
    localNotificationChannel.setSound(mSound, mAudioAttributes);
    localNotificationChannel.enableLights(mLights);
    localNotificationChannel.setLightColor(mLightColor);
    localNotificationChannel.setVibrationPattern(mVibrationPattern);
    localNotificationChannel.enableVibration(mVibrationEnabled);
    if (i >= 30)
    {
      String str1 = mParentId;
      if (str1 != null)
      {
        String str2 = mConversationId;
        if (str2 != null) {
          d.q(localNotificationChannel, str1, str2);
        }
      }
    }
    return localNotificationChannel;
  }
  
  @Nullable
  public String getParentChannelId()
  {
    return mParentId;
  }
  
  @Nullable
  public Uri getSound()
  {
    return mSound;
  }
  
  @Nullable
  public long[] getVibrationPattern()
  {
    return mVibrationPattern;
  }
  
  public boolean isImportantConversation()
  {
    return mImportantConversation;
  }
  
  public boolean shouldShowLights()
  {
    return mLights;
  }
  
  public boolean shouldVibrate()
  {
    return mVibrationEnabled;
  }
  
  @NonNull
  public Builder toBuilder()
  {
    return new Builder(mId, mImportance).setName(mName).setDescription(mDescription).setGroup(mGroupId).setShowBadge(mShowBadge).setSound(mSound, mAudioAttributes).setLightsEnabled(mLights).setLightColor(mLightColor).setVibrationEnabled(mVibrationEnabled).setVibrationPattern(mVibrationPattern).setConversationId(mParentId, mConversationId);
  }
  
  public static class Builder
  {
    private final NotificationChannelCompat mChannel;
    
    public Builder(@NonNull String paramString, int paramInt)
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
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationChannelCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */