package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import b;

@RequiresApi(26)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26
  extends AudioAttributesImplApi21
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributesImplApi26() {}
  
  public AudioAttributesImplApi26(AudioAttributes paramAudioAttributes)
  {
    super(paramAudioAttributes, -1);
  }
  
  public int getVolumeControlStream()
  {
    return b.e(mAudioAttributes);
  }
  
  @RequiresApi(26)
  public static class Builder
    extends AudioAttributesImplApi21.Builder
  {
    public Builder() {}
    
    public Builder(Object paramObject)
    {
      super();
    }
    
    @NonNull
    public AudioAttributesImpl build()
    {
      return new AudioAttributesImplApi26(mFwkBuilder.build());
    }
    
    @NonNull
    public Builder setUsage(int paramInt)
    {
      mFwkBuilder.setUsage(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */