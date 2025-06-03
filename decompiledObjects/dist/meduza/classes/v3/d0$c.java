package v3;

import android.media.MediaFormat;
import w5.i;
import x5.a;
import x5.j;

public final class d0$c
  implements i, a, g1.b
{
  public i a;
  public a b;
  public i c;
  public a d;
  
  public final void a(long paramLong, float[] paramArrayOfFloat)
  {
    a locala = d;
    if (locala != null) {
      locala.a(paramLong, paramArrayOfFloat);
    }
    locala = b;
    if (locala != null) {
      locala.a(paramLong, paramArrayOfFloat);
    }
  }
  
  public final void c(long paramLong1, long paramLong2, i0 parami0, MediaFormat paramMediaFormat)
  {
    i locali = c;
    if (locali != null) {
      locali.c(paramLong1, paramLong2, parami0, paramMediaFormat);
    }
    locali = a;
    if (locali != null) {
      locali.c(paramLong1, paramLong2, parami0, paramMediaFormat);
    }
  }
  
  public final void f()
  {
    a locala = d;
    if (locala != null) {
      locala.f();
    }
    locala = b;
    if (locala != null) {
      locala.f();
    }
  }
  
  public final void q(int paramInt, Object paramObject)
  {
    if (paramInt != 7)
    {
      if (paramInt != 8)
      {
        if (paramInt == 10000)
        {
          paramObject = (j)paramObject;
          if (paramObject == null)
          {
            paramObject = null;
            c = null;
          }
          else
          {
            c = ((j)paramObject).getVideoFrameMetadataListener();
            paramObject = ((j)paramObject).getCameraMotionListener();
          }
          d = ((a)paramObject);
        }
      }
      else {
        b = ((a)paramObject);
      }
    }
    else {
      a = ((i)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     v3.d0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */