package androidx.media;

import android.media.AudioAttributes.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
class AudioAttributesImplApi26$Builder
  extends AudioAttributesImplApi21.Builder
{
  public AudioAttributesImplApi26$Builder() {}
  
  public AudioAttributesImplApi26$Builder(Object paramObject)
  {
    super(paramObject);
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

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */