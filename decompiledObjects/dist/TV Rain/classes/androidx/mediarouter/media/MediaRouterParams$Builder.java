package androidx.mediarouter.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public final class MediaRouterParams$Builder
{
  public int mDialogType;
  public Bundle mExtras;
  public boolean mMediaTransferEnabled;
  public boolean mOutputSwitcherEnabled;
  public boolean mTransferToLocalEnabled;
  
  public MediaRouterParams$Builder()
  {
    boolean bool = true;
    mDialogType = 1;
    if (Build.VERSION.SDK_INT < 30) {
      bool = false;
    }
    mMediaTransferEnabled = bool;
  }
  
  public MediaRouterParams$Builder(@NonNull MediaRouterParams paramMediaRouterParams)
  {
    boolean bool = true;
    mDialogType = 1;
    if (Build.VERSION.SDK_INT < 30) {
      bool = false;
    }
    mMediaTransferEnabled = bool;
    if (paramMediaRouterParams != null)
    {
      mDialogType = mDialogType;
      mOutputSwitcherEnabled = mOutputSwitcherEnabled;
      mTransferToLocalEnabled = mTransferToLocalEnabled;
      mMediaTransferEnabled = mMediaTransferReceiverEnabled;
      if (mExtras == null) {
        paramMediaRouterParams = null;
      } else {
        paramMediaRouterParams = new Bundle(mExtras);
      }
      mExtras = paramMediaRouterParams;
      return;
    }
    throw new NullPointerException("params should not be null!");
  }
  
  @NonNull
  public MediaRouterParams build()
  {
    return new MediaRouterParams(this);
  }
  
  @NonNull
  public Builder setDialogType(int paramInt)
  {
    mDialogType = paramInt;
    return this;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Builder setExtras(@Nullable Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = null;
    } else {
      paramBundle = new Bundle(paramBundle);
    }
    mExtras = paramBundle;
    return this;
  }
  
  @NonNull
  public Builder setMediaTransferReceiverEnabled(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      mMediaTransferEnabled = paramBoolean;
    }
    return this;
  }
  
  @NonNull
  public Builder setOutputSwitcherEnabled(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      mOutputSwitcherEnabled = paramBoolean;
    }
    return this;
  }
  
  @NonNull
  public Builder setTransferToLocalEnabled(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      mTransferToLocalEnabled = paramBoolean;
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterParams.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */