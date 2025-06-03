package androidx.media;

import b2.c;

public class AudioAttributesImplBaseParcelizer
{
  public static AudioAttributesImplBase read(c paramc)
  {
    AudioAttributesImplBase localAudioAttributesImplBase = new AudioAttributesImplBase();
    a = paramc.o(a, 1);
    b = paramc.o(b, 2);
    c = paramc.o(c, 3);
    d = paramc.o(d, 4);
    return localAudioAttributesImplBase;
  }
  
  public static void write(AudioAttributesImplBase paramAudioAttributesImplBase, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    paramc.I(b, 2);
    paramc.I(c, 3);
    paramc.I(d, 4);
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBaseParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */