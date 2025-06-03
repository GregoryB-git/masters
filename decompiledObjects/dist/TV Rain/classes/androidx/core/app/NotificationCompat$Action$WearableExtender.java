package androidx.core.app;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class NotificationCompat$Action$WearableExtender
  implements NotificationCompat.Action.Extender
{
  private static final int DEFAULT_FLAGS = 1;
  private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
  private static final int FLAG_AVAILABLE_OFFLINE = 1;
  private static final int FLAG_HINT_DISPLAY_INLINE = 4;
  private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
  private static final String KEY_CANCEL_LABEL = "cancelLabel";
  private static final String KEY_CONFIRM_LABEL = "confirmLabel";
  private static final String KEY_FLAGS = "flags";
  private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
  private CharSequence mCancelLabel;
  private CharSequence mConfirmLabel;
  private int mFlags = 1;
  private CharSequence mInProgressLabel;
  
  public NotificationCompat$Action$WearableExtender() {}
  
  public NotificationCompat$Action$WearableExtender(@NonNull NotificationCompat.Action paramAction)
  {
    paramAction = paramAction.getExtras().getBundle("android.wearable.EXTENSIONS");
    if (paramAction != null)
    {
      mFlags = paramAction.getInt("flags", 1);
      mInProgressLabel = paramAction.getCharSequence("inProgressLabel");
      mConfirmLabel = paramAction.getCharSequence("confirmLabel");
      mCancelLabel = paramAction.getCharSequence("cancelLabel");
    }
  }
  
  private void setFlag(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      mFlags = (paramInt | mFlags);
    } else {
      mFlags = (paramInt & mFlags);
    }
  }
  
  @NonNull
  public WearableExtender clone()
  {
    WearableExtender localWearableExtender = new WearableExtender();
    mFlags = mFlags;
    mInProgressLabel = mInProgressLabel;
    mConfirmLabel = mConfirmLabel;
    mCancelLabel = mCancelLabel;
    return localWearableExtender;
  }
  
  @NonNull
  public NotificationCompat.Action.Builder extend(@NonNull NotificationCompat.Action.Builder paramBuilder)
  {
    Bundle localBundle = new Bundle();
    int i = mFlags;
    if (i != 1) {
      localBundle.putInt("flags", i);
    }
    CharSequence localCharSequence = mInProgressLabel;
    if (localCharSequence != null) {
      localBundle.putCharSequence("inProgressLabel", localCharSequence);
    }
    localCharSequence = mConfirmLabel;
    if (localCharSequence != null) {
      localBundle.putCharSequence("confirmLabel", localCharSequence);
    }
    localCharSequence = mCancelLabel;
    if (localCharSequence != null) {
      localBundle.putCharSequence("cancelLabel", localCharSequence);
    }
    paramBuilder.getExtras().putBundle("android.wearable.EXTENSIONS", localBundle);
    return paramBuilder;
  }
  
  @Deprecated
  @Nullable
  public CharSequence getCancelLabel()
  {
    return mCancelLabel;
  }
  
  @Deprecated
  @Nullable
  public CharSequence getConfirmLabel()
  {
    return mConfirmLabel;
  }
  
  public boolean getHintDisplayActionInline()
  {
    boolean bool;
    if ((mFlags & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean getHintLaunchesActivity()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  @Nullable
  public CharSequence getInProgressLabel()
  {
    return mInProgressLabel;
  }
  
  public boolean isAvailableOffline()
  {
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public WearableExtender setAvailableOffline(boolean paramBoolean)
  {
    setFlag(1, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setCancelLabel(@Nullable CharSequence paramCharSequence)
  {
    mCancelLabel = paramCharSequence;
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setConfirmLabel(@Nullable CharSequence paramCharSequence)
  {
    mConfirmLabel = paramCharSequence;
    return this;
  }
  
  @NonNull
  public WearableExtender setHintDisplayActionInline(boolean paramBoolean)
  {
    setFlag(4, paramBoolean);
    return this;
  }
  
  @NonNull
  public WearableExtender setHintLaunchesActivity(boolean paramBoolean)
  {
    setFlag(2, paramBoolean);
    return this;
  }
  
  @Deprecated
  @NonNull
  public WearableExtender setInProgressLabel(@Nullable CharSequence paramCharSequence)
  {
    mInProgressLabel = paramCharSequence;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.Action.WearableExtender
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */