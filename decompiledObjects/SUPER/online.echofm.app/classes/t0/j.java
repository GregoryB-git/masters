package t0;

import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class j
  extends i
{
  public long x;
  public int y;
  public int z = 32;
  
  public j()
  {
    super(2);
  }
  
  public boolean H(i parami)
  {
    g0.a.a(parami.D() ^ true);
    g0.a.a(parami.o() ^ true);
    g0.a.a(parami.p() ^ true);
    if (!K(parami)) {
      return false;
    }
    int i = y;
    y = (i + 1);
    if (i == 0)
    {
      t = t;
      if (parami.s()) {
        w(1);
      }
    }
    ByteBuffer localByteBuffer = r;
    if (localByteBuffer != null)
    {
      z(localByteBuffer.remaining());
      r.put(localByteBuffer);
    }
    x = t;
    return true;
  }
  
  public final boolean K(i parami)
  {
    if (!U()) {
      return true;
    }
    if (y >= z) {
      return false;
    }
    parami = r;
    if (parami != null)
    {
      ByteBuffer localByteBuffer = r;
      if ((localByteBuffer != null) && (localByteBuffer.position() + parami.remaining() > 3072000)) {
        return false;
      }
    }
    return true;
  }
  
  public long M()
  {
    return t;
  }
  
  public long S()
  {
    return x;
  }
  
  public int T()
  {
    return y;
  }
  
  public boolean U()
  {
    boolean bool;
    if (y > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void V(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.a(bool);
    z = paramInt;
  }
  
  public void m()
  {
    super.m();
    y = 0;
  }
}

/* Location:
 * Qualified Name:     t0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */