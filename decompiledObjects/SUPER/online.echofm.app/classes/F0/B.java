package F0;

import d0.q;
import d0.q.b;
import d0.x;
import g0.M;
import g0.y;
import java.util.Collections;
import java.util.List;

public final class B
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final long j;
  public final a k;
  public final x l;
  
  public B(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, long paramLong, a parama, x paramx)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
    f = j(paramInt5);
    g = paramInt6;
    h = paramInt7;
    i = e(paramInt7);
    j = paramLong;
    k = parama;
    l = paramx;
  }
  
  public B(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new y(paramArrayOfByte);
    paramArrayOfByte.p(paramInt * 8);
    a = paramArrayOfByte.h(16);
    b = paramArrayOfByte.h(16);
    c = paramArrayOfByte.h(24);
    d = paramArrayOfByte.h(24);
    paramInt = paramArrayOfByte.h(20);
    e = paramInt;
    f = j(paramInt);
    g = (paramArrayOfByte.h(3) + 1);
    paramInt = paramArrayOfByte.h(5) + 1;
    h = paramInt;
    i = e(paramInt);
    j = paramArrayOfByte.j(36);
    k = null;
    l = null;
  }
  
  public static int e(int paramInt)
  {
    if (paramInt != 8)
    {
      if (paramInt != 12)
      {
        if (paramInt != 16)
        {
          if (paramInt != 20)
          {
            if (paramInt != 24) {
              return -1;
            }
            return 6;
          }
          return 5;
        }
        return 4;
      }
      return 2;
    }
    return 1;
  }
  
  public static int j(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 192000: 
      return 3;
    case 176400: 
      return 2;
    case 96000: 
      return 11;
    case 88200: 
      return 1;
    case 48000: 
      return 10;
    case 44100: 
      return 9;
    case 32000: 
      return 8;
    case 24000: 
      return 7;
    case 22050: 
      return 6;
    case 16000: 
      return 5;
    }
    return 4;
  }
  
  public B a(List paramList)
  {
    paramList = h(new x(paramList));
    return new B(a, b, c, d, e, g, h, j, k, paramList);
  }
  
  public B b(a parama)
  {
    return new B(a, b, c, d, e, g, h, j, parama, l);
  }
  
  public B c(List paramList)
  {
    paramList = h(W.d(paramList));
    return new B(a, b, c, d, e, g, h, j, k, paramList);
  }
  
  public long d()
  {
    int m = d;
    long l1;
    if (m > 0) {
      l1 = (m + c) / 2L;
    }
    for (long l2 = 1L;; l2 = 64L)
    {
      break;
      m = a;
      if ((m == b) && (m > 0)) {
        l2 = m;
      } else {
        l2 = 4096L;
      }
      l1 = l2 * g * h / 8L;
    }
    return l1 + l2;
  }
  
  public long f()
  {
    long l1 = j;
    if (l1 == 0L) {
      l1 = -9223372036854775807L;
    } else {
      l1 = l1 * 1000000L / e;
    }
    return l1;
  }
  
  public q g(byte[] paramArrayOfByte, x paramx)
  {
    paramArrayOfByte[4] = ((byte)Byte.MIN_VALUE);
    int m = d;
    if (m <= 0) {
      m = -1;
    }
    paramx = h(paramx);
    return new q.b().o0("audio/flac").f0(m).N(g).p0(e).i0(M.e0(h)).b0(Collections.singletonList(paramArrayOfByte)).h0(paramx).K();
  }
  
  public x h(x paramx)
  {
    x localx = l;
    if (localx != null) {
      paramx = localx.b(paramx);
    }
    return paramx;
  }
  
  public long i(long paramLong)
  {
    return M.q(paramLong * e / 1000000L, 0L, j - 1L);
  }
  
  public static class a
  {
    public final long[] a;
    public final long[] b;
    
    public a(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
    {
      a = paramArrayOfLong1;
      b = paramArrayOfLong2;
    }
  }
}

/* Location:
 * Qualified Name:     F0.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */