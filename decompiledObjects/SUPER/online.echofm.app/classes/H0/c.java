package H0;

import g0.z;

public final class c
  implements a
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
  }
  
  public static c c(z paramz)
  {
    int i = paramz.t();
    paramz.U(8);
    int j = paramz.t();
    int k = paramz.t();
    paramz.U(4);
    int m = paramz.t();
    paramz.U(12);
    return new c(i, j, k, m);
  }
  
  public int a()
  {
    return 1751742049;
  }
  
  public boolean b()
  {
    boolean bool;
    if ((b & 0x10) == 16) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     H0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */