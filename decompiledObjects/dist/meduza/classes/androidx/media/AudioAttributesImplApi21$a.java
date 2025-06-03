package androidx.media;

import android.media.AudioAttributes.Builder;

public class AudioAttributesImplApi21$a
  implements AudioAttributesImpl.a
{
  public final AudioAttributes.Builder a = new AudioAttributes.Builder();
  
  public a b(int paramInt)
  {
    int i = paramInt;
    if (paramInt == 16) {
      i = 12;
    }
    a.setUsage(i);
    return this;
  }
  
  public AudioAttributesImpl build()
  {
    return new AudioAttributesImplApi21(a.build());
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */