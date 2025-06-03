package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

public final class NotificationCompat$BubbleMetadata$Builder
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
  public NotificationCompat$BubbleMetadata$Builder() {}
  
  public NotificationCompat$BubbleMetadata$Builder(@NonNull PendingIntent paramPendingIntent, @NonNull IconCompat paramIconCompat)
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
  public NotificationCompat$BubbleMetadata$Builder(@NonNull String paramString)
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

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.BubbleMetadata.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */