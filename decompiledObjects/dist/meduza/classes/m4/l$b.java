package m4;

import c4.v;

public final class l$b
{
  public final v a;
  public boolean b;
  public boolean c;
  public boolean d;
  public int e;
  public int f;
  public long g;
  public long h;
  
  public l$b(v paramv)
  {
    a = paramv;
  }
  
  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (c)
    {
      int i = f;
      int j = paramInt1 + 1 - i;
      if (j < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[j] & 0xC0) >> 6 == 0) {
          bool = true;
        } else {
          bool = false;
        }
        d = bool;
        c = false;
      }
      else
      {
        f = (paramInt2 - paramInt1 + i);
      }
    }
  }
}

/* Location:
 * Qualified Name:     m4.l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */