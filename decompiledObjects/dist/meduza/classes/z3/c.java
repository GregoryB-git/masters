package z3;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import v5.e0;

public final class c
{
  public byte[] a;
  public byte[] b;
  public int c;
  public int[] d;
  public int[] e;
  public int f;
  public int g;
  public int h;
  public final MediaCodec.CryptoInfo i;
  public final a j;
  
  public c()
  {
    Object localObject = new MediaCodec.CryptoInfo();
    i = ((MediaCodec.CryptoInfo)localObject);
    if (e0.a >= 24) {
      localObject = new a((MediaCodec.CryptoInfo)localObject);
    } else {
      localObject = null;
    }
    j = ((a)localObject);
  }
  
  public static final class a
  {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b;
    
    public a(MediaCodec.CryptoInfo paramCryptoInfo)
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
}

/* Location:
 * Qualified Name:     z3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */