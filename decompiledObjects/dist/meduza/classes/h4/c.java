package h4;

import c4.i;
import x6.b;

public final class c
  implements i
{
  public final i a;
  public final long b;
  
  public c(i parami, long paramLong)
  {
    a = parami;
    boolean bool;
    if (parami.getPosition() >= paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    b = paramLong;
  }
  
  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a.b(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
  }
  
  public final boolean c(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return a.c(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
  }
  
  public final long d()
  {
    return a.d() - b;
  }
  
  public final void e(int paramInt)
  {
    a.e(paramInt);
  }
  
  public final int g(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.g(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final long getLength()
  {
    return a.getLength() - b;
  }
  
  public final long getPosition()
  {
    return a.getPosition() - b;
  }
  
  public final void i()
  {
    a.i();
  }
  
  public final void j(int paramInt)
  {
    a.j(paramInt);
  }
  
  public final boolean k(int paramInt, boolean paramBoolean)
  {
    return a.k(paramInt, paramBoolean);
  }
  
  public final void m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.m(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final int n()
  {
    return a.n();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a.read(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.readFully(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     h4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */