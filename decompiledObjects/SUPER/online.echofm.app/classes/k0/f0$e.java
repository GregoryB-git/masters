package k0;

import D0.p;
import android.media.MediaFormat;
import d0.q;

public final class f0$e
  implements p, E0.a, V0.b
{
  public p o;
  public E0.a p;
  public p q;
  public E0.a r;
  
  public void a(long paramLong, float[] paramArrayOfFloat)
  {
    E0.a locala = r;
    if (locala != null) {
      locala.a(paramLong, paramArrayOfFloat);
    }
    locala = p;
    if (locala != null) {
      locala.a(paramLong, paramArrayOfFloat);
    }
  }
  
  public void h()
  {
    E0.a locala = r;
    if (locala != null) {
      locala.h();
    }
    locala = p;
    if (locala != null) {
      locala.h();
    }
  }
  
  public void k(long paramLong1, long paramLong2, q paramq, MediaFormat paramMediaFormat)
  {
    p localp = q;
    if (localp != null) {
      localp.k(paramLong1, paramLong2, paramq, paramMediaFormat);
    }
    localp = o;
    if (localp != null) {
      localp.k(paramLong1, paramLong2, paramq, paramMediaFormat);
    }
  }
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt != 7)
    {
      if (paramInt != 8)
      {
        if (paramInt == 10000)
        {
          android.support.v4.media.a.a(paramObject);
          q = null;
          r = null;
        }
      }
      else {
        p = ((E0.a)paramObject);
      }
    }
    else {
      o = ((p)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     k0.f0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */