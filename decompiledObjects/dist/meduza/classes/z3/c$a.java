package z3;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

public final class c$a
{
  public final MediaCodec.CryptoInfo a;
  public final MediaCodec.CryptoInfo.Pattern b;
  
  public c$a(MediaCodec.CryptoInfo paramCryptoInfo)
  {
    a = paramCryptoInfo;
    b = new MediaCodec.CryptoInfo.Pattern(0, 0);
  }
  
  public static void a(a parama, int paramInt1, int paramInt2)
  {
    b.set(paramInt1, paramInt2);
    a.setPattern(b);
  }
}

/* Location:
 * Qualified Name:     z3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */