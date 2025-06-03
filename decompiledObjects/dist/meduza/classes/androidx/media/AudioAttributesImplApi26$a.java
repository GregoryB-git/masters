package androidx.media;

import android.media.AudioAttributes.Builder;

public final class AudioAttributesImplApi26$a
  extends AudioAttributesImplApi21.a
{
  public final AudioAttributesImpl.a a(int paramInt)
  {
    a.setUsage(paramInt);
    return this;
  }
  
  public final AudioAttributesImplApi21.a b(int paramInt)
  {
    a.setUsage(paramInt);
    return this;
  }
  
  public final AudioAttributesImpl build()
  {
    return new AudioAttributesImplApi26(a.build());
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */