package androidx.media;

import android.util.Log;
import androidx.annotation.NonNull;

class AudioAttributesImplBase$Builder
  implements AudioAttributesImpl.Builder
{
  private int mContentType = 0;
  private int mFlags = 0;
  private int mLegacyStream = -1;
  private int mUsage = 0;
  
  public AudioAttributesImplBase$Builder() {}
  
  public AudioAttributesImplBase$Builder(AudioAttributesCompat paramAudioAttributesCompat)
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

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBase.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */