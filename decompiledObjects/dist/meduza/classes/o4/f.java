package o4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import x6.b;
import z3.a;
import z3.g;

public final class f
  extends g
{
  public long q;
  public int r;
  public int s = 32;
  
  public f()
  {
    super(2);
  }
  
  public final void o()
  {
    super.o();
    r = 0;
  }
  
  public final boolean s(g paramg)
  {
    b.q(paramg.m(1073741824) ^ true);
    b.q(paramg.m(268435456) ^ true);
    b.q(paramg.m(4) ^ true);
    int i = r;
    if (i > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      if ((i < s) && (paramg.n() == n()))
      {
        localByteBuffer1 = c;
        if (localByteBuffer1 != null)
        {
          ByteBuffer localByteBuffer2 = c;
          if (localByteBuffer2 != null)
          {
            j = localByteBuffer2.position();
            if (localByteBuffer1.remaining() + j <= 3072000) {}
          }
        }
      }
      else
      {
        j = 0;
        break label127;
      }
    }
    int j = 1;
    label127:
    if (j == 0) {
      return false;
    }
    j = r;
    r = (j + 1);
    if (j == 0)
    {
      e = e;
      if (paramg.m(1)) {
        a = 1;
      }
    }
    if (paramg.n()) {
      a = Integer.MIN_VALUE;
    }
    ByteBuffer localByteBuffer1 = c;
    if (localByteBuffer1 != null)
    {
      q(localByteBuffer1.remaining());
      c.put(localByteBuffer1);
    }
    q = e;
    return true;
  }
}

/* Location:
 * Qualified Name:     o4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */