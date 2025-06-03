package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import z2;

@RequiresApi(21)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21
  implements AudioAttributesImpl
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributes mAudioAttributes;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mLegacyStreamType;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributesImplApi21()
  {
    mLegacyStreamType = -1;
  }
  
  public AudioAttributesImplApi21(AudioAttributes paramAudioAttributes)
  {
    this(paramAudioAttributes, -1);
  }
  
  public AudioAttributesImplApi21(AudioAttributes paramAudioAttributes, int paramInt)
  {
    mAudioAttributes = paramAudioAttributes;
    mLegacyStreamType = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AudioAttributesImplApi21)) {
      return false;
    }
    paramObject = (AudioAttributesImplApi21)paramObject;
    return mAudioAttributes.equals(mAudioAttributes);
  }
  
  @Nullable
  public Object getAudioAttributes()
  {
    return mAudioAttributes;
  }
  
  public int getContentType()
  {
    return mAudioAttributes.getContentType();
  }
  
  public int getFlags()
  {
    return mAudioAttributes.getFlags();
  }
  
  public int getLegacyStreamType()
  {
    int i = mLegacyStreamType;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.toVolumeStreamType(false, getFlags(), getUsage());
  }
  
  public int getRawLegacyStreamType()
  {
    return mLegacyStreamType;
  }
  
  public int getUsage()
  {
    return mAudioAttributes.getUsage();
  }
  
  public int getVolumeControlStream()
  {
    return AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
  }
  
  public int hashCode()
  {
    return mAudioAttributes.hashCode();
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("AudioAttributesCompat: audioattributes=");
    localStringBuilder.append(mAudioAttributes);
    return localStringBuilder.toString();
  }
  
  @RequiresApi(21)
  public static class Builder
    implements AudioAttributesImpl.Builder
  {
    public final AudioAttributes.Builder mFwkBuilder;
    
    public Builder()
    {
      mFwkBuilder = new AudioAttributes.Builder();
    }
    
    public Builder(Object paramObject)
    {
      mFwkBuilder = new AudioAttributes.Builder((AudioAttributes)paramObject);
    }
    
    @NonNull
    public AudioAttributesImpl build()
    {
      return new AudioAttributesImplApi21(mFwkBuilder.build());
    }
    
    @NonNull
    public Builder setContentType(int paramInt)
    {
      mFwkBuilder.setContentType(paramInt);
      return this;
    }
    
    @NonNull
    public Builder setFlags(int paramInt)
    {
      mFwkBuilder.setFlags(paramInt);
      return this;
    }
    
    @NonNull
    public Builder setLegacyStreamType(int paramInt)
    {
      mFwkBuilder.setLegacyStreamType(paramInt);
      return this;
    }
    
    @SuppressLint({"WrongConstant"})
    @NonNull
    public Builder setUsage(int paramInt)
    {
      int i = paramInt;
      if (paramInt == 16) {
        i = 12;
      }
      mFwkBuilder.setUsage(i);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */