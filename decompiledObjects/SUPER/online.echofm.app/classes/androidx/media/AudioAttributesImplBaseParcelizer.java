package androidx.media;

import v1.b;

public class AudioAttributesImplBaseParcelizer
{
  public static AudioAttributesImplBase read(b paramb)
  {
    AudioAttributesImplBase localAudioAttributesImplBase = new AudioAttributesImplBase();
    a = paramb.p(a, 1);
    b = paramb.p(b, 2);
    c = paramb.p(c, 3);
    d = paramb.p(d, 4);
    return localAudioAttributesImplBase;
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, b paramb)
  {
    paramb.x(false, false);
    paramb.F(a, 1);
    paramb.F(b, 2);
    paramb.F(c, 3);
    paramb.F(d, 4);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBaseParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */