package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

public class AudioAttributesImplApi26
  extends AudioAttributesImplApi21
{
  public AudioAttributesImplApi26() {}
  
  public AudioAttributesImplApi26(AudioAttributes paramAudioAttributes)
  {
    super(paramAudioAttributes, -1);
  }
  
  public static class a
    extends AudioAttributesImplApi21.a
  {
    public AudioAttributesImpl a()
    {
      return new AudioAttributesImplApi26(a.build());
    }
    
    public a h(int paramInt)
    {
      a.setUsage(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi26
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */