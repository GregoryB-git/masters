package androidx.mediarouter.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MediaRouterParams
{
  public static final int DIALOG_TYPE_DEFAULT = 1;
  public static final int DIALOG_TYPE_DYNAMIC_GROUP = 2;
  public static final String ENABLE_GROUP_VOLUME_UX = "androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static final String EXTRAS_KEY_FIXED_CAST_ICON = "androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON";
  public final int mDialogType;
  public final Bundle mExtras;
  public final boolean mMediaTransferReceiverEnabled;
  public final boolean mOutputSwitcherEnabled;
  public final boolean mTransferToLocalEnabled;
  
  public MediaRouterParams(@NonNull Builder paramBuilder)
  {
    mDialogType = mDialogType;
    mMediaTransferReceiverEnabled = mMediaTransferEnabled;
    mOutputSwitcherEnabled = mOutputSwitcherEnabled;
    mTransferToLocalEnabled = mTransferToLocalEnabled;
    paramBuilder = mExtras;
    if (paramBuilder == null) {
      paramBuilder = Bundle.EMPTY;
    } else {
      paramBuilder = new Bundle(paramBuilder);
    }
    mExtras = paramBuilder;
  }
  
  public int getDialogType()
  {
    return mDialogType;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public boolean isMediaTransferReceiverEnabled()
  {
    return mMediaTransferReceiverEnabled;
  }
  
  public boolean isOutputSwitcherEnabled()
  {
    return mOutputSwitcherEnabled;
  }
  
  public boolean isTransferToLocalEnabled()
  {
    return mTransferToLocalEnabled;
  }
  
  public static final class Builder
  {
    public int mDialogType;
    public Bundle mExtras;
    public boolean mMediaTransferEnabled;
    public boolean mOutputSwitcherEnabled;
    public boolean mTransferToLocalEnabled;
    
    public Builder()
    {
      boolean bool = true;
      mDialogType = 1;
      if (Build.VERSION.SDK_INT < 30) {
        bool = false;
      }
      mMediaTransferEnabled = bool;
    }
    
    public Builder(@NonNull MediaRouterParams paramMediaRouterParams)
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
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface DialogType {}
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouterParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */