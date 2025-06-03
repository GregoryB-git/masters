package hb;

import gb.s3;
import xc.f;

public final class o
  implements s3
{
  public final f a;
  public int b;
  public int c;
  
  public o(f paramf, int paramInt)
  {
    a = paramf;
    b = paramInt;
  }
  
  public final int a()
  {
    return b;
  }
  
  public final int b()
  {
    return c;
  }
  
  public final void c(byte paramByte)
  {
    a.B0(paramByte);
    b -= 1;
    c += 1;
  }
  
  public final void release() {}
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a.write(paramArrayOfByte, paramInt1, paramInt2);
    b -= paramInt2;
    c += paramInt2;
  }
}

/* Location:
 * Qualified Name:     hb.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */