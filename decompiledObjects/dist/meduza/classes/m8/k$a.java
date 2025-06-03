package m8;

import a0.j;

public final class k$a
  extends f0.e.c.a
{
  public int a;
  public String b;
  public int c;
  public long d;
  public long e;
  public boolean f;
  public int g;
  public String h;
  public String i;
  public byte j;
  
  public final k a()
  {
    if (j == 63)
    {
      String str1 = b;
      if (str1 != null)
      {
        String str2 = h;
        if (str2 != null)
        {
          localObject = i;
          if (localObject != null) {
            return new k(a, str1, c, d, e, f, g, str2, (String)localObject);
          }
        }
      }
    }
    Object localObject = new StringBuilder();
    if ((j & 0x1) == 0) {
      ((StringBuilder)localObject).append(" arch");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" model");
    }
    if ((j & 0x2) == 0) {
      ((StringBuilder)localObject).append(" cores");
    }
    if ((j & 0x4) == 0) {
      ((StringBuilder)localObject).append(" ram");
    }
    if ((j & 0x8) == 0) {
      ((StringBuilder)localObject).append(" diskSpace");
    }
    if ((j & 0x10) == 0) {
      ((StringBuilder)localObject).append(" simulator");
    }
    if ((j & 0x20) == 0) {
      ((StringBuilder)localObject).append(" state");
    }
    if (h == null) {
      ((StringBuilder)localObject).append(" manufacturer");
    }
    if (i == null) {
      ((StringBuilder)localObject).append(" modelClass");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */