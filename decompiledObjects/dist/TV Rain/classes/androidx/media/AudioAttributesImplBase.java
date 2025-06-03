package androidx.media;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase
  implements AudioAttributesImpl
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mContentType;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mFlags;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mLegacyStream;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mUsage;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributesImplBase()
  {
    mUsage = 0;
    mContentType = 0;
    mFlags = 0;
    mLegacyStream = -1;
  }
  
  public AudioAttributesImplBase(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mContentType = paramInt1;
    mFlags = paramInt2;
    mUsage = paramInt3;
    mLegacyStream = paramInt4;
  }
  
  public static int usageForStreamType(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
    default: 
      return 0;
    case 10: 
      return 11;
    case 8: 
      return 3;
    case 6: 
      return 2;
    case 5: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      return 1;
    case 2: 
      return 6;
    case 1: 
    case 7: 
      return 13;
    }
    return 2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesImplBase;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AudioAttributesImplBase)paramObject;
    bool1 = bool2;
    if (mContentType == ((AudioAttributesImplBase)paramObject).getContentType())
    {
      bool1 = bool2;
      if (mFlags == ((AudioAttributesImplBase)paramObject).getFlags())
      {
        bool1 = bool2;
        if (mUsage == ((AudioAttributesImplBase)paramObject).getUsage())
        {
          bool1 = bool2;
          if (mLegacyStream == mLegacyStream) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  @Nullable
  public Object getAudioAttributes()
  {
    return null;
  }
  
  public int getContentType()
  {
    return mContentType;
  }
  
  public int getFlags()
  {
    int i = mFlags;
    int j = getLegacyStreamType();
    int k;
    if (j == 6)
    {
      k = i | 0x4;
    }
    else
    {
      k = i;
      if (j == 7) {
        k = i | 0x1;
      }
    }
    return k & 0x111;
  }
  
  public int getLegacyStreamType()
  {
    int i = mLegacyStream;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.toVolumeStreamType(false, mFlags, mUsage);
  }
  
  public int getRawLegacyStreamType()
  {
    return mLegacyStream;
  }
  
  public int getUsage()
  {
    return mUsage;
  }
  
  public int getVolumeControlStream()
  {
    return AudioAttributesCompat.toVolumeStreamType(true, mFlags, mUsage);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(mContentType), Integer.valueOf(mFlags), Integer.valueOf(mUsage), Integer.valueOf(mLegacyStream) });
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (mLegacyStream != -1)
    {
      localStringBuilder.append(" stream=");
      localStringBuilder.append(mLegacyStream);
      localStringBuilder.append(" derived");
    }
    localStringBuilder.append(" usage=");
    localStringBuilder.append(AudioAttributesCompat.usageToString(mUsage));
    localStringBuilder.append(" content=");
    localStringBuilder.append(mContentType);
    localStringBuilder.append(" flags=0x");
    localStringBuilder.append(Integer.toHexString(mFlags).toUpperCase());
    return localStringBuilder.toString();
  }
  
  public static class Builder
    implements AudioAttributesImpl.Builder
  {
    private int mContentType = 0;
    private int mFlags = 0;
    private int mLegacyStream = -1;
    private int mUsage = 0;
    
    public Builder() {}
    
    public Builder(AudioAttributesCompat paramAudioAttributesCompat)
    {
      mUsage = paramAudioAttributesCompat.getUsage();
      mContentType = paramAudioAttributesCompat.getContentType();
      mFlags = paramAudioAttributesCompat.getFlags();
      mLegacyStream = paramAudioAttributesCompat.getRawLegacyStreamType();
    }
    
    private Builder setInternalLegacyStreamType(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid stream type ");
        localStringBuilder.append(paramInt);
        localStringBuilder.append(" for AudioAttributesCompat");
        Log.e("AudioAttributesCompat", localStringBuilder.toString());
        break;
      case 10: 
        mContentType = 1;
        break;
      case 9: 
        mContentType = 4;
        break;
      case 8: 
        mContentType = 4;
        break;
      case 7: 
        mFlags = (0x1 | mFlags);
        break;
      case 6: 
        mContentType = 1;
        mFlags |= 0x4;
        break;
      case 5: 
        mContentType = 4;
        break;
      case 4: 
        mContentType = 4;
        break;
      case 3: 
        mContentType = 2;
        break;
      case 2: 
        mContentType = 4;
        break;
      case 1: 
        mContentType = 4;
        break;
      }
      mContentType = 1;
      mUsage = AudioAttributesImplBase.usageForStreamType(paramInt);
      return this;
    }
    
    @NonNull
    public AudioAttributesImpl build()
    {
      return new AudioAttributesImplBase(mContentType, mFlags, mUsage, mLegacyStream);
    }
    
    @NonNull
    public Builder setContentType(int paramInt)
    {
      if ((paramInt != 0) && (paramInt != 1) && (paramInt != 2) && (paramInt != 3) && (paramInt != 4)) {
        mContentType = 0;
      } else {
        mContentType = paramInt;
      }
      return this;
    }
    
    @NonNull
    public Builder setFlags(int paramInt)
    {
      mFlags = (paramInt & 0x3FF | mFlags);
      return this;
    }
    
    @NonNull
    public Builder setLegacyStreamType(int paramInt)
    {
      if (paramInt != 10)
      {
        mLegacyStream = paramInt;
        return setInternalLegacyStreamType(paramInt);
      }
      throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
    }
    
    @NonNull
    public Builder setUsage(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        mUsage = 0;
        break;
      case 16: 
        mUsage = 12;
        break;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
        mUsage = paramInt;
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */