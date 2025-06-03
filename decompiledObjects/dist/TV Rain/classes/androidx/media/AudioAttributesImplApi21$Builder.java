package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class AudioAttributesImplApi21$Builder
  implements AudioAttributesImpl.Builder
{
  public final AudioAttributes.Builder mFwkBuilder;
  
  public AudioAttributesImplApi21$Builder()
  {
    mFwkBuilder = new AudioAttributes.Builder();
  }
  
  public AudioAttributesImplApi21$Builder(Object paramObject)
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

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */