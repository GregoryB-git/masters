package j0;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;

public final class c$b
{
  public final MediaCodec.CryptoInfo a;
  public final MediaCodec.CryptoInfo.Pattern b;
  
  public c$b(MediaCodec.CryptoInfo paramCryptoInfo)
  {
    a = paramCryptoInfo;
    b = d.a(0, 0);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    e.a(b, paramInt1, paramInt2);
    f.a(a, b);
  }
}

/* Location:
 * Qualified Name:     j0.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */