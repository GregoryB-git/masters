package androidx.media;

import android.os.Build.VERSION;

public class AudioAttributesCompat$Builder
{
  public final AudioAttributesImpl.Builder mBuilderImpl;
  
  public AudioAttributesCompat$Builder()
  {
    if (AudioAttributesCompat.sForceLegacyBehavior) {
      mBuilderImpl = new AudioAttributesImplBase.Builder();
    } else if (Build.VERSION.SDK_INT >= 26) {
      mBuilderImpl = new AudioAttributesImplApi26.Builder();
    } else {
      mBuilderImpl = new AudioAttributesImplApi21.Builder();
    }
  }
  
  public AudioAttributesCompat$Builder(AudioAttributesCompat paramAudioAttributesCompat)
  {
    if (AudioAttributesCompat.sForceLegacyBehavior) {
      mBuilderImpl = new AudioAttributesImplBase.Builder(paramAudioAttributesCompat);
    } else if (Build.VERSION.SDK_INT >= 26) {
      mBuilderImpl = new AudioAttributesImplApi26.Builder(paramAudioAttributesCompat.unwrap());
    } else {
      mBuilderImpl = new AudioAttributesImplApi21.Builder(paramAudioAttributesCompat.unwrap());
    }
  }
  
  public AudioAttributesCompat build()
  {
    return new AudioAttributesCompat(mBuilderImpl.build());
  }
  
  public Builder setContentType(int paramInt)
  {
    mBuilderImpl.setContentType(paramInt);
    return this;
  }
  
  public Builder setFlags(int paramInt)
  {
    mBuilderImpl.setFlags(paramInt);
    return this;
  }
  
  public Builder setLegacyStreamType(int paramInt)
  {
    mBuilderImpl.setLegacyStreamType(paramInt);
    return this;
  }
  
  public Builder setUsage(int paramInt)
  {
    mBuilderImpl.setUsage(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */