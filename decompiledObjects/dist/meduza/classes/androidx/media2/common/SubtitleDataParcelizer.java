package androidx.media2.common;

import b2.c;

public final class SubtitleDataParcelizer
{
  public static SubtitleData read(c paramc)
  {
    SubtitleData localSubtitleData = new SubtitleData();
    a = paramc.q(1, a);
    b = paramc.q(2, b);
    byte[] arrayOfByte = c;
    if (!paramc.l(3)) {
      paramc = arrayOfByte;
    } else {
      paramc = paramc.i();
    }
    c = paramc;
    return localSubtitleData;
  }
  
  public static void write(SubtitleData paramSubtitleData, c paramc)
  {
    paramc.getClass();
    paramc.J(1, a);
    paramc.J(2, b);
    paramSubtitleData = c;
    paramc.y(3);
    paramc.D(paramSubtitleData);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.SubtitleDataParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */