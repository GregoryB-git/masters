package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import d;

public final class NotificationCompat$BubbleMetadata
{
  private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
  private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
  private PendingIntent mDeleteIntent;
  private int mDesiredHeight;
  @DimenRes
  private int mDesiredHeightResId;
  private int mFlags;
  private IconCompat mIcon;
  private PendingIntent mPendingIntent;
  private String mShortcutId;
  
  private NotificationCompat$BubbleMetadata(@Nullable PendingIntent paramPendingIntent1, @Nullable PendingIntent paramPendingIntent2, @Nullable IconCompat paramIconCompat, int paramInt1, @DimenRes int paramInt2, int paramInt3, @Nullable String paramString)
  {
    mPendingIntent = paramPendingIntent1;
    mIcon = paramIconCompat;
    mDesiredHeight = paramInt1;
    mDesiredHeightResId = paramInt2;
    mDeleteIntent = paramPendingIntent2;
    mFlags = paramInt3;
    mShortcutId = paramString;
  }
  
  @Nullable
  public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      return Api30Impl.fromPlatform(paramBubbleMetadata);
    }
    if (i == 29) {
      return Api29Impl.fromPlatform(paramBubbleMetadata);
    }
    return null;
  }
  
  @Nullable
  public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata paramBubbleMetadata)
  {
    if (paramBubbleMetadata == null) {
      return null;
    }
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      return Api30Impl.toPlatform(paramBubbleMetadata);
    }
    if (i == 29) {
      return Api29Impl.toPlatform(paramBubbleMetadata);
    }
    return null;
  }
  
  public boolean getAutoExpandBubble()
  {
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public PendingIntent getDeleteIntent()
  {
    return mDeleteIntent;
  }
  
  @Dimension(unit=0)
  public int getDesiredHeight()
  {
    return mDesiredHeight;
  }
  
  @DimenRes
  public int getDesiredHeightResId()
  {
    return mDesiredHeightResId;
  }
  
  @SuppressLint({"InvalidNullConversion"})
  @Nullable
  public IconCompat getIcon()
  {
    return mIcon;
  }
  
  @SuppressLint({"InvalidNullConversion"})
  @Nullable
  public PendingIntent getIntent()
  {
    return mPendingIntent;
  }
  
  @Nullable
  public String getShortcutId()
  {
    return mShortcutId;
  }
  
  public boolean isNotificationSuppressed()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setFlags(int paramInt)
  {
    mFlags = paramInt;
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @Nullable
    @RequiresApi(29)
    public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      if (paramBubbleMetadata.getIntent() == null) {
        return null;
      }
      NotificationCompat.BubbleMetadata.Builder localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon())).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
      if (paramBubbleMetadata.getDesiredHeight() != 0) {
        localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
      }
      if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
        localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
      }
      return localBuilder.build();
    }
    
    @Nullable
    @RequiresApi(29)
    public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      if (paramBubbleMetadata.getIntent() == null) {
        return null;
      }
      Notification.BubbleMetadata.Builder localBuilder = new Notification.BubbleMetadata.Builder().setIcon(paramBubbleMetadata.getIcon().toIcon()).setIntent(paramBubbleMetadata.getIntent()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
      if (paramBubbleMetadata.getDesiredHeight() != 0) {
        localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
      }
      if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
        localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
      }
      return localBuilder.build();
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @Nullable
    @RequiresApi(30)
    public static NotificationCompat.BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      NotificationCompat.BubbleMetadata.Builder localBuilder;
      if (d.l(paramBubbleMetadata) != null) {
        localBuilder = new NotificationCompat.BubbleMetadata.Builder(d.l(paramBubbleMetadata));
      } else {
        localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon()));
      }
      localBuilder.setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
      if (paramBubbleMetadata.getDesiredHeight() != 0) {
        localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
      }
      if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
        localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
      }
      return localBuilder.build();
    }
    
    @Nullable
    @RequiresApi(30)
    public static Notification.BubbleMetadata toPlatform(@Nullable NotificationCompat.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      Notification.BubbleMetadata.Builder localBuilder;
      if (paramBubbleMetadata.getShortcutId() != null) {
        localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getShortcutId());
      } else {
        localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), paramBubbleMetadata.getIcon().toIcon());
      }
      localBuilder.setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
      if (paramBubbleMetadata.getDesiredHeight() != 0) {
        localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
      }
      if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
        localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
      }
      return localBuilder.build();
    }
  }
  
  public static final class Builder
  {
    private PendingIntent mDeleteIntent;
    private int mDesiredHeight;
    @DimenRes
    private int mDesiredHeightResId;
    private int mFlags;
    private IconCompat mIcon;
    private PendingIntent mPendingIntent;
    private String mShortcutId;
    
    @Deprecated
    public Builder() {}
    
    public Builder(@NonNull PendingIntent paramPendingIntent, @NonNull IconCompat paramIconCompat)
    {
      if (paramPendingIntent != null)
      {
        if (paramIconCompat != null)
        {
          mPendingIntent = paramPendingIntent;
          mIcon = paramIconCompat;
          return;
        }
        throw new NullPointerException("Bubbles require non-null icon");
      }
      throw new NullPointerException("Bubble requires non-null pending intent");
    }
    
    @RequiresApi(30)
    public Builder(@NonNull String paramString)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        mShortcutId = paramString;
        return;
      }
      throw new NullPointerException("Bubble requires a non-null shortcut id");
    }
    
    @NonNull
    private Builder setFlag(int paramInt, boolean paramBoolean)
    {
      if (paramBoolean) {
        mFlags = (paramInt | mFlags);
      } else {
        mFlags = (paramInt & mFlags);
      }
      return this;
    }
    
    @SuppressLint({"SyntheticAccessor"})
    @NonNull
    public NotificationCompat.BubbleMetadata build()
    {
      Object localObject = mShortcutId;
      if ((localObject == null) && (mPendingIntent == null)) {
        throw new NullPointerException("Must supply pending intent or shortcut to bubble");
      }
      if ((localObject == null) && (mIcon == null)) {
        throw new NullPointerException("Must supply an icon or shortcut for the bubble");
      }
      localObject = new NotificationCompat.BubbleMetadata(mPendingIntent, mDeleteIntent, mIcon, mDesiredHeight, mDesiredHeightResId, mFlags, (String)localObject, null);
      ((NotificationCompat.BubbleMetadata)localObject).setFlags(mFlags);
      return (NotificationCompat.BubbleMetadata)localObject;
    }
    
    @NonNull
    public Builder setAutoExpandBubble(boolean paramBoolean)
    {
      setFlag(1, paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder setDeleteIntent(@Nullable PendingIntent paramPendingIntent)
    {
      mDeleteIntent = paramPendingIntent;
      return this;
    }
    
    @NonNull
    public Builder setDesiredHeight(@Dimension(unit=0) int paramInt)
    {
      mDesiredHeight = Math.max(paramInt, 0);
      mDesiredHeightResId = 0;
      return this;
    }
    
    @NonNull
    public Builder setDesiredHeightResId(@DimenRes int paramInt)
    {
      mDesiredHeightResId = paramInt;
      mDesiredHeight = 0;
      return this;
    }
    
    @NonNull
    public Builder setIcon(@NonNull IconCompat paramIconCompat)
    {
      if (mShortcutId == null)
      {
        if (paramIconCompat != null)
        {
          mIcon = paramIconCompat;
          return this;
        }
        throw new NullPointerException("Bubbles require non-null icon");
      }
      throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
    }
    
    @NonNull
    public Builder setIntent(@NonNull PendingIntent paramPendingIntent)
    {
      if (mShortcutId == null)
      {
        if (paramPendingIntent != null)
        {
          mPendingIntent = paramPendingIntent;
          return this;
        }
        throw new NullPointerException("Bubble requires non-null pending intent");
      }
      throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
    }
    
    @NonNull
    public Builder setSuppressNotification(boolean paramBoolean)
    {
      setFlag(2, paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */