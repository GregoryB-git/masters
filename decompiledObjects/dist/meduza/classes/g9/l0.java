package g9;

import x6.b;

public final class l0
{
  public int a;
  
  public l0(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramInt1 & 0x1) == paramInt1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.Z("Generator ID %d contains more than %d reserved bits", bool2, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1) });
    if ((paramInt2 & 0x1) == paramInt1) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.Z("Cannot supply target ID from different generator ID", bool2, new Object[0]);
    a = paramInt2;
  }
}

/* Location:
 * Qualified Name:     g9.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */