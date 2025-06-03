package jb;

import xc.f;

public final class e$b
{
  public final f a;
  public d[] b = new d[8];
  public int c;
  public int d = 7;
  public int e;
  
  public e$b(f paramf)
  {
    a = paramf;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    f localf;
    if (paramInt1 < paramInt2)
    {
      localf = a;
      paramInt1 |= paramInt3;
    }
    else
    {
      a.B0(paramInt3 | paramInt2);
      paramInt1 -= paramInt2;
      while (paramInt1 >= 128)
      {
        a.B0(0x80 | paramInt1 & 0x7F);
        paramInt1 >>>= 7;
      }
      localf = a;
    }
    localf.B0(paramInt1);
  }
}

/* Location:
 * Qualified Name:     jb.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */