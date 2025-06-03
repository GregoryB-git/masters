package t0;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import d0.q;

public final class m$a
{
  public final p a;
  public final MediaFormat b;
  public final q c;
  public final Surface d;
  public final MediaCrypto e;
  public final int f;
  
  public m$a(p paramp, MediaFormat paramMediaFormat, q paramq, Surface paramSurface, MediaCrypto paramMediaCrypto, int paramInt)
  {
    a = paramp;
    b = paramMediaFormat;
    c = paramq;
    d = paramSurface;
    e = paramMediaCrypto;
    f = paramInt;
  }
  
  public static a a(p paramp, MediaFormat paramMediaFormat, q paramq, MediaCrypto paramMediaCrypto)
  {
    return new a(paramp, paramMediaFormat, paramq, null, paramMediaCrypto, 0);
  }
  
  public static a b(p paramp, MediaFormat paramMediaFormat, q paramq, Surface paramSurface, MediaCrypto paramMediaCrypto)
  {
    return new a(paramp, paramMediaFormat, paramq, paramSurface, paramMediaCrypto, 0);
  }
}

/* Location:
 * Qualified Name:     t0.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */