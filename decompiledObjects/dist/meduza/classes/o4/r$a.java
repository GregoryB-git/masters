package o4;

import android.media.MediaCodec;
import p2.m0;

public final class r$a
  implements j.b
{
  public static MediaCodec b(j.a parama)
  {
    a.getClass();
    String str = a.a;
    parama = new StringBuilder();
    parama.append("createCodec:");
    parama.append(str);
    m0.i(parama.toString());
    parama = MediaCodec.createByCodecName(str);
    m0.B();
    return parama;
  }
}

/* Location:
 * Qualified Name:     o4.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */