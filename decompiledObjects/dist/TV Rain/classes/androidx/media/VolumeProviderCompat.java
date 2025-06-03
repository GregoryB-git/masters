package androidx.media;

import android.media.VolumeProvider;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat
{
  public static final int VOLUME_CONTROL_ABSOLUTE = 2;
  public static final int VOLUME_CONTROL_FIXED = 0;
  public static final int VOLUME_CONTROL_RELATIVE = 1;
  private Callback mCallback;
  private final String mControlId;
  private final int mControlType;
  private int mCurrentVolume;
  private final int mMaxVolume;
  private VolumeProvider mVolumeProviderFwk;
  
  public VolumeProviderCompat(int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, paramInt3, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public VolumeProviderCompat(int paramInt1, int paramInt2, int paramInt3, @Nullable String paramString)
  {
    mControlType = paramInt1;
    mMaxVolume = paramInt2;
    mCurrentVolume = paramInt3;
    mControlId = paramString;
  }
  
  public final int getCurrentVolume()
  {
    return mCurrentVolume;
  }
  
  public final int getMaxVolume()
  {
    return mMaxVolume;
  }
  
  public final int getVolumeControl()
  {
    return mControlType;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public final String getVolumeControlId()
  {
    return mControlId;
  }
  
  public Object getVolumeProvider()
  {
    if (mVolumeProviderFwk == null) {
      if (Build.VERSION.SDK_INT >= 30) {
        mVolumeProviderFwk = new VolumeProvider(mControlType, mMaxVolume, mCurrentVolume, mControlId)
        {
          public void onAdjustVolume(int paramAnonymousInt)
          {
            VolumeProviderCompat.this.onAdjustVolume(paramAnonymousInt);
          }
          
          public void onSetVolumeTo(int paramAnonymousInt)
          {
            VolumeProviderCompat.this.onSetVolumeTo(paramAnonymousInt);
          }
        };
      } else {
        mVolumeProviderFwk = new VolumeProvider(mControlType, mMaxVolume, mCurrentVolume)
        {
          public void onAdjustVolume(int paramAnonymousInt)
          {
            VolumeProviderCompat.this.onAdjustVolume(paramAnonymousInt);
          }
          
          public void onSetVolumeTo(int paramAnonymousInt)
          {
            VolumeProviderCompat.this.onSetVolumeTo(paramAnonymousInt);
          }
        };
      }
    }
    return mVolumeProviderFwk;
  }
  
  public void onAdjustVolume(int paramInt) {}
  
  public void onSetVolumeTo(int paramInt) {}
  
  public void setCallback(Callback paramCallback)
  {
    mCallback = paramCallback;
  }
  
  public final void setCurrentVolume(int paramInt)
  {
    mCurrentVolume = paramInt;
    Api21Impl.setCurrentVolume((VolumeProvider)getVolumeProvider(), paramInt);
    Callback localCallback = mCallback;
    if (localCallback != null) {
      localCallback.onVolumeChanged(this);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void setCurrentVolume(VolumeProvider paramVolumeProvider, int paramInt)
    {
      paramVolumeProvider.setCurrentVolume(paramInt);
    }
  }
  
  public static abstract class Callback
  {
    public abstract void onVolumeChanged(VolumeProviderCompat paramVolumeProviderCompat);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface ControlType {}
}

/* Location:
 * Qualified Name:     androidx.media.VolumeProviderCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */